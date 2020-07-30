package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
import com.ws.yuyue.service.GetDepartWorkInfoResponse;
import com.ws.yuyue.service.GetDtNoInfoResponse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetBedResourcesInfo extends GetInfo
{
  private static GetBedResourcesInfo instance = new GetBedResourcesInfo();

  public static GetBedResourcesInfo getInstance()
  {
    return instance;
  }

  public static void main(String[] args){
	  StringBuilder strXml = new StringBuilder();
      strXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> ");
      strXml.append("<Message>");
      strXml.append("<requestInfo>");
      strXml.append("<HospitalID>ZYY</HospitalID>");
      strXml.append("<DoctorId>11329</DoctorId>");
      strXml.append("<DepartId>100</DepartId>");
      strXml.append("<WorkDate>2015-10-20</WorkDate>");
      strXml.append("<WorkType>2</WorkType>");
      strXml.append("</requestInfo>");
      strXml.append("</Message>");
	  
//      String returnXML = GetDtNoInfo.getInstance().execute(strXml.toString());
//      System.out.println(returnXML);
      
  }
  
  public GetDtNoInfoResponse execute(com.ws.yuyue.service.GetDtNoInfo getDtNoInfo)
  {
	com.ws.yuyue.service.GetDtNoInfo.Message    message =     getDtNoInfo.getMessage();
	String departId = message.getRequestInfo().getDepartID();
	String doctorId = message.getRequestInfo().getDoctorID();
	String hospitalID = message.getRequestInfo().getHospitalID();
	String workDate = message.getRequestInfo().getWorkDate();
	int workType = message.getRequestInfo().getWorkType();
	

    String startTime = GetInfo.StartTime1;
    String endTime = GetInfo.EndTime1;

    if ("2".equals(workType)) {
      startTime = GetInfo.StartTime2;
      endTime = GetInfo.EndTime2;
    }

    String sql = "select cwzs as sjxe,cwsys as syhy,zymc,"
    		+ "CONVERT(varchar(12) , getdate(), 108 ) as qssj, "
    		+ "CONVERT(varchar(12) , getdate(), 108 ) as jzsj from   v_yy_cwsyxx  where ksdm = '"+departId+"' ";
 

    InterfaceQueryDao dao = new InterfaceQueryDao(); 
    List returnList = dao.doQuery(sql);

    System.out.println(sql);
    
    int returnCou = 0;
    if ((returnList != null) && (returnList.size() > 0)) {
      returnCou = Integer.parseInt((String)((Map)returnList.get(0)).get("sjxe"));
      returnCou = returnCou * 2;
      if (returnCou > returnList.size()) {
        returnCou = returnList.size();
      }
    }

	com.ws.yuyue.service.GetDtNoInfoResponse Res = new GetDtNoInfoResponse();
	com.ws.yuyue.service.GetDtNoInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message();// 
	msgRes.workInfo = null ;
	com.ws.yuyue.service.GetDtNoInfoResponse.Message.WorkInfo workInfoRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.WorkInfo();//
	List<GetDtNoInfoResponse.Message.WorkInfo> workInfo = msgRes.getWorkInfo();
	
	for (int i = 0; i < returnCou; i++) {
		
		Map map = (Map) returnList.get(i);
		
		if(map.get("jzrs")== null|| "".equals(map.get("jzrs"))){
		}else{
			workInfoRes.setCheckSum(Integer.parseInt((String) map.get("jzrs")));
		}
		if(map.get("jzsj")== null|| "".equals(map.get("jzsj"))){
			
		}else{
			workInfoRes.setEndTime((String) map.get("jzsj"));
		}
		if(map.get("syhy")== null|| "".equals(map.get("syhy"))){
			
		}else{
			workInfoRes.setLeftNum(Integer.parseInt((String) map.get("syhy")));
		}
		if(map.get("qssj")== null|| "".equals(map.get("qssj"))){
			
		}else{
			workInfoRes.setStartTime((String) map.get("qssj"));
		}
		if(map.get("sjxe")== null|| "".equals(map.get("sjxe"))){
			
		}else{
			workInfoRes.setTotalNum(Integer.parseInt((String) map.get("sjxe")));
		}
		if(map.get("zymc")== null|| "".equals(map.get("zymc"))){
		}else{
			workInfoRes.setResName((String) map.get("zymc"));
		}
		workInfo.add(i, workInfoRes);
		workInfoRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.WorkInfo();//
	}
	Res.setMessage(msgRes);
	return Res; 
  }
  
  
  

}