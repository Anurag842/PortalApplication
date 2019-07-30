<jsp:include page="Header.jsp"/>

	<h3>Welcome ${sessionScope.user.employeeName}</h3>
	
	<br/>
	
	<table>
		<tr>
			<td><a href="viewall">1. View All Employees</a></td>
		</tr>
		<tr>
			<td>3. Search Employee By Id</td>
		</tr>
		<tr>
			<td>4. Change your Password</td>
		</tr>
	</table>
	
</body>
</html>