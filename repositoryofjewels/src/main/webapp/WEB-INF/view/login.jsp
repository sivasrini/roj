<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta name="viewport" content="width=device-width initial-scale=1">
<link rel="stylesheet" href="<c:url value="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>">
  <script src="<c:url value="resources/jquery-3.1.1.min.js"/>"></script>
  <script src="<c:url value="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="resources/font-awesome-4.7.0/font-awesome-4.7.0/font-awesome.min.css"/>"></script>
  <script src="<c:url value="resources/fontawesome.js"/>"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%@ include file="header.jsp" %>
<br><br>
<div align="center" class="container" class="form-group">
<form  role="form"  action="loginsuccess">
<table class="table table-bordered table-hover table-responsive">
<tr>
<td colspan="2" align="center" ><h2 style="color:green">LOGIN</h2></td>
 </tr>
<tr>
<td><span class="glyphicon glyphicon-user">Username:</span></td>
<td ><input type="text" class="form-contol" placeholder="enter your username" required="true" /></td><br><br><br>
</tr>
<tr>
<td><span class="glyphicon glyphicon-lock">Username:</span></td>
<td ><input type="password" class="form-contol" placeholder="enter your password" required="true" /></td><br><br><br>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" class="btn btn-success" value="submit" />
<input type="reset" class="btn btn-danger" value="reset"/></td>
</tr>
</table>
</form>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>