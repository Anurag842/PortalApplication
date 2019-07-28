package com.portal.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.portal.daos.EmployeeDao;
import com.portal.entities.Employee;
import com.portal.utilities.ConnectionCreator;

public class DaoImplementation implements EmployeeDao {

	@Override
	public boolean register(Employee emp) {
		try
		(Connection conn = ConnectionCreator.getDBConnection();)
		{	
			
			PreparedStatement ps=conn.prepareStatement("insert into employeetab values(empseq.nextval,?,?,?,?,?)");
			ps.setString(1,emp.getEmployeeName());
			ps.setString(2, emp.getGender());
			ps.setString(3, emp.getQualification());
			ps.setString(4, emp.getContactNo());
			ps.setString(5, emp.getEmailAddress());
			
			int i=ps.executeUpdate();
			if(i!=0)
			{
				ps=conn.prepareStatement("insert into logintab values(empseq.currval,?,'Employee')");
				ps.setString(1, emp.getPassword());
				ps.executeUpdate();
				return true;
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Employee validate(int empId, String password) {
		System.out.println("Enters valiate");
		try (Connection conn=ConnectionCreator.getDBConnection();)
		{
			System.out.println("Enters connection");
			PreparedStatement ps=conn.prepareStatement("select Empid,ename,gender,qualification,contactno,email,role from employeetab join logintab using(empid) where empid=? and password=?");
			ps.setInt(1, empId);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			System.out.println("Enters query");
			if(rs.next())
			{
				String name=rs.getString(2);
				String gender=rs.getString(3);
				String q=rs.getString(4);
				String contactNo=rs.getString(5);
				String email=rs.getString(6);
				String role=rs.getString(7);
				
				Employee emp=new Employee();
				emp.setEmployeeId(empId);
				emp.setEmployeeName(name);
				emp.setGender(gender);
				emp.setEmailAddress(email);
				emp.setQualification(q);
				emp.setContactNo(contactNo);
				emp.setRole(role);
				System.out.println(name+gender);
				return emp;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(int empId) {
		
		return null;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
