
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
 *                   &lt;element name="RequestInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
 *                             &lt;element name="SickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SickSex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="SickInsureType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlRootElement(name = "updateOrderInfo")
public class UpdateOrderInfo {

    @XmlElement(name = "Message", required = true)
    protected UpdateOrderInfo.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderInfo.Message }
     *     
     */
    public UpdateOrderInfo.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderInfo.Message }
     *     
     */
    public void setMessage(UpdateOrderInfo.Message value) {
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
     *                   &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
     *                   &lt;element name="SickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SickSex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="SickInsureType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        protected UpdateOrderInfo.Message.RequestInfo requestInfo;

        /**
         * Gets the value of the requestInfo property.
         * 
         * @return
         *     possible object is
         *     {@link UpdateOrderInfo.Message.RequestInfo }
         *     
         */
        public UpdateOrderInfo.Message.RequestInfo getRequestInfo() {
            return requestInfo;
        }

        /**
         * Sets the value of the requestInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link UpdateOrderInfo.Message.RequestInfo }
         *     
         */
        public void setRequestInfo(UpdateOrderInfo.Message.RequestInfo value) {
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
         *         &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/>
         *         &lt;element name="SickName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SickSex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="SickInsureType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PayType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "sickName",
            "sickSex",
            "sickInsureType",
            "phone",
            "cardNo",
            "payType"
        })
        public static class RequestInfo {

            @XmlElement(name = "RegID", required = true)
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger regID;
            @XmlElement(name = "SickName")
            protected String sickName;
            @XmlElement(name = "SickSex")
            protected Integer sickSex;
            @XmlElement(name = "SickInsureType")
            protected Integer sickInsureType;
            @XmlElement(name = "Phone")
            protected String phone;
            @XmlElement(name = "CardNo", required = true)
            protected String cardNo;
            @XmlElement(name = "PayType")
            protected Integer payType;

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
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSickSex() {
                return sickSex;
            }

            /**
             * Sets the value of the sickSex property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSickSex(Integer value) {
                this.sickSex = value;
            }

            /**
             * Gets the value of the sickInsureType property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getSickInsureType() {
                return sickInsureType;
            }

            /**
             * Sets the value of the sickInsureType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setSickInsureType(Integer value) {
                this.sickInsureType = value;
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
             * Gets the value of the payType property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPayType() {
                return payType;
            }

            /**
             * Sets the value of the payType property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPayType(Integer value) {
                this.payType = value;
            }

        }

    }

}
