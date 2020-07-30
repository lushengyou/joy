
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
 *                   &lt;element name="ResponseInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                             &lt;element name="ReserveNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ErrMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlRootElement(name = "getYyNoResponse")
public class GetYyNoResponse {

    @XmlElement(name = "Message", required = true)
    protected GetYyNoResponse.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetYyNoResponse.Message }
     *     
     */
    public GetYyNoResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetYyNoResponse.Message }
     *     
     */
    public void setMessage(GetYyNoResponse.Message value) {
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
     *         &lt;element name="ResponseInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                   &lt;element name="ReserveNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ErrMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "responseInfo"
    })
    public static class Message {

        @XmlElement(name = "ResponseInfo", required = true)
        protected GetYyNoResponse.Message.ResponseInfo responseInfo;

        /**
         * Gets the value of the responseInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GetYyNoResponse.Message.ResponseInfo }
         *     
         */
        public GetYyNoResponse.Message.ResponseInfo getResponseInfo() {
            return responseInfo;
        }

        /**
         * Sets the value of the responseInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetYyNoResponse.Message.ResponseInfo }
         *     
         */
        public void setResponseInfo(GetYyNoResponse.Message.ResponseInfo value) {
            this.responseInfo = value;
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
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *         &lt;element name="ReserveNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ErrMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "code",
            "regID",
            "reserveNo",
            "errMsg"
        })
        public static class ResponseInfo {

            @XmlElement(name = "Code", required = true)
            protected String code;
            @XmlElement(name = "RegID", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger regID;
            @XmlElement(name = "ReserveNo", required = true)
            protected String reserveNo;
            @XmlElement(name = "ErrMsg")
            protected String errMsg;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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
             * Gets the value of the errMsg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getErrMsg() {
                return errMsg;
            }

            /**
             * Sets the value of the errMsg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setErrMsg(String value) {
                this.errMsg = value;
            }

        }

    }

}
