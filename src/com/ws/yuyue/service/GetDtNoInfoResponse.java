package com.ws.yuyue.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
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
 *                   &lt;element name="WorkInfo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ResName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="TotalNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="LeftNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="CheckSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Queue" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CurrentNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="QueuingNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = { "message" })
@XmlRootElement(name = "getDtNoInfoResponse")
public class GetDtNoInfoResponse {

	@XmlElement(name = "Message", required = true)
	protected GetDtNoInfoResponse.Message message;

	/**
	 * Gets the value of the message property.
	 * 
	 * @return possible object is {@link GetDtNoInfoResponse.Message }
	 * 
	 */
	public GetDtNoInfoResponse.Message getMessage() {
		return message;
	}

	/**
	 * Sets the value of the message property.
	 * 
	 * @param value
	 *            allowed object is {@link GetDtNoInfoResponse.Message }
	 * 
	 */
	public void setMessage(GetDtNoInfoResponse.Message value) {
		this.message = value;
	}

	/**
	 * <p>
	 * Java class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment specifies the expected content contained
	 * within this class.
	 * 
	 * <pre>
	 * &lt;complexType>
	 *   &lt;complexContent>
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *       &lt;sequence>
	 *         &lt;element name="WorkInfo" maxOccurs="unbounded" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="ResName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
	 *                   &lt;element name="TotalNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="LeftNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
	 *                   &lt;element name="CheckSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
	 *                 &lt;/sequence>
	 *               &lt;/restriction>
	 *             &lt;/complexContent>
	 *           &lt;/complexType>
	 *         &lt;/element>
	 *         &lt;element name="Queue" minOccurs="0">
	 *           &lt;complexType>
	 *             &lt;complexContent>
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	 *                 &lt;sequence>
	 *                   &lt;element name="CurrentNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
	 *                   &lt;element name="QueuingNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
	@XmlType(name = "", propOrder = { "workInfo", "queue" })
	public static class Message {

		@XmlElement(name = "WorkInfo")
		public List<GetDtNoInfoResponse.Message.WorkInfo> workInfo;
		@XmlElement(name = "Queue")
		public GetDtNoInfoResponse.Message.Queue queue;

		/**
		 * Gets the value of the workInfo property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a
		 * snapshot. Therefore any modification you make to the returned list
		 * will be present inside the JAXB object. This is why there is not a
		 * <CODE>set</CODE> method for the workInfo property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getWorkInfo().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link GetDtNoInfoResponse.Message.WorkInfo }
		 * 
		 * 
		 */
		public List<GetDtNoInfoResponse.Message.WorkInfo> getWorkInfo() {
			if (workInfo == null) {
				workInfo = new ArrayList<GetDtNoInfoResponse.Message.WorkInfo>();
			}
			return this.workInfo;
		}

		/**
		 * Gets the value of the queue property.
		 * 
		 * @return possible object is {@link GetDtNoInfoResponse.Message.Queue }
		 * 
		 */
		public GetDtNoInfoResponse.Message.Queue getQueue() {
			return queue;
		}

		/**
		 * Sets the value of the queue property.
		 * 
		 * @param value
		 *            allowed object is
		 *            {@link GetDtNoInfoResponse.Message.Queue }
		 * 
		 */
		public void setQueue(GetDtNoInfoResponse.Message.Queue value) {
			this.queue = value;
		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="CurrentNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="QueuingNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "currentNum", "queuingNum" })
		public static class Queue {

			@XmlElement(name = "CurrentNum", required = true)
			protected String currentNum;
			@XmlElement(name = "QueuingNum", required = true)
			protected String queuingNum;

			/**
			 * Gets the value of the currentNum property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getCurrentNum() {
				return currentNum;
			}

			/**
			 * Sets the value of the currentNum property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setCurrentNum(String value) {
				this.currentNum = value;
			}

			/**
			 * Gets the value of the queuingNum property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getQueuingNum() {
				return queuingNum;
			}

			/**
			 * Sets the value of the queuingNum property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setQueuingNum(String value) {
				this.queuingNum = value;
			}

		}

		/**
		 * <p>
		 * Java class for anonymous complex type.
		 * 
		 * <p>
		 * The following schema fragment specifies the expected content
		 * contained within this class.
		 * 
		 * <pre>
		 * &lt;complexType>
		 *   &lt;complexContent>
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
		 *       &lt;sequence>
		 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
		 *         &lt;element name="ResName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
		 *         &lt;element name="TotalNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="LeftNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
		 *         &lt;element name="CheckSum" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
		 *       &lt;/sequence>
		 *     &lt;/restriction>
		 *   &lt;/complexContent>
		 * &lt;/complexType>
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "startTime", "endTime", "resName",
				"totalNum", "leftNum", "checkSum" })
		public static class WorkInfo {

			@XmlElement(name = "StartTime", required = true)
			protected String startTime;
			@XmlElement(name = "EndTime", required = true)
			protected String endTime;
			@XmlElement(name = "ResName")
			protected String resName;
			@XmlElement(name = "TotalNum")
			protected int totalNum;
			@XmlElement(name = "LeftNum")
			protected int leftNum;
			@XmlElement(name = "CheckSum")
			protected Integer checkSum;

			/**
			 * Gets the value of the startTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getStartTime() {
				return startTime;
			}

			/**
			 * Sets the value of the startTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setStartTime(String value) {
				this.startTime = value;
			}

			/**
			 * Gets the value of the endTime property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getEndTime() {
				return endTime;
			}

			/**
			 * Sets the value of the endTime property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setEndTime(String value) {
				this.endTime = value;
			}

			/**
			 * Gets the value of the resName property.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getResName() {
				return resName;
			}

			/**
			 * Sets the value of the resName property.
			 * 
			 * @param value
			 *            allowed object is {@link String }
			 * 
			 */
			public void setResName(String value) {
				this.resName = value;
			}

			/**
			 * Gets the value of the totalNum property.
			 * 
			 */
			public int getTotalNum() {
				return totalNum;
			}

			/**
			 * Sets the value of the totalNum property.
			 * 
			 */
			public void setTotalNum(int value) {
				this.totalNum = value;
			}

			/**
			 * Gets the value of the leftNum property.
			 * 
			 */
			public int getLeftNum() {
				return leftNum;
			}

			/**
			 * Sets the value of the leftNum property.
			 * 
			 */
			public void setLeftNum(int value) {
				this.leftNum = value;
			}

			/**
			 * Gets the value of the checkSum property.
			 * 
			 * @return possible object is {@link Integer }
			 * 
			 */
			public Integer getCheckSum() {
				return checkSum;
			}

			/**
			 * Sets the value of the checkSum property.
			 * 
			 * @param value
			 *            allowed object is {@link Integer }
			 * 
			 */
			public void setCheckSum(Integer value) {
				this.checkSum = value;
			}

		}

	}

}
