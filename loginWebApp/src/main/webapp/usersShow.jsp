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
<title>UsersShow</title>
</head>
<body>

<%

PersonDB personList = new PersonDB();
		for (int i=0; i < personList.getPersonList().size() ; i++ ) {
%><br><%= i  %>) <%
			String u = ("  username: "+personList.getPersonList().get(i).getUserName());
%><%= u %> <br><%
			String p =("  privilage: "+personList.getPersonList().get(i).getPrivilage());
%><%= p %>
<br><br>
<%} %>
</body>
</html>