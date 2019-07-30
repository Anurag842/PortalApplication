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


@WebServlet("/search")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int empId=Integer.parseInt(request.getParameter("empId"));
		EmployeeDao daoObj=new DaoImplementation();
		Employee r=daoObj.getEmployeeById(empId);
		if(r!=null)
		{
			request.setAttribute("searchResult", r);
			RequestDispatcher rd=request.getRequestDispatcher("GetSearchResult.jsp");
			rd.forward(request, response);
		}
		
	}

}
