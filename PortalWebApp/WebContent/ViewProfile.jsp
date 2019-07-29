<jsp:include page="Header.jsp"/>
<%@ page import="com.portal.entities.*" %>
<%Employee e=(Employee)session.getAttribute("user"); %>

<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	
	<table>
		<tr>
			<td>Name -  <%= e.getEmployeeName() %> </td>
		</tr>
		<tr>
			<td>Gender - <%=e.getGender() %></td>
		</tr>
		<tr>
			<td>Qualification - <%=e.getQualification() %></td>
		</tr>
		<tr>
			<td>Contact no - <%=e.getContactNo() %></td>
		</tr>
		<tr>
			<td>Email id - <%=e.getEmailAddress()%></td>
		</tr>
		<tr>
			<td>Password - <%=session.getAttribute("pass") %></td>
		</tr>
		
	</table><br>
	<form action="delete">
	<button type="submit">Delete Profile</button>
	</form>
	
</body>
</html>