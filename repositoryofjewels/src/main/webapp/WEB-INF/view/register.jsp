<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width initial-scale=1">
<link rel="stylesheet" 

href="<c:url value="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>">
  <script src="<c:url value="resources/jquery-3.1.1.min.js"/>"></script>
  <script src="<c:url value="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="resources/font-awesome-4.7.0/font-awesome-4.7.0/font-awesome.min.css"/>"></script>
  <script src="<c:url value="resources/fontawesome.js"/>"></script>
</head>
<body>
<div align="center">
<form:form action="index" method="post" commandName="reg">
<table border=0>
<tr>
<td colspan="2" align="center"><h2>Registration</h2></td>
 </tr>
<tr>
<td>Name:</td>
<td><form:input path="uname"></form:input></td><br><br>
</tr>
<tr>
<td>Username:</td>
<td><form:input path="username"></form:input></td>
</tr>
<tr>
<td>Password:</td>
<td><form:input path="password"></form:input></td>
</tr>
<tr>
<td>Address:</td>
<td><form:input path="address"></form:input></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="Register" /></td>
</tr>

</table>

</form:form>


</div>


</body>
</html>