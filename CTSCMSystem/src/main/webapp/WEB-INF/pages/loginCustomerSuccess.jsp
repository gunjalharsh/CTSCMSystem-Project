<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false" %>
<h1>
	You are sucessfully login!....
	<br> Welcome <span style="color: red"><b>${cust}</b></span> 
	<br>
	<!-- request mapping pattern login/get type -->
	<a href="login">Logout</a>
	
	
	
	<html>
	
	<body>
	<form:form id="form1" name="form1" modelAttribute="customer" method="post" action="details">
		<table width="526" border="0" align="center">
			<tr>
				<td width="520">&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><fieldset>
						<legend>Details</legend>
						<table width="499" border="0" align="center">
							<tr>
								<td colspan="5">&nbsp;</td>
							</tr>
						
							<tr>
								<td width="50">&nbsp;</td>
								<td width="114">Username</td>
								<td colspan="2"><label> 
<form:input type="text"	name="txt_username" id="txt_username" style=" width : 159px;" path="username" />
								</label></td>
								<td width="131">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td width="109"><label></label></td>
								<td width="73"><label> 
<input type="submit" name="btn_submit" id="btn_submit" value="Submit" />
								</label></td>
						
						</table>
					</fieldset></td>
			</tr>
		</table>
	</form:form>
</body>
	
	
	</html>