

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<style>
body {
  background-image: url('/resources/images/crm.jpeg');
    background-color: linear-gradient(red, yellow);
  
  background-repeat: no-repeat;
  background-attachment: fixed;  
  background-size: cover;
}
</style>

<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link href="<c:url value='/resources/css/style.css' />" rel="stylesheet"></link>
					<link href="<c:url value='/resources/css/bootstrap.css' />"  rel="stylesheet"></link>
	
	</head>

 <body>
 
    <div class="login-box">
 <!--    <img src="<c:url value="/resources/images/avatar.png"></c:url>" class="avatar">    --> 
           <form action=vendorlogin method="post" modelAttribute="vendor">
            <br>

           <table align="center">
           
           
           <tr>
              <td><a href="callproj">Customer Registration</a></td>  
             </tr> 
               <tr>
              <br>
              <tr>
           <td>&nbsp</td>
           </tr>
            <tr>
           <td>&nbsp</td>
           </tr>
              <td><a href="details">Customer Details</a></td>  
             </tr> 
             </table>
              
            </form>
        
        
        </div>
    
    </body>
</html>


</body>
</html>
