package com.portal.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebFilter("/Homepage.jsp")
public class TimeFilter implements Filter {

 

	
	public void destroy() {
		System.out.println("destroyr");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		PrintWriter out=res.getWriter();
		
		LocalDateTime ldt=LocalDateTime.now();
		int hr=ldt.getHour();
		System.out.println("dofilter");
		
		if(hr>=0 && hr<=17)
		{
			chain.doFilter(request, response);
		}
		else
		{
			res.sendRedirect("failure.jsp");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init");
	}

}
