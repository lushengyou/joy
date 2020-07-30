
package com.ws.yuyue.service;

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
 *                   &lt;element name="RequestInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlRootElement(name = "getDtNoInfo")
public class GetDtNoInfo {

    @XmlElement(name = "Message", required = true)
    protected GetDtNoInfo.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetDtNoInfo.Message }
     *     
     */
    public GetDtNoInfo.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDtNoInfo.Message }
     *     
     */
    public void setMessage(GetDtNoInfo.Message value) {
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
     *         &lt;element name="RequestInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "requestInfo"
    })
    public static class Message {

        @XmlElement(name = "RequestInfo", required = true)
        protected GetDtNoInfo.Message.RequestInfo requestInfo;

        /**
         * Gets the value of the requestInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GetDtNoInfo.Message.RequestInfo }
         *     
         */
        public GetDtNoInfo.Message.RequestInfo getRequestInfo() {
            return requestInfo;
        }

        /**
         * Sets the value of the requestInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetDtNoInfo.Message.RequestInfo }
         *     
         */
        public void setRequestInfo(GetDtNoInfo.Message.RequestInfo value) {
            this.requestInfo = value;
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
         *         &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="WorkDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="WorkType" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
            "doctorID",
            "departID",
            "workDate",
            "workType"
        })
        public static class RequestInfo {

            @XmlElement(name = "HospitalID", required = true)
            protected String hospitalID;
            @XmlElement(name = "DoctorID")
            protected String doctorID;
            @XmlElement(name = "DepartID", required = true)
            protected String departID;
            @XmlElement(name = "WorkDate", required = true)
            protected String workDate;
            @XmlElement(name = "WorkType")
            protected int workType;

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

        }

    }

}
