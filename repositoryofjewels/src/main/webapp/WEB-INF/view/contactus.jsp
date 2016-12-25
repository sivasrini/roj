<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width initial-scale=1">
<link rel="stylesheet" 

href="<c:url value="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>">
  <script src="<c:url value="resources/jquery-3.1.1.min.js"/>"></script>
  <script src="<c:url value="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="resources/font-awesome-4.7.0/font-awesome-4.7.0/font-awesome.min.css"/>"></script>
  <script src="<c:url value="resources/fontawesome.js"/>"></script>
  <style>
  a
  {text-decoration:none;}
 a.highlight:hover{color:red;} 
  </style>
</head>
<body>
<%@ include file="header.jsp" %>
<br><br>
<div class="jumbotron text-center" style="font-family:courier new;background-color:black;color:white;">
  <h1>CONTACT US</h1>
</div>
<div class="conatiner" style="text-align:center;">
<h1><a class="highlight" href="#">E-mail</a></h1>
<br><br>
<h1><a class="highlight" href="#">chat</a></h1>
<br><br>
<h1><a class="highlight" href="#">phone</a></h1>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>