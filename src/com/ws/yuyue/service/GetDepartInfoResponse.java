
package com.ws.yuyue.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.util.EntityToString;


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
 *                   &lt;element name="DepartInfo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="DepartIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="RegistryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="ClinicFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *                             &lt;element name="MZKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DepartSex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="BabyFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                             &lt;element name="BabyAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlRootElement(name = "getDepartInfoResponse")
public class GetDepartInfoResponse {

    @XmlElement(name = "Message", required = true)
    protected GetDepartInfoResponse.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetDepartInfoResponse.Message }
     *     
     */
    public GetDepartInfoResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDepartInfoResponse.Message }
     *     
     */
    public void setMessage(GetDepartInfoResponse.Message value) {
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
     *         &lt;element name="DepartInfo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartType" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="DepartIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="RegistryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="ClinicFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
     *                   &lt;element name="MZKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DepartSex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="BabyFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *                   &lt;element name="BabyAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "departInfo"
    })
    public static class Message {

        @XmlElement(name = "DepartInfo", required = true)
        public static List<GetDepartInfoResponse.Message.DepartInfo> departInfo;

        /**
         * Gets the value of the departInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the departInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDepartInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetDepartInfoResponse.Message.DepartInfo }
         * 
         * 
         */
        public List<GetDepartInfoResponse.Message.DepartInfo> getDepartInfo() {
        	
            if (departInfo == null) {
                departInfo = new ArrayList<GetDepartInfoResponse.Message.DepartInfo>();
            }
            return this.departInfo;
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
         *         &lt;element name="DepartName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartType" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="DepartIntro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="RegistryFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="ClinicFee" type="{http://www.w3.org/2001/XMLSchema}double"/>
         *         &lt;element name="MZKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DepartSex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="BabyFlag" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         *         &lt;element name="BabyAge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "departName",
            "departID",
            "departType",
            "departIntro",
            "registryFee",
            "clinicFee",
            "mzks",
            "departSex",
            "babyFlag",
            "babyAge",
            "IsSpecialDepart",
            "Phone",
            "Remark"
            
        })
        public static class DepartInfo {

            @XmlElement(name = "HospitalID", required = true)
            protected String hospitalID;
            @XmlElement(name = "DepartName", required = true)
            protected String departName;
            @XmlElement(name = "DepartID", required = true)
            protected String departID;
            @XmlElement(name = "DepartType")
            protected int departType;
            @XmlElement(name = "DepartIntro")
            protected String departIntro;
            @XmlElement(name = "RegistryFee")
            protected double registryFee;
            @XmlElement(name = "ClinicFee")
            protected double clinicFee;
            @XmlElement(name = "MZKS")
            protected String mzks;
            @XmlElement(name = "DepartSex")
            protected Integer departSex;
            @XmlElement(name = "BabyFlag")
            protected Integer babyFlag;
            @XmlElement(name = "BabyAge")
            protected Integer babyAge;
			@XmlElement(name = "IsSpecialDepart")
            protected Integer IsSpecialDepart;
            @XmlElement(name = "Phone")
            protected String Phone;
            @XmlElement(name = "Remark")
            protected String Remark;
            


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
             * Gets the value of the departType property.
             * 
             */
            public int getDepartType() {
                return departType;
            }

            /**
             * Sets the value of the departType property.
             * 
             */
            public void setDepartType(int value) {
                this.departType = value;
            }

            /**
             * Gets the value of the departIntro property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartIntro() {
                return departIntro;
            }

            /**
             * Sets the value of the departIntro property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartIntro(String value) {
                this.departIntro = value;
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
             * Gets the value of the mzks property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMZKS() {
                return mzks;
            }

            /**
             * Sets the value of the mzks property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMZKS(String value) {
                this.mzks = value;
            }

            /**
             * Gets the value of the departSex property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDepartSex() {
                return departSex;
            }

            /**
             * Sets the value of the departSex property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDepartSex(Integer value) {
                this.departSex = value;
            }

            /**
             * Gets the value of the babyFlag property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBabyFlag() {
                return babyFlag;
            }

            /**
             * Sets the value of the babyFlag property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBabyFlag(Integer value) {
                this.babyFlag = value;
            }

            /**
             * Gets the value of the babyAge property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getBabyAge() {
                return babyAge;
            }

            /**
             * Sets the value of the babyAge property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setBabyAge(Integer value) {
                this.babyAge = value;
            }
            
			public Integer getIsSpecialDepart() {
				return IsSpecialDepart;
			}

			public void setIsSpecialDepart(Integer isSpecialDepart) {
				IsSpecialDepart = isSpecialDepart;
			}

			public String getPhone() {
				return Phone;
			}

			public void setPhone(String phone) {
				Phone = phone;
			}
			public String getRemark() {
				return Remark;
			}

			public void setRemark(String remark) {
				Remark = remark;
			}
			

        }

    }



}
