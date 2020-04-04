<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Vendor Login</title>
		<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet"></link>
	</head>
</head>
 <body>
    <div class="login-box">
    <img src="<c:url value="/resources/images/avatar.png"></c:url>" class="avatar">
        <h1>Vendor Login </h1>
            <form action=vendorlogin method="post" modelAttribute="vendor">
            
            <p>Username</p>
            <input type="text" name="username" placeholder="Enter Username">
             <form:errors path="username" cssClass="myerror" />
            
            <p>Password</p>
            <input type="password" name="password" placeholder="Enter Password">
              <form:errors path="password" cssClass="myerror" />
            
            <input type="submit" name="submit" value="Login">
             
            </form>
        
        
        </div>
    
    </body>
</html>