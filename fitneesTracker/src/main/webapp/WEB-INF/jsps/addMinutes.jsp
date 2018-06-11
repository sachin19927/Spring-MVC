<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Minutes</title>
<script type="text/javascript" src="resources/jquery-3.3.1.js"></script>
<script type="text/javascript">

	$(document).ready(
			function() {
				$.getJSON('http://localhost:8888/fitneesTracker/activities.json',{
							ajax : 'true'
						}, function(data) {
							var html = '<option value="">Select</option>';
							var len = data.length;

							for (var i = 0; i < len; i++) {
								html += '<option value="'+data[i].desc+'">"'+ data[i].desc + '</option> ';
							}
							html += '</option>';
							$("#activites").html(html)
						})
			});
</script>
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
<td> <spring:message code="goal.text"/></td>
<td><form:select id="activites" path="activity"> </form:select></td>
</tr>

<tr>
<td colspan="2"><input type="submit" valur="Enter Value"/></td>
</tr>
</table>

</form:form>

<h1>Out goal for the day : ${goal.minutes}</h1>
</body>
</html>