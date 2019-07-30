package com.portal.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.portal.daos.AddressDao;
import com.portal.daos.EmployeeDao;
import com.portal.entities.Address;
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
			PreparedStatement ps=conn.prepareStatement("select Empid,ename,gender,qualification,contactno,email,role,password from employeetab join logintab using(empid) where empid=? and password=?");
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
				emp.setPassword(rs.getString(8));
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
		try (Connection conn=ConnectionCreator.getDBConnection();)
		{
			PreparedStatement ps=conn.prepareStatement("select Empid,role,ename,gender,qualification,contactno,email,password from employeetab join logintab using(empid) where empid=?");
			ps.setInt(1, empId);
			ResultSet rs=ps.executeQuery();
			System.out.println("input is "+empId);
			
			if(rs.next())
				{
					int empid=rs.getInt(1);
					String role=rs.getString(2);
					String name=rs.getString(3);
					String gender=rs.getString(4);
					String q=rs.getString(5);
					String contactNo=rs.getString(6);
					String email=rs.getString(7);
					String password=rs.getString(8);
					
					System.out.println("inside rs next"+empid);
					Employee emp=new Employee();
					emp.setEmployeeId(empid);
					emp.setRole(role);
					emp.setEmployeeName(name);
					emp.setGender(gender);
					emp.setEmailAddress(email);
					emp.setQualification(q);
					emp.setContactNo(contactNo);
					emp.setPassword(password);
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
	public boolean updateEmployee(Employee emp) {
		System.out.println("Password in DAO : "+emp.getPassword());
		try (Connection conn=ConnectionCreator.getDBConnection();)
		{
			PreparedStatement ps=conn.prepareStatement("update employeetab set ename=?,gender=?,qualification=?,contactno=?,email=? where empid=?");
			ps.setString(1, emp.getEmployeeName());
			ps.setString(2, emp.getGender());
			ps.setString(3, emp.getQualification());
			ps.setString(4, emp.getContactNo());
			ps.setString(5, emp.getEmailAddress());
			ps.setInt(6, emp.getEmployeeId());
			int i=ps.executeUpdate();
			
			
			ps=conn.prepareStatement("update logintab set password=? where empid=?");
			ps.setString(1, emp.getPassword());
			ps.setInt(2, emp.getEmployeeId());
			
			
			int j=ps.executeUpdate();
			if(i!=0 && j!=0)
			{
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
	public boolean deleteEmployee(int empid) {
		try (Connection conn=ConnectionCreator.getDBConnection();)
		{
			PreparedStatement ps=conn.prepareStatement("delete from logintab where empid=?");
			ps.setInt(1, empid);
			int i=ps.executeUpdate();
			
			PreparedStatement ps2=conn.prepareStatement("delete from employeetab where empid=?");
			ps2.setInt(1, empid);
			int j=ps2.executeUpdate();
			
			if(i!=0 && j!=0)
			{
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
	public List<Employee> getAllEmployee() {
		List<Employee> eList=new ArrayList<>();
		try (Connection conn=ConnectionCreator.getDBConnection();)
		{
			PreparedStatement ps=conn.prepareStatement("select empid,EName,Gender,Qualification,ContactNo,Email,Role,password from EmployeeTab join LoginTab using(EmpId)");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				
				System.out.println("I m  in while loop");
				int empId=rs.getInt(1);
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
				emp.setPassword(rs.getString(8));
				
				eList.add(emp);
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return eList;
	}
	

}
