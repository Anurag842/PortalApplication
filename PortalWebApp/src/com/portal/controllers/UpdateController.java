package com.portal.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daoimpl.DaoImplementation;
import com.portal.daos.EmployeeDao;
import com.portal.entities.Employee;


@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("upempName");
    	String gender=request.getParameter("upgender");
    	String qual=request.getParameter("upqual");
    	String contact=request.getParameter("upcontactNo");
    	String email=request.getParameter("upemail");
    	String password=request.getParameter("uppsw");
    	
    	Employee emp=new Employee();
        
		if(name != null)
		{
			emp.setEmployeeName(name);
		}
		if(gender != null)
		{
			emp.setGender(gender);
		}
		if(qual != null)
		{
			emp.setQualification(qual);
		}
		if(contact != null)
		{
			emp.setContactNo(contact);
		}
		if(email != null)
		{
			emp.setEmailAddress(email);
		}
		if(password != null)
		{
		emp.setPassword(password);
		}
		
		EmployeeDao daoObj=new DaoImplementation();
		boolean r=daoObj.updateEmployee(emp);
		
		
	}

}
