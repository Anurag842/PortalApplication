package com.portal.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.daoimpl.AddressDaoImplementation;
import com.portal.daoimpl.DaoImplementation;
import com.portal.daos.AddressDao;
import com.portal.entities.Address;


@WebServlet("/addaddress")
public class AddressAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int empId=(int) session.getAttribute("idSession");
		int hNo= Integer.parseInt(request.getParameter("hNo"));
		String locality=request.getParameter("locality");
		String city=request.getParameter("city");
		String state = request.getParameter("state");
		int pin = Integer.parseInt(request.getParameter("pin"));
		
		Address addr = new Address();
		addr.setHouseNo(hNo);
		addr.setEmployeeId(empId);
		addr.setLocality(locality);
		addr.setCity(city);
		addr.setState(state);
		addr.setPinCode(pin);
		
		AddressDao aDaoObj=new AddressDaoImplementation();
		boolean r= aDaoObj.addAddress(addr);
		
		if(r==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("AddressSuccess.jsp");
			rd.forward(request, response);
			
		}
		
		
	}

}
