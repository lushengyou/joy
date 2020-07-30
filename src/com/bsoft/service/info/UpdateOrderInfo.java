package com.bsoft.service.info;

import com.dao.InterfaceQueryDao;
import com.ws.yuyue.service.BackNoResponse;
import com.ws.yuyue.service.UpdateOrderInfoResponse;

import java.util.Map;

public class UpdateOrderInfo extends GetInfo
{
  private static UpdateOrderInfo instance = new UpdateOrderInfo();

  public static UpdateOrderInfo getInstance()
  {
    return instance;
  }

  public UpdateOrderInfoResponse execute(com.ws.yuyue.service.UpdateOrderInfo updateOrderInfo)
  {
	
	com.ws.yuyue.service.UpdateOrderInfo.Message ms = updateOrderInfo.getMessage();
    String hospitalID = "";
    
    String id ="";
    String sickName ="";
    String sickSex = "";
    String sickInsureType = "";
    String phone = "";
    String cardNo = "";
    String payType = "";
		try {
			id = ms.getRequestInfo().getRegID().toString();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			sickName = ms.getRequestInfo().getSickName();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			sickSex = ms.getRequestInfo().getSickSex().toString();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			sickInsureType = ms.getRequestInfo().getSickInsureType().toString();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			phone = ms.getRequestInfo().getPhone();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			cardNo = ms.getRequestInfo().getCardNo();
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			payType = ms.getRequestInfo().getPayType().toString();
		} catch (Exception e) {
			// TODO: handle exception
		}
    
    StringBuilder base_sb = new StringBuilder();
    base_sb.append("id = '")
      .append(id)
      .append("' ");

    if (!strIsNull(sickName)) {
      base_sb.append(",sickname = '").append(sickName).append("' ");
    }

    if (!strIsNull(sickSex)) {
      base_sb.append(",sicksex = '").append(sickSex).append("' ");
    }

    if (!strIsNull(sickInsureType)) {
      base_sb.append(",sickinsuretype = '").append(sickInsureType).append("' ");
    }

    if (!strIsNull(phone)) {
      base_sb.append(",phone = '").append(phone).append("' ");
    }

    if (!strIsNull(payType)) {
      base_sb.append(",paytype = '").append(payType).append("' ");
    }

    if (!strIsNull(cardNo)) {
      base_sb.append(",sfzh = '").append(cardNo).append("' ");
    }

    StringBuilder sql_sb = new StringBuilder();

    sql_sb.append("update registered_info set ")
      .append(base_sb)
      .append("where id = '")
      .append(id)
      .append("'");

    String sql = sql_sb.toString();
    InterfaceQueryDao dao = new InterfaceQueryDao();

    if ("0".equals(dao.doUpdate(sql))) {
      return getReturnXML(HospitalCode, "0001", "修改挂号信息失败");
    }

    return getReturnXML(HospitalCode, "0000", "修改挂号信息成功");
  }

  public UpdateOrderInfoResponse getReturnXML(String hospitalID, String code, String errMsg)
  {
		com.ws.yuyue.service.UpdateOrderInfoResponse Res = new UpdateOrderInfoResponse();
		com.ws.yuyue.service.UpdateOrderInfoResponse.Message msgRes = new com.ws.yuyue.service.UpdateOrderInfoResponse.Message();// 
		com.ws.yuyue.service.UpdateOrderInfoResponse.Message.ResponseInfo responseInfoRes = new com.ws.yuyue.service.UpdateOrderInfoResponse.Message.ResponseInfo();//
		responseInfoRes.setCode(code);
		responseInfoRes.setErrMsg(errMsg);
		msgRes.setResponseInfo(responseInfoRes);
		Res.setMessage(msgRes);
    return Res;
  }
}