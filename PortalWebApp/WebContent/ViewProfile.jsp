<jsp:include page="Header.jsp"/>

<h3>Welcome <%=session.getAttribute("userName") %></h3>
	
	<br/>
	
	<table>
		<tr>
			<td>Name -  <%=session.getAttribute("userName") %> </td>
		</tr>
		<tr>
			<td>Gender - <%=session.getAttribute("userGender") %></td>
		</tr>
		<tr>
			<td>Qualification - <%=session.getAttribute("userQual") %></td>
		</tr>
		<tr>
			<td>Contact no - <%=session.getAttribute("userContact") %></td>
		</tr>
		<tr>
			<td>Email id - <%=session.getAttribute("userMail") %></td>
		</tr>
		<tr>
			<td>Password - <%=session.getAttribute("userPass") %></td>
		</tr>
		
	</table>
	
</body>
</html>