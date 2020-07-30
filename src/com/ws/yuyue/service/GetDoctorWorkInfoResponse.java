
package com.ws.yuyue.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *                   &lt;element name="DoctorCalendar" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="WorkStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="BeginNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="SpaceNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="Limited" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="RegistryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="ClinicFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="ExpertsFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "getDoctorWorkInfoResponse")
public class GetDoctorWorkInfoResponse {

    @XmlElement(name = "Message", required = true)
    protected GetDoctorWorkInfoResponse.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetDoctorWorkInfoResponse.Message }
     *     
     */
    public GetDoctorWorkInfoResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDoctorWorkInfoResponse.Message }
     *     
     */
    public void setMessage(GetDoctorWorkInfoResponse.Message value) {
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
     *         &lt;element name="DoctorCalendar" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="WorkStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="BeginNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="SpaceNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="Limited" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="RegistryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="ClinicFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="ExpertsFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "doctorCalendar"
    })
    public static class Message {

        @XmlElement(name = "DoctorCalendar")
		public List<GetDoctorWorkInfoResponse.Message.DoctorCalendar> doctorCalendar;

        /**
         * Gets the value of the doctorCalendar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the doctorCalendar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDoctorCalendar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetDoctorWorkInfoResponse.Message.DoctorCalendar }
         * 
         * 
         */
        public List<GetDoctorWorkInfoResponse.Message.DoctorCalendar> getDoctorCalendar() {
            if (doctorCalendar == null) {
                doctorCalendar = new ArrayList<GetDoctorWorkInfoResponse.Message.DoctorCalendar>();
            }
            return this.doctorCalendar;
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
         *         &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="WorkStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="BeginNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="SpaceNo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="Limited" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="RegistryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="ClinicFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="ExpertsFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "hospitalID",
            "workStatus",
            "doctorID",
            "departID",
            "workDate",
            "workType",
            "beginNo",
            "spaceNo",
            "limited",
            "registryFee",
            "clinicFee",
            "expertsFee",
            "remark"
        })
        public static class DoctorCalendar {

            @XmlElement(name = "HospitalID", required = true)
            protected String hospitalID;
            @XmlElement(name = "WorkStatus")
            protected int workStatus;
            @XmlElement(name = "DoctorID", required = true)
            protected String doctorID;
            @XmlElement(name = "DepartID", required = true)
            protected String departID;
            @XmlElement(name = "WorkDate", required = true)
            protected String workDate;
            @XmlElement(name = "WorkType")
            protected int workType;
            @XmlElement(name = "BeginNo")
            protected Integer beginNo;
            @XmlElement(name = "SpaceNo")
            protected Integer spaceNo;
            @XmlElement(name = "Limited")
            protected int limited;
            @XmlElement(name = "RegistryFee")
            protected double registryFee;
            @XmlElement(name = "ClinicFee")
            protected double clinicFee;
            @XmlElement(name = "ExpertsFee")
            protected double expertsFee;
            @XmlElement(name = "Remark")
            protected String remark;

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
             * Gets the value of the workStatus property.
             * 
             */
            public int getWorkStatus() {
                return workStatus;
            }

            /**
             * Sets the value of the workStatus property.
             * 
             */
            public void setWorkStatus(int value) {
                this.workStatus = value;
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
             * Gets the value of the workDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkDate() {
                return workDate;
            }

            /**
             * Sets the value of the workDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWorkDate(String value) {
                this.workDate = value;
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
             * Gets the value of the beginNo property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBeginNo() {
                return beginNo;
            }

            /**
             * Sets the value of the beginNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBeginNo(Integer value) {
                this.beginNo = value;
            }

            /**
             * Gets the value of the spaceNo property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSpaceNo() {
                return spaceNo;
            }

            /**
             * Sets the value of the spaceNo property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSpaceNo(Integer value) {
                this.spaceNo = value;
            }

            /**
             * Gets the value of the limited property.
             * 
             */
            public int getLimited() {
                return limited;
            }

            /**
             * Sets the value of the limited property.
             * 
             */
            public void setLimited(int value) {
                this.limited = value;
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
             */
            public double getExpertsFee() {
                return expertsFee;
            }

            /**
             * Sets the value of the expertsFee property.
             * 
             */
            public void setExpertsFee(double value) {
                this.expertsFee = value;
            }

            /**
             * Gets the value of the remark property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemark() {
                return remark;
            }

            /**
             * Sets the value of the remark property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemark(String value) {
                this.remark = value;
            }

        }

    }

}
