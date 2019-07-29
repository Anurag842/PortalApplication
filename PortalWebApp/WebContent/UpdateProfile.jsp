<jsp:include page="Header.jsp"/>

	<fieldset>
		<legend>Update Profile</legend>
		<form action="update" method="post">	
			<table>
				<tr>
					<td>Update Name : </td>
					<td>
						<input type="text" name="upempName" placeholder="Enter name"/>
					</td>
				</tr>
				<tr>
					<td>Update gender : </td>
					<td>
						<input type="radio" name="upgender" value="male"> Male
  						<input type="radio" name="upgender" value="female"> Female
 						<input type="radio" name="upgender" value="other"> Other 
					</td>
				</tr>
				<tr>
					<td>Update Qualification : </td>
					<td>
						<input type="text" name="upqual" placeholder="Enter qualification" />
					</td>
				</tr>
				<tr>
				<tr>
					<td>Update Contact no : </td>
					<td>
						<input type="text" name="upcontactNo" placeholder="Enter contact" />
					</td>
				</tr>
				<tr>
					<td>Update email : </td>
					<td>
						<input type="text" name="upemail" placeholder="Enter emailid" />
					</td>
				</tr>
				<tr>
					<td>Update Password : </td>
					<td>
						<input type="password" name="uppsw" placeholder="Enter password" />
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
