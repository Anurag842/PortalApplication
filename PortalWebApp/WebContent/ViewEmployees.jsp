<%@page import="java.util.List,com.portal.entities.Employee" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="Header.jsp"/>

<table border="1">
	<tr>
			<th>Emp Id</th>
			<th>Role</th>
			<th>Emp Name</th>
			<th>Gender</th>
			<th>Contact No</th>
			<th>Qualification</th>
			<th>Email</th>
			<th>Password</th>
		</tr>
		
	<c:forEach items="${eList}" var="e">
			<tr>
				<td>${e.employeeId}</td>
				<td>${e.role}</td>
				<td>${e.employeeName}</td>
				<td>${e.gender}</td>
				<td>${e.contactNo}</td>
				<td>${e.qualification}</td>
				<td>${e.emailAddress}</td>
				<td>${e.password}</td>
				
			</tr>
		</c:forEach>
</table>
