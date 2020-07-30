package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
import java.util.Map;

public class UpdatePayType extends GetInfo
{
  private static UpdatePayType instance = new UpdatePayType();

  public static UpdatePayType getInstance()
  {
    return instance;
  }

  public String execute(String strXml)
  {
    Map parserXmlMap = parserXml(strXml);
    String hospitalID = (String)parserXmlMap.get("HospitalID");
    String id = (String)parserXmlMap.get("Id");
    String payType = (String)parserXmlMap.get("PayType");

    String sql = "update registered_info set payType = '" + payType + "' where id = '" + id + "'";
    InterfaceQueryDao dao = new InterfaceQueryDao();

    if ("0".equals(dao.doUpdate(sql))) {
      return getReturnXML(hospitalID, "0001", "修改挂号支付状态失败");
    }

    return getReturnXML(hospitalID, "0000", "修改挂号支付状态成功");
  }

  public String getReturnXML(String hospitalID, String code, String errMsg)
  {
    StringBuffer strXml = new StringBuffer();
    strXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?> ");
    strXml.append("<Message>");
    strXml.append("<ResponseInfo> ");
    strXml.append("<Hospitalcode>" + hospitalID + "</Hospitalcode>");
    strXml.append("<Code>" + code + "</Code>");
    strXml.append("<ErrMsg>" + errMsg + "</ErrMsg>");
    strXml.append("</ResponseInfo> ");
    strXml.append("</Message>");
    return strXml.toString();
  }
}