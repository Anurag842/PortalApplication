<jsp:include page="Header.jsp"/>

	<fieldset>
		<legend>Registration Form</legend>
		<form action="register" method="post">	
			<table>
				<tr>
					<td>Enter Name : </td>
					<td>
						<input type="text" name="empName" placeholder="Enter name" required/>
					</td>
				</tr>
				<tr>
					<td>Choose gender : </td>
					<td>
						<input type="radio" name="gender" value="male" checked> Male
  						<input type="radio" name="gender" value="female"> Female
 						<input type="radio" name="gender" value="other"> Other 
					</td>
				</tr>
				<tr>
					<td>Enter Qualification : </td>
					<td>
						<input type="text" name="qual" placeholder="Enter qualification" required/>
					</td>
				</tr>
				<tr>
				<tr>
					<td>Enter Contact no : </td>
					<td>
						<input type="text" name="contactNo" placeholder="Enter contact" required/>
					</td>
				</tr>
				<tr>
					<td>Enter email : </td>
					<td>
						<input type="text" name="email" placeholder="Enter emailid" required/>
					</td>
				</tr>
				<tr>
					<td>Set Password : </td>
					<td>
						<input type="password" name="psw" placeholder="Enter password" id="ps1" required/>
					</td>
				</tr>
				<tr>
				<tr>
					<td>Confirm Password : </td>
					<td>
						<input type="password" name="psw" placeholder="Enter password" id="ps2" required/>
					</td>
				</tr>
				<tr>
				<td></td>
					<td colspan="2">
						<input type="submit" value="Register" onclick="check()"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>
<script>
	
	function check()
	{
		 var pass1=document.getElementById("ps1").value;
         var pass2=document.getElementById("ps2").value;
         if(pass1!=pass2)
         {
             alert("Enter valid matching passwords");
         }
	}
</script>
</body>
</html>
