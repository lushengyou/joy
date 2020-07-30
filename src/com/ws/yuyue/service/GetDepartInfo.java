
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
@XmlRootElement(name = "getDepartInfo")
public class GetDepartInfo {

    @XmlElement(name = "Message", required = true)
    protected GetDepartInfo.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetDepartInfo.Message }
     *     
     */
    public GetDepartInfo.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDepartInfo.Message }
     *     
     */
    public void setMessage(GetDepartInfo.Message value) {
    	
    	
    	
    	
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
        protected GetDepartInfo.Message.RequestInfo requestInfo;

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
         *     {@link GetDepartInfo.Message.RequestInfo }
         *     
         */
        public GetDepartInfo.Message.RequestInfo getRequestInfo() {
            return requestInfo;
        }

        /**
         * Sets the value of the requestInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetDepartInfo.Message.RequestInfo }
         *     
         */
        public void setRequestInfo(GetDepartInfo.Message.RequestInfo value) {
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
            "hospitalID"
        })
        public static class RequestInfo {

            @XmlElement(name = "HospitalID", required = true)
            protected String hospitalID;

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

        }

    }

}
