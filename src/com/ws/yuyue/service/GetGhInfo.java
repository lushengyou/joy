
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
 *                   &lt;element name="BatRegInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="QueyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OneRegInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
 *                             &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SeeDoctorDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "getGhInfo")
public class GetGhInfo {

    @XmlElement(name = "Message", required = true)
    protected GetGhInfo.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetGhInfo.Message }
     *     
     */
    public GetGhInfo.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetGhInfo.Message }
     *     
     */
    public void setMessage(GetGhInfo.Message value) {
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
     *         &lt;element name="BatRegInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="QueyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OneRegInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
     *                   &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SeeDoctorDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "batRegInfo",
        "oneRegInfo"
    })
    public static class Message {

        @XmlElement(name = "BatRegInfo")
        protected GetGhInfo.Message.BatRegInfo batRegInfo;
        @XmlElement(name = "OneRegInfo")
        protected GetGhInfo.Message.OneRegInfo oneRegInfo;

        /**
         * Gets the value of the batRegInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GetGhInfo.Message.BatRegInfo }
         *     
         */
        public GetGhInfo.Message.BatRegInfo getBatRegInfo() {
            return batRegInfo;
        }

        /**
         * Sets the value of the batRegInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetGhInfo.Message.BatRegInfo }
         *     
         */
        public void setBatRegInfo(GetGhInfo.Message.BatRegInfo value) {
            this.batRegInfo = value;
        }

        /**
         * Gets the value of the oneRegInfo property.
         * 
         * @return
         *     possible object is
         *     {@link GetGhInfo.Message.OneRegInfo }
         *     
         */
        public GetGhInfo.Message.OneRegInfo getOneRegInfo() {
            return oneRegInfo;
        }

        /**
         * Sets the value of the oneRegInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link GetGhInfo.Message.OneRegInfo }
         *     
         */
        public void setOneRegInfo(GetGhInfo.Message.OneRegInfo value) {
            this.oneRegInfo = value;
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
         *         &lt;element name="QueyDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "queyDate"
        })
        public static class BatRegInfo {

            @XmlElement(name = "HospitalID", required = true)
            protected String hospitalID;
            @XmlElement(name = "QueyDate", required = true)
            protected String queyDate;

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
             * Gets the value of the queyDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueyDate() {
                return queyDate;
            }

            /**
             * Sets the value of the queyDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueyDate(String value) {
                this.queyDate = value;
            }

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
         *         &lt;element name="RegID" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" minOccurs="0"/>
         *         &lt;element name="CardNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SeeDoctorDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "cardNo",
            "departID",
            "doctorID",
            "seeDoctorDate"
        })
        public static class OneRegInfo {

            @XmlElement(name = "RegID")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger regID;
            @XmlElement(name = "CardNo", required = true)
            protected String cardNo;
            @XmlElement(name = "DepartID")
            protected String departID;
            @XmlElement(name = "DoctorID")
            protected String doctorID;
            @XmlElement(name = "SeeDoctorDate", required = true)
            protected String seeDoctorDate;

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

        }

    }

}
