<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 
 <font color="red">${deletedUserStatus}</font> 
<h1>User Details List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>UID</th><th>User Name</th><th>Password</th><th>Email</th><th>Delete</th></tr>  
   <c:forEach var="user" items="${usersList}">   
   <tr>  
   <td>${user.uid}</td>  
   <td>${user.username}</td>  
   <td>${user.password}</td>  
   <td>${user.email}</td>  
  <%--  <td><a href="editemp/${emp.id}">Edit</a></td>   --%>
   <td><a href="deleteUserDetailsById/${user.uid}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="./userRegistration">Add User Details</a> 
   <br>
   <a href="./login">Verify User Details</a> 
