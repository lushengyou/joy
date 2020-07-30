package com.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author zhaofeng
 *
 */
public class EncodingFilter implements Filter{

	private String encoding;
	public void destroy() {
		
	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		if(this.encoding == null || this.encoding.equals("")){
			this.encoding = "UTF-8";
		}
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse  response=(HttpServletResponse)  res;
		request.setCharacterEncoding(encoding);
	    chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		encoding = config.getServletContext().getInitParameter("encoding");
	}

}
