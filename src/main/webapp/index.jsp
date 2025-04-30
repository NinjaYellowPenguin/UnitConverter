<%@page import="unitconverter.models.Lenght"%>
<%@page import="unitconverter.services.LenghtService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello world</title>
</head>
<body>
	<h1>Hello world!</h1>

<p>
<%
    LenghtService service = new LenghtService();
	Lenght lenght = service.convert(100000, "Millimiter","Mile");
    
%>
</p>

<h> <%= lenght.getValue()  %></h>


</body>
</html>