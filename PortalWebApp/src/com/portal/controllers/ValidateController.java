package com.portal.controllers;

import java.io.IOException;
import java.io.PrintWriter;

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


@WebServlet("/validate")
public class ValidateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		int empId=Integer.parseInt(request.getParameter("empId"));
		String pass=request.getParameter("empPass");
		
		EmployeeDao daoObj=new DaoImplementation();
		Employee r=daoObj.validate(empId, pass);
		
		if(r!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("userName",r.getEmployeeName());
			session.setAttribute("userGender", r.getGender());
			session.setAttribute("userQual",r.getQualification());
			session.setAttribute("userContact",r.getContactNo());
			session.setAttribute("userMail", r.getEmailAddress());
			session.setAttribute("userPass", pass);
			
			
			
			if(r.getRole().equals("Admin"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("AdminSuccess.jsp");
				rd.forward(request, response);
			
			}
			else
			{
				RequestDispatcher rd=request.getRequestDispatcher("EmployeeSuccess.jsp");
				rd.forward(request, response);
		
			}
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
			
		}
	}

}
