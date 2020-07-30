package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
import com.ws.yuyue.service.GetDtNoInfoResponse;
import com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

import register.WSYuyueServiceSkeleton;

public class GetDepartNoInfo extends GetInfo
{
  private static GetDepartNoInfo instance = new GetDepartNoInfo();
  
  private static final Logger log = Logger.getLogger(GetDepartNoInfo.class);
  
  public static GetDepartNoInfo getInstance()
  {
    return instance;
  }

  public static void main(String[] args){
//	  StringBuilder strXml = new StringBuilder();
//      strXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> ");
//      strXml.append("<Message>");
//      strXml.append("<requestInfo>");
//      strXml.append("<HospitalID>ZYY</HospitalID>");
//      strXml.append("<DepartId>100</DepartId>");
//      strXml.append("<WorkDate>2013-09-13</WorkDate>");
//      strXml.append("<WorkType>1</WorkType>");
//      strXml.append("</requestInfo>");
//      strXml.append("</Message>");
	  
//      String returnXML = GetDepartNoInfo.getInstance().execute(strXml.toString());
//      System.out.println(returnXML);
      
  }
  
  public GetDtNoInfoResponse execute(com.ws.yuyue.service.GetDtNoInfo getDtNoInfo)
  {
	  
	com.ws.yuyue.service.GetDtNoInfo.Message    message =     getDtNoInfo.getMessage();
	
    String hospitalID =  message.getRequestInfo().getHospitalID();
    String departId = message.getRequestInfo().getDepartID();
    String workDate =  message.getRequestInfo().getWorkDate();
    int workType =  	((Integer)message.getRequestInfo().getWorkType());
//    int workType = message.getRequestInfo().getWorkType();
	
    int workType1 = workType;
	if(HospitalCode.equals("MDYY")){
		if(workType1 == 3){// 由于木渎人民医院 全天是 0  而12320规定的全天是 3  因此在挂号的时候 转换一下
			workType1 = 0;
		}
	}
	
//    Map parserXmlMap = parserXml(strXml);
//    String hospitalID = (String)parserXmlMap.get("HospitalID");
//    String departId = (String)parserXmlMap.get("DepartId");
//    String workDate = (String)parserXmlMap.get("WorkDate");
//    String workType = (String)parserXmlMap.get("WorkType");

//    String startTime = "8:00";
//    String endTime = "11:00";
//
//    if ("2".equals(workType)) {
//      startTime = "12:00";
//      endTime = "16:30";
//    }

    String dayOfWeek = getDayOfWeek(workDate);

    /**
     *  改成视图形式  Modified By Zhanggh 20160524      
     */
//    String sql = "select (CASE WHEN GHXE = '0' THEN " + 
//      GetInfo.Limited + " ELSE GHXE END) AS SJXE," + 
//      "((CASE WHEN GHXE = '0' THEN " + GetInfo.Limited + " ELSE GHXE END)-YGRS) AS SYHY," + 
//      "'' as JZRS," + 
//      "'" + startTime + "'" + " as QSSJ," + 
//      "'" + endTime + "'" + " as JZSJ " + 
//      "from MS_KSPB " + 
//      "where GHKS = '" + departId + "' " + 
//      "and ZBLB = '" + workType + "' " + 
//      "and GHRQ = '" + dayOfWeek + "' " ;

    StringBuilder sql_sb = new StringBuilder();
    sql_sb.append("select ")
    .append("A.WSXH,")
    .append("A.SYHY,")
    .append("A.JZRS,")
    .append("A.QSSJ,")
    .append("A.JZSJ ")
    .append("from V_YY_DepartNoInfo A ");
    sql_sb.append("WHERE A.GHKS = '").append(departId).append("' ");
    sql_sb.append("AND A.ZBLB = '").append(workType).append("' ");
    sql_sb.append("AND A.GHRQ = '").append(workDate).append("' ");
    sql_sb.append(" UNION ALL ")
    .append("select ")
    .append("A.WSXH,")
    .append("A.SYHY,")
    .append("A.JZRS,")
    .append("A.QSSJ,")
    .append("A.JZSJ ")
    .append("from V_YY_DepartNoInfo_NOFS A ");
    sql_sb.append("WHERE A.GHKS = '").append(departId).append("' ");
    sql_sb.append("AND A.ZBLB = '").append(workType).append("' ");
    sql_sb.append("AND A.GHRQ = '").append(dayOfWeek).append("' "); 
    sql_sb.append("order by qssj");
    
    String sql = sql_sb.toString();
    
    Map xmlMap = new HashMap();
//    xmlMap.put("sjxe", "TotalNum");
    xmlMap.put("wsxh", "TotalNum");
    xmlMap.put("syhy", "LeftNum");
    xmlMap.put("jzrs", "CheckSum");
    xmlMap.put("qssj", "StartTime");
    xmlMap.put("jzsj", "EndTime");

    InterfaceQueryDao dao = new InterfaceQueryDao();
    List returnList = dao.doQuery(sql);

    System.out.println(sql);
    
	com.ws.yuyue.service.GetDtNoInfoResponse Res = new GetDtNoInfoResponse();
	com.ws.yuyue.service.GetDtNoInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message();// 
	com.ws.yuyue.service.GetDtNoInfoResponse.Message.WorkInfo workInfoRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.WorkInfo();//
	List<GetDtNoInfoResponse.Message.WorkInfo> workInfo = msgRes.getWorkInfo();
	workInfo.clear();
    int returnCou = 0;
    if ((returnList != null) && (returnList.size() > 0)) {
//      returnCou = Integer.parseInt((String)((Map)returnList.get(0)).get("sjxe"));
      returnCou = Integer.parseInt((String)((Map)returnList.get(0)).get("wsxh"));
      if (returnCou > returnList.size()) {
        returnCou = returnList.size();
      }
    }
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
		if(map.get("wsxh")== null|| "".equals(map.get("wsxh"))){
		}else{
			if(GetInfo.Limited.equals(map.get("wsxh"))){
				workInfoRes.setTotalNum(Integer.parseInt(GetInfo.Limited));
			}else{
				workInfoRes.setTotalNum(1);
			}
		}
		workInfo.add(i, workInfoRes);
		workInfoRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.WorkInfo();
	}
    
	    msgRes.workInfo = workInfo;
   
	    if(version.equals("5")){
    		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue QueueRes = getQueue5(departId,workDate,workType1);
    		msgRes.queue = QueueRes;
    	}else{
	    	if(HospitalCode.equals("MDYY")||HospitalCode.equals("XCRM")){
	    		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue QueueRes = getQueue_md(departId,workDate,workType1);
	    		msgRes.queue = QueueRes;
	    	    
	    	}else{
	    	
	    		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue QueueRes = getQueue(departId);
	    		msgRes.queue = QueueRes;
	    	    
	    	}
    	}
    
	Res.setMessage(msgRes);
	return Res; 
  }
  
  private Queue getQueue5(String departId, String workDate, int zblb) {
		com.ws.yuyue.service.GetDtNoInfoResponse Res = new GetDtNoInfoResponse();
		com.ws.yuyue.service.GetDtNoInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message();//
		msgRes.queue = null;
		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue queueRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue();//
	    InterfaceQueryDao dao = new InterfaceQueryDao(); 
	    String CurrentNum = ""; 
	    String QueuingNum  = ""; 
		StringBuffer sql_pd = new StringBuffer("select a.pdzt,cast(a.PDHM as int) as jzxh from pd_dlb a  where cast(a.PDHM as int) != 0 "
				+ " and (a.pdzt = '1' or a.pdzt = '3')");
		sql_pd.append(" and a.ksid = '"+departId+"' ")
		.append(" and (isnull(zblb,0) = '"+zblb+"' or isnull(zblb,0) = 0) ");		
		sql_pd.append(" and kssj > convert(varchar(12),getdate(),102) order by cast(a.PDHM as int)  asc");
	    System.out.println("sql_dl:"+sql_pd.toString());
	    log.info("5系列排队："+sql_pd);
	    
	        List  dl_list = dao.doQuery(sql_pd.toString());
	        if(dl_list.size() == 0){
	        	
	        }else{
	        	Map dl_1 = (Map)dl_list.get(0);
			    for(int i = 0; i < dl_list.size(); i ++){
		    		Map   dl_map1 = (Map)dl_list.get(i);
		    		String dl3 = (String) dl_map1.get("pdzt");
		    		String dl1 = (String) dl_map1.get("jzxh");
		    		if(dl3.equals("3")){
		    			CurrentNum +=  dl1 + ",";
		    		}else{
		    			QueuingNum += dl1+",";
		    		}
		       }
	        }
       String QueuingNumR = "";
       if(QueuingNum == null||QueuingNum == ""||QueuingNum.equals("")){
      	 QueuingNumR = QueuingNum;
       }else{
      	 QueuingNumR = QueuingNum.substring(0, QueuingNum.length() - 1);
       }
       String CurrentNumR = "";
       if(CurrentNum == null||CurrentNum == ""||CurrentNum.equals("")){
      	 CurrentNumR = CurrentNum;
       }else{
      	 CurrentNumR = CurrentNum.substring(0, CurrentNum.length() - 1);
       }
	    queueRes.setCurrentNum(CurrentNumR);
	    queueRes.setQueuingNum(QueuingNumR);
       
      return queueRes;
	}

/**
   * 木渎人民医院，排队数据获取。
   * @param doctorId
   * @param departId
   * @param workDate
   * @param zblb
   * @return
   */
	public com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue getQueue_md(String departId,String workDate,int zblb){

		
		com.ws.yuyue.service.GetDtNoInfoResponse Res = new GetDtNoInfoResponse();
		com.ws.yuyue.service.GetDtNoInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message();//
		msgRes.queue = null;
		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue queueRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue();//
		if(zblb == 1){
		}else if(zblb == 2){
			workDate += " 11:30:00.000";
		}else{
			
		}
		
		String gzrq = getDayOfWeek(workDate);
		String sql_zj = "select max(jzxh) as jzxh from v_pd_ghmx where ksdm = '" + departId
				+"' and thbz != 1 and jzls > 0 and ghsj >= '"+workDate+"'";//获取 科室看到几号
	    InterfaceQueryDao dao = new InterfaceQueryDao(); 
	    List returnList = dao.doQuery(sql_zj);
	    if(returnList.size() == 0){//如果取不到数据，直接返回空。
	    	queueRes.setCurrentNum("");
	 	    queueRes.setQueuingNum("");
	    	return queueRes;
	    }
	    Map max_jzxh = (Map)returnList.get(0);
	    
	    queueRes.setCurrentNum(max_jzxh.get("jzxh").toString());//给出现在就诊的号码！
	    //获取未就诊的就诊号码队列
	    String sql_dl = "select jzxh from v_pd_ghmx where ksdm = '" + departId
				+"' and thbz != 1 and jzls = 0 and ghsj >= '"+workDate+"'";
		System.out.println("sql_dl:"+sql_dl);
		
        List  dl_list = dao.doQuery(sql_dl);
        
        
        String CurrentNum = "";
        String QueuingNum  = "";
        String QueuingNumR = "";
        String CurrentNumR = "";
        if(dl_list.size() > 0){
	    	    for(int i = 0; i < dl_list.size(); i ++){
	    	    	Map   dl_map = (Map)dl_list.get(i);
		    		String jzxh_wk = (String) dl_map.get("jzxh");
	    	    		QueuingNum += jzxh_wk+",";
		    }
	    
	        
	        if(QueuingNum == null||QueuingNum == ""||QueuingNum.equals("")){
	       	 QueuingNumR = QueuingNum;
	        }else{
	       	 QueuingNumR = QueuingNum.substring(0, QueuingNum.length() - 1);
	        }
        }

	    queueRes.setQueuingNum(QueuingNumR);
	    
        return queueRes;
	}
	public com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue getQueue(String departId){
		com.ws.yuyue.service.GetDtNoInfoResponse Res = new GetDtNoInfoResponse();
		com.ws.yuyue.service.GetDtNoInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message();//
		msgRes.queue = null;
		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue queueRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue();//
	    InterfaceQueryDao dao = new InterfaceQueryDao(); 
	    
		String sql_ks = null;
			sql_ks = "SELECT TOP 1 PDJK_DLDY_GHKS.DLID FROM PDJK_DLDY_GHKS WHERE PDJK_DLDY_GHKS.GHKS = '"+departId+"'";

	    List returnList = dao.doQuery(sql_ks); 
        String CurrentNum = ""; 
        String QueuingNum  = ""; 
	    for(int j = 0 ; j < returnList.size(); j ++){
		    Map dl = (Map)returnList.get(j);//获取队列编码
			String dlbName =  "pd_dlb"+dl.get("dlid");
			
	        String sql_dl = "select a.pdzt,cast(a.PDHM as int) as jzxh from "+dlbName+" a where  cast(a.PDHM as int) != 0 "
					+ " and (a.pdzt = '1' or a.pdzt = '3') "
					+ " and kssj > convert(varchar(12),getdate(),102) order by cast(a.PDHM as int)  asc";
	        System.out.println("sql_dl:"+sql_dl);
	        List  dl_list = dao.doQuery(sql_dl);
	        if(dl_list.size() == 0){
	        	continue;
	        }
	        Map dl_1 = (Map)dl_list.get(0);
	        
		    for(int i = 0; i < dl_list.size(); i ++){
		    	
	    		Map   dl_map1 = (Map)dl_list.get(i);
	    		String dl3 = (String) dl_map1.get("pdzt");
	    		String dl1 = (String) dl_map1.get("jzxh");
	    		if(dl3.equals("3")){
	    			CurrentNum +=  dl1 + ",";
	    		}else{
	    			QueuingNum += dl1+",";
	    		}
	       }
	    }
         String QueuingNumR = "";
         if(QueuingNum == null||QueuingNum == ""||QueuingNum.equals("")){
        	 QueuingNumR = QueuingNum;
         }else{
        	 QueuingNumR = QueuingNum.substring(0, QueuingNum.length() - 1);
         }
         String CurrentNumR = "";
         if(CurrentNum == null||CurrentNum == ""||CurrentNum.equals("")){
        	 CurrentNumR = CurrentNum;
         }else{
        	 CurrentNumR = CurrentNum.substring(0, CurrentNum.length() - 1);
         }
 	    queueRes.setCurrentNum(CurrentNumR);
 	    queueRes.setQueuingNum(QueuingNumR);
         
        return queueRes;
	}

}