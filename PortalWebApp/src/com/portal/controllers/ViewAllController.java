package com.portal.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.portal.daoimpl.DaoImplementation;
import com.portal.daos.EmployeeDao;
import com.portal.entities.Employee;


@WebServlet("/viewall")
public class ViewAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao daoObj=new DaoImplementation();
		List<Employee> r=daoObj.getAllEmployee();
		
		request.setAttribute("eList", r);
		RequestDispatcher rd=request.getRequestDispatcher("ViewEmployees.jsp");
		rd.forward(request, response);
	}

}
