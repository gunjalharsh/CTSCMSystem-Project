
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Customer registration</title>
<style type="text/css">
.myerror
{
color:red;
}

</style>
</head>

<body>
 <img height = 200 width=200 src="<c:url value="/resources/images/download.png"></c:url>"/>	

	<form:form id="form1" name="form1" modelAttribute="customer" method="post" action="register">
	<f:validateBean disabled="true" />
		<table width="200" border="0" align="center">
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td><fieldset>
						<legend>Register</legend>
						<table width="609" border="0" align="center">

							<tr>
								<td width="69">&nbsp;</td>
								<td colspan="2">Username</td>
								<td colspan="3"><label> <form:input type="text"
											name="txt_username" id="txt_username" path="username" />
											<form:errors path="username" cssClass="myerror" />
								</label></td>
								<td width="56">&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Password</td>
								<td colspan="3"><label><form:input type="password"
										name="txt_password" id="txt_password" path="password" />
										<form:errors path="password" cssClass="myerror" />
										</label></td>
								<td width="56">&nbsp;</td>		
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Name</td>
								<td colspan="3"><label><form:input type="text" name="txt_name"
										id="txt_name" path="name" />
										<form:errors path="name" cssClass="myerror" />
										</label></td>
										<td width="56">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Email</td>
								<td colspan="3"><label><form:input type="text" name="txt_email"
										id="txt_email" path="email" />
								<form:errors path="email" cssClass="myerror" /></label></td>
				                <td width="56">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">MobileNo</td>
								<td colspan="3"><label><form:input type="text" name="txt_mobileno"
										id="txt_mobileno" path="mobileno" />
											<form:errors path="mobileno" cssClass="myerror" /></label></td>
									 <td width="56">&nbsp;</td>	
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td colspan="2">Address</td>
								<td colspan="3"><label><form:input type="text" name="txt_address"
										id="txt_address" path="address" />
									<form:errors path="address" cssClass="myerror" /></label></td>
										<td width="56">&nbsp;</td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td width="60">&nbsp;</td>
								<td width="68"><input type="submit" name="btn_submit"
									id="btn_submit" value="Submit" /></td>
								<td>&nbsp;</td>
							</tr>
							<tr>
								<td>&nbsp;</td>
								<td><a href="login">If already a Customer </a></td>
								
								<td>&nbsp;</td>
							</tr>

						</table>

					</fieldset></td>
			</tr>
		</table>

	</form:form>
</body>
</html>
