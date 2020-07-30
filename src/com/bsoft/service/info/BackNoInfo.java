package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
import com.ws.yuyue.service.BackNoResponse;
import com.ws.yuyue.service.GetYyNoResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BackNoInfo extends GetInfo
{
	private static BackNoInfo instance = new BackNoInfo();

	public static BackNoInfo getInstance()
	{
		return instance;
	}

	public BackNoResponse execute(com.ws.yuyue.service.BackNo backNo)
	{
		com.ws.yuyue.service.BackNo.Message    message =     backNo.getMessage();
		String hospitalID ="";
		String id = "";
		String departid = "";
		String doctorid = "";
		String isexpert = "";
		String reserveno = "";
		String worktype = "";
		String seedoctordate = "";
		String RegType = "";
		String begintime ="";
		String endtime = "";

		try {
			hospitalID = message.getRequestInfo().getHospitalID();

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			id = (message.getRequestInfo().getRegID()).toString();

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			departid = message.getRequestInfo().getDepartID();

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			doctorid = message.getRequestInfo().getDoctorID();

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			isexpert = message.getRequestInfo().getIsExpert().toString();

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			reserveno = message.getRequestInfo().getReserveNo();

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			worktype = message.getRequestInfo().getWorkType().toString();
			if(worktype.equals("3")){// 由于木渎人民医院 全天是 0  而12320规定的全天是 3  因此在挂号的时候 转换一下
				worktype = "0";
			}
		} catch (Exception e) {
			// TODO: handle exception
		}	    

		try {
			seedoctordate = message.getRequestInfo().getSeeDoctorDate();

		} catch (Exception e) {
			// TODO: handle exception
		}	    

		try {
			RegType = message.getRequestInfo().getRegType().toString();

		} catch (Exception e) {
			// TODO: handle exception
		}	

		try {
			begintime = message.getRequestInfo().getBeginTime();

		} catch (Exception e) {
			// TODO: handle exception
		}	

		try {
			endtime = message.getRequestInfo().getEndTime();

		} catch (Exception e) {
			// TODO: handle exception
		}	



		InterfaceQueryDao dao = new InterfaceQueryDao();
		String sql = "";
		String cou = "";
		List returnList = new ArrayList();
		if ("9".equals(RegType)) {
			sql = "select sbxh,jlxh,brid from yy_kspb_hb WHERE sjid = " + id;
			returnList = dao.doQuery(sql);
			
			System.out.println(sql);
			
			if ((returnList == null) || (returnList.size() == 0)) {
				return getReturnXML(hospitalID, "0003", "不存在id为" + id + "的诊间预约挂号");
			}

			if (returnList.size() > 1) {
				return getReturnXML(hospitalID, "0003", "id为" + id + "的诊间预约挂号不唯一");
			}

			String sbxh = (String)((Map)returnList.get(0)).get("sbxh");
			String jlxh = (String)((Map)returnList.get(0)).get("jlxh");
			String brid = (String)((Map)returnList.get(0)).get("brid");

			sql = "update yy_kspb_hb set sjid = null,brid = 0,qxsj=getDate(),bzxx='',yylx=0,lxdh='',zt=0,yysj=null where sbxh=" + 
					sbxh + 
					" and brid=" + brid;
			cou = dao.doUpdate(sql);
			if ("0".equals(cou)) {
				return getReturnXML(hospitalID, "0003", "数据库错误1");
			}

			sql = "update YY_KSPB_JL set yyrs=yyrs - 1 where jlxh =" + jlxh;
			cou = dao.doUpdate(sql);
			if ("0".equals(cou)) {
				return getReturnXML(hospitalID, "0003", "数据库错误2");
			}

//			sql = "Update yy_qxmx set scbz = 1 where isnull(scbz,0) = 0  and sjid = " + 
//					id + 
//					" and sbxh = " + sbxh;
//			cou = dao.doUpdate(sql);
//			if ("0".equals(cou)) {
//				return getReturnXML(hospitalID, "0003", "数据库错误3");
//			}
		}
		else
		{
			sql = "select count(*) as cou from registered_info where id = '" + id + "'";
			returnList = dao.doQuery(sql);
			
			System.out.println(sql);
			
			if ((returnList == null) || (returnList.size() == 0)) {
				return getReturnXML(hospitalID, "0003", "数据库错误4");
			}

			cou = (String)((Map)returnList.get(0)).get("cou");

			if ("0".equals(cou)) {
				return getReturnXML(hospitalID, "0001", "挂号记录不存在");
			}

			sql = "select count(*) as cou from registered_info where id = '" + id + "' and iscance = '1'";
			returnList = dao.doQuery(sql);

			System.out.println(sql);
			
			if ((returnList == null) || (returnList.size() == 0)) {
				return getReturnXML(hospitalID, "0003", "数据库错误5");
			}

			cou = (String)((Map)returnList.get(0)).get("cou");

			if ("1".equals(cou)) {
				return getReturnXML(hospitalID, "0000", "用户已退号");
			}

			sql = "select count(*) as cou from registered_info where id = '" + id + "' and getnodate is null";
			returnList = dao.doQuery(sql);

			System.out.println(sql);
			
			if ((returnList == null) || (returnList.size() == 0)) {
				return getReturnXML(hospitalID, "0003", "数据库错误6");
			}

			cou = (String)((Map)returnList.get(0)).get("cou");

			if ("0".equals(cou)) {
				return getReturnXML(hospitalID, "0002", "用户已经取号");
			}

			sql = "update registered_info set iscance = '1',cancedate = getdate() where id = '" + id + "'";
			cou = dao.doUpdate(sql);
			if ("0".equals(cou)) {
				return getReturnXML(hospitalID, "0003", "数据库错误7");
			}

			if ((begintime != null) && 
					(endtime != null) && 
					(!"".equals(begintime)) && 
					(!"".equals(endtime))) {
				sql = getSqlUpdateFY(departid, 
						doctorid, 
						isexpert, 
						worktype, 
						seedoctordate, 
						begintime, 
						endtime, 
						reserveno);

				cou = dao.doUpdate(sql);
				if ("0".equals(cou)) {
					return getReturnXML(hospitalID, "0003", "数据库错误8");
				}

			}

			sql = getSqlUpdateYG(departid, 
					doctorid, 
					isexpert, 
					worktype, 
					seedoctordate, 
					begintime, 
					endtime);

			cou = dao.doUpdate(sql);

			if ("0".equals(cou)) {
				return getReturnXML(hospitalID, "0003", "数据库错误9");
			}
		}

		return getReturnXML(hospitalID, "0000", "退号成功");
	}

	public BackNoResponse getReturnXML(String hospitalID, String code, String errMsg)
	{


		com.ws.yuyue.service.BackNoResponse Res = new BackNoResponse();
		com.ws.yuyue.service.BackNoResponse.Message msgRes = new com.ws.yuyue.service.BackNoResponse.Message();// 
		com.ws.yuyue.service.BackNoResponse.Message.ResponseInfo responseInfoRes = new com.ws.yuyue.service.BackNoResponse.Message.ResponseInfo();//


		responseInfoRes.setCode(code);
		responseInfoRes.setErrMsg(errMsg);
		msgRes.setResponseInfo(responseInfoRes);
		Res.setMessage(msgRes);


		return Res;
	}

	public String getSqlUpdateYG(String departid, String doctorid, String isexpert, String worktype, String seedoctordate, String begintime, String endtime)
	{
		String sql = "";

		if ("0".equals(isexpert)) {
			if ((("".equals(begintime)) || 
					(begintime == null)) && (
							("".equals(endtime)) || 
							(endtime == null)))
			{
				String dayOfWeek = getDayOfWeek(seedoctordate);

				sql = "update MS_KSPB set ygrs = ygrs - 1 where ghks = '" + 
						departid + "' " + 
						"and ghrq = '" + dayOfWeek + "' " + 
						"and zblb = '" + worktype + "'";
			}
			else{
				sql = "update YY_KSPB_JL set yyrs = yyrs - 1 where ghks = '" + 
						departid + "' " + 
						"and ghrq = '" + seedoctordate + "' " + 
						"and zblb = '" + worktype + "' ";
			}
		}else if (("".equals(begintime)) || 
				(begintime == null) || 
				("".equals(endtime)) || 
				(endtime == null))
		{
			sql = "update MS_GHKS set ygrs = ygrs - 1 where gzrq = '" + 
					seedoctordate + "' " + 
					"and ysdm = '" + doctorid + "' " + 
					"and ksdm = '" + departid + "' ";
			//+		"and zblb = '" + worktype + "'";
		}
		else
		{
			sql = "update YY_KSPB_JL set yyrs = yyrs - 1 where ghrq = '" + 
					seedoctordate + "' " + 
					"and ghks = '" + departid + "' " + 
					"and ysdm = '" + doctorid + "' " + 
					"and zblb = '" + worktype + "' ";
		}

		return sql;
	}

	public String getSqlUpdateFY(String departid, String doctorid, String isexpert, String worktype, String seedoctordate, String begintime, String endtime, String reserveno)
	{
		String sql = "";

		if ("0".equals(isexpert))
			sql = "update yy_kspb_hb set brid = '0',yylx=0,zt=0,yysj = null,qxsj=getdate() " +  
					"where jlxh = (select jlxh from yy_kspb_jl where ghks = '" + 
					departid + "' " + 
					"and ghrq = '" + seedoctordate + "' " + 
					"and zblb = '" + worktype + "') " + 
					"and LEFT(qssj,5) = '" + begintime + "' " + 
					"and LEFT(jzsj,5) = '" + endtime + "'" + 
					"and jzxh = '" + reserveno + "' " + 
					"and brid = '-2'";
		else {
			sql = "update yy_kspb_hb set brid = '0',yylx=0,zt=0,yysj = null,qxsj=getdate() " + 
					"where jlxh = (select jlxh from yy_kspb_jl where ghks = '" + 
					departid + "' " + 
					"and ysdm = '" + doctorid + "'" + 
					"and ghrq = '" + seedoctordate + "' " + 
					"and zblb = '" + worktype + "') " + 
					"and LEFT(qssj,5) = '" + begintime + "' " + 
					"and LEFT(jzsj,5) = '" + endtime + "' " + 
					"and jzxh = '" + reserveno + "' " + 
					"and brid = '-2'";
		}

		return sql;
	}
}