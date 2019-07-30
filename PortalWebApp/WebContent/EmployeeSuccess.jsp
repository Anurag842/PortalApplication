<jsp:include page="Header.jsp"/>

	<h3>Welcome ${sessionScope.user.employeeName}</h3>
	
	<br/>
	
	<table>
		<tr>
			<a href="ViewProfile.jsp">1. View Profile</a>
		</tr><br>
		<tr>
			<a href="UpdateProfile.jsp">2. Update Profile</a>
		</tr><br>
		<tr>
			<a href="AddAddress.jsp">3. Add Address</a>
		</tr><br>
		<tr>
			<a href="UpdateAddress.jsp">4. Update Address</a>
		</tr><br>
		
	</table>
	
</body>
</html>