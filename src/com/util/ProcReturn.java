package com.util;

public class ProcReturn {
	//返回结果代码  0成功  其他失败
	private String resultcode="";
	//返回失败结果消息
	private String resultmsg="";
	public String getResultcode() {
		return resultcode;
	}
	public void setResultcode(String resultcode) {
		this.resultcode = resultcode;
	}
	public String getResultmsg() {
		return resultmsg;
	}
	public void setResultmsg(String resultmsg) {
		this.resultmsg = resultmsg;
	}
}
