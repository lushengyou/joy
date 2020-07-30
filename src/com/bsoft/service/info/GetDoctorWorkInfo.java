package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
//import com.info.GetInfo;
import com.ws.yuyue.service.GetDoctorInfoResponse;
import com.ws.yuyue.service.GetDoctorWorkInfoResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetDoctorWorkInfo extends GetInfo
{
  private static GetDoctorWorkInfo instance = new GetDoctorWorkInfo();

  public static GetDoctorWorkInfo getInstance()
  {
    return instance;
  }

  public static void main(String[] args){
//	  StringBuilder strXml = new StringBuilder();
//      strXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> ");
//      strXml.append("<Message>");
//      strXml.append("<requestInfo>");
//      strXml.append("<HospitalID>ZYY</HospitalID>");
//      strXml.append("<BeginTime>2013-09-13</BeginTime>");
//      strXml.append("<EndTime>2013-09-14</EndTime>");
//      strXml.append("<DoctorId>11412</DoctorId>");
//      strXml.append("<DepartId>100</DepartId>");
//      strXml.append("</requestInfo>");
//      strXml.append("</Message>");      
  }
  
  public GetDoctorWorkInfoResponse execute(com.ws.yuyue.service.GetDoctorWorkInfo getDoctorWorkInfo)
  {
	  
	  com.ws.yuyue.service.GetDoctorWorkInfo.Message ms = getDoctorWorkInfo.getMessage();
  	  String hospitalID = getDoctorWorkInfo.getMessage().getRequestInfo().getHospitalID();
  	  int msgtype = ms.getMsgType();
  	  String doctorId = getDoctorWorkInfo.getMessage().getRequestInfo().getDoctorID();
  	  String departId = getDoctorWorkInfo.getMessage().getRequestInfo().getDepartID();
  	  String beginTime = getDoctorWorkInfo.getMessage().getRequestInfo().getBeginTime();
  	  String endTime = getDoctorWorkInfo.getMessage().getRequestInfo().getEndTime();

    StringBuilder sql_sb = new StringBuilder();

    /**
     *  改成视图形式  Modified By Zhanggh 20160524  	
     */
//    sql_sb.append("select ")
//      .append("A.TZBZ as tgbz,")
//      .append("A.YSDM as ysdm,")
//      .append("A.GHKS as ksdm,")
//      .append("A.GHRQ as gzrq,")
//      .append("A.ZBLB as zblb,")
//      .append("A.WSXH as sjxe,'")
//      .append(GetInfo.BeginNo).append("' as kshm,'")
//      .append(GetInfo.SpaceNo).append("' as jghm,")
//      .append("C.GHF as ghf,")
//      .append("C.ZLF as zlf,")
//      .append("B.ZJFY as zjfy ")
//      .append("from YY_KSPB_JL A,GY_YGDM B,MS_GHKS C ")
//      .append("where A.YSDM = B.YGDM ")
//      .append("and A.GHKS = C.KSDM ");
////      .append("and A.KSLB = 3 ");
//    if (!strIsNull(doctorId)) {
//      sql_sb.append("and A.YSDM = '").append(doctorId).append("' ");
//    }
//    if (!strIsNull(departId)) {
//      sql_sb.append("and A.GHKS = '").append(departId).append("' ");
//    }
//    sql_sb.append("and ISNULL(A.WSXH,0) > 0 ")
//      .append("and A.GHRQ BETWEEN '").append(beginTime).append("' AND '").append(endTime).append("' ");

    sql_sb.append("select ")
    .append("A.TZBZ,")
    .append("A.YSDM,")
    .append("A.GHKS,")
    .append("A.GHRQ,")
    .append("A.ZBLB,")
    .append("A.WSXH,")
    .append("A.GHF,")
    .append("A.ZLF,")
    .append("A.ZJFY,")
    .append("A.KSHM,")
    .append("A.JGHM, ")
    .append("A.REMARK ")
    .append("from V_YY_DoctorWorkInfo A ");
    sql_sb.append("where 1 = 1 ");
  if (!strIsNull(doctorId)) {
    sql_sb.append("and A.YSDM = '").append(doctorId).append("' ");
  }
  if (!strIsNull(departId)) {
    sql_sb.append("and A.GHKS = '").append(departId).append("' ");
  }
  sql_sb.append("and A.GHRQ BETWEEN '").append(beginTime).append("' AND '").append(endTime).append("' ");

    String sql = sql_sb.toString();
    
    InterfaceQueryDao dao = new InterfaceQueryDao();
    List returnList = dao.doQuery(sql);

    System.out.println(sql);
    
	com.ws.yuyue.service.GetDoctorWorkInfoResponse Res = new GetDoctorWorkInfoResponse();
	com.ws.yuyue.service.GetDoctorWorkInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDoctorWorkInfoResponse.Message();// 
	com.ws.yuyue.service.GetDoctorWorkInfoResponse.Message.DoctorCalendar DoctorCalendarRes = new com.ws.yuyue.service.GetDoctorWorkInfoResponse.Message.DoctorCalendar();//
	List<GetDoctorWorkInfoResponse.Message.DoctorCalendar> doctorCalendar = msgRes.getDoctorCalendar();
	doctorCalendar.clear();
	
	for (int i = 0; i < returnList.size(); i++) {
		
		Map map = (Map) returnList.get(i);
		
		
		if(map.get("kshm")== null|| "".equals(map.get("kshm"))){
		}else{
			DoctorCalendarRes.setBeginNo(Integer.parseInt((String) map.get("kshm")));
		}
		if(map.get("zlf")== null|| "".equals(map.get("zlf"))){
		}else{
			DoctorCalendarRes.setClinicFee(Double.parseDouble((String) map.get("zlf")));
		}
		
		if(map.get("ghks")== null|| "".equals(map.get("ghks"))){
		}else{
			DoctorCalendarRes.setDepartID(map.get("ghks").toString());
		}		
		if(map.get("ysdm")== null|| "".equals(map.get("ysdm"))){
		}else{
			DoctorCalendarRes.setDoctorID(map.get("ysdm").toString());
		}
		if(map.get("zjfy")== null|| "".equals(map.get("zjfy"))){
		}else{
			DoctorCalendarRes.setExpertsFee(Double.parseDouble((String) map.get("zjfy")));
		}
			DoctorCalendarRes.setHospitalID(hospitalID);
//		if(map.get("sjxe")== null|| "".equals(map.get("sjxe"))){
//		}else{
//			DoctorCalendarRes.setLimited(Integer.parseInt((String) map.get("sjxe")));
//		}
		if(map.get("wsxh")== null|| "".equals(map.get("wsxh"))){
			}else{
				DoctorCalendarRes.setLimited(Integer.parseInt((String) map.get("wsxh")));
			}
		if(map.get("ghf")== null|| "".equals(map.get("ghf"))){
		}else{
			DoctorCalendarRes.setRegistryFee(Double.parseDouble((String) map.get("ghf")));
		}
		if(map.get("jghm")== null|| "".equals(map.get("jghm"))){
		}else{
			DoctorCalendarRes.setSpaceNo(Integer.parseInt((String) map.get("jghm")));
		}
		if(map.get("ghrq")== null|| "".equals(map.get("ghrq"))){
		}else{
			String gzrq = (String) map.get("ghrq");
			DoctorCalendarRes.setWorkDate(gzrq.substring(0,10));
		}
		if(map.get("tzbz")== null|| "".equals(map.get("tzbz"))){
		}else{
			DoctorCalendarRes.setWorkStatus(Integer.parseInt((String) map.get("tzbz")));
		}
		if(map.get("zblb")== null|| "".equals(map.get("zblb"))){
		}else{
			DoctorCalendarRes.setWorkType(Integer.parseInt((String) map.get("zblb")));
		}
		if(map.get("remark")== null|| "".equals(map.get("remark"))){
		}else{
			DoctorCalendarRes.setRemark((String) map.get("remark"));
			//DoctorCalendarRes.setRemark("测试测试");
		}
		doctorCalendar.add(i, DoctorCalendarRes);
		DoctorCalendarRes = new com.ws.yuyue.service.GetDoctorWorkInfoResponse.Message.DoctorCalendar();//

	}
	msgRes.doctorCalendar = doctorCalendar;
	Res.setMessage(msgRes);
	return Res; 
    

    
  }
}