<jsp:include page="Header.jsp"/>
<%@ page import="com.portal.entities.*" %>


<h3>Welcome ${user.employeeName}</h3>
	
	<br/>
	
	<table>
		<tr>
			<td>Name -  ${user.employeeName} </td>
		</tr>
		<tr>
			<td>Gender - ${user.gender}</td>
		</tr>
		<tr>
			<td>Qualification - ${user.qualification}</td>
		</tr>
		<tr>
			<td>Contact no - ${user.contactNo}</td>
		</tr>
		<tr>
			<td>Email id - ${user.emailAddress}</td>
		</tr>
		<tr>
			<td>Password -${user.password}</td>
		</tr>
		
	</table><br>
	<form action="delete">
	<button type="submit">Delete Profile</button>
	</form>
	
</body>
</html>