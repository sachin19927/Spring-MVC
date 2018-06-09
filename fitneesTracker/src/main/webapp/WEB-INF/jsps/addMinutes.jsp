<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Minutes</title>
</head>
<body>
<h1>Add minutes Excercied</h1>


Language: <a href="?language=en">English</a> <a href="?language=ka">Kannada</a> | <a href="?language=hi">Hindi</a> | <a href="?language=eu">spanish</a>
<form:form modelAttribute="excercise">

<table>
<tr>
<td> <spring:message code="goal.text"/></td>
<td><form:input path="minutes"/> </td>
</tr>

<tr>
<td colspan="2"><input type="submit" valur="Enter Value"/></td>
</tr>
</table>

</form:form>

</body>
</html>