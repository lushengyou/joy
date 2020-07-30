
package com.ws.yuyue.service;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OrderInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                             &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DoctorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="SickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SickSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="SickBirthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SickInsureType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="SickInsureNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SeeDoctorDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="ReserveNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegistryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="ClinicFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="ExpertsFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *                             &lt;element name="CheckNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RegType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OperID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OutHospitalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OutHospitalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FromDeptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FromDeptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FromDoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="FromDoctorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ChangeCliniqueReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="MedicalRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="PreDiagnosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "message"
})
@XmlRootElement(name = "getYyNo")
public class GetYyNo {

    @XmlElement(name = "Message", required = true)
    protected GetYyNo.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetYyNo.Message }
     *     
     */
    public GetYyNo.Message getMessage() {
    	
    	
    	
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetYyNo.Message }
     *     
     */
    public void setMessage(GetYyNo.Message value) {
        this.message = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OrderInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                   &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DoctorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="SickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SickSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="SickBirthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SickInsureType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="SickInsureNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SeeDoctorDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="ReserveNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegistryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="ClinicFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="ExpertsFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
     *                   &lt;element name="CheckNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RegType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OperID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OutHospitalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OutHospitalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FromDeptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FromDeptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FromDoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="FromDoctorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ChangeCliniqueReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="MedicalRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="PreDiagnosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderInfo"
    })
    public static class Message {

        @XmlElement(name = "OrderInfo", required = true)
        protected GetYyNo.Message.OrderInfo orderInfo;

        /**
         * Gets the value of the orderInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GetYyNo.Message.OrderInfo }
         *     
         */
        public GetYyNo.Message.OrderInfo getOrderInfo() {
            return orderInfo;
        }

        /**
         * Sets the value of the orderInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetYyNo.Message.OrderInfo }
         *     
         */
        public void setOrderInfo(GetYyNo.Message.OrderInfo value) {
            this.orderInfo = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *         &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DoctorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="SickName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SickSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="SickBirthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SickInsureType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="SickInsureNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SeeDoctorDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="ReserveNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegistryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="ClinicFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="ExpertsFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
         *         &lt;element name="CheckNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RegType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OperID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OutHospitalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OutHospitalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FromDeptID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FromDeptName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FromDoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="FromDoctorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ChangeCliniqueReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="MedicalRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="PreDiagnosis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "regID",
            "hospitalID",
            "departID",
            "departName",
            "doctorID",
            "doctorName",
            "isExpert",
            "sickName",
            "sickSex",
            "sickBirthday",
            "sickInsureType",
            "sickInsureNo",
            "seeDoctorDate",
            "workType",
            "reserveNo",
            "registryFee",
            "clinicFee",
            "expertsFee",
            "checkNo",
            "phone",
            "cardNo",
            "regType",
            "payType",
            "createDate",
            "beginTime",
            "endTime",
            "operID",
            "outHospitalID",
            "outHospitalName",
            "fromDeptID",
            "fromDeptName",
            "fromDoctorID",
            "fromDoctorName",
            "changeCliniqueReason",
            "medicalRecord",
            "preDiagnosis",
            "Mzbh"
            
        })
        public static class OrderInfo {

            @XmlElement(name = "RegID", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger regID;
            @XmlElement(name = "HospitalID", required = true)
            protected String hospitalID;
            @XmlElement(name = "DepartID", required = true)
            protected String departID;
            @XmlElement(name = "DepartName", required = true)
            protected String departName;
            @XmlElement(name = "DoctorID")
            protected String doctorID;
            @XmlElement(name = "DoctorName")
            protected String doctorName;
            @XmlElement(name = "IsExpert")
            protected int isExpert;
            @XmlElement(name = "SickName", required = true)
            protected String sickName;
            @XmlElement(name = "SickSex")
            protected int sickSex;
            @XmlElement(name = "SickBirthday")
            protected String sickBirthday;
            @XmlElement(name = "SickInsureType")
            protected int sickInsureType;
            @XmlElement(name = "SickInsureNo")
            protected String sickInsureNo;
            @XmlElement(name = "SeeDoctorDate", required = true)
            protected String seeDoctorDate;
            @XmlElement(name = "WorkType")
            protected int workType;
            @XmlElement(name = "ReserveNo")
            protected String reserveNo;
            @XmlElement(name = "RegistryFee")
            protected double registryFee;
            @XmlElement(name = "ClinicFee")
            protected double clinicFee;
            @XmlElement(name = "ExpertsFee")
            protected Double expertsFee;
            @XmlElement(name = "CheckNo")
            protected String checkNo;
            @XmlElement(name = "Phone")
            protected String phone;
            @XmlElement(name = "CardNo", required = true)
            protected String cardNo;
            @XmlElement(name = "RegType")
            protected int regType;
            @XmlElement(name = "PayType")
            protected int payType;
            @XmlElement(name = "CreateDate", required = true)
            protected String createDate;
            @XmlElement(name = "BeginTime")
            protected String beginTime;
            @XmlElement(name = "EndTime")
            protected String endTime;
            @XmlElement(name = "OperID")
            protected String operID;
            @XmlElement(name = "OutHospitalID")
            protected String outHospitalID;
            @XmlElement(name = "OutHospitalName")
            protected String outHospitalName;
            @XmlElement(name = "FromDeptID")
            protected String fromDeptID;
            @XmlElement(name = "FromDeptName")
            protected String fromDeptName;
            @XmlElement(name = "FromDoctorID")
            protected String fromDoctorID;
            @XmlElement(name = "FromDoctorName")
            protected String fromDoctorName;
            @XmlElement(name = "ChangeCliniqueReason")
            protected String changeCliniqueReason;
            @XmlElement(name = "MedicalRecord")
            protected String medicalRecord;
            @XmlElement(name = "PreDiagnosis")
            protected String preDiagnosis;
			@XmlElement(name = "Mzbh")
            protected String Mzbh;


			public String getMzbh() {
				return Mzbh;
			}

			public void setMzbh(String mzbh) {
				Mzbh = mzbh;
			}
			
			
            /**
             * Gets the value of the regID property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getRegID() {
                return regID;
            }

            /**
             * Sets the value of the regID property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setRegID(BigInteger value) {
                this.regID = value;
            }

            /**
             * Gets the value of the hospitalID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHospitalID() {
                return hospitalID;
            }

            /**
             * Sets the value of the hospitalID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHospitalID(String value) {
                this.hospitalID = value;
            }

            /**
             * Gets the value of the departID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartID() {
                return departID;
            }

            /**
             * Sets the value of the departID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartID(String value) {
                this.departID = value;
            }

            /**
             * Gets the value of the departName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartName() {
                return departName;
            }

            /**
             * Sets the value of the departName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartName(String value) {
                this.departName = value;
            }

            /**
             * Gets the value of the doctorID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDoctorID() {
                return doctorID;
            }

            /**
             * Sets the value of the doctorID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDoctorID(String value) {
                this.doctorID = value;
            }

            /**
             * Gets the value of the doctorName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDoctorName() {
                return doctorName;
            }

            /**
             * Sets the value of the doctorName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDoctorName(String value) {
                this.doctorName = value;
            }

            /**
             * Gets the value of the isExpert property.
             * 
             */
            public int getIsExpert() {
                return isExpert;
            }

            /**
             * Sets the value of the isExpert property.
             * 
             */
            public void setIsExpert(int value) {
                this.isExpert = value;
            }

            /**
             * Gets the value of the sickName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSickName() {
                return sickName;
            }

            /**
             * Sets the value of the sickName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSickName(String value) {
                this.sickName = value;
            }

            /**
             * Gets the value of the sickSex property.
             * 
             */
            public int getSickSex() {
                return sickSex;
            }

            /**
             * Sets the value of the sickSex property.
             * 
             */
            public void setSickSex(int value) {
                this.sickSex = value;
            }

            /**
             * Gets the value of the sickBirthday property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSickBirthday() {
                return sickBirthday;
            }

            /**
             * Sets the value of the sickBirthday property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSickBirthday(String value) {
                this.sickBirthday = value;
            }

            /**
             * Gets the value of the sickInsureType property.
             * 
             */
            public int getSickInsureType() {
                return sickInsureType;
            }

            /**
             * Sets the value of the sickInsureType property.
             * 
             */
            public void setSickInsureType(int value) {
                this.sickInsureType = value;
            }

            /**
             * Gets the value of the sickInsureNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSickInsureNo() {
                return sickInsureNo;
            }

            /**
             * Sets the value of the sickInsureNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSickInsureNo(String value) {
                this.sickInsureNo = value;
            }

            /**
             * Gets the value of the seeDoctorDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeeDoctorDate() {
                return seeDoctorDate;
            }

            /**
             * Sets the value of the seeDoctorDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeeDoctorDate(String value) {
                this.seeDoctorDate = value;
            }

            /**
             * Gets the value of the workType property.
             * 
             */
            public int getWorkType() {
                return workType;
            }

            /**
             * Sets the value of the workType property.
             * 
             */
            public void setWorkType(int value) {
                this.workType = value;
            }

            /**
             * Gets the value of the reserveNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReserveNo() {
                return reserveNo;
            }

            /**
             * Sets the value of the reserveNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReserveNo(String value) {
                this.reserveNo = value;
            }

            /**
             * Gets the value of the registryFee property.
             * 
             */
            public double getRegistryFee() {
                return registryFee;
            }

            /**
             * Sets the value of the registryFee property.
             * 
             */
            public void setRegistryFee(double value) {
                this.registryFee = value;
            }

            /**
             * Gets the value of the clinicFee property.
             * 
             */
            public double getClinicFee() {
                return clinicFee;
            }

            /**
             * Sets the value of the clinicFee property.
             * 
             */
            public void setClinicFee(double value) {
                this.clinicFee = value;
            }

            /**
             * Gets the value of the expertsFee property.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getExpertsFee() {
                return expertsFee;
            }

            /**
             * Sets the value of the expertsFee property.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setExpertsFee(Double value) {
                this.expertsFee = value;
            }

            /**
             * Gets the value of the checkNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCheckNo() {
                return checkNo;
            }

            /**
             * Sets the value of the checkNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCheckNo(String value) {
                this.checkNo = value;
            }

            /**
             * Gets the value of the phone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhone() {
                return phone;
            }

            /**
             * Sets the value of the phone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhone(String value) {
                this.phone = value;
            }

            /**
             * Gets the value of the cardNo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCardNo() {
                return cardNo;
            }

            /**
             * Sets the value of the cardNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCardNo(String value) {
                this.cardNo = value;
            }

            /**
             * Gets the value of the regType property.
             * 
             */
            public int getRegType() {
                return regType;
            }

            /**
             * Sets the value of the regType property.
             * 
             */
            public void setRegType(int value) {
                this.regType = value;
            }

            /**
             * Gets the value of the payType property.
             * 
             */
            public int getPayType() {
                return payType;
            }

            /**
             * Sets the value of the payType property.
             * 
             */
            public void setPayType(int value) {
                this.payType = value;
            }

            /**
             * Gets the value of the createDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreateDate() {
                return createDate;
            }

            /**
             * Sets the value of the createDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreateDate(String value) {
                this.createDate = value;
            }

            /**
             * Gets the value of the beginTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBeginTime() {
                return beginTime;
            }

            /**
             * Sets the value of the beginTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBeginTime(String value) {
                this.beginTime = value;
            }

            /**
             * Gets the value of the endTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEndTime() {
                return endTime;
            }

            /**
             * Sets the value of the endTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEndTime(String value) {
                this.endTime = value;
            }

            /**
             * Gets the value of the operID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOperID() {
                return operID;
            }

            /**
             * Sets the value of the operID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOperID(String value) {
                this.operID = value;
            }

            /**
             * Gets the value of the outHospitalID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutHospitalID() {
                return outHospitalID;
            }

            /**
             * Sets the value of the outHospitalID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOutHospitalID(String value) {
                this.outHospitalID = value;
            }

            /**
             * Gets the value of the outHospitalName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutHospitalName() {
                return outHospitalName;
            }

            /**
             * Sets the value of the outHospitalName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOutHospitalName(String value) {
                this.outHospitalName = value;
            }

            /**
             * Gets the value of the fromDeptID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromDeptID() {
                return fromDeptID;
            }

            /**
             * Sets the value of the fromDeptID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromDeptID(String value) {
                this.fromDeptID = value;
            }

            /**
             * Gets the value of the fromDeptName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromDeptName() {
                return fromDeptName;
            }

            /**
             * Sets the value of the fromDeptName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromDeptName(String value) {
                this.fromDeptName = value;
            }

            /**
             * Gets the value of the fromDoctorID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromDoctorID() {
                return fromDoctorID;
            }

            /**
             * Sets the value of the fromDoctorID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromDoctorID(String value) {
                this.fromDoctorID = value;
            }

            /**
             * Gets the value of the fromDoctorName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFromDoctorName() {
                return fromDoctorName;
            }

            /**
             * Sets the value of the fromDoctorName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFromDoctorName(String value) {
                this.fromDoctorName = value;
            }

            /**
             * Gets the value of the changeCliniqueReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChangeCliniqueReason() {
                return changeCliniqueReason;
            }

            /**
             * Sets the value of the changeCliniqueReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChangeCliniqueReason(String value) {
                this.changeCliniqueReason = value;
            }

            /**
             * Gets the value of the medicalRecord property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicalRecord() {
                return medicalRecord;
            }

            /**
             * Sets the value of the medicalRecord property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicalRecord(String value) {
                this.medicalRecord = value;
            }

            /**
             * Gets the value of the preDiagnosis property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreDiagnosis() {
                return preDiagnosis;
            }

            /**
             * Sets the value of the preDiagnosis property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreDiagnosis(String value) {
                this.preDiagnosis = value;
            }
        }

    }

}
