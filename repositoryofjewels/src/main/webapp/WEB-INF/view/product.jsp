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
<div align="center" class="container" class="form-group">
<form:form action="productdetails" method="post" commandName="prdt" enctype="multipart/form-data">
<table class="table table-bordered table-hover table-responsive">
<tr>
<td colspan="2" align="center"><h2>Product details</h2></td>
 </tr>
<tr>
<td>Product Name:</td>
<td ><form:input class="form-contol" placeholder="enter the name of the product" path="productname" required="true"></form:input></td><br><br><br>

</tr>
<tr>
<td>Product Category:</td>
<td><form:input path="productcategory" required="true"></form:input></td>


</tr>
<tr>
<td>Price:</td>
<td><form:input path="price" required="true"></form:input></td>



</tr>
<tr>
<td colspan="2" align="center">
select your File to upload: <input type="file" class="btn btn-primary" name="FileDetails"><br/>
<input type="submit" class="btn btn-primary" value="add"/>

</td>
</tr>

</table>

</form:form>


</div>


</body>
</html>