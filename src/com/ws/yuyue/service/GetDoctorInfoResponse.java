
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
 *                   &lt;element name="DoctorInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DoctorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="DoctorSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="DoctorRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DoctorInro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DoctorIntor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="AveWorkTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlRootElement(name = "getDoctorInfoResponse")
public class GetDoctorInfoResponse {

    @XmlElement(name = "Message", required = true)
    protected GetDoctorInfoResponse.Message message;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link GetDoctorInfoResponse.Message }
     *     
     */
    public GetDoctorInfoResponse.Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDoctorInfoResponse.Message }
     *     
     */
    public void setMessage(GetDoctorInfoResponse.Message value) {
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
     *         &lt;element name="DoctorInfo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="HospitalID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DoctorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="DoctorSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="DoctorRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DoctorInro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DoctorIntor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="AveWorkTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "doctorInfo"
    })
    public static class Message {

        @XmlElement(name = "DoctorInfo")
		public List<GetDoctorInfoResponse.Message.DoctorInfo> doctorInfo;

        /**
         * Gets the value of the doctorInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the doctorInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDoctorInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GetDoctorInfoResponse.Message.DoctorInfo }
         * 
         * 
         */
        public List<GetDoctorInfoResponse.Message.DoctorInfo> getDoctorInfo() {
            if (doctorInfo == null) {
                doctorInfo = new ArrayList<GetDoctorInfoResponse.Message.DoctorInfo>();
            }
            return this.doctorInfo;
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
         *         &lt;element name="DoctorID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DepartID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DoctorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="DoctorSex" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="DoctorRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DoctorInro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DoctorIntor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="IsExpert" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="AveWorkTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
            "doctorName",
            "doctorSex",
            "doctorRank",
            "doctorInro",
            "doctorIntor",
            "isExpert",
            "aveWorkTime",
            "DoctorCardNo",
            "Education",
            "Experience"           
        })
        public static class DoctorInfo {

            @XmlElement(name = "HospitalID", required = true)
            protected String hospitalID;
            @XmlElement(name = "DoctorID", required = true)
            protected String doctorID;
            @XmlElement(name = "DepartID", required = true)
            protected String departID;
            @XmlElement(name = "DoctorName", required = true)
            protected String doctorName;
            @XmlElement(name = "DoctorSex")
            protected int doctorSex;
            @XmlElement(name = "DoctorRank")
            protected String doctorRank;
            @XmlElement(name = "DoctorInro")
            protected String doctorInro;
            @XmlElement(name = "DoctorIntor")
            protected String doctorIntor;
            @XmlElement(name = "IsExpert")
            protected int isExpert;
            @XmlElement(name = "AveWorkTime")
            protected Integer aveWorkTime;
			@XmlElement(name = "DoctorCardNo")
            protected String DoctorCardNo;
            @XmlElement(name = "Education")
            protected String Education;
            @XmlElement(name = "Experience")
            protected String Experience;

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
             * Gets the value of the doctorSex property.
             * 
             */
            public int getDoctorSex() {
                return doctorSex;
            }

            /**
             * Sets the value of the doctorSex property.
             * 
             */
            public void setDoctorSex(int value) {
                this.doctorSex = value;
            }

            /**
             * Gets the value of the doctorRank property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDoctorRank() {
                return doctorRank;
            }

            /**
             * Sets the value of the doctorRank property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDoctorRank(String value) {
                this.doctorRank = value;
            }

            /**
             * Gets the value of the doctorInro property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDoctorInro() {
                return doctorInro;
            }

            /**
             * Sets the value of the doctorInro property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDoctorInro(String value) {
                this.doctorInro = value;
            }

            /**
             * Gets the value of the doctorIntor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDoctorIntor() {
                return doctorIntor;
            }

            /**
             * Sets the value of the doctorIntor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDoctorIntor(String value) {
                this.doctorIntor = value;
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
             * Gets the value of the aveWorkTime property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAveWorkTime() {
                return aveWorkTime;
            }

            /**
             * Sets the value of the aveWorkTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAveWorkTime(Integer value) {
                this.aveWorkTime = value;
            }
            
            public String getDoctorCardNo() {
				return DoctorCardNo;
			}

			public void setDoctorCardNo(String doctorCardNo) {
				DoctorCardNo = doctorCardNo;
			}

			public String getEducation() {
				return Education;
			}

			public void setEducation(String education) {
				Education = education;
			}

			public String getExperience() {
				return Experience;
			}

			public void setExperience(String experience) {
				Experience = experience;
			}
        }

    }

}
