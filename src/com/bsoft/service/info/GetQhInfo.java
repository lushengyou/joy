/*     */ package com.bsoft.service.info;
/*     */ 
/*     */ import com.dao.InterfaceQueryDao;
/*     */ import com.ws.yuyue.service.GetGhInfo;
/*     */ import com.ws.yuyue.service.GetGhInfo.Message;
/*     */ import com.ws.yuyue.service.GetGhInfo.Message.BatRegInfo;
/*     */ import com.ws.yuyue.service.GetGhInfo.Message.OneRegInfo;
/*     */ import com.ws.yuyue.service.GetGhInfoResponse;
/*     */ import com.ws.yuyue.service.GetGhInfoResponse.Message.RegInfo;
/*     */ import java.io.PrintStream;
/*     */ import java.math.BigInteger;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.log4j.Logger;
/*     */ 
/*     */ public class GetQhInfo extends GetInfo
/*     */ {
/*  20 */   private static GetQhInfo instance = new GetQhInfo();
/*     */   private static String hospitalID;
/*  28 */   private static final Logger log = Logger.getLogger(GetQhInfo.class);
/*     */ 
/*     */   public static GetQhInfo getInstance()
/*     */   {
/*  26 */     return instance;
/*     */   }
/*     */ 
/*     */   public GetGhInfoResponse execute(GetGhInfo getGhInfo)
/*     */   {
/*  34 */     GetGhInfo.Message ms = getGhInfo.getMessage();
/*  35 */     String QhDate = "";
/*  36 */     String id = "";
/*  37 */     String cardNo = "";
/*  38 */     String departId = "";
/*  39 */     String doctorId = "";
/*  40 */     String seeDoctorDate = "";
/*     */     try {
/*  42 */       hospitalID = ms.getBatRegInfo().getHospitalID();
/*     */     }
/*     */     catch (Exception e) {
/*  45 */       e.getStackTrace();
/*     */     }
/*     */     try {
/*  48 */       QhDate = ms.getBatRegInfo().getQueyDate();
/*     */     }
/*     */     catch (Exception e) {
/*  51 */       e.getStackTrace();
/*     */     }
/*     */     try {
/*  54 */       BigInteger regId = ms.getOneRegInfo().getRegID();
/*  55 */       id = regId.toString();
/*     */     }
/*     */     catch (Exception e) {
/*  58 */       e.getStackTrace();
/*     */     }
/*     */     try {
/*  61 */       cardNo = ms.getOneRegInfo().getCardNo();
/*     */     }
/*     */     catch (Exception e) {
/*  64 */       e.getStackTrace();
/*     */     }
/*     */     try {
/*  67 */       departId = ms.getOneRegInfo().getDepartID();
/*     */     }
/*     */     catch (Exception e) {
/*  70 */       e.getStackTrace();
/*     */     }
/*     */     try {
/*  73 */       doctorId = ms.getOneRegInfo().getDoctorID();
/*     */     }
/*     */     catch (Exception e) {
/*  76 */       e.getStackTrace();
/*     */     }
/*     */     try {
/*  79 */       seeDoctorDate = ms.getOneRegInfo().getSeeDoctorDate();
/*     */     }
/*     */     catch (Exception e) {
/*  82 */       e.getStackTrace();
/*     */     }
/*     */ 
/*  94 */     String sql = "";
/*     */ 
/* 103 */     if (!strIsNull(id))
/* 104 */       sql = getSQL_SB(id);
/* 105 */     else if ((!strIsNull(cardNo)) && (!strIsNull(seeDoctorDate)))
/* 106 */       sql = getSQL_SB(cardNo, departId, doctorId, seeDoctorDate);
/* 107 */     else if ((!strIsNull(hospitalID)) && (!strIsNull(QhDate))) {
/* 108 */       sql = getSQL_SB(hospitalID, QhDate);
/*     */     }
/*     */ 
/* 111 */     GetGhInfoResponse Res = new GetGhInfoResponse();
/* 112 */     GetGhInfoResponse.Message msgRes = new GetGhInfoResponse.Message();
/* 113 */     List regInfo = msgRes.getRegInfo();
/* 114 */     regInfo.clear();
/*     */ 
/* 116 */     if (strIsNull(sql)) {
/* 117 */       msgRes.setCode("2001");
/* 118 */       msgRes.setDescription("请求格式不正确");
/* 119 */       Res.setMessage(msgRes);
/* 120 */       return Res;
/*     */     }
/*     */ 
/* 140 */     InterfaceQueryDao dao = new InterfaceQueryDao();
/* 141 */     List returnList = dao.doQuery(sql);
/*     */ 
/* 143 */     System.out.println(sql);
/*     */ 
/* 145 */     log.info("sql for  getQhInfo:" + sql);
/*     */ 
/* 147 */     if (returnList.size() <= 0) {
/* 148 */       msgRes.setCode("2002");
/* 149 */       msgRes.setDescription("挂号信息不存在！");
/* 150 */       Res.setMessage(msgRes);
/* 151 */       return Res;
/*     */     }
/*     */ 
/* 154 */     GetGhInfoResponse.Message.RegInfo RegInfoRes = new GetGhInfoResponse.Message.RegInfo();
/*     */ 
/* 157 */     for (int i = 0; i < returnList.size(); i++) {
/* 158 */       Map map = (Map)returnList.get(i);
/*     */ 
/* 161 */       String isGet = (String)map.get("isget");
/* 162 */       if (isGet.equals("0"))
/*     */       {
/* 164 */         RegInfoRes = getResGet(map);
/*     */       }
/*     */       else {
/* 167 */         RegInfoRes = getResult(map);
/*     */       }
/*     */ 
/* 170 */       regInfo.add(i, RegInfoRes);
/* 171 */       RegInfoRes = new GetGhInfoResponse.Message.RegInfo();
/*     */     }
/*     */ 
/* 174 */     msgRes.regInfo = regInfo;
/* 175 */     msgRes.setCode("2000");
/* 176 */     msgRes.setDescription("挂号信息获取成功！");
/* 177 */     Res.setMessage(msgRes);
/* 178 */     return Res;
/*     */   }
/*     */ 
/*     */   private GetGhInfoResponse.Message.RegInfo getResGet(Map map)
/*     */   {
/* 184 */     String sql_get = getSql_Get(map);
/*     */ 
/* 186 */     InterfaceQueryDao dao = new InterfaceQueryDao();
/* 187 */     List returnList = dao.doQuery(sql_get);
/*     */ 
/* 189 */     System.out.println(sql_get);
/*     */ 
/* 191 */     if (returnList.size() > 1) {
/* 192 */       Map moneyMap = (Map)returnList.get(0);
/* 193 */       log.error("获取费用表结果超过2个，sql：" + sql_get);
/*     */ 
/* 195 */       String selfmoney = (String)moneyMap.get("selfmoney");
/* 196 */       String insuremoney = (String)moneyMap.get("insuremoney");
/* 197 */       String notpay = (String)moneyMap.get("notpay");
/*     */ 
/* 199 */       map.put("selfmoney", Double.valueOf(Double.parseDouble(selfmoney)));
/* 200 */       map.put("insuremoney", Double.valueOf(Double.parseDouble(insuremoney)));
/* 201 */       map.put("notpay", Double.valueOf(Double.parseDouble(notpay)));
/*     */     }
/* 203 */     else if (returnList.size() == 0) {
/* 204 */       log.error("挂号明细未取到数据，sql：" + sql_get);
/* 205 */       map.put("selfmoney", Double.valueOf(0.0D));
/* 206 */       map.put("insuremoney", Double.valueOf(0.0D));
/*     */     }
/*     */     else {
/* 209 */       Map moneyMap = (Map)returnList.get(0);
/* 210 */       String selfmoney = (String)moneyMap.get("selfmoney");
/* 211 */       String insuremoney = (String)moneyMap.get("insuremoney");
/* 212 */       String notpay = (String)moneyMap.get("notpay");
/* 213 */       if (("" == notpay) || (notpay == null)) {
/* 214 */         notpay = "0";
/*     */       }
/* 216 */       map.put("selfmoney", Double.valueOf(Double.parseDouble(selfmoney)));
/* 217 */       map.put("insuremoney", Double.valueOf(Double.parseDouble(insuremoney)));
/* 218 */       map.put("notpay", Double.valueOf(Double.parseDouble(notpay)));
/*     */     }
/* 220 */     return getResult(map);
/*     */   }
/*     */ 
/*     */   private String getSql_Get(Map map)
/*     */   {
/* 225 */     String ksdm = (String)map.get("departid");
/* 226 */     String jzxh = (String)map.get("reserveno");
/* 227 */     String zblb = (String)map.get("worktype");
/* 228 */     String ghsj = ((String)map.get("seedoctordate")).substring(0, 10);
/*     */ 
/* 233 */     String sjid = (String)map.get("id");
/*     */ 
/* 235 */     String IsExpert = (String)map.get("isexpert");
/*     */ 
/* 237 */     StringBuilder sql_get = new StringBuilder();
/*     */ 
/* 239 */     sql_get.append("select ")
/* 246 */       .append("XJJE as selfmoney, ")
/* 247 */       .append("ZLJE + ZJFY + BLJE - XJJE as insuremoney, ")
/* 248 */       .append("CASE THBZ WHEN 1 THEN 0 ELSE CASE YKTJSBZ WHEN 1 THEN 0 ELSE YKTWJSJE END END as notpay ")
/* 249 */       .append("from ms_ghmx where ")
/* 250 */       .append("ksdm = '").append(ksdm).append("' ")
/* 255 */       .append("and sjid = '").append(sjid).append("' ");
/* 256 */     if (IsExpert.equals("1")) {
/* 257 */       String ysdm = (String)map.get("doctorid");
/* 258 */       sql_get.append("and ysdm = '").append(ysdm).append("' ");
/*     */     }
/* 260 */     if (zblb.equals("1"))
/* 261 */       sql_get.append("and ghsj >= '").append(ghsj).append(" 00:00:00' ")
/* 262 */         .append("and ghsj <= '").append(ghsj).append(" 11:59:59' ");
/* 263 */     else if (zblb.equals("2"))
/* 264 */       sql_get.append("and ghsj >= '").append(ghsj).append(" 12:00:00' ")
/* 265 */         .append("and ghsj <= '").append(ghsj).append(" 23:59:59' ");
/*     */     else {
/* 267 */       sql_get.append("and ghsj >= '").append(ghsj).append(" 00:00:00' ")
/* 268 */         .append("and ghsj <= '").append(ghsj).append(" 23:59:59' ");
/*     */     }
/*     */ 
/* 280 */     sql_get.append(" order by ghsj asc");
/* 281 */     log.info("已经取号后的sql 语句：" + sql_get);
/* 282 */     return sql_get.toString();
/*     */   }
/*     */ 
/*     */   public GetGhInfoResponse.Message.RegInfo getResult(Map map) {
/* 286 */     GetGhInfoResponse.Message.RegInfo RegInfoRes = new GetGhInfoResponse.Message.RegInfo();
/* 287 */     GetGhInfoResponse.Message msgRes = new GetGhInfoResponse.Message();
/*     */ 
/* 291 */     if ((map.get("departid") == null) || ("".equals(map.get("departid"))))
/* 292 */       RegInfoRes.setDepartID("");
/*     */     else {
/* 294 */       RegInfoRes.setDepartID((String)map.get("departid"));
/*     */     }
/*     */ 
/* 297 */     if ((map.get("doctorid") == null) || ("".equals(map.get("doctorid"))))
/* 298 */       RegInfoRes.setDoctorID("");
/*     */     else {
/* 300 */       RegInfoRes.setDoctorID((String)map.get("doctorid"));
/*     */     }
/* 302 */     if ((map.get("getnodate") == null) || ("".equals(map.get("getnodate"))))
/*     */     {
/* 306 */       RegInfoRes.setGetNoDate("");
/*     */     }
/* 308 */     else RegInfoRes.setGetNoDate((String)map.get("getnodate"));
/*     */ 
/* 311 */     if ((map.get("worktype") != null) && (!"".equals(map.get("worktype"))))
/*     */     {
/* 314 */       RegInfoRes.setWorkType((String)map.get("worktype"));
/*     */     }
/*     */ 
/* 317 */     if ((map.get("yysjd") != null) && (!"".equals(map.get("yysjd"))) && (!"-".equals(map.get("yysjd"))))
/*     */     {
/* 321 */       String yysjd = (String)map.get("yysjd");
/* 322 */       String[] ls = yysjd.split("-");
/*     */ 
/* 324 */       String beginTime = ls[0];
/* 325 */       String endTime = ls[1];
/*     */ 
/* 327 */       RegInfoRes.setBeginTime(beginTime);
/* 328 */       RegInfoRes.setEndTime(endTime);
/*     */     }
/*     */ 
/* 332 */     if ((map.get("clinicno") != null) && (!"".equals(map.get("clinicno"))))
/*     */     {
/* 335 */       RegInfoRes.setClinicNo((String)map.get("clinicno"));
/*     */     }
/* 337 */     if ((map.get("checkno") != null) && (!"".equals(map.get("checkno"))))
/*     */     {
/* 340 */       RegInfoRes.setCheckNo((String)map.get("checkno"));
/*     */     }
/* 342 */     if ((map.get("sickinsuretype") != null) && (!"".equals(map.get("sickinsuretype"))))
/*     */     {
/* 345 */       RegInfoRes.setSickInsuretype((String)map.get("sickinsuretype"));
/*     */     }
         if ((map.get("hospitalid") != null) && (!"".equals(map.get("hospitalid"))))
        /*     */     {
        /* 345 */       RegInfoRes.setHospitalID((String)map.get("hospitalid"));
        /*     */     }else{
        	RegInfoRes.setHospitalID(hospitalID);
        }
/* 347 */     if ((map.get("money") != null) && (!"".equals(map.get("money"))))
/*     */     {
/* 350 */       RegInfoRes.setMoney((String)map.get("money"));
/*     */     }
/*     */ 
/* 353 */     if ((map.get("isquit") != null) && (!"".equals(map.get("isquit"))))
/*     */     {
/* 356 */       RegInfoRes.setIsQuit((String)map.get("isquit"));
/*     */     }
/*     */ 
/* 359 */     if ((map.get("quitdate") != null) && (!"".equals(map.get("quitdate"))))
/*     */     {
/* 362 */       RegInfoRes.setQuitDate((String)map.get("quitdate"));
/*     */     }
/*     */ 
/* 365 */     if ((map.get("ispay") != null) && (!"".equals(map.get("ispay"))))
/*     */     {
/* 368 */       RegInfoRes.setIsPay((String)map.get("ispay"));
/*     */     }
/*     */ 
/* 371 */     if ((map.get("paydate") != null) && (!"".equals(map.get("paydate"))))
/*     */     {
/* 374 */       RegInfoRes.setPayDate((String)map.get("paydate"));
/*     */     }
/*     */ 
/* 377 */     if ((map.get("regvia") != null) && (!"".equals(map.get("regvia"))))
/*     */     {
/* 380 */       String regvia = (String)map.get("regvia");
/*     */ 
/* 386 */       RegInfoRes.setRegVia("12320预约");
/*     */     }
/* 388 */    // RegInfoRes.setHospitalID(hospitalID);
/* 389 */     if ((map.get("insuremoney") != null) && (!"".equals(map.get("insuremoney"))))
/*     */     {
/* 392 */       RegInfoRes.setInsureMoney(((Double)map.get("insuremoney")).doubleValue());
/*     */     }
/*     */ 
/* 395 */     if ((map.get("isget") != null) && (!"".equals(map.get("isget"))))
/*     */     {
/* 398 */       RegInfoRes.setIsGet((String)map.get("isget"));
/*     */     }
/*     */ 
/* 401 */     if ((map.get("notpay") != null) && (!"".equals(map.get("notpay"))))
/*     */     {
/* 404 */       String notpay = map.get("notpay").toString();
/* 405 */       RegInfoRes.setNotPay(Double.parseDouble(notpay));
/*     */     }
/* 407 */     if ((map.get("id") != null) && (!"".equals(map.get("id"))))
/*     */     {
/* 410 */       BigInteger bit = new BigInteger(map.get("id").toString());
/* 411 */       RegInfoRes.setRegID(bit);
/*     */     }
/* 413 */     if ((map.get("selfmoney") != null) && (!"".equals(map.get("selfmoney"))))
/*     */     {
/* 416 */       RegInfoRes.setSelfMoney(((Double)map.get("selfmoney")).doubleValue());
/*     */     }
/*     */ 
/* 422 */     return RegInfoRes;
/*     */   }
/*     */ 
/*     */   public String getSQL_SB(String cardNo, String departId, String doctorId, String seeDoctorDate)
/*     */   {
/* 428 */     StringBuilder sql_sb = new StringBuilder();
/* 429 */     sql_sb.append("select ")
/* 430 */       .append("A.id,")
/* 431 */       .append("A.hospitalid,")
/* 432 */       .append("A.departid,")
/* 433 */       .append("A.doctorid,")
/* 434 */       .append("A.isexpert,")
/* 435 */       .append("CONVERT(varchar,A.getnodate, 120 ) as getnodate,")
/* 436 */       .append("CONVERT(varchar,A.SeeDoctorDate, 120 ) as seedoctordate,")
/* 437 */       .append("A.reserveno,")
/* 438 */       .append("A.workType,")
/* 439 */       .append("A.yysjd,")
/* 440 */       .append("A.reserveno as ClinicNo,")
/* 441 */       .append("A.CheckNo,")
/* 442 */       .append("A.sickinsuretype,")
/* 443 */       .append("registryfee+clinicfee+expertsfee as Money,")
/* 444 */       .append("A.iscance as IsQuit,")
/* 445 */       .append("CONVERT(varchar,A.cancedate, 20) as QuitDate,")
/* 446 */       .append("CASE WHEN ISDATE(A.getnodate) = 1 THEN '1' ELSE 0 END AS IsPay,")
/* 447 */       .append("CONVERT(varchar,A.getnodate, 20) as PayDate,")
/* 448 */       .append("A.regtype as RegVia,")
/* 449 */       .append("'' as selfmoney,")
/* 450 */       .append("'' as insuremoney,")
/* 451 */       .append("CASE WHEN ISDATE(A.getnodate) = 1 THEN '0' ELSE 1 END AS isget,")
/* 452 */       .append("CASE ISCANCE WHEN '0' THEN registryfee+clinicfee+expertsfee ELSE '0' END  as notpay ")
/* 453 */       .append("from registered_info as A ")
/* 455 */       .append("where A.SFZH = '").append(cardNo).append("' ");
/*     */ 
/* 457 */     if (!strIsNull(seeDoctorDate)) {
/* 458 */       sql_sb.append("and A.SeeDoctorDate >= '").append(seeDoctorDate).append(" 00:00:00' ")
/* 459 */         .append("and A.SeeDoctorDate <= '").append(seeDoctorDate).append(" 23:59:59' ");
/*     */     }
/* 461 */     if (!strIsNull(departId)) {
/* 462 */       sql_sb.append("and A.DEPARTID  = '").append(departId).append("' ");
/*     */     }
/*     */ 
/* 465 */     if (!strIsNull(doctorId)) {
/* 466 */       sql_sb.append("and  A.DOCTORID  = '").append(doctorId).append("' ");
/*     */     }
/* 468 */     return sql_sb.toString();
/*     */   }
/*     */ 
/*     */   public String getSQL_SB(String id)
/*     */   {
/* 473 */     StringBuilder sql_sb = new StringBuilder();
/* 474 */     sql_sb.append("select ")
/* 475 */       .append("A.id,")
/* 476 */       .append("A.hospitalid,")
/* 477 */       .append("A.departid,")
/* 478 */       .append("A.doctorid,")
/* 479 */       .append("A.isexpert,")
/* 480 */       .append("CONVERT(varchar,A.getnodate, 120 ) as getnodate,")
/* 481 */       .append("CONVERT(varchar,A.SeeDoctorDate, 120 ) as seedoctordate,")
/* 482 */       .append("A.reserveno,")
/* 483 */       .append("A.iscance,")
/* 484 */       .append("A.worktype,")
/* 485 */       .append("A.yysjd,")
/* 486 */       .append("A.reserveno as ClinicNo,")
/* 487 */       .append("A.CheckNo,")
/* 488 */       .append("A.sickinsuretype,")
/* 489 */       .append("registryfee+clinicfee+expertsfee as Money,")
/* 490 */       .append("A.iscance as IsQuit,")
/* 491 */       .append("CONVERT(varchar,A.cancedate, 20) as QuitDate,")
/* 492 */       .append("CASE WHEN ISDATE(A.getnodate) = 1 THEN '1' ELSE 0 END AS IsPay,")
/* 493 */       .append("CONVERT(varchar,A.getnodate, 20) as PayDate,")
/* 494 */       .append("A.regtype as RegVia,")
/* 495 */       .append("'' as selfmoney,")
/* 496 */       .append("'' as insuremoney,")
/* 497 */       .append("CASE WHEN ISDATE(A.getnodate) = 1 THEN '0' ELSE 1 END AS isget,")
/* 498 */       .append("CASE ISCANCE WHEN '0' THEN registryfee+clinicfee+expertsfee ELSE '0' END  as notpay ")
/* 499 */       .append("from registered_info as A ")
/* 501 */       .append("where A.id = '").append(id).append("' ");
/* 502 */     return sql_sb.toString();
/*     */   }
/*     */ 
/*     */   public String getSQL_SB(String hospitalID, String QhDate)
/*     */   {
/* 507 */     StringBuilder sql_sb = new StringBuilder();
/* 508 */     sql_sb.append("select ")
/* 509 */       .append("A.id,'")
/* 510 */       .append(hospitalID)
/* 511 */       .append("',A.departid,")
/* 512 */       .append("A.doctorid,")
/* 513 */       .append("A.isexpert,")
/* 514 */       .append("CONVERT(varchar,A.getnodate, 120 ) as getnodate,")
/* 515 */       .append("CONVERT(varchar,A.SeeDoctorDate, 120 ) as seedoctordate,")
/* 516 */       .append("A.reserveno,")
/* 517 */       .append("A.iscance,")
/* 518 */       .append("A.worktype,")
/* 519 */       .append("A.yysjd,")
/* 520 */       .append("A.reserveno as ClinicNo,")
/* 521 */       .append("A.CheckNo,")
/* 522 */       .append("A.sickinsuretype,")
/* 523 */       .append("registryfee+clinicfee+expertsfee as Money,")
/* 524 */       .append("A.iscance as IsQuit,")
/* 525 */       .append("CONVERT(varchar,A.cancedate, 20) as QuitDate,")
/* 526 */       .append("CASE WHEN ISDATE(A.getnodate) = 1 THEN '1' ELSE 0 END AS IsPay,")
/* 527 */       .append("CONVERT(varchar,A.getnodate, 20) as PayDate,")
/* 528 */       .append("A.regtype as RegVia,")
/* 529 */       .append("'' as selfmoney,")
/* 530 */       .append("'' as insuremoney,")
/* 531 */       .append("CASE WHEN ISDATE(A.getnodate) = 1 THEN '0' ELSE 1 END AS isget,")
/* 532 */       .append("CASE ISCANCE WHEN '0' THEN registryfee+clinicfee+expertsfee ELSE '0' END  as notpay ")
/* 533 */       .append("from registered_info as A ")
/* 535 */       .append("where A.hospitalid = '").append(hospitalID).append("' ")
/* 541 */       .append("and A.SeeDoctorDate >= '").append(QhDate).append(" 00:00:00' ")
/* 542 */       .append("and A.SeeDoctorDate <= '").append(QhDate).append(" 23:59:59' ");
/*     */ 
/* 544 */     return sql_sb.toString();
/*     */   }
/*     */ }

/* Location:           C:\Users\lsy\Desktop\
 * Qualified Name:     com.bsoft.service.info.GetQhInfo
 * JD-Core Version:    0.6.0
 */