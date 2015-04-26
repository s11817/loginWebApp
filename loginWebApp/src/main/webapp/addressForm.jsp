<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address FORM</title>
</head>
<body>

<form action="/loginWebApp/AddressServlet" method="POST">		<!-- nadawanie i usuwanie uprawnien premium	 -->


  Type of Address <select name="type">
<option value="zameldowania">Living Address</option>
<option value="korespondencyjny">Mail Address</option>
<option value="pracy">Job Address</option>
</select></br>
 Wojewodztwo  <select name="country">
<option value="pomorskie">Pomorskie</option>
<option value="mazowieckie">Mazowieckie</option>
<option value="dolnoslaskie">Dolnoslaskie</option>
</select></br>

  City:<input type="text" name="city"><br>
  postcode:<input type="text" name="postcode"><br>
  street:<input type="text" name="street"><br>
  house nr:<input type="text" name="nr"><br> 
 
 
 <input type="submit" value=" Set Address ">


</form>


</body>
</html>