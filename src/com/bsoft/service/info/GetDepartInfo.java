package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
import com.util.EntityToString;
import com.ws.yuyue.service.GetDepartInfoResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetDepartInfo extends GetInfo
{
  private static GetDepartInfo instance = new GetDepartInfo();

  public static GetDepartInfo getInstance()
  {
    return instance;
  }

  public static void main(String[] args){
//	  StringBuilder strXml = new StringBuilder();
//      strXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> ");
//      strXml.append("<Message>");
//      strXml.append("<requestInfo>");
//      strXml.append("<HospitalID>ZYY</HospitalID>");
//      strXml.append("</requestInfo>");
//      strXml.append("</Message>");
//	  
//      String returnXML = GetDepartInfo.getInstance().execute(strXml.toString());
//      System.out.println(returnXML);
      
  }
  
  public GetDepartInfoResponse execute(com.ws.yuyue.service.GetDepartInfo getDepartInfo)
  {
	  com.ws.yuyue.service.GetDepartInfo.Message ms = getDepartInfo.getMessage();
  	  String hospitalID = getDepartInfo.getMessage().getRequestInfo().getHospitalID();
  	  int msgtype = ms.getMsgType();
//	  String aaaa = EntityToString.getString(message, message.getClass());
//	  System.out.println(aaaa);
//    Map parserXmlMap = parserXml(strXml);
//    String hospitalID = (String)parserXmlMap.get("HospitalID");
  	  
//  	  loadXmlEdit();
  	  
  	  /**
  	   *  改成视图形式  Modified By Zhanggh 20160524 
  	   */
 

    String sql = "select ksmc,ksdm,ghlb,ghf,zlf,mzks,ksxb,ekbz,ksjj,etnl,IsSpecialDepart,Phone,remark from V_YY_DepartInfo ";

    InterfaceQueryDao dao = new InterfaceQueryDao();
    List returnList = dao.doQuery(sql);
    
    System.out.println(sql);
    
	com.ws.yuyue.service.GetDepartInfoResponse Res = new GetDepartInfoResponse();//获得返回对象，
	com.ws.yuyue.service.GetDepartInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDepartInfoResponse.Message();//获得返回message
	com.ws.yuyue.service.GetDepartInfoResponse.Message.DepartInfo DepartInfoRes = new com.ws.yuyue.service.GetDepartInfoResponse.Message.DepartInfo();//获得返回部门信息
	
	List<GetDepartInfoResponse.Message.DepartInfo>  deptinfo = msgRes.getDepartInfo();
	deptinfo.clear();
    for (int i = 0; i < returnList.size(); i++) {
    		DepartInfoRes.setBabyFlag(Integer.parseInt((String) ((Map) returnList.get(i)).get("ekbz")));
    		if("0".equals((String) ((Map) returnList.get(i)).get("ekbz"))){
    			DepartInfoRes.setBabyAge(null);
    		}else{
    			DepartInfoRes.setBabyAge(Integer.parseInt((String) ((Map) returnList.get(i)).get("etnl")));
    		}
//    		DepartInfoRes.setBabyAge(Integer.parseInt((String) ((Map) returnList.get(i)).get("etnl")));

    		DepartInfoRes.setClinicFee(Double.parseDouble((String) ((Map) returnList.get(i)).get("zlf")));
    		DepartInfoRes.setDepartID((String)((Map) returnList.get(i)).get("ksdm"));
    		DepartInfoRes.setDepartIntro((String)((Map) returnList.get(i)).get("ksjj"));
    		DepartInfoRes.setDepartName((String)((Map) returnList.get(i)).get("ksmc"));
    		DepartInfoRes.setDepartSex(Integer.parseInt((String)((Map) returnList.get(i)).get("ksxb")));
    		DepartInfoRes.setDepartType(Integer.parseInt((String) ((Map) returnList.get(i)).get("ghlb")));
    		DepartInfoRes.setHospitalID(hospitalID);
    		DepartInfoRes.setMZKS((String)((Map) returnList.get(i)).get("mzks"));
    		DepartInfoRes.setRegistryFee(Double.parseDouble((String) ((Map) returnList.get(i)).get("ghf")));
    		String isspecialdepart =  (((Map) returnList.get(i)).get("isspecialdepart")).toString();
    		DepartInfoRes.setIsSpecialDepart(Integer.parseInt(isspecialdepart));
    		String phone =  (((Map) returnList.get(i)).get("phone")).toString();    		
    		DepartInfoRes.setPhone(phone);
    		String remark =  (((Map) returnList.get(i)).get("remark")).toString();
    		DepartInfoRes.setRemark(remark);
    		deptinfo.add(i, DepartInfoRes);
    		DepartInfoRes = new com.ws.yuyue.service.GetDepartInfoResponse.Message.DepartInfo();
    }	
    msgRes.departInfo = deptinfo; 
	Res.setMessage(msgRes);
    return Res;
  }
}