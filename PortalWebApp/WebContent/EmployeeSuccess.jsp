<jsp:include page="Header.jsp"/>

	<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	
	<table>
		<tr>
			<a href="ViewProfile.jsp">1. View Profile</a>
		</tr><br>
		<tr>
			<a href="UpdateProfile.jsp">2. Update Profile</a>
		</tr><br>
		<tr>
			<a href="DeleteProfile.jsp">3. Delete Profile</a>
		</tr><br>
		
		
	</table>
	
</body>
</html>