<jsp:include page="Header.jsp"/>
<%@ page import="com.portal.entities.*" %>

<%Address a=(Address)session.getAttribute("user"); %>

<fieldset>
		<legend>Update Address</legend>
		<form action="updateaddr" method="post">	
			<table>
				<tr>
					<td>Update House number : </td>
					<td>
						<input type="number" name="hNo" placeholder="Enter house no" />
					</td>
				</tr>
				<tr>
					<td>Update Locality : </td>
					<td>
						<input type="text" name="locality" placeholder="Enter locality"/>
					</td>
				</tr>
				<tr>
				<tr>
					<td>Update City : </td>
					<td>
						<input type="text" name="city" placeholder="Enter city" />
					</td>
				</tr>
				<tr>
					<td>Update State : </td>
					<td>
						<input type="text" name="state" placeholder="Enter state" />
					</td>
				</tr>
				
				<tr>
					<td>Update Pincode : </td>
					<td>
						<input type="number" name="pin" placeholder="pincode" />
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