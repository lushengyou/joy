package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
import com.ws.yuyue.service.GetDepartInfoResponse;
import com.ws.yuyue.service.GetDoctorInfoResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetDoctorInfo extends GetInfo {
	private static GetDoctorInfo instance = new GetDoctorInfo();

	public static GetDoctorInfo getInstance() {
		return instance;
	}

	public static void main(String[] args) {
//		StringBuilder strXml = new StringBuilder();
//		strXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> ");
//		strXml.append("<Message>");
//		strXml.append("<requestInfo>");
//		strXml.append("<HospitalID>ZYY</HospitalID>");
//		strXml.append("</requestInfo>");
//		strXml.append("</Message>");

		// String returnXML =
		// GetDoctorInfo.getInstance().execute(strXml.toString());
		// System.out.println(returnXML);

	}

	public GetDoctorInfoResponse execute(com.ws.yuyue.service.GetDoctorInfo getDoctorInfo) {
		com.ws.yuyue.service.GetDoctorInfo.Message ms = getDoctorInfo
				.getMessage();
		String hospitalID = getDoctorInfo.getMessage().getRequestInfo()
				.getHospitalID();
		int msgtype = ms.getMsgType();

		/**
		 *  改成视图形式  Modified By Zhanggh 20160524  	
		 */
		String sql = "select ygdm,ksdm,ygxm,ygxb,ygjb,ysjj,zjpb,ygtc,jzsj,DoctorCardNo,Education,Experience,ygzc from V_YY_DoctorInfo ";
		

		InterfaceQueryDao dao = new InterfaceQueryDao();
		List returnList = dao.doQuery(sql);
		
		System.out.println(sql);
		
		com.ws.yuyue.service.GetDoctorInfoResponse Res = new GetDoctorInfoResponse();
		com.ws.yuyue.service.GetDoctorInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDoctorInfoResponse.Message();// 获得返回message
		com.ws.yuyue.service.GetDoctorInfoResponse.Message.DoctorInfo DoctorInfoRes = new com.ws.yuyue.service.GetDoctorInfoResponse.Message.DoctorInfo();// 获得返回部门信息
		List<GetDoctorInfoResponse.Message.DoctorInfo> doctorInfo = msgRes.getDoctorInfo();
		doctorInfo.clear();
		
		for (int i = 0; i < returnList.size(); i++) {
			
			Map map = (Map) returnList.get(i);
			
			if(map.get("jzsj")== null|| "".equals(map.get("jzsj"))){
				
				DoctorInfoRes.setAveWorkTime(null);
				
			}else{
				
				DoctorInfoRes.setAveWorkTime(Integer.parseInt((String) map.get("jzsj")));
				
			}
			
			if(map.get("ksdm")== null|| "".equals(map.get("ksdm"))){
				
				DoctorInfoRes.setDepartID("");
				
			}else{
				
				DoctorInfoRes.setDepartID((String) ((Map) returnList.get(i))
						.get("ksdm"));
			}
			
			if(map.get("ygdm")== null|| "".equals(map.get("ygdm"))){
				DoctorInfoRes.setDoctorID("");
			}else{
				
				DoctorInfoRes.setDoctorID((String) ((Map) returnList.get(i))
						.get("ygdm"));
			}
			
			if(map.get("ysjj")== null|| "".equals(map.get("ysjj"))){
				DoctorInfoRes.setDoctorInro("");
			}else{
				
				DoctorInfoRes.setDoctorInro((String)map.get("ysjj"));
			}
			
			if(map.get("ygtc")== null|| "".equals(map.get("ygtc"))){
				DoctorInfoRes.setDoctorIntor("");
			}else{
				
				DoctorInfoRes.setDoctorIntor((String) ((Map) returnList.get(i))
						.get("ygtc"));
			}
			
			if(map.get("ygxm")== null|| "".equals(map.get("ygxm"))){
				DoctorInfoRes.setDoctorName("");
			}else{
				DoctorInfoRes.setDoctorName((String) ((Map) returnList.get(i))
						.get("ygxm"));
			}
			
			
			if(map.get("ygxb")== null|| "".equals(map.get("ygxb"))){
				
			}else{
				DoctorInfoRes.setDoctorSex(Integer
						.parseInt((String) ((Map) returnList.get(i)).get("ygxb")));
			}
			
			if(map.get("zjpb")== null|| "".equals(map.get("zjpb"))){
				
			}else{
				DoctorInfoRes.setIsExpert(Integer
						.parseInt((String) ((Map) returnList.get(i)).get("zjpb")));
			}
			
			
			if(map.get("doctorcardno")== null|| "".equals(map.get("doctorcardno"))){
				DoctorInfoRes.setDoctorCardNo("");
				
			}else{
				DoctorInfoRes.setDoctorCardNo((String)((Map)returnList.get(i)).get("doctorcardno"));
			}
			if(map.get("education")== null|| "".equals(map.get("education"))){
				DoctorInfoRes.setEducation("");
				
			}else{
				DoctorInfoRes.setEducation((String)((Map)returnList.get(i)).get("education"));
			}
			if(map.get("experience")== null|| "".equals(map.get("experience"))){
				DoctorInfoRes.setExperience("");
				
			}else{
				DoctorInfoRes.setExperience((String)((Map)returnList.get(i)).get("experience"));
			}	
			if(map.get("ygzc")== null|| "".equals(map.get("ygzc"))){//职称字段  相城人民医院新加
				DoctorInfoRes.setDoctorRank("");
			}else{
				DoctorInfoRes.setDoctorRank((String)((Map)returnList.get(i)).get("ygzc"));
			}	
			
			DoctorInfoRes.setHospitalID(hospitalID);
			doctorInfo.add(i, DoctorInfoRes);
			DoctorInfoRes = new com.ws.yuyue.service.GetDoctorInfoResponse.Message.DoctorInfo();// 获得返回部门信息

		}
		msgRes.doctorInfo = doctorInfo;
		Res.setMessage(msgRes);
		return Res;
	}
}