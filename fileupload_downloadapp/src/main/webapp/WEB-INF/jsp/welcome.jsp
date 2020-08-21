<html>

<head>
<title>COMPLAINT REGISTERED</title>
</head>

<body style="background-color: lightblue;">
<c:forEach var="vehicle" items="${databaseFile}">
   <h2> Hello Mr/Ms/Miss: ${vehicle.vehicleNumber} your ticket has been raised successfully and will be shared to higher authority to take further action  . </h2>
</c:forEach> 
</body>
 
</html>