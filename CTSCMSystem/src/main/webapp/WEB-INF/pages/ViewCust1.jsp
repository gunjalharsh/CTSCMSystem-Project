
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <%@ page isELIgnored="false"%>
  
  <h1>Customer Details</h1>  
<table border="3" width="20%">  
<tr><th>Id</th><th>Name</th><th>Email</th><th>MobileNo</th><th>Address</th><th>Delete::</th></tr>  
  <!-- emps === model attribute in controller -->
   <c:forEach var="cust1" items="${result}">   
   <tr>  
    
   <td>${cust1.name}</td>  
   <td>${cust1.email}</td>      
   <td>${cust1.mobileno}</td>    
    <td>${cust1.address}</td>    
        <td>
        <!-- 1.onclick javascript event 2.confirm similar to alert but takes OK CANCEL BUTTONS -->
       <a href="deletecust/${cust1.id}" onclick="if(!(confirm('Are you sure you want to delete this customer?'))) return false">DeleteRecord</a></td>      
   
   </tr>  
   </c:forEach>  
   </table>