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
<div style="background-color:orange">
<h1>PLEASE LOGIN HERE</h1>
<form class="navbar-form navbar-left" role="form">
<div class="input-group">
<span class="input-group-addon">
<span class="glyphicon glyphicon-user">
</span>
</span>
<input type="text" class="form-control" placeholder="username"/>
</div>
<br>
<br>
<br>
<div class="input-group">
<span class="input-group-addon">
<span class="glyphicon glyphicon-lock">
</span>
</span>
<input type="password" class="form-control" placeholder="password"/>
</div>
<br>
<br>
<br>
<button type="submit" value="SUBMIT" class="btn btn-success">SUBMIT
</button> 
</form>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>