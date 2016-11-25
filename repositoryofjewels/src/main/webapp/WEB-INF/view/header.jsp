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
  #s
  {
  color:red;
  font-family:courier;
  font-style:italic;
  }

  </style>
</head>
<body>
<div class="container">
<header>
<nav class="navbar navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#mynavbar">
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
    <span class="icon-bar"></span>
</button>
      <a class="navbar-brand mystyle" id="s">Repository of Jewels</a>
    </div>
<div class="collapse navbar-collapse" id="mynavbar">
    <ul class="nav navbar-nav">
      <li class="active"><a href="index">Home</a></li>
      <li class="dropdown">
      <a class="dropdown-toggle" data-toggle="dropdown" href="category">collections<span class="caret"></span>
</a>
        <ul class="dropdown-menu">
        <li><a href="category">Earrings</a></li>
        <li><a href="#">chains</a></li>
        <li><a href="#">Rings</a><li>
        <li><a href="#">Necklace</a><li>
        <li><a href="#">Bangles</a></li>
        <li class="divider"></li>
          <li><a href="#">Others</a></li>
</ul></li>
      <li><a href="#">Make your design</a></li>
      <li><a href="aboutus">About us</a></li>
      <li><a href="contactus">Contact us</a></li>
    </ul>
<ul class="nav navbar-nav navbar-right">
<li><a href="sign up.html"><span class="glyphicon glyphicon-user"></span>Sign up</a></li>
<li><a href="login"><span class="glyphicon glyphicon-log-in"></span>login</a></li>
</ul>
</div>
  </div>
</nav>
</header>
</div>
</body>
</html>