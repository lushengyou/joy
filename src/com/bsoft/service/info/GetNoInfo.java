package com.bsoft.service.info;

import java.util.Map;

import com.ws.yuyue.service.GetDtNoInfoResponse;

public class GetNoInfo extends GetInfo
{
  private static GetNoInfo instance = new GetNoInfo();

  public static GetNoInfo getInstance()
  {
    return instance;
  }

  public GetDtNoInfoResponse execute(com.ws.yuyue.service.GetDtNoInfo getDtNoInfo)
  {
	    com.ws.yuyue.service.GetDtNoInfo.Message    message =     getDtNoInfo.getMessage();
	    String doctorId = message.getRequestInfo().getDoctorID();
	    int workType = message.getRequestInfo().getWorkType();
	    
	    if(workType == 50){
	    	  return GetBedResourcesInfo.getInstance().execute(getDtNoInfo);
	    }else{
		    if (strIsNull(doctorId)){
		      return GetDepartNoInfo.getInstance().execute(getDtNoInfo);
		    }
		    else {
		      return GetDtNoInfo.getInstance().execute(getDtNoInfo);
		    }
	    }
	  }
}