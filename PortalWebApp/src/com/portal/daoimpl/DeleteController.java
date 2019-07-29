package com.portal.daoimpl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.portal.daos.EmployeeDao;
import com.portal.entities.Employee;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		int empId=(int)session.getAttribute("idSession");
		System.out.println(empId);
		EmployeeDao daoObj=new DaoImplementation();
		boolean r=daoObj.deleteEmployee(empId);
		if(r==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("DeleteProfile.jsp");
			rd.forward(request, response);
		}
	}

}
