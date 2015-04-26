<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Give premium FORM</title>
</head>
<body>

<form action="/loginWebApp/PremiumServlet" method="POST">		<!-- nadawanie i usuwanie uprawnien premium	 -->

  Username <input type="text" name="username" /><br />
 <input type="radio" name="premium" value="set" >Set premium<br>
 <input type="radio" name="premium" value="del">Delete premium<br>
 
 
 
 
 <input type="submit" value=" SET ">
  
</form>



</body>
</html>