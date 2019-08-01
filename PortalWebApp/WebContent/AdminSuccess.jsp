<jsp:include page="Header.jsp"/>
<%@ page import="com.portal.listeners.*"%>

	<h3>Welcome ${sessionScope.user.employeeName}</h3>
	
	<br/>
	
	<table>
		<tr>
			<td><a href="viewall">1. View All Employees</a></td>
		</tr>
		<tr>
			<td><a href="SearchEmployee.jsp">2. Search Employees</a></td>
		</tr>
	
		<tr>
			<td><a href="logout">5. Logout</a></td>
		</tr><br>
			<tr><td>Active users right now- <%=UserCountListener.count %></td>
		</tr>
	</table>
	
</body>
</html>