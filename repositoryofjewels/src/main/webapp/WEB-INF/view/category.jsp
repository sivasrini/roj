<!DOCTYPE html>
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width initial-scale=1">
<link rel="stylesheet" 

href="<c:url value="resources/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>">
  <script src="<c:url value="resources/jquery-3.1.1.min.js"/>"></script>
  <script src="<c:url value="resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="resources/font-awesome-4.7.0/font-awesome-4.7.0/font-awesome.min.css"/>"></script>
  <script src="<c:url value="resources/fontawesome.js"/>"></script>
  <style>
  table,th,td
  {
  border:1px solid black;
  border-collapse: collapse;
  text-align:center;
  margin:auto;
  height:30px;
  }
  tr:hover{background-color:#f5f5f5}
  th
  {
  text-align:centre;
  height:50px;
  background-color:#4CAF50;
  color:white;
  }
  </style>
</head>
<body>
<%@ include file="header.jsp" %>
<br>
<br>
<br>
<table style="width:70%">
<tr>
<th>Products</th>
<th>product price</th>
<th>product category</th>
</tr>
<c:forEach items="${Product}" var="Products">
<tr>
<td>
<c:out  value="${Products.getPname()}"></c:out>
</td>
<td>
<c:out  value="${Products.getPprice()}"></c:out>
</td>
<td>
<c:out  value="${Products.getPcategory()}"></c:out>
</td>
</tr>
</c:forEach>
</table>

 
<%@ include file="footer.jsp" %>
</body>
</html>