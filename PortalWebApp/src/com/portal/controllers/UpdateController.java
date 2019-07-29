package com.portal.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.daoimpl.DaoImplementation;
import com.portal.daos.EmployeeDao;
import com.portal.entities.Employee;


@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		String name=request.getParameter("upempName");
    	String gender=request.getParameter("upgender");
    	String qual=request.getParameter("upqual");
    	String contact=request.getParameter("upcontactNo");
    	String email=request.getParameter("upemail");
    	String password=request.getParameter("uppsw");
    	int employeeId=(int) session.getAttribute("idSession");
    	Employee emp=new Employee();
        
    	emp.setEmployeeName(name);
		emp.setGender(gender);
		emp.setQualification(qual);
		emp.setContactNo(contact);
		emp.setEmailAddress(email);
		emp.setPassword(password);
		emp.setEmployeeId(employeeId);
		
		EmployeeDao daoObj=new DaoImplementation();
		boolean r=daoObj.updateEmployee(emp);
		
		if(r==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("UpdateSuccess.jsp");
			rd.forward(request, response);
			
		}
		
		
	}

}
