/**
 * WSYuyueServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */
package register;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.bsoft.service.info.BackNoInfo;
import com.bsoft.service.info.GetDepartInfo;
import com.bsoft.service.info.GetDepartWorkInfo;
import com.bsoft.service.info.GetDoctorInfo;
import com.bsoft.service.info.GetDoctorWorkInfo;
import com.bsoft.service.info.GetDtNoInfo;
import com.bsoft.service.info.GetNoInfo;
import com.bsoft.service.info.GetQhInfo;
import com.bsoft.service.info.GetYyNo;
import com.bsoft.service.info.GetYyNo5;
import com.bsoft.service.info.UpdateOrderInfo;
import com.util.EntityToString;
import com.ws.yuyue.service.BackNoResponse;
import com.ws.yuyue.service.GetDepartInfoResponse;
import com.ws.yuyue.service.GetDepartWorkInfo.Message;
import com.ws.yuyue.service.GetDepartWorkInfoResponse;
import com.ws.yuyue.service.GetDoctorInfoResponse;
import com.ws.yuyue.service.GetDoctorWorkInfoResponse;
import com.ws.yuyue.service.GetDtNoInfoResponse;
import com.ws.yuyue.service.GetGhInfo;
import com.ws.yuyue.service.GetGhInfoResponse;
import com.ws.yuyue.service.GetYyNoResponse;
import com.ws.yuyue.service.UpdateOrderInfoResponse;

import org.apache.log4j.Logger;
/**
 *  WSYuyueServiceSkeleton java skeleton for the axisService
 */
public class WSYuyueServiceSkeleton {
    /**
     * Auto generated method signature
     *
     * @param updateOrderInfo
     * @return updateOrderInfoResponse
     */
	
	 private static final Logger log = Logger.getLogger(WSYuyueServiceSkeleton.class);

    public com.ws.yuyue.service.UpdateOrderInfoResponse updateOrderInfo(
        com.ws.yuyue.service.UpdateOrderInfo updateOrderInfo) {
        //TODO : fill this with the necessary business logic
    	
       	log.info(this.getCurrentDate()+"  "+"WS4SZ.updateOrderInfo:begin");
      	String inputObj = EntityToString.getString(updateOrderInfo, updateOrderInfo.getClass());
      	log.info("inputObj:" + inputObj);
      	System.out.println("inputObj:"+inputObj);
      	UpdateOrderInfo gdi = new UpdateOrderInfo();
      	UpdateOrderInfoResponse   objRes   =  gdi.execute(updateOrderInfo);
    	String outputObj = EntityToString.getString(objRes, objRes.getClass());
        log.info("outputObj:" + outputObj);
        log.info(this.getCurrentDate()+"  "+"WS4SZ.updateOrderInfo:end");
        System.out.println("outputObj:"+outputObj);
	  	return objRes;
    	
    	
    	
    }

    /**
     * Auto generated method signature
     *
     * @param getDoctorWorkInfo
     * @return getDoctorWorkInfoResponse
     */
    public com.ws.yuyue.service.GetDoctorWorkInfoResponse getDoctorWorkInfo(
        com.ws.yuyue.service.GetDoctorWorkInfo getDoctorWorkInfo) {
        //TODO : fill this with the necessary business logic
    	
    	
    	
       	log.info(this.getCurrentDate()+"  "+"WS4SZ.getDoctorWorkInfo:begin");
      	String inputObj = EntityToString.getString(getDoctorWorkInfo, getDoctorWorkInfo.getClass());
      	log.info("inputObj:" + inputObj);
      	System.out.println("inputObj:"+inputObj);
      	GetDoctorWorkInfo gdi = new GetDoctorWorkInfo();
      	GetDoctorWorkInfoResponse   objRes   =  gdi.execute(getDoctorWorkInfo);
    	String outputObj = EntityToString.getString(objRes, objRes.getClass());
        log.info("outputObj:" + outputObj);
        log.info(this.getCurrentDate()+"  "+"WS4SZ.getDoctorWorkInfo:end");
        System.out.println("outputObj:"+outputObj);
	  	return objRes;
  
    }

    /**
     * Auto generated method signature
     *
     * @param getYyNo
     * @return getYyNoResponse
     */
    public com.ws.yuyue.service.GetYyNoResponse getYyNo(
        com.ws.yuyue.service.GetYyNo getYyNo) {
        //TODO : fill this with the necessary business logic
       	log.info(this.getCurrentDate()+"  "+"WS4SZ.getYyNo:begin");
      	String inputObj = EntityToString.getString(getYyNo, getYyNo.getClass());
      	log.info("inputObj:" + inputObj);
      	System.out.println("inputObj:"+inputObj);
//      	GetYyNo5 gdi = new GetYyNo5();//5系列更改
      GetYyNo gdi = new GetYyNo();
      	GetYyNoResponse   objRes   =  gdi.execute(getYyNo);
    	String outputObj = EntityToString.getString(objRes, objRes.getClass());
        log.info("outputObj:" + outputObj);
        log.info(this.getCurrentDate()+"  "+"WS4SZ.getYyNo:end");
        System.out.println("outputObj:"+outputObj);
	  	return objRes;
    	
    }

    /**
     * Auto generated method signature
     *
     * @param getDtNoInfo
     * @return getDtNoInfoResponse
     */
    public com.ws.yuyue.service.GetDtNoInfoResponse getDtNoInfo(
        com.ws.yuyue.service.GetDtNoInfo getDtNoInfo) {
        //TODO : fill this with the necessary business logic
    	
       	log.info(this.getCurrentDate()+"  "+"WS4SZ.getDtNoInfo:begin");
      	String inputObj = EntityToString.getString(getDtNoInfo, getDtNoInfo.getClass());
      	log.info("inputObj:" + inputObj);
      	System.out.println("inputObj:"+inputObj);
      	GetNoInfo gdi = new GetNoInfo();
      	GetDtNoInfoResponse   objRes   =  gdi.execute(getDtNoInfo);
    	String outputObj = EntityToString.getString(objRes, objRes.getClass());
        log.info("outputObj:" + outputObj);
        log.info(this.getCurrentDate()+"  "+"WS4SZ.getDtNoInfo:end");
        System.out.println("outputObj:"+outputObj);
	  	return objRes;
    }

    /**
     * Auto generated method signature
     *
     * @param backNo
     * @return backNoResponse
     */
    public com.ws.yuyue.service.BackNoResponse backNo(
        com.ws.yuyue.service.BackNo backNo) {
    	
       	log.info(this.getCurrentDate()+"  "+"WS4SZ.backNo:begin");
      	String inputObj = EntityToString.getString(backNo, backNo.getClass());
      	log.info("inputObj:" + inputObj);
      	System.out.println("inputObj:"+inputObj);
      	BackNoInfo gdi = new BackNoInfo();
      	BackNoResponse   objRes   =  gdi.execute(backNo);
    	String outputObj = EntityToString.getString(objRes, objRes.getClass());
        log.info("outputObj:" + outputObj);
        log.info(this.getCurrentDate()+"  "+"WS4SZ.backNo:end");
        System.out.println("outputObj:"+outputObj);
	  	return objRes;
    	
        //TODO : fill this with the necessary business logic
    }

    /**
     * Auto generated method signature
     *
     * @param getDoctorInfo
     * @return getDoctorInfoResponse
     */
    public com.ws.yuyue.service.GetDoctorInfoResponse getDoctorInfo(
        com.ws.yuyue.service.GetDoctorInfo getDoctorInfo) {
    	
    	log.info(this.getCurrentDate()+"  "+"WS4SZ.getDoctorInfo:begin");
      	String inputObj = EntityToString.getString(getDoctorInfo, getDoctorInfo.getClass());
      	log.info("inputObj:" + inputObj);
      	System.out.println("inputObj:"+inputObj);
      	GetDoctorInfo gdi = new GetDoctorInfo();
      	GetDoctorInfoResponse   objRes   =  gdi.execute(getDoctorInfo);
    	String outputObj = EntityToString.getString(objRes, objRes.getClass());
        log.info("outputObj:" + outputObj);
        log.info(this.getCurrentDate()+"  "+"WS4SZ.getDoctorInfo:end");
        System.out.println("outputObj:"+outputObj);
	  	return objRes;
    	
        //TODO : fill this with the necessary business logic
    }

    /**
     * Auto generated method signature
     *
     * @param getDepartInfo
     * @return getDepartInfoResponse
     */
    public com.ws.yuyue.service.GetDepartInfoResponse getDepartInfo(
        com.ws.yuyue.service.GetDepartInfo getDepartInfo) {
        //TODO : fill this with the necessary business logic
    	log.info(this.getCurrentDate()+"  "+"WS4SZ.getDepartInfo:begin");
      	String inputObj = EntityToString.getString(getDepartInfo, getDepartInfo.getClass());
      	log.info("inputObj:" + inputObj);
      	System.out.println("inputObj:"+inputObj);
    	GetDepartInfo gdi = new GetDepartInfo();
    	GetDepartInfoResponse   objRes   =  gdi.execute(getDepartInfo);
    	String outputObj = EntityToString.getString(objRes, objRes.getClass());
        log.info("outputObj:" + outputObj);
        log.info(this.getCurrentDate()+"  "+"WS4SZ.getDepartInfo:end");
        System.out.println("outputObj:"+outputObj);
	  	return objRes;
//        throw new java.lang.UnsupportedOperationException("Please implement " +
//            this.getClass().getName() + "#getDepartInfo");
    }

    /**
     * Auto generated method signature
     *
     * @param getGhInfo
     * @return getGhInfoResponse
     */
    public com.ws.yuyue.service.GetGhInfoResponse getGhInfo(
        com.ws.yuyue.service.GetGhInfo getGhInfo) {
    	
    	
    	log.info(this.getCurrentDate()+"  "+"WS4SZ.getGhInfo:begin");
      	String inputObj = EntityToString.getString(getGhInfo, getGhInfo.getClass());
      	log.info("inputObj:" + inputObj);
      	System.out.println("inputObj:"+inputObj);
      	GetQhInfo gdi = new GetQhInfo();
    	GetGhInfoResponse   objRes   =  gdi.execute(getGhInfo);
    	String outputObj = EntityToString.getString(objRes, objRes.getClass());
        log.info("outputObj:" + outputObj);
        log.info(this.getCurrentDate()+"  "+"WS4SZ.getGhInfo:end");
        System.out.println("outputObj:"+outputObj);
	  	return objRes;
    	
    	
    }

    /**
     * Auto generated method signature
     *
     * @param getDepartWorkInfo
     * @return getDepartWorkInfoResponse
     */
    public com.ws.yuyue.service.GetDepartWorkInfoResponse getDepartWorkInfo(
        com.ws.yuyue.service.GetDepartWorkInfo getDepartWorkInfo) {


       	log.info(this.getCurrentDate()+"  "+"WS4SZ.getDepartWorkInfo:begin");
      	String inputObj = EntityToString.getString(getDepartWorkInfo, getDepartWorkInfo.getClass());
      	log.info("inputObj:" + inputObj);
      	System.out.println("inputObj:"+inputObj);
      	GetDepartWorkInfo gdi = new GetDepartWorkInfo();
      	GetDepartWorkInfoResponse   objRes   =  gdi.execute(getDepartWorkInfo);
    	String outputObj = EntityToString.getString(objRes, objRes.getClass());
        log.info("outputObj:" + outputObj);
        log.info(this.getCurrentDate()+"  "+"WS4SZ.getDepartWorkInfo:end");
        System.out.println("outputObj:"+outputObj);
	  	return objRes;
    }
    
    
    public String getCurrentDate(){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");   
    	return sdf.format(new Date());
      }
}
