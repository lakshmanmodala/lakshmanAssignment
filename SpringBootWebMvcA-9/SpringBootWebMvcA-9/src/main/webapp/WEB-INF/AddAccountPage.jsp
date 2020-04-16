<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Management</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 align="center">Transfer Fund</h1>
	<div class="text-center">
		<a class="btn btn-danger" href="home">Home</a>
	</div>
	<hr />
	<h2 class="text-center">Add Account</h2>
	<c:if test="${msg ne null}">
		<div class="col-md-4 mx-auto alert alert-danger">${msg}</div>
	</c:if>
	<form:form action="add" method="post" modelAttribute="abean">
		<table class="col-md-8 table table-striped mx-auto">
			<tr>
				<td>Account ID</td>
				<td><form:input path="accId"type="number"/></td>
			    <td><form:errors path="accId" class="text-danger"/></td>			
			</tr>
            <tr>
				<td>Customer Name</td>
				<td><form:input path="custName"/></td>
			    <td><form:errors path="custName" class="text-danger"/></td>			
			</tr>
<tr>
				<td>Opening Balance</td>
				<td><form:input path="balance"type="number"/></td>
			    <td><form:errors path="balance" class="text-danger"/></td>			
			</tr>
			<tr><td colspan="3"><input type="submit" value="Save"/></td></tr>
</table>
</form:form>
</body>
</html>