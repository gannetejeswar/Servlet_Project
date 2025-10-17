<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to my result page</h1>
<%
out.println("Math: "+ request.getParameter("tbMath"));
out.println("<br>");
out.println("Phy: "+ request.getParameter("tbPhy"));
out.println("<br>");
out.println("Chem: "+request.getParameter("tbChem"));
out.println("<br>");
out.println("Percentage result:");
out.println("<br>");
out.println(request.getAttribute("Percentage"));
out.println("<br>");
out.println("Grade result:");
out.println("<br>");
out.println(request.getAttribute("Grade"));
%>
</body>
</html>