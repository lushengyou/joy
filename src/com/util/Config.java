package com.util;

import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.jaxen.JaxenException;
import org.jaxen.dom.DOMXPath;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class Config {
	private Document document;
	private URL confURL;

	public Config(String filename) {
		if (filename.trim().length() == 0) {
			filename = "config.xml";
		}
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			confURL = Config.class.getClassLoader().getResource(filename);
			if (confURL == null) {
				confURL = ClassLoader.getSystemResource(filename);
			}
			if (confURL != null) {
				System.out.println(confURL.toString());
			} else {
				System.out.println(filename + " not found: ");
			}
			document = db.parse(confURL.openStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String getNodeValue(String xpath) {
		try {
			DOMXPath path = new DOMXPath(xpath);
			Node node = (Node) path.selectSingleNode(document
					.getDocumentElement());
			if (node == null) {
				System.out.println("Xpath " + xpath + " seems void");
				return null;
			}
			if (node.hasChildNodes()) {
				Node child = node.getFirstChild();
				if (child != null)
					return child.getNodeValue();
			} else
				return "";

		} catch (JaxenException e) {
			e.printStackTrace();
		}
		return null;
	}

	public long getLongValue(String xpath, long fallback) {
		try {
			String value = getNodeValue(xpath);
			if (value != null)
				return Long.parseLong(value);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("Using fallback value ( " + fallback + " ) for "
				+ xpath);
		return fallback;
	}

	public String getStringValue(String xpath, String fallback) {
		String value = getNodeValue(xpath);
		if (value != null)
			return value;
		System.out.println("Using fallback value ( " + fallback + " ) for "
				+ xpath);
		return fallback;
	}

}
