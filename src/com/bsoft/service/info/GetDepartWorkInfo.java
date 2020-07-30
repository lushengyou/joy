package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
//import com.info.GetInfo;
import com.ws.yuyue.service.GetDepartWorkInfoResponse;
import com.ws.yuyue.service.GetDoctorWorkInfoResponse;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetDepartWorkInfo extends GetInfo
{
	private static GetDepartWorkInfo instance = new GetDepartWorkInfo();

	public static GetDepartWorkInfo getInstance()
	{
		return instance;
	}

	public static void main(String[] args){

		//	  System.out.println(GetDepartWorkInfo.getInstance().getDateMap("2013-10-15","2013-10-22"));
		//	  
		//	  StringBuilder strXml = new StringBuilder();
		//      strXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> ");
		//      strXml.append("<Message>");
		//      strXml.append("<requestInfo>");
		//      strXml.append("<HospitalID>ZYY</HospitalID>");
		//      strXml.append("<BeginTime>2013-09-13</BeginTime>");
		//      strXml.append("<EndTime>2013-09-13</EndTime>");
		//      strXml.append("<DepartId>100</DepartId>");
		//      strXml.append("</requestInfo>");
		//      strXml.append("</Message>");
		//	  
		//      String returnXML = GetDepartWorkInfo.getInstance().execute(strXml.toString());
		//      System.out.println(returnXML);

	}

	public GetDepartWorkInfoResponse execute(com.ws.yuyue.service.GetDepartWorkInfo getDepartWorkInfo)
	{

		com.ws.yuyue.service.GetDepartWorkInfo.Message    message =     getDepartWorkInfo.getMessage();
		String beginTime =  message.getRequestInfo().getBeginTime();
		String endTime = message.getRequestInfo().getEndTime();
		String hospitalID = message.getRequestInfo().getHospitalID();
		String departId = message.getRequestInfo().getDepartID();

		int msgType = message.getMsgType();


		Map dateMap = getDateMap(beginTime, endTime);
		Iterator iterator = dateMap.keySet().iterator();

		String dateStr = "";
		while (iterator.hasNext()) {
			dateStr = dateStr + (String)iterator.next() + ",";
		}

		if ((dateStr != null) && (!"".equals(dateStr)))
			dateStr = dateStr.substring(0, dateStr.length() - 1);
		else {
			dateStr = "9";
		}

		StringBuilder sql_sb = new StringBuilder();

		/**
		 *  改成视图形式  Modified By Zhanggh 20160524     
		 */

		sql_sb.append("select ")
		.append("A.TZBZ,")
		.append("A.GHKS,")
		.append("A.GHRQ,")
		.append("A.ZBLB,")
		.append("A.WSXH,")
		.append("A.GHF,")
		.append("A.ZLF,")
		.append("A.KSHM,")
		.append("A.JGHM,")
		.append("A.REMARK ")		
		.append("from V_YY_DepartWorkInfo A ");
		sql_sb.append("where 1 = 1 ");
		if (!strIsNull(departId)) {
			sql_sb.append("and A.GHKS = '").append(departId).append("' ");
		}
		sql_sb.append("and (A.GHRQ BETWEEN '").append(beginTime).append("' AND '").append(endTime).append("') ")
		.append("UNION ALL ")
		.append("select ")
		.append("A.TZBZ,")
		.append("A.GHKS,")
		.append("A.GHRQ,")
		.append("A.ZBLB,")
		.append("A.WSXH,")
		.append("A.GHF,")
		.append("A.ZLF,")
		.append("A.KSHM,")
		.append("A.JGHM,")
		.append("A.REMARK ")
		.append("from V_YY_DepartWorkInfo_NOFS A ");
		sql_sb.append("where 1 = 1 ");
		if (!strIsNull(departId)) {
			sql_sb.append("and A.GHKS = '").append(departId).append("' ");
		}
		sql_sb.append("and A.GHRQ in (").append(dateStr).append(")");  

		String sql = sql_sb.toString();

		//    String[] queryField = { "ghks", 
		//      "tzbz", 
		//      "ghrq", 
		//      "zblb", 
		//      "wsxh", 
		//      "ghf", 
		//      "zlf", 
		//      "kshm", 
		//      "jghm" };

		Map returnXmlMap = new HashMap();
		returnXmlMap.put("tzbz", "WorkStatus");
		returnXmlMap.put("ghks", "DepartId");
		returnXmlMap.put("ghrq", "WorkDate");
		returnXmlMap.put("zblb", "WorkType");
		returnXmlMap.put("wsxh", "Limited");
		returnXmlMap.put("ghf", "Registryfee");
		returnXmlMap.put("zlf", "Chinicfee");
		returnXmlMap.put("kshm", "BeginNo");
		returnXmlMap.put("jghm", "SpaceNo");
		returnXmlMap.put("remark", "remark");
		

		InterfaceQueryDao dao = new InterfaceQueryDao();
		List returnList = dao.doQuery(sql);

		System.out.println(sql);

		com.ws.yuyue.service.GetDepartWorkInfoResponse Res = new GetDepartWorkInfoResponse();
		com.ws.yuyue.service.GetDepartWorkInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDepartWorkInfoResponse.Message();// 
		com.ws.yuyue.service.GetDepartWorkInfoResponse.Message.DepartCalendar DepartCalendarRes = new com.ws.yuyue.service.GetDepartWorkInfoResponse.Message.DepartCalendar();//
		List<GetDepartWorkInfoResponse.Message.DepartCalendar> departCalendar = msgRes.getDepartCalendar();
		departCalendar.clear();

		for (int i = 0; i < returnList.size(); i++) {

			Map map = (Map) returnList.get(i);


			if(map.get("kshm")== null|| "".equals(map.get("kshm"))){
			}else{
				DepartCalendarRes.setBeginNo(Integer.parseInt((String) map.get("kshm")));
			}
			if(map.get("zlf")== null|| "".equals(map.get("zlf"))){
			}else{
				DepartCalendarRes.setClinicFee(Double.parseDouble((String) map.get("zlf")));
			}
			if(map.get("ghks")== null|| "".equals(map.get("ghks"))){
			}else{
				DepartCalendarRes.setDepartID((String) map.get("ghks"));
			}

			DepartCalendarRes.setHospitalID(hospitalID);
			if(map.get("wsxh")== null|| "".equals(map.get("wsxh"))){
			}else{
				DepartCalendarRes.setLimited(Integer.parseInt((String) map.get("wsxh")));
			}
			if(map.get("ghf")== null|| "".equals(map.get("ghf"))){
			}else{
				DepartCalendarRes.setRegistryFee(Double.parseDouble((String) map.get("ghf")));
			}
			if(map.get("remark")== null|| map.get("remark") == ""){
			}else{
				DepartCalendarRes.setRemark((String) map.get("remark"));
			}
			if(map.get("jghm")== null|| "".equals(map.get("jghm"))){
			}else{
				DepartCalendarRes.setSpaceNo(Integer.parseInt((String) map.get("jghm")));
			}
			if(map.get("ghrq")== null|| "".equals(map.get("ghrq"))){
			}else{
				String ghrq = (String) map.get("ghrq");
				/**
				 * BUG 处理  正常日期直接取值
				 */
//				String ghrq2 =  (String) dateMap.get(ghrq);
				if(ghrq.contains("1900")){
					String ghrq1  = (String) dateMap.get(new StringBuilder(String.valueOf(Integer.parseInt(ghrq.substring(9, 10)) - 1)).toString());
					DepartCalendarRes.setWorkDate(ghrq1);
				}else{
//					DepartCalendarRes.setWorkDate(ghrq2);
					DepartCalendarRes.setWorkDate(ghrq.substring(0,10));
				}
			}
			if(map.get("tzbz")== null|| "".equals(map.get("tzbz"))){
			}else{
				DepartCalendarRes.setWorkStatus(Integer.parseInt((String) map.get("tzbz")));
			}
			if(map.get("zblb")== null|| "".equals(map.get("zblb"))){
			}else{
				DepartCalendarRes.setWorkType(Integer.parseInt((String) map.get("zblb")));
			}
			//      for (int j = 0; j < queryField.length; j++) {
			//    	
			//    	value = (String)((Map)returnList.get(i)).get(queryField[j]);
			//    	  
			//        if ("ghrq".equals(queryField[j])) {
			//          if (value.contains("1900")){
			//              returnXml.append("<" + (String)returnXmlMap.get(queryField[j]) + ">" + 
			//                      (String)dateMap.get(new StringBuilder(String.valueOf(Integer.parseInt(value.substring(9, 10)) - 1)).toString()) + 
			//                      "</" + (String)returnXmlMap.get(queryField[j]) + "> ");
			//          }
			//          else{
			//              returnXml.append("<" + (String)returnXmlMap.get(queryField[j]) + ">" + 
			//            		  dateMap.get(value)+
			//                      "</" + (String)returnXmlMap.get(queryField[j]) + "> ");
			//          }
			//        }
			//        else {
			//          returnXml.append("<" + (String)returnXmlMap.get(queryField[j]) + ">" + 
			//        		  value + 
			//            "</" + (String)returnXmlMap.get(queryField[j]) + "> ");
			//        }
			//      }
			departCalendar.add(i, DepartCalendarRes);
			DepartCalendarRes = new com.ws.yuyue.service.GetDepartWorkInfoResponse.Message.DepartCalendar();//

		}

		msgRes.departCalendar = departCalendar;
		Res.setMessage(msgRes);
		return Res; 
	}

	public Map<String, String> getDateMap(String beginTime, String endTime)
	{
		Map<String, String> dateMap = new HashMap<String, String>();
		try {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date beginDate = format.parse(beginTime);
			Date endDate = format.parse(endTime);
			Date standDate = new Date();

			Calendar calendar = Calendar.getInstance();

			calendar.setTime(standDate);
			calendar.add(5, 6);
			standDate = calendar.getTime();

			calendar.setTime(beginDate);

			while (!standDate.before(beginDate))
			{
				dateMap.put(calendar.get(Calendar.DAY_OF_WEEK)+"", format.format(beginDate));
				calendar.add(5, 1);
				beginDate = calendar.getTime();

				if (endDate.before(beginDate)) break; 
			}
		}
		catch (ParseException e)
		{
			e.printStackTrace();
		}
		return dateMap;
	}
}