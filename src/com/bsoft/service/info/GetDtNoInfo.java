package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
import com.ws.yuyue.service.GetDepartWorkInfoResponse;
import com.ws.yuyue.service.GetDtNoInfoResponse;
import com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetDtNoInfo extends GetInfo
{
  private static GetDtNoInfo instance = new GetDtNoInfo();

  public static GetDtNoInfo getInstance()
  {
    return instance;
  }

  public static void main(String[] args){
//	  StringBuilder strXml = new StringBuilder();
//      strXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> ");
//      strXml.append("<Message>");
//      strXml.append("<requestInfo>");
//      strXml.append("<HospitalID>ZYY</HospitalID>");
//      strXml.append("<DoctorId>11329</DoctorId>");
//      strXml.append("<DepartId>100</DepartId>");
//      strXml.append("<WorkDate>2015-10-20</WorkDate>");
//      strXml.append("<WorkType>2</WorkType>");
//      strXml.append("</requestInfo>");
//      strXml.append("</Message>");
	  
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
	int workType1 = workType;
	if(HospitalCode.equals("MDYY")){
		if(workType1 == 3){// 由于木渎人民医院 全天是 0  而12320规定的全天是 3  因此在挂号的时候 转换一下
			workType1 = 0;
		}
	}
	
	/**
	 *  改成视图形式  Modified By Zhanggh 20160524   
	 */
    StringBuilder sql_sb = new StringBuilder();
    sql_sb.append("select ")
    .append("A.WSXH,")
    .append("A.SYHY,")
    .append("A.JZRS,")
    .append("A.QSSJ,")
    .append("A.JZSJ ")
    .append("from V_YY_DoctorNoInfo A ");
    sql_sb.append("WHERE A.GHKS = '").append(departId).append("' ");
    sql_sb.append("AND A.YSDM = '").append(doctorId).append("' ");
    sql_sb.append("AND A.ZBLB = '").append(workType).append("' ");
    sql_sb.append("AND A.GHRQ = '").append(workDate).append("' ");
    sql_sb.append("order by qssj");
    String sql = sql_sb.toString();

    InterfaceQueryDao dao = new InterfaceQueryDao(); 
    List returnList = dao.doQuery(sql);

    System.out.println(sql);
    
    int returnCou = 0;
    if ((returnList != null) && (returnList.size() > 0)) {
      returnCou = Integer.parseInt((String)((Map)returnList.get(0)).get("wsxh"));
//      returnCou = returnCou * 2;
      if (returnCou > returnList.size()) {
        returnCou = returnList.size();
      }
    }

	com.ws.yuyue.service.GetDtNoInfoResponse Res = new GetDtNoInfoResponse();
	com.ws.yuyue.service.GetDtNoInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message();// 
	com.ws.yuyue.service.GetDtNoInfoResponse.Message.WorkInfo workInfoRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.WorkInfo();//
	List<GetDtNoInfoResponse.Message.WorkInfo> workInfo = msgRes.getWorkInfo();
	workInfo.clear();
	
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
			if(!"".equals((String) map.get("qssj"))&&(String) map.get("qssj") != null){
				workInfoRes.setTotalNum(1);
			}else{
				workInfoRes.setTotalNum(Integer.parseInt((String) map.get("wsxh")));
			}
		}
		workInfo.add(i, workInfoRes);
		workInfoRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.WorkInfo();
	}
	
    msgRes.workInfo = workInfo;
    if(returnCou > 0){//如果有号源则请求排队信息 如果没有则不请求！
    	
    	if(version.equals("5")){
    		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue QueueRes = getQueue5(doctorId,departId,workDate,workType1);
    		msgRes.queue = QueueRes;
    	}else{
	    	if(HospitalCode.equals("MDYY")||HospitalCode.equals("XCRM")){
	    		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue QueueRes = getQueue_md(doctorId,departId,workDate,workType1);
	    		msgRes.queue = QueueRes;
	    	}else{
	    		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue QueueRes = getQueue(doctorId,departId,workDate,workType1);
	    		msgRes.queue = QueueRes;
	    	}
    	}
//        QueueRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue();
    }
    
	Res.setMessage(msgRes);
	return Res; 
  }
  private Queue getQueue5(String doctorId, String departId, String workDate,
		int zblb) {
		com.ws.yuyue.service.GetDtNoInfoResponse Res = new GetDtNoInfoResponse();
		com.ws.yuyue.service.GetDtNoInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message();//
		msgRes.queue = null;
		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue queueRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue();//
//		String gzrq = getDayOfWeek(workDate);
//		String sql_zj = "SELECT DLID FROM PDJK_DLDY_ZJYS WHERE YSDM  ='"+doctorId+
//				"'  and  (gzrq = '"+gzrq+"' or  gzrq = '0') and (isnull(zblb,0) = '"+zblb+"' or isnull(zblb,0) = 0 )  ";//获取 专家队列id
	    
		StringBuffer sql_pd = new StringBuffer("select a.pdzt,cast(a.PDHM as int) as jzxh from pd_dlb a  where cast(a.PDHM as int) != 0 "
				+ " and (a.pdzt = '1' or a.pdzt = '3')");
			sql_pd.append(" and a.ysid = '"+doctorId+"' ")
			.append(" and  CONVERT(varchar(100), KSSJ, 23) = '"+workDate+"' ")
			.append(" and (isnull(zblb,0) = '"+zblb+"' or isnull(zblb,0) = 0 )");
		sql_pd.append(" order by cast(a.PDHM as int)  asc ");
		InterfaceQueryDao dao = new InterfaceQueryDao(); 
	    Map dl  = null;
	  System.out.println("sql_pd:"+sql_pd);
      List  dl_list = dao.doQuery(sql_pd.toString());
	  if(dl_list.size() == 0 ){
	    	queueRes.setCurrentNum("");
	 	    queueRes.setQueuingNum("");
	    	return queueRes;
	    }
      String CurrentNum = "";
      String QueuingNum  = "";
      String QueuingNumR = "";
      String CurrentNumR = "";
      if(dl_list.size() > 0){
	    	    for(int i = 0; i < dl_list.size(); i ++){
		    		Map   dl_map = (Map)dl_list.get(i);
		    		String dl3 = (String) dl_map.get("pdzt");
		    		String dl1 = (String) dl_map.get("jzxh");
		    		
		    		if(dl3.equals("3")){
		    				CurrentNum = dl1+",";
		    		}else{
				    		 QueuingNum += dl1+",";
		    		}
		    }
	    
	        
	        if(QueuingNum == null||QueuingNum == ""||QueuingNum.equals("")){
	       	 QueuingNumR = QueuingNum;
	        }else{
	       	 QueuingNumR = QueuingNum.substring(0, QueuingNum.length() - 1);
	        }
	        
	        if(CurrentNum == null||CurrentNum == ""||CurrentNum.equals("")){
	       	 CurrentNumR = CurrentNum;
	        }else{
	       	 CurrentNumR = CurrentNum.substring(0, CurrentNum.length() - 1);
	        }
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
	public com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue getQueue_md(String doctorId,String departId,String workDate,int zblb){

		
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
				+"' and thbz != 1 and jzls > 0 and ghsj >= '"+workDate+"' and ysdm = '"+doctorId+"'";//获取 专家看到几号
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
				+"' and thbz != 1 and jzls = 0 and ghsj >= '"+workDate+"' and ysdm = '"+doctorId+"'";
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
  
	public com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue getQueue(String doctorId,String departId,String workDate,int zblb){

		
		com.ws.yuyue.service.GetDtNoInfoResponse Res = new GetDtNoInfoResponse();
		com.ws.yuyue.service.GetDtNoInfoResponse.Message msgRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message();//
		msgRes.queue = null;
		com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue queueRes = new com.ws.yuyue.service.GetDtNoInfoResponse.Message.Queue();//

		
		String gzrq = getDayOfWeek(workDate);
		String sql_zj = "SELECT DLID FROM PDJK_DLDY_ZJYS WHERE YSDM  ='"+doctorId+
				"'  and  (gzrq = '"+gzrq+"' or  gzrq = '0') and (isnull(zblb,0) = '"+zblb+"' or isnull(zblb,0) = 0 )  ";//获取 专家队列id
	    InterfaceQueryDao dao = new InterfaceQueryDao(); 
	    List returnList = dao.doQuery(sql_zj);
	    if(returnList.size() == 0 ){// 如果在专家队列中没有则邹 普通科室队列
	    	sql_zj = "SELECT DLID FROM PDJK_DLDY_GHKS WHERE GHKS  ='"+departId+"' ";
	  	    returnList = dao.doQuery(sql_zj);
	    } 
	    Map dl  = null;
	    if(returnList.size() == 0 ){
	    	queueRes.setCurrentNum("");
	 	    queueRes.setQueuingNum("");
	    	return queueRes;
	    }
	    dl = (Map)returnList.get(0);
	    System.out.println("sql_zj:"+sql_zj);
		String dlbName =  "pd_dlb"+dl.get("dlid");
		String sql_dl = "select a.pdzt,cast(a.PDHM as int) as jzxh from "+dlbName+" a where  cast(a.PDHM as int) != 0 "
				+ " and (a.pdzt = '1' or a.pdzt = '3') order by cast(a.PDHM as int)  asc";
        System.out.println("sql_dl:"+sql_dl);
        List  dl_list = dao.doQuery(sql_dl);
        String CurrentNum = "";
        String QueuingNum  = "";
        String QueuingNumR = "";
        String CurrentNumR = "";
        if(dl_list.size() > 0){
	    	    for(int i = 0; i < dl_list.size(); i ++){
		    		Map   dl_map = (Map)dl_list.get(i);
		    		String dl3 = (String) dl_map.get("pdzt");
		    		String dl1 = (String) dl_map.get("jzxh");
		    		
		    		if(dl3.equals("3")){
		    				CurrentNum = dl1+",";
		    		}else{
				    		 QueuingNum += dl1+",";
		    		}
		    }
	    
	        
	        if(QueuingNum == null||QueuingNum == ""||QueuingNum.equals("")){
	       	 QueuingNumR = QueuingNum;
	        }else{
	       	 QueuingNumR = QueuingNum.substring(0, QueuingNum.length() - 1);
	        }
	        
	        if(CurrentNum == null||CurrentNum == ""||CurrentNum.equals("")){
	       	 CurrentNumR = CurrentNum;
	        }else{
	       	 CurrentNumR = CurrentNum.substring(0, CurrentNum.length() - 1);
	        }
	        } 

	    queueRes.setCurrentNum(CurrentNumR);
	    queueRes.setQueuingNum(QueuingNumR);
	    
        return queueRes;
	}

}