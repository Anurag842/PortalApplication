<jsp:include page="Header.jsp"/>

	<h3>Welcome ${sessionScope.user.employeeName}</h3>
	
	<br/>
	
	<table>
		<tr>
			<td><a href="viewall">1. View All Employees</a></td>
		</tr>
		<tr>
			<td><a href="SearchEmployee.jsp">2. Search Employees</a></td>
		</tr>
	
	</table>
	
</body>
</html>