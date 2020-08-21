<html>
<head>
<title>Vehicle search Page</title>
</head>
<body>
   please enter VehicleNumber:
   <form method="get" action="/">
<input type="text" name="vehicleNumber"><br>
 <input type="submit"  name="VERIFY"/>
   </form>
</body>
</html>



<html>
<head>
<title>Vehicle search Page</title>
</head>
<body>
<form method="Get" action="/downloadFile/">
<c:forEach var="vehicle" items="${databaseFile}">  
   please enter VehicleNumber:
<input type="${vehicleNumber}" name="vehicleNumber"><br>
 <input type="submit"  name="VERIFY"/>
 </c:forEach>
   </form>
</body>
</html>



<td><img src="data:image/jpg;base64,"+encodedImage;${vehicle.vehiclePhoto}" width="240" height="300"/></td>