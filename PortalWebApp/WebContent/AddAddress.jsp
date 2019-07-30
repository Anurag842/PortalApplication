<jsp:include page="Header.jsp"/>

<fieldset>
		<legend>Add Address</legend>
		<form action="addaddress" method="post">	
			<table>
				<tr>
					<td>Enter House number : </td>
					<td>
						<input type="number" name="hNo" placeholder="Enter house no" required/>
					</td>
				</tr>
				<tr>
					<td>Enter Locality : </td>
					<td>
						<input type="text" name="locality" placeholder="Enter locality" required/>
					</td>
				</tr>
				<tr>
				<tr>
					<td>Enter City : </td>
					<td>
						<input type="text" name="city" placeholder="Enter city" required/>
					</td>
				</tr>
				<tr>
					<td>Enter State : </td>
					<td>
						<input type="text" name="state" placeholder="Enter state" required/>
					</td>
				</tr>
				
				<tr>
					<td>Enter Pincode : </td>
					<td>
						<input type="number" name="pin" placeholder="pincode" required/>
					</td>
				</tr>
				<tr>
				<td></td>
					<td colspan="2">
						<input type="submit" value="Update""/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>
	</body>
	</html>