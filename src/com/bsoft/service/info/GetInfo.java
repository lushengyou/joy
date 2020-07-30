package com.bsoft.service.info;

import com.util.Config;
import com.util.ReadXml;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class GetInfo
{
  public static String DepartIntro = "";

  public static String DoctorIntor = "";

  public static String BabyAge = "";

  public static String AVeworktime = "0";

  public static String BeginNo = "";

  public static String SpaceNo = "";

  public static String Limited = "";

  public static String StartTime1 = "8:00";

  public static String EndTime1 = "11:00";

  public static String StartTime2 = "12:00";

  public static String EndTime2 = "16:30";

  public static String HospitalCode = "";
  
  public static String version = "";
  
  public static String WX_wsdl = "";

  public static String WX_ns = "";

  public static boolean initFlag = false;

  public GetInfo()
  {
    if (!initFlag)
      init();
  }

  public void init()
  {
    Config staticInfo = new Config("staticInfo.xml");
    DepartIntro = staticInfo.getStringValue("DepartIntro", "");
    DoctorIntor = staticInfo.getStringValue("DoctorIntor", "");
    BabyAge = staticInfo.getStringValue("BabyAge", "14");
    AVeworktime = staticInfo.getStringValue("AVeworktime", "");
    BeginNo = staticInfo.getStringValue("BeginNo", "1");
    SpaceNo = staticInfo.getStringValue("SpaceNo", "1");
    Limited = staticInfo.getStringValue("Limited", "999");
    StartTime1 = staticInfo.getStringValue("StartTime1", "");
    EndTime1 = staticInfo.getStringValue("EndTime1", "");
    StartTime2 = staticInfo.getStringValue("StartTime2", "");
    EndTime2 = staticInfo.getStringValue("EndTime2", "");
    version = staticInfo.getStringValue("version", "");
    HospitalCode = staticInfo.getStringValue("HospitalCode", "");
    
    WX_wsdl = staticInfo.getStringValue("WX_wsdl", "");
    WX_ns = staticInfo.getStringValue("WX_ns", "");
    initFlag = true;
  }
/**
 * 未完善   --待编写
 * @param mode
 * @return
 */
  
  public String getSql(String mode){
	  String sql = "";
	  
	  
	  
      String xmlstr = new ReadXml().getXml("manageUnit");
		org.dom4j.Document doc_unit;
		try {
			doc_unit = DocumentHelper.parseText(xmlstr);
			Element rootElt = doc_unit.getRootElement(); // 获取根节点  
			Iterator iterItem = rootElt.elementIterator("item"); ///获取根节点下的子节点body
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Map<String,String> unitMap = new HashMap<String,String>();//存储字典
//	  sqlEdit
	  
	  return sql;
  }
  
  public Map<String, String> parserXml(String strXml)
  {
    Map returnMap = new HashMap();
    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document dc = db.parse(new InputSource(new StringReader(strXml)));
      NodeList message = dc.getElementsByTagName("Message");
      for (int i = 0; i < message.getLength(); i++) {
        Node request = message.item(i);
        NodeList requestInfo = request.getChildNodes();
        for (int j = 0; j < requestInfo.getLength(); j++) {
          Node node = requestInfo.item(j);
          NodeList hospitalMeta = node.getChildNodes();
          for (int k = 0; k < hospitalMeta.getLength(); k++)
            returnMap.put(hospitalMeta.item(k).getNodeName(), hospitalMeta.item(k).getTextContent());
        }
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (ParserConfigurationException e) {
      e.printStackTrace();
    } catch (SAXException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return returnMap;
  }

  public String getDayOfWeek(String strDate)
  {
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calendar = Calendar.getInstance();
    try
    {
      Date date = format.parse(strDate);
      calendar.setTime(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return calendar.get(Calendar.DAY_OF_WEEK)+"";
  }

  public boolean strIsNull(String str)
  {
    if (str == null) {
      return true;
    }

    str = str.trim();

    return "".equals(str);
  }
}