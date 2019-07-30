<%@page import="java.util.List,com.portal.entities.Employee" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>


<table border="1">
	<tr>
			<th>Emp Id</th>
			<th>Role</th>
			<th>Emp Name</th>
			<th>Gender</th>
			<th>Qualification</th>
			<th>Contact No</th>
			<th>Email</th>
			<th>Password</th>
	</tr>
	<tr>
				<td>${searchResult.employeeId}</td>
				<td>${searchResult.role}</td>
				<td>${searchResult.employeeName}</td>
				<td>${searchResult.gender}</td>
				<td>${searchResult.contactNo}</td>
				<td>${searchResult.qualification}</td>
				<td>${searchResult.emailAddress}</td>
				<td>${searchResult.password}</td>
				
			</tr>
</table>