package com.util;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ReadXml {

	private String datapath = "config/";
	/**
	 * 加载datasets中所有的数据集
	 * @param path
	 */
	public String getXml(String id ){
		SAXReader saxReader = new SAXReader();
		String dataxml = ReadXml.class.getResource("/")+datapath;
		String path = dataxml+id+".xml";
		Document document = null;
		try {
			document = saxReader.read(path);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		String dataset = document.asXML();
		return dataset;
	}
	
}
