<html>
<head>
<title>Login Page</title>
<link href="css/h1.css" rel="stylesheet">
</head>

<body>
 <h1  style="margin-left:300px;">Welcome to Insurance agent login page please use your credentials to Redirect</h1>
    <font color="red">${errorMessage}</font>
    <form method="get" action="/verifyLoginDetails">
    <table border="8" width="50%" cellpadding="20" style="margin-left:auto;margin-right:auto;margin-top:0px;margin-bottom:100px;">   
        <tr>    
        <td>Name : </td>
        <td><input type="text" name="username" /></td>
        </tr>
        <tr>
        <td>Password : </td>
        <td><input type="password" name="password" /></td>
        </tr>
        <tr>
        <td>Who are you : </td>
        <td><input type="text" name="purpose" /></td>
        </tr>
        <tr>
        <td>  </td>
        <td><input type="submit"  name="VERIFY"/></td>
        </tr>
    </form>
    <br><br>
    <table border="8" width="50%" cellpadding="15" style="margin-left:auto;margin-right:auto;margin-bottom:0px;margin-top:-100px;">
    <tr>
    <td><a href="./userRegistration">If you are new officers please create yourself</a> </td>
    </tr>
    </table>
</body>
</html>