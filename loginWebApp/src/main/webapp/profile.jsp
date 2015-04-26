<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ 
    page import = "javax.servlet.http.HttpSession"   %>
      <%@
    page import =  "classes.PersonDB"   %>
   
     <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MyProfile</title>
</head>
<body>
<%  PersonDB personList = new PersonDB();
HttpSession ses = request.getSession();
int i = (Integer) ses.getAttribute("user"); 
String UN = personList.getPersonList().get(i).getUserName();
String EM = personList.getPersonList().get(i).getEmail();

String z =			(personList.getPersonList().get(i).getLivingAddress().get(0)
					+";   miasto: "+personList.getPersonList().get(i).getLivingAddress().get(1)
					+";   postcode: "+personList.getPersonList().get(i).getLivingAddress().get(2)
					+";   street: "+personList.getPersonList().get(i).getLivingAddress().get(3)
					+";   nr: "+personList.getPersonList().get(i).getLivingAddress().get(4));

String k =			(personList.getPersonList().get(i).getMailAddress().get(0)
					+";   miasto: "+personList.getPersonList().get(i).getMailAddress().get(1)
					+";   postcode: "+personList.getPersonList().get(i).getMailAddress().get(2)
					+";   street: "+personList.getPersonList().get(i).getMailAddress().get(3)
					+";   nr: "+personList.getPersonList().get(i).getMailAddress().get(4));

String p =			(personList.getPersonList().get(i).getJobAddress().get(0)
					+";   miasto: "+personList.getPersonList().get(i).getJobAddress().get(1)
					+";   postcode: "+personList.getPersonList().get(i).getJobAddress().get(2)
					+";   street: "+personList.getPersonList().get(i).getJobAddress().get(3)
					+";   nr: "+personList.getPersonList().get(i).getJobAddress().get(4));
%><br> <br>		
		
<br>
<br>	
Name <%= UN  %> 
<br>	
email  <%= EM  %> 

<br> 
adres zamieszkania:  wojewodztwo <%= z  %> 
<br>	
adres korespondencyjny:  wojewodztwo  <%= k  %> 
<br>	
adres pracy:   wojewodztwo  <%= p  %> 
<br><br>
Change my address: <p><a href="addressForm.jsp">change</a></p>

</body>
</html>