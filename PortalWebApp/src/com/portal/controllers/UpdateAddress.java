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
import com.portal.daos.AddressDao;
import com.portal.entities.Address;

@WebServlet("/updateaddr")
public class UpdateAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int houseNo=Integer.parseInt(request.getParameter("hNo"));
		String locality=request.getParameter("locality");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		int pinCode=Integer.parseInt(request.getParameter("pin"));
    	int employeeId=(int) session.getAttribute("idSession");
    	
		Address add= new Address();
		add.setHouseNo(houseNo);
		add.setLocality(locality);
		add.setCity(city);
		add.setState(state);
		add.setPinCode(pinCode);
		add.setEmployeeId(employeeId);
		
		AddressDao daoObj= new AddressDaoImplementation();
		boolean r = daoObj.updateAddress(add);
		
		System.out.println("inside update controller"+r);
		if(r==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("UpdateSuccess.jsp");
			rd.forward(request, response);
			
		}
	}

}
