<jsp:include page="Header.jsp"/>

	<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	
	<table>
		<tr>
			<a href="ViewProfile.jsp">1. View Profile</a>
		</tr>
		<tr>
			<a href="UpdateProfile.jsp">2. Update Profile</a>
		</tr>
		<tr>
			<td>3. Add your Address</td>
		</tr>
		<tr>
			<td>3. Change Password</td>
		</tr>
		
	</table>
	
</body>
</html>