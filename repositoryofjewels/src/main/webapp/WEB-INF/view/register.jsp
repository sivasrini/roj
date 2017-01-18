<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<%@ include file="header.jsp" %>
<div align="center" class="container" class="form-group">
<form:form action="add" method="post" commandName="reg">
<form:errors path="*"></form:errors>
<table class="table table-bordered table-hover table-responsive">
<tr>
<td colspan="2" align="center" ><h2 style="color:green">Registration</h2></td>
 </tr>
<tr>
<td>Name:</td>
<td ><form:input class="form-contol" placeholder="enter your name" path="name" required="true" pattern="[A-Za-z0-9]{4,15}" title="the name should contain 4-15 characters"></form:input></td><br><br><br>

</tr>
<tr>
<td>Username:</td>
<td><form:input class="form-contol" placeholder="enter your username" path="username" required="true" pattern="([0-9A-Za-z])+([A-Za-z0-9]).{2,15}" title="the username should contain 4-15 characters and should contain combination of characters and numbers"  ></form:input></td>


</tr>
<tr>
<td>Password:</td>
<td><form:input type="password" class="form-contol" placeholder="enter your password" path="password"  required="true" pattern="(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"  ></form:input></td>


</tr>
<tr>
<td>Address:</td>
<td><form:input class="form-contol" placeholder="enter your address" path="address" required="true"></form:input></td>

</tr>
<tr>
<td>Mobile number:</td>
<td><form:input  class="form-contol" placeholder="enter your mobile number" path="mobilenumber" required="true" pattern="[7|8|9][0-9]{9}" title="please enter the valid mobile number" ></form:input></td>

</tr>
<tr>
<td>E-mail id:</td>
<td><form:input type="email" class="form-contol" placeholder="enter your mail id" path="emailid" required="true"></form:input></td>

</tr>
<tr>
<td colspan="2" align="center"><input type="submit" class="btn btn-success" value="Register" />
<input type="reset" class="btn btn-danger" value="reset"/></td>
</tr>

</table>

</form:form>


</div>

<%@ include file="footer.jsp" %>
</body>
</html>