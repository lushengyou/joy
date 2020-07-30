
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
 *                   &lt;element name="MsgType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="RequestInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "getDoctorWorkInfo")
public class GetDoctorWorkInfo {

    @XmlElement(name = "Message", required = true)
    protected GetDoctorWorkInfo.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetDoctorWorkInfo.Message }
     *     
     */
    public GetDoctorWorkInfo.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDoctorWorkInfo.Message }
     *     
     */
    public void setMessage(GetDoctorWorkInfo.Message value) {
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
     *         &lt;element name="MsgType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="RequestInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "msgType",
        "requestInfo"
    })
    public static class Message {

        @XmlElement(name = "MsgType")
        protected int msgType;
        @XmlElement(name = "RequestInfo", required = true)
        protected GetDoctorWorkInfo.Message.RequestInfo requestInfo;

        /**
         * Gets the value of the msgType property.
         * 
         */
        public int getMsgType() {
            return msgType;
        }

        /**
         * Sets the value of the msgType property.
         * 
         */
        public void setMsgType(int value) {
            this.msgType = value;
        }

        /**
         * Gets the value of the requestInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GetDoctorWorkInfo.Message.RequestInfo }
         *     
         */
        public GetDoctorWorkInfo.Message.RequestInfo getRequestInfo() {
            return requestInfo;
        }

        /**
         * Sets the value of the requestInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetDoctorWorkInfo.Message.RequestInfo }
         *     
         */
        public void setRequestInfo(GetDoctorWorkInfo.Message.RequestInfo value) {
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
         *         &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "beginTime",
            "endTime"
        })
        public static class RequestInfo {

            @XmlElement(name = "HospitalID", required = true)
            protected String hospitalID;
            @XmlElement(name = "DoctorID")
            protected String doctorID;
            @XmlElement(name = "DepartID")
            protected String departID;
            @XmlElement(name = "BeginTime", required = true)
            protected String beginTime;
            @XmlElement(name = "EndTime", required = true)
            protected String endTime;

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

        }

    }

}
