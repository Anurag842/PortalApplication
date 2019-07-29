<jsp:include page="Header.jsp"/>
<%@ page import="com.portal.entities.*" %>
<%Employee e=(Employee)session.getAttribute("user"); %>
	<fieldset>
		<legend>Update Profile</legend>
		<form action="update" method="post">	
			<table>
				<tr>
					<td>Update Name : </td>
					<td>
						<input type="text" name="upempName" placeholder="Enter name" value=<%= e.getEmployeeName() %>>
					</td>
				</tr>
				<tr>
					<td>Update gender : </td>
					<td>
						<input type="radio" name="upgender" value="male" checked> Male
  						<input type="radio" name="upgender" value="female"> Female
 						<input type="radio" name="upgender" value="other"> Other 
					</td>
				</tr>
				<tr>
					<td>Update Qualification : </td>
					<td>
						<input type="text" name="upqual" placeholder="Enter qualification" value=<%= e.getQualification() %> >
					</td>
				</tr>
				<tr>
				<tr>
					<td>Update Contact no : </td>
					<td>
						<input type="text" name="upcontactNo" placeholder="Enter contact" value=<%= e.getContactNo() %> >
					</td>
				</tr>
				<tr>
					<td>Update email : </td>
					<td>
						<input type="text" name="upemail" placeholder="Enter emailid" value=<%= e.getEmailAddress() %>>
					</td>
				</tr>
				<tr>
					<td>Update Password : </td>
					<td>
						<input type="password" name="uppsw" placeholder="Enter password" value=<%= e.getPassword() %>>
					</td>
				</tr>
				<tr>
				<td></td>
					<td colspan="2">
						<input type="submit" value="Update values"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	</div>

</body>
</html>
