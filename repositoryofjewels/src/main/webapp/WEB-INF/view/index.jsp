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
  #innerbox{
  border-style:solid;
  border-color:lightgrey;
  border-width:1px;
  }
  #e
  {
 margin: 0 0 0 0;
 padding:0px;
  }
  .col-sm-2
  {
  margin:0 0 0 0;
  padding:0px;
  outline-style:groove;
  outline-color:pink;
  text-align:center;
  text-decoration:none;
  }
  a:link{color:red;}
  a:visited{color:green;}
a:hover{color:hotpink;}
a:active{color:blue;}
  
  </style>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="container-fluid" id="e" Style="background-color:#FFA500;outline-style:groove;outline-color:pink;">
<div id="mycarousel" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
     <li data-target="#mycarousel" data-slide-to="0"></li>

     <li data-target="#mycarousel" data-slide-to="1" 

class="active"></li>

     <li data-target="#mycarousel" data-slide-to="2"></li>
</ol>
<div class="carousel-inner">
<div class="item">
<img src="<c:url value="/resources/images/9.jpg"/>" alt="wow"class="img-responsive">
<div class="carousel-caption">
    <h3>Light weight chains<small>(denotes, you are a trend 
setter)</small></h3>
</div>
</div>
<div class="item active">
<img src="<c:url value="/resources/images/7.jpg"/>" alt="Rings" class="img-responsive">
<div class="carousel-caption">
    <h3>Diamond rings<small>(which makes you even 
prettier)</small></h3>
</div>
</div>
<div class="item">
<img src="<c:url value="/resources/images/hello.jpg"/>" alt="bangles" class="img-responsive">
<div class="carousel-caption">
    <h3>Golden Bangles<small>(Question arises who is the real beauty)</small></h3>
</div>
</div>
</div>
<a class="carousel-control left" href="#mycarousel" 

role="button" data-slide="prev">
<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
<span class="sr-only">Previous</span>
</a>
<a class="carousel-control right" href="#mycarousel" role="button" data-slide="next">
<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
<span class="sr-only">Next</span>
</a>
</div>
<div class="row">
<div class=col-xs-6 id="e" style="outline-style:groove;outline-color:pink;">
<div class="embed-responsive embed-responsive-16by9">>
<iframe width="500" height="315" src="https://www.youtube.com/embed/SpUK7U7kDtE" frameborder="0" allowfullscreen></iframe>
</div>
</div>
<div class=col-xs-6 id="e" style="background-color:black;padding:5px;outline-color:pink;outline-style:groove;text-decoration:none;">
<h3 style="font-style:italic;text-align:center;color:lightgreen;font-family:courier new;font-weight:bold;">WEDDING JEWELS</h3>
<p><a href="#"><span class="glyphicon glyphicon-hand-right"></span>&nbsp GOLD jewelleries for your WEDDING celebration</a></p>
<p><a href="#"><span class="glyphicon glyphicon-hand-right"></span>&nbsp DIAMOND jewelleries to remaind your anniverseries</a></p>
<p><a href="#"><span class="glyphicon glyphicon-hand-right"></span>&nbsp SILVER jewelleries can fill your normal days which makes your day even more special</a></p>
<p><a href="#"><span class="glyphicon glyphicon-hand-right"></span>&nbsp India's largest collections of wedding jewelleries</a></p>
<p><a href="#"><span class="glyphicon glyphicon-hand-right"></span>&nbsp Modern and trendy jewels which are so lite in weight</a></p>
<p><a href="#"><span class="glyphicon glyphicon-hand-right"></span>&nbsp This Video can explain you more........which never stops you from buying jewels here....</a></p>
</div>
</div>
<div class="container" id="e" style="background-color:black;max-width:1100px;margin:auto;padding:0 0 0 0;">
<div class="row">
<div class="col-sm-2" id="e">
<a href="#"><h3 style="font-family:courier new;font-weight:bold;">EARRINGS</h3><p>New bridal collections</p></a>
</div>
<div class="col-sm-2" id="e">
<a href="#"><h3 style="font-family:courier new;font-weight:bold;">RINGS</h3><p>Engagemnt rings</p></a>
</div>
<div class="col-sm-2" id="e">
<a href="#"><h3 style="font-family:courier new;font-weight:bold;">BANGLES</h3><p>Light weight bangles</p></a>
</div>
<div class="col-sm-2" id="e">
<a href="#"><h3 style="font-family:courier new;font-weight:bold;">NECKLACE</h3><p>New designs</p></a>
</div>
<div class="col-sm-2" id="e">
<a href="#"><h3 style="font-family:courier new;font-weight:bold;">CHAINS</h3><p>Long chains</p></a>
</div>
<div class="col-sm-2" id="e">
<a href="#"><h3 style="font-family:courier new;font-weight:bold;">OTHERS</h3><p>And much more</p></a>
</div>
</div>
</div>
</div>
<br><br><br>
<%@ include file="footer.jsp" %>
</body>
</html>