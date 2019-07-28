package com.portal.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daoimpl.DaoImplementation;
import com.portal.daos.EmployeeDao;
import com.portal.entities.Employee;


@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String name=request.getParameter("empName");
    	String gender=request.getParameter("gender");
    	String qual=request.getParameter("qual");
    	String contact=request.getParameter("contactNo");
    	String email=request.getParameter("email");
    	String password=request.getParameter("psw");
    	
    	System.out.println(contact);
    	
    	Employee emp=new Employee();
    
		emp.setEmployeeName(name);
		emp.setGender(gender);
		emp.setQualification(qual);
		emp.setContactNo(contact);
		emp.setEmailAddress(email);
		emp.setPassword(password);
		
		
    	EmployeeDao daoObj=new DaoImplementation();
		boolean r= daoObj.register(emp);
		
		if(r==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("RegistrationSuccess.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			RequestDispatcher rd= request.getRequestDispatcher("Registrationfailure.jsp");
			rd.forward(request, response);
		}
		
	}

}
