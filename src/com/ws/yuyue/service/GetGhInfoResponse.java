/*     */ package com.ws.yuyue.service;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="", propOrder={"message"})
/*     */ public class GetGhInfoResponse
/*     */ {
/*     */ 
/*     */   @XmlElement(name="Message", required=true)
/*     */   protected Message message;
/*     */ 
/*     */   public Message getMessage()
/*     */   {
/*  81 */     return this.message;
/*     */   }
/*     */ 
/*     */   public void setMessage(Message value)
/*     */   {
/*  93 */     this.message = value;
/*     */   }
/*     */ 
/*     */   @XmlAccessorType(XmlAccessType.FIELD)
/*     */   @XmlType(name="", propOrder={"code", "description", "regInfo"})
/*     */   public static class Message
/*     */   {
/*     */ 
/*     */     @XmlElement(name="Code", required=true)
/*     */     protected String code;
/*     */ 
/*     */     @XmlElement(name="Description")
/*     */     protected String description;
/*     */ 
/*     */     @XmlElement(name="RegInfo")
/*     */     public List<RegInfo> regInfo;
/*     */ 
/*     */     public String getCode()
/*     */     {
/* 160 */       return this.code;
/*     */     }
/*     */ 
/*     */     public void setCode(String value)
/*     */     {
/* 172 */       this.code = value;
/*     */     }
/*     */ 
/*     */     public String getDescription()
/*     */     {
/* 184 */       return this.description;
/*     */     }
/*     */ 
/*     */     public void setDescription(String value)
/*     */     {
/* 196 */       this.description = value;
/*     */     }
/*     */ 
/*     */     public List<RegInfo> getRegInfo()
/*     */     {
/* 222 */       if (this.regInfo == null) {
/* 223 */         this.regInfo = new ArrayList();
/*     */       }
/* 225 */       return this.regInfo; } 
/*     */     @XmlAccessorType(XmlAccessType.FIELD)
/*     */     @XmlType(name="", propOrder={"hospitalID", "regID", "WorkType", "BeginTime", "EndTime", "ClinicNo", "CheckNo", "SickInsureType", "Money", "IsQuit", "QuitDate", "IsPay", "PayDate", "RegVia", "departID", "doctorID", "selfMoney", "insureMoney", "getNoDate", "isGet", "notPay"})
/*     */     public static class RegInfo { 
/*     */       @XmlElement(name="HospitalID", required=true)
/*     */       protected String hospitalID;
/*     */ 
/*     */       @XmlElement(name="RegID", required=true)
/*     */       @XmlSchemaType(name="unsignedLong")
/*     */       protected BigInteger regID;
/*     */ 
/*     */       @XmlElement(name="WorkType", required=true)
/*     */       protected String WorkType;
/*     */ 
/*     */       @XmlElement(name="BeginTime", required=true)
/*     */       protected String BeginTime;
/*     */ 
/*     */       @XmlElement(name="EndTime", required=true)
/*     */       protected String EndTime;
/*     */ 
/*     */       @XmlElement(name="ClinicNo", required=true)
/*     */       protected String ClinicNo;
/*     */ 
/*     */       @XmlElement(name="CheckNo", required=true)
/*     */       protected String CheckNo;
/*     */ 
/*     */       @XmlElement(name="SickInsureType", required=true)
/*     */       protected String SickInsureType;
/*     */ 
/*     */       @XmlElement(name="Money", required=true)
/*     */       protected String Money;
/*     */ 
/*     */       @XmlElement(name="IsQuit", required=true)
/*     */       protected String IsQuit;
/*     */ 
/*     */       @XmlElement(name="QuitDate", required=true)
/*     */       protected String QuitDate;
/*     */ 
/*     */       @XmlElement(name="IsPay", required=true)
/*     */       protected String IsPay;
/*     */ 
/*     */       @XmlElement(name="PayDate", required=true)
/*     */       protected String PayDate;
/*     */ 
/*     */       @XmlElement(name="RegVia", required=true)
/*     */       protected String RegVia;
/*     */ 
/*     */       @XmlElement(name="DepartID", required=true)
/*     */       protected String departID;
/*     */ 
/*     */       @XmlElement(name="DoctorID")
/*     */       protected String doctorID;
/*     */ 
/*     */       @XmlElement(name="SelfMoney")
/*     */       protected double selfMoney;
/*     */ 
/*     */       @XmlElement(name="InsureMoney")
/*     */       protected double insureMoney;
/*     */ 
/*     */       @XmlElement(name="GetNoDate", required=true)
/*     */       protected String getNoDate;
/*     */ 
/*     */       @XmlElement(name="IsGet", required=true)
/*     */       protected String isGet;
/*     */ 
/*     */       @XmlElement(name="NotPay")
/*     */       protected double notPay;
/*     */ 
/* 335 */       public String getHospitalID() { return this.hospitalID;
/*     */       }
/*     */ 
/*     */       public void setHospitalID(String value)
/*     */       {
/* 347 */         this.hospitalID = value;
/*     */       }
/*     */ 
/*     */       public BigInteger getRegID()
/*     */       {
/* 359 */         return this.regID;
/*     */       }
/*     */ 
/*     */       public void setRegID(BigInteger value)
/*     */       {
/* 371 */         this.regID = value;
/*     */       }
/*     */ 
/*     */       public String getDepartID()
/*     */       {
/* 383 */         return this.departID;
/*     */       }
/*     */ 
/*     */       public void setDepartID(String value)
/*     */       {
/* 395 */         this.departID = value;
/*     */       }
/*     */ 
/*     */       public String getDoctorID()
/*     */       {
/* 407 */         return this.doctorID;
/*     */       }
/*     */ 
/*     */       public void setDoctorID(String value)
/*     */       {
/* 419 */         this.doctorID = value;
/*     */       }
/*     */ 
/*     */       public double getSelfMoney()
/*     */       {
/* 427 */         return this.selfMoney;
/*     */       }
/*     */ 
/*     */       public void setSelfMoney(double value)
/*     */       {
/* 435 */         this.selfMoney = value;
/*     */       }
/*     */ 
/*     */       public double getInsureMoney()
/*     */       {
/* 443 */         return this.insureMoney;
/*     */       }
/*     */ 
/*     */       public void setInsureMoney(double value)
/*     */       {
/* 451 */         this.insureMoney = value;
/*     */       }
/*     */ 
/*     */       public String getGetNoDate()
/*     */       {
/* 463 */         return this.getNoDate;
/*     */       }
/*     */ 
/*     */       public void setGetNoDate(String value)
/*     */       {
/* 475 */         this.getNoDate = value;
/*     */       }
/*     */ 
/*     */       public String getIsGet()
/*     */       {
/* 487 */         return this.isGet;
/*     */       }
/*     */ 
/*     */       public void setIsGet(String value)
/*     */       {
/* 499 */         this.isGet = value;
/*     */       }
/*     */ 
/*     */       public double getNotPay()
/*     */       {
/* 507 */         return this.notPay;
/*     */       }
/*     */ 
/*     */       public void setNotPay(double value)
/*     */       {
/* 515 */         this.notPay = value;
/*     */       }
/*     */ 
/*     */       public String getWorkType() {
/* 519 */         return this.WorkType;
/*     */       }
/*     */ 
/*     */       public void setWorkType(String WorkType) {
/* 523 */         this.WorkType = WorkType;
/*     */       }
/*     */ 
/*     */       public String getBeginTime() {
/* 527 */         return this.BeginTime;
/*     */       }
/*     */ 
/*     */       public void setBeginTime(String beginTime) {
/* 531 */         this.BeginTime = beginTime;
/*     */       }
/*     */ 
/*     */       public String getEndTime() {
/* 535 */         return this.EndTime;
/*     */       }
/*     */ 
/*     */       public void setEndTime(String endTime) {
/* 539 */         this.EndTime = endTime;
/*     */       }
/*     */ 
/*     */       public String getClinicNo() {
/* 543 */         return this.ClinicNo;
/*     */       }
/*     */ 
/*     */       public void setClinicNo(String clinicNo) {
/* 547 */         this.ClinicNo = clinicNo;
/*     */       }
/*     */ 
/*     */       public String getSickInsuretype() {
/* 551 */         return this.SickInsureType;
/*     */       }
/*     */ 
/*     */       public void setSickInsuretype(String sickInsuretype) {
/* 555 */         this.SickInsureType = sickInsuretype;
/*     */       }
/*     */ 
/*     */       public String getCheckNo() {
/* 559 */         return this.CheckNo;
/*     */       }
/*     */ 
/*     */       public void setCheckNo(String checkNo) {
/* 563 */         this.CheckNo = checkNo;
/*     */       }
/*     */ 
/*     */       public String getMoney() {
/* 567 */         return this.Money;
/*     */       }
/*     */ 
/*     */       public void setMoney(String money) {
/* 571 */         this.Money = money;
/*     */       }
/*     */ 
/*     */       public String getIsQuit() {
/* 575 */         return this.IsQuit;
/*     */       }
/*     */ 
/*     */       public void setIsQuit(String isQuit) {
/* 579 */         this.IsQuit = isQuit;
/*     */       }
/*     */ 
/*     */       public String getQuitDate() {
/* 583 */         return this.QuitDate;
/*     */       }
/*     */ 
/*     */       public void setQuitDate(String quitDate) {
/* 587 */         this.QuitDate = quitDate;
/*     */       }
/*     */ 
/*     */       public String getIsPay() {
/* 591 */         return this.IsPay;
/*     */       }
/*     */ 
/*     */       public void setIsPay(String isPay) {
/* 595 */         this.IsPay = isPay;
/*     */       }
/*     */ 
/*     */       public String getPayDate() {
/* 599 */         return this.PayDate;
/*     */       }
/*     */ 
/*     */       public void setPayDate(String payDate) {
/* 603 */         this.PayDate = payDate;
/*     */       }
/*     */ 
/*     */       public String getRegVia() {
/* 607 */         return this.RegVia;
/*     */       }
/*     */ 
/*     */       public void setRegVia(String regVia) {
/* 611 */         this.RegVia = regVia;
/*     */       }
/*     */     }
/*     */   }
/*     */ }

/* Location:           C:\Users\lsy\Desktop\新建文件夹\
 * Qualified Name:     com.ws.yuyue.service.GetGhInfoResponse
 * JD-Core Version:    0.6.0
 */