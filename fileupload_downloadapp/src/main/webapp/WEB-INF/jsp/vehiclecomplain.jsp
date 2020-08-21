<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 
 
<html>
<head>
<title>Complaint Page</title>
<link href="css/h2.css" rel="stylesheet">
</head>
<body>
 <font color="red">${uploadFileSuccess}</font>
 <br><br>
<form method="POST" action="/uploadFile" enctype="multipart/form-data">	
<h2>Complaint Registration page<h2>
	
	<table border="8" width="70%" cellpadding="20" style="margin-left:auto;margin-right:auto;margin-top:0px;margin-bottom:100px;"> 
	<tr>
<th>Vehicle Name:
<input type="text" name="vehicleName"><br>
</th>
</tr>
<br>
<tr>
<th>
VehicleNumber:
<input type="text" name="vehicleNumber"><br>
</th>
</tr>
<br>
<tr>
<th>
ComplaintAddress:
<input type="text" name="complaintAddress"><br>
</th>
</tr>
<br>
<tr>
<th>
ComplaintType:
<input type="text" name="complaintType"><br>
</th>
</tr>
<br>
<tr>
<th>
VehicleImage for Proof:
<input type="file" name="file" accept="image/*"><br>
</th>
<br><br><br>
<tr>
<th>
<input type="submit" value="Upload">
</tr>
</table

</body>
</form>
</html>