<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
      <html>
      <head>
      <title>Officials Registration Page</title>
      <link href="css/h1.css" rel="stylesheet">
      </head>
       <body>
        <h1>Add New User Details</h1>  
       <form:form method="post" action="/addUserDetails">    
        <table border="8" width="50%" cellpadding="20" style="margin-left:auto;margin-right:auto;margin-top:0px;margin-bottom:100px;">
         <tr>    
          <td>User Name : </td>   
          <td><form:input path="username"  /></td>  
         </tr>    
         <tr>    
          <td>Password :</td>    
          <td><form:input path="password" /></td>  
         </tr>   
         <tr>    
          <td>Email :</td>    
          <td><form:input path="email" /></td>  
         </tr>  
         <tr>    
          <td>Who are You ..?:</td>    
          <td><form:input path="purpose" /></td>  
         </tr>  
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    
       
       </body>
       </html>