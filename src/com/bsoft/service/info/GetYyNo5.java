package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
import com.ws.yuyue.service.GetYyNoResponse;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

public class GetYyNo5 extends GetInfo
{
	private static GetYyNo5 instance = new GetYyNo5();

	public static GetYyNo5 getInstance()
	{
		return instance;
	}

	public GetYyNoResponse execute(com.ws.yuyue.service.GetYyNo getYyNo)
	{
		com.ws.yuyue.service.GetYyNo.Message    message =     getYyNo.getMessage();
		String id = message.getOrderInfo().getRegID().toString();
		String hospitalID = message.getOrderInfo().getHospitalID();
		String departid = message.getOrderInfo().getDepartID();
		String doctorid = message.getOrderInfo().getDoctorID();
		Integer isexpert1 = message.getOrderInfo().getIsExpert();
		String isexpert =  isexpert1.toString();
		String sickname = message.getOrderInfo().getSickName();
		String sicksex = ((Integer)message.getOrderInfo().getSickSex()).toString();
		String sickbirthday = message.getOrderInfo().getSickBirthday();
		String sickinsuretype = ((Integer)message.getOrderInfo().getSickInsureType()).toString();
		String sickinsureno = message.getOrderInfo().getSickInsureNo();
		String seedoctordate = message.getOrderInfo().getSeeDoctorDate();
		String worktype = ((Integer)message.getOrderInfo().getWorkType()).toString();
		String registryfee = ((Double)message.getOrderInfo().getRegistryFee()).toString();
		String clinicfee = ((Double)message.getOrderInfo().getClinicFee()).toString();
		String expertsfee = ((Double)message.getOrderInfo().getExpertsFee()).toString();
		String checkno = message.getOrderInfo().getCheckNo();
		String phone = message.getOrderInfo().getPhone();
		String sfzh = message.getOrderInfo().getCardNo();
		String regtype = ((Integer)message.getOrderInfo().getRegType()).toString();
		String paytype = ((Integer)message.getOrderInfo().getPayType()).toString();
		String reserverDate = message.getOrderInfo().getCreateDate();
		
		if(worktype.equals("3")){// 由于木渎人民医院 全天是 0  而12320规定的全天是 3  因此在挂号的时候 转换一下
			worktype = "0";
		}
		
		/**
		 * 增加双向转诊信息  Modified by Zhanggh 20160525
		 */
		String departName = message.getOrderInfo().getDepartName(); 
		String doctorName  = message.getOrderInfo().getDoctorName();
		String operID  = message.getOrderInfo().getOperID();
		String outHospitalID  = message.getOrderInfo().getOutHospitalID();
		String outHospitalName  = message.getOrderInfo().getOutHospitalName();
		String fromDeptID  = message.getOrderInfo().getFromDeptID();
		String fromDeptName  = message.getOrderInfo().getFromDeptName();
		String fromDoctorID  = message.getOrderInfo().getFromDoctorID();
		String fromDoctorName = message.getOrderInfo().getFromDoctorName();
		String changeCliniqueReason  = message.getOrderInfo().getChangeCliniqueReason();
		String medicalRecord = message.getOrderInfo().getMedicalRecord();
		String preDiagnosis = message.getOrderInfo().getPreDiagnosis();

		/**
		 * 增加MZBH Modified By Zhanggh 20160525 
		 */
		String sjhm = message.getOrderInfo().getMzbh();

		String iscance ="0";
		String begintime = message.getOrderInfo().getBeginTime();
		String endtime = message.getOrderInfo().getEndTime();


		String sql = "";
		String reserveno = "";

		InterfaceQueryDao dao = new InterfaceQueryDao();
		List returnList = null;
		int returnCode = 0;
		try
		{
			returnCode = getSqlNoIsExist(id);

			if (returnCode > 0) {
				return getReturnXML(hospitalID, "1005", id, reserveno, "ID:" + id + " 已挂号");
			}

			returnCode = getSqlNoIsOccupy(departid, doctorid, isexpert, worktype, seedoctordate, begintime, endtime);
			if (returnCode <= 0) {
				return getReturnXML(hospitalID, "1005", id, reserveno, "号段已被使用");
			}

			returnCode = executeSqlBeforeYY(departid, doctorid, isexpert, worktype, seedoctordate, begintime, endtime);

			if (returnCode <= 0) {
				return getReturnXML(hospitalID, "1005", id, reserveno, "挂号数已超过限额");
			}

			sql = getSqlUpdatePB(departid, 
					doctorid, 
					isexpert, 
					worktype, 
					seedoctordate, 
					begintime, 
					endtime);

			returnCode = Integer.parseInt(dao.doUpdate(sql));

			if (returnCode == 0) {
				return getReturnXML(hospitalID, "1005", id, reserveno, "更新已挂人数失败");
			}

			sql = getSqlSelectPB(departid, 
					doctorid, 
					isexpert, 
					worktype, 
					seedoctordate, 
					begintime, 
					endtime);
			returnList = dao.doQuery(sql);

			System.out.println(sql);

			if ((returnList == null) || (returnList.size() == 0)) {
				return getReturnXML(hospitalID, "1005", id, reserveno, "查询就诊序号失败");
			}

			reserveno = (String)((Map)returnList.get(0)).get("reserveno");

			if ((reserveno == null) || 
					("".equals(reserveno))) {
				return getReturnXML(hospitalID, "1005", id, reserveno, "就诊序号为空");
			}

			/**
			 * 允许普通门诊挂号  Modified by Zhanggh 20160525
			 */
			//			 if(isexpert.equals("1"))
			if ((begintime != null) && 
					(endtime != null) && 
					(!"".equals(begintime)) && 
					(!"".equals(endtime)))
			{
				sql = getSqlUpdateFY(id,departid, 
						doctorid, 
						isexpert, 
						worktype, 
						seedoctordate, 
						begintime, 
						endtime, 
						reserveno);
				returnCode = Integer.parseInt(dao.doUpdate(sql));
				if (returnCode == 0) {
					return getReturnXML(hospitalID, "1005", id, reserveno, "更新yy_kspb_hb表失败");
				}
			}		

			sql = getSqlInsertRG(id, 
					hospitalID, 
					departid, 
					doctorid, 
					isexpert, 
					sickname, 
					sicksex, 
					sickbirthday, 
					sickinsuretype, 
					sickinsureno, 
					seedoctordate, 
					worktype, 
					reserveno, 
					registryfee, 
					clinicfee, 
					expertsfee, 
					checkno, 
					phone, 
					sfzh, 
					regtype, 
					paytype, 
					iscance, 
					reserverDate,
					departName ,
					doctorName,
					operID ,
					outHospitalID,
					outHospitalName,
					fromDeptID,
					fromDeptName,
					fromDoctorID,
					fromDoctorName,
					changeCliniqueReason,
					medicalRecord,
					preDiagnosis,
					begintime,
					endtime,
					sjhm);
			returnCode = Integer.parseInt(dao.doUpdate(sql));

			if (returnCode == 0)
				return getReturnXML(hospitalID, "1005", id, reserveno, "保存挂号信息失败");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return getReturnXML(hospitalID, "1005", id, reserveno, "");
		}

		return getReturnXML(hospitalID, "1000", id, reserveno, "");
	}

	public GetYyNoResponse getReturnXML(String hospitalID, String msgType, String id, String reserveNo, String errMsg)
	{
		com.ws.yuyue.service.GetYyNoResponse Res = new GetYyNoResponse();
		com.ws.yuyue.service.GetYyNoResponse.Message msgRes = new com.ws.yuyue.service.GetYyNoResponse.Message();// 
		com.ws.yuyue.service.GetYyNoResponse.Message.ResponseInfo responseInfoRes = new com.ws.yuyue.service.GetYyNoResponse.Message.ResponseInfo();//


		BigInteger regId  =	 BigInteger.valueOf(Integer.parseInt(id));
		responseInfoRes.setCode(msgType);
		responseInfoRes.setErrMsg(errMsg);
		responseInfoRes.setRegID(regId);
		responseInfoRes.setReserveNo(reserveNo);
		msgRes.setResponseInfo(responseInfoRes);
		Res.setMessage(msgRes);
		return Res;
	}

	public int executeSqlBeforeYY(String departid, String doctorid, String isexpert, String worktype, String seedoctordate, String begintime, String endtime)
			throws Exception
			{
		InterfaceQueryDao dao = new InterfaceQueryDao();
		List returnList = null;
		String sql = "";
		int returnCode = 0;

		if ((("".equals(begintime)) || 
				(begintime == null)) && (
						("".equals(endtime)) || 
						(endtime == null)))
		{
			if ("0".equals(isexpert)) {
				String dayOfWeek = getDayOfWeek(seedoctordate);
				sql = "select a.ygrs,a.ghxe from  MS_GHKS A, MS_KSPB B  WHERE A.KSDM = B.GHKS " + 
						"and b.tgbz = 0 and b.ghks = '"  + departid + "' " + 
						"and b.zblb = '" + worktype + "' " + 
						"and b.ghrq = '" + dayOfWeek + "'";
				returnList = dao.doQuery(sql);

				System.out.println(sql);

				if (returnList.size() > 0) {
					String ghxeStr = (String)((Map)returnList.get(0)).get("ghxe");
					String ygrsStr = (String)((Map)returnList.get(0)).get("ygrs");
					if (("".endsWith(ghxeStr)) || 
							(ghxeStr == null) || 
							("0".endsWith(ghxeStr)))
						returnCode = Integer.parseInt(GetInfo.Limited);
					else {
						returnCode = Integer.parseInt(ghxeStr) - Integer.parseInt(ygrsStr);
					}

				}

			}
			else
			{
				sql = "select sjxe,ygrs from ms_yspb " +
						"where tgbz = 0 and ysdm = '" + doctorid + "' " + 
						"and ksdm = '" + departid + "' " + 
						"and zblb = '" + worktype + "' " + 
						"and gzrq = '" + seedoctordate + "' ";
				returnList = dao.doQuery(sql);

				System.out.println(sql);

				if (returnList.size() > 0) {
					String ghxeStr = (String)((Map)returnList.get(0)).get("sjxe");
					String ygrsStr = (String)((Map)returnList.get(0)).get("ygrs");
					if (("".endsWith(ghxeStr)) || 
							(ghxeStr == null) || 
							("0".endsWith(ghxeStr))) {
						returnCode = 0;
					}
					else {
						if (("".endsWith(ygrsStr)) || (ygrsStr == null)) {
							ygrsStr = "0";
						}

						returnCode = Integer.parseInt(ghxeStr) - Integer.parseInt(ygrsStr);
					}

				}

			}

		}
		else
		{
			if ("0".equals(isexpert))
//				sql = "select wsxh as hyzs from yy_kspb_jl " +
//						"where tzbz = 0 and ghks = '" +  departid + "' " + 
//						"and kslb <> 3 and zblb = '" + worktype + "' " + 
//						"and ghrq = '" + seedoctordate + "' ";
			sql = "select yyxh as hyzs from yy_kspb_jl " +//木渎人民医院改，只维护了预约限号  yyxh
					"where tzbz = 0 and ghks = '" +  departid + "' " + 
					"and kslb <> 3 and zblb = '" + worktype + "' " + 
					"and ghrq = '" + seedoctordate + "' ";

			else {
//				sql = "select a.wsxh as hyzs from yy_kspb_jl a,yy_kspb d " + 
//						"where a.kspbxh = d.jlxh and a.tzbz = 0 " + 
//						"and a.ysdm = '" + doctorid + "' " + 
//						"and a.ghks = '" + departid + "' " + 
//						"and a.kslb = 3 and a.zblb = '" + worktype + "' " + 
//						"and a.ghrq = '" + seedoctordate + "'";
				sql = "select a.yyxh as hyzs from yy_kspb_jl a,yy_kspb d " + //木渎人民医院改  只维护了预约限号  yyxh
						"where a.kspbxh = d.jlxh and a.tzbz = 0 " + 
						"and a.ysdm = '" + doctorid + "' " + 
						"and a.ghks = '" + departid + "' " + 
						"and a.kslb = 3 and a.zblb = '" + worktype + "' " + 
						"and a.ghrq = '" + seedoctordate + "'";
			}
			returnList = dao.doQuery(sql);

			System.out.println(sql);

			if (returnList.size() > 0) {
				String hyzsStr = (String)((Map)returnList.get(0)).get("hyzs");
				if (("".endsWith(hyzsStr)) || (hyzsStr == null)) {
					hyzsStr = "0";
				}

				returnCode = Integer.parseInt(hyzsStr);

				sql = "Select count(*) as cou from Registered_info " + 
						"where isexpert = '1' and doctorid = '" + doctorid + "' " + 
						"and departid = '" + departid + "' " + 
						"and worktype = '" + worktype + "' " + 
						"and seedoctordate = '" + seedoctordate + "' " + 
						"and iscance = '0' ";
				returnList = dao.doQuery(sql);

				System.out.println(sql);

				int cou = 0;
				if (returnList.size() > 0) {
					cou = Integer.parseInt((String)((Map)returnList.get(0)).get("cou"));
				}
				returnCode -= cou;
			}

		}

		return returnCode;
			}

	public int getSqlNoIsExist(String id)
			throws Exception
			{
		String sql = "select count(*) as cou from Registered_info where id = '" + id + "' ";

		InterfaceQueryDao dao = new InterfaceQueryDao();
		List returnList = dao.doQuery(sql);

		System.out.println(sql);

		int cou = 0;
		if (returnList.size() > 0) {
			cou = Integer.parseInt((String)((Map)returnList.get(0)).get("cou"));
		}
		return cou;
			}

	public int getSqlNoIsOccupy(String departid, String doctorid, String isexpert, String worktype, String seedoctordate, String begintime, String endtime)
			throws Exception
			{
		int cou = Integer.parseInt(GetInfo.Limited);

		String sql = "";

		if (((!"".equals(begintime)) && 
				(begintime != null)) || (
						(!"".equals(endtime)) && 
						(endtime != null))) {

			if ("0".equals(isexpert))
				sql = "select count(*) as cou from yy_kspb_hb where jlxh = (select jlxh from yy_kspb_jl where ghks = '" + 
						departid + "' " + 
						"and kslb <> 3 " + 
						"and ghrq = '" + seedoctordate + "' " + 
						"and zblb = '" + worktype + "' ) " + 
						"and LEFT(qssj,5) = '" + begintime + "' " + 
						"and LEFT(jzsj,5) = '" + endtime + "' " + 
						"and brid = '0'";
			else {
				sql = "select count(*) as cou from yy_kspb_hb where jlxh = (select a.jlxh from yy_kspb_jl a,yy_kspb d where a.kspbxh = d.jlxh  and (a.ghks = '" + 
						departid + "') " + 
						"and a.ysdm = '" + doctorid + "' " + 
						"and a.kslb = 3 " + 
						"and a.ghrq = '" + seedoctordate + "' " + 
						"and a.zblb = '" + worktype + "' )" + 
						"and LEFT(qssj,5) = '" + begintime + "' " + 
						"and LEFT(jzsj,5) = '" + endtime + "'" + 
						"and brid = '0'";
			}
			InterfaceQueryDao dao = new InterfaceQueryDao();
			List returnList = dao.doQuery(sql);

			System.out.println(sql);

			if (returnList.size() > 0) {
				cou = Integer.parseInt((String)((Map)returnList.get(0)).get("cou"));
			}
		}

		return cou;
			}

	public String getSqlUpdatePB(String departid, String doctorid, String isexpert, String worktype, String seedoctordate, String begintime, String endtime)
	{
		String sql = "";

		if ("0".equals(isexpert))
		{
			if ((("".equals(begintime)) || 
					(begintime == null)) && (
							("".equals(endtime)) || 
							(endtime == null))) {
				String dayOfWeek = getDayOfWeek(seedoctordate);
				sql = "update MS_GHKS set jzxh = jzxh+1,ygrs = ygrs+1 where ksdm = '" + 
						departid + "' " ;
					//	+"and convert(varchar(10),ghrq,23) = '" + seedoctordate + "' " ;
					//+	"and zblb = '" + worktype + "'";
				
			}
			else
			{
				sql = "update YY_KSPB_JL set yyrs = yyrs+1 where ghks = '" + 
						departid + "' " + 
						"and ghrq = '" + seedoctordate + "' " + 
						"and zblb = '" + worktype + "' " + 
						"and kslb <> 3 ";
			}

		}
		else if ((("".equals(begintime)) || 
				(begintime == null)) && (
						("".equals(endtime)) || 
						(endtime == null))) {
			sql = "update MS_YSPB set jzxh = jzxh +1,ygrs = ygrs +1 where gzrq = '" + 
					seedoctordate + "' " + 
					"and ysdm = '" + doctorid + "' " + 
					"and ksdm = '" + departid + "' " + 
					"and zblb = '" + worktype + "'";
		}
		else
		{
			sql = "update YY_KSPB_JL set yyrs = yyrs + 1 where exists (select 1 from YY_KSPB B where YY_KSPB_JL.kspbxh = B.jlxh and YY_KSPB_JL.ghrq = '" + 
					seedoctordate + "' " + 
					"and (B.ghks = '" + departid + "' or B.ghks2 = '" + departid + "') " + 
					"and YY_KSPB_JL.ysdm = '" + doctorid + "' " + 
					"and YY_KSPB_JL.zblb = '" + worktype + "' " + 
					"and YY_KSPB_JL.kslb = 3 )";
		}		

		return sql;
	}

	public String getSqlSelectPB(String departid, String doctorid, String isexpert, String worktype, String seedoctordate, String begintime, String endtime)
	{
		String sql = "";

		if ("0".equals(isexpert))
		{
			if ((("".equals(begintime)) || 
					(begintime == null)) && (
							("".equals(endtime)) || 
							(endtime == null)))
			{
				String dayOfWeek = getDayOfWeek(seedoctordate);
				sql = "select jzxh as reserveno from MS_GHKS where ksdm = '" + 
						departid + "' " ;
				//+     "and ghrq = '" + dayOfWeek + "' " ;
//						+"and zblb = '" + worktype + "'";
			}
			else
			{
				sql = "select a.jzxh as reserveno from yy_kspb_hb a,yy_kspb_jl b where a.jlxh = b.jlxh and a.brid = 0 and LEFT(a.qssj,5) = '" + 
						begintime + "' " + 
						"and LEFT(a.jzsj,5) = '" + endtime + "' " + 
						"and b.ghks = '" + departid + "' " + 
						"and b.ghrq = '" + seedoctordate + "' " + 
						"and b.zblb = '" + worktype + "' " + 
						"and b.kslb <> 3 ";
			}

		}
		else if ((("".equals(begintime)) || 
				(begintime == null)) && (
						("".equals(endtime)) || 
						(endtime == null))) {
			sql = "select jzxh as reserveno from MS_YSPB where gzrq = '" + 
					seedoctordate + "' " + 
					"and ysdm = '" + doctorid + "' " + 
					"and ksdm = '" + departid + "' " + 
					"and zblb = '" + worktype + "'";
		}
		else
		{
			sql = "select a.jzxh as reserveno from yy_kspb_hb a,yy_kspb_jl b where a.jlxh = b.jlxh and a.brid = 0 and LEFT(a.qssj,5) = '" + 
					begintime + "' " + 
					"and LEFT(a.jzsj,5) = '" + endtime + "' " + 
					"and b.ysdm = '" + doctorid + "' " + 
					"and b.ghrq = '" + seedoctordate + "' " + 
					"and b.zblb = '" + worktype + "' " + 
					"and b.kslb = 3 ";
		}

		return sql;
	}

	public String getSqlUpdateFY(String id,String departid, String doctorid, String isexpert, String worktype, String seedoctordate, String begintime, String endtime, String reserveno)
	{	
		String sql = "";

		if (((!"".equals(begintime)) && 
				(begintime != null)) || (
						(!"".equals(endtime)) && 
						(endtime != null))) {
			if ("0".equals(isexpert))
				sql = "update yy_kspb_hb set brid = '-2' , sjid = '"+id+"' where jlxh = (select jlxh from yy_kspb_jl where ghks = '" + 
						departid + "' " + 
						"and kslb <> 3 " + 
						"and ghrq = '" + seedoctordate + "' " + 
						"and zblb = '" + worktype + "' ) " + 
						"and LEFT(qssj,5) = '" + begintime + "' " + 
						"and LEFT(jzsj,5) = '" + endtime + "' " + 
						"and brid = '0'" + 
						"and jzxh = '" + reserveno + "'";
			else {
				sql = "update yy_kspb_hb set brid = '-2' , sjid = '"+id+"' where jlxh = (select a.jlxh from yy_kspb_jl a,yy_kspb d where a.kspbxh = d.jlxh and (a.ghks = '" + 
						departid + "' or d.ghks2 = '" + departid + "') " + 
						"and a.ysdm = '" + doctorid + "' " + 
						"and a.kslb = 3 " + 
						"and a.ghrq = '" + seedoctordate + "' " + 
						"and a.zblb = '" + worktype + "' )" + 
						"and LEFT(qssj,5) = '" + begintime + "' " + 
						"and LEFT(jzsj,5) = '" + endtime + "'" + 
						"and brid = '0'" + 
						"and jzxh = '" + reserveno + "'";
			}
		}

		return sql;
	}

	/**
	 * 增加双向转诊信息  Modified by Zhanggh 20160525
	 * 增加输入mzbh Modified by Zhanggh 20160525
	 * @param id
	 * @param hospitalID
	 * @param departid
	 * @param doctorid
	 * @param isexpert
	 * @param sickname
	 * @param sicksex
	 * @param sickbirthday
	 * @param sickinsuretype
	 * @param sickinsureno
	 * @param seedoctordate
	 * @param worktype
	 * @param reserveNo
	 * @param registryfee
	 * @param clinicfee
	 * @param expertsfee
	 * @param checkno
	 * @param phone
	 * @param sfzh
	 * @param regtype
	 * @param paytype
	 * @param iscance
	 * @param reserverDate
	 * @param departName
	 * @param doctorName
	 * @param operID
	 * @param outHospitalID
	 * @param outHospitalName
	 * @param fromDeptID
	 * @param fromDeptName
	 * @param fromDoctorID
	 * @param fromDoctorName
	 * @param changeCliniqueReason
	 * @param medicalRecord
	 * @param preDiagnosis
	 * @param begintime
	 * @param endtime
	 * @param sjhm
	 * @return
	 */
	public String getSqlInsertRG(String id, String hospitalID, String departid, String doctorid, 
			String isexpert, String sickname, String sicksex, String sickbirthday, String sickinsuretype,
			String sickinsureno, String seedoctordate, String worktype, String reserveNo, 
			String registryfee, String clinicfee, String expertsfee, String checkno,
			String phone, String sfzh, String regtype, String paytype, String iscance, String reserverDate,
			String departName,String doctorName,String operID,String outHospitalID,String outHospitalName,
			String fromDeptID,String fromDeptName,String fromDoctorID,String fromDoctorName,
			String changeCliniqueReason,String medicalRecord,String preDiagnosis,String begintime,String endtime,String sjhm)
	{
		String sql = "insert into registered_info( id,hospitalid,departid,doctorid,isexpert,sickname," +
				"sicksex,sickbirthday,sickinsuretype,sickinsureno,seedoctordate,worktype,reserveno," +
				"registryfee,clinicfee,expertsfee,checkno,phone,sfzh,regtype,paytype,iscance,reserveDate ," +
				"departName ,doctorName,operID ,outHospitalID,outHospitalName,fromDeptID,fromDeptName," +
				"fromDoctorID,fromDoctorName,changeCliniqueReason,medicalRecord,preDiagnosis," +
				"begintime,endtime,sjhm) values ('" + 
				id + "'," + 
				"'" + hospitalID + "'," + 
				"'" + departid + "'," + 
				"'" + doctorid + "'," + 
				"'" + isexpert + "'," + 
				"'" + sickname + "'," + 
				"'" + sicksex + "'," + 
				"'" + sickbirthday + "'," + 
				"'" + sickinsuretype + "'," + 
				"'" + sickinsureno + "'," + 
				"'" + seedoctordate + "'," + 
				"'" + worktype + "'," + 
				"'" + reserveNo + "'," + 
				"'" + registryfee + "'," + 
				"'" + clinicfee + "'," + 
				"'" + expertsfee + "'," + 
				"'" + checkno + "'," + 
				"'" + phone + "'," + 
				"'" + sfzh + "'," + 
				"'" + regtype + "'," + 
				"'" + paytype + "'," + 
				"'" + iscance + "'," + 
				"'" + reserverDate + "'," +
				"'" + departName + "'," +
				"'" + doctorName + "'," +
				"'" + operID + "'," +
				"'" + outHospitalID + "'," +
				"'" + outHospitalName + "'," +
				"'" + fromDeptID + "'," +
				"'" + fromDeptName + "'," +
				"'" + fromDoctorID + "'," +
				"'" + fromDoctorName + "'," +
				"'" + changeCliniqueReason + "'," +
				"'" + medicalRecord + "'," +
				"'" + preDiagnosis + "'," +
				"'" + begintime + "'," +
				"'" + endtime + "'," +
				"'" + sjhm + "')";
		return sql;
	}
}