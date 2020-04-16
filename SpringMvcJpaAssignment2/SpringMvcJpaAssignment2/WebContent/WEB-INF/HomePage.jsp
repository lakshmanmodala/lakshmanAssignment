<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Emp Management</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<h1 class="text-center">Emp Management</h1>
	
	<hr />
	<h2 class="text-center">Home</h2>
	<nav class="alert alert-primary row col-md-10 mx-auto">
		<div class="m-2">
			<a class="btn btn-danger" href="viewall">View All</a>
		</div>
		<div class="m-2">
			<a class="btn btn-danger" href="viewbyid">View By ID</a>
		</div>
		<div class="m-2">
		    <a class="btn btn-danger" href="viewbydept">View By Dept</a>
		</div>
		<div class="m-2">
		    <a class="btn btn-danger" href="showaddform">Add Employee</a>
		</div>
	</nav>
	<c:if test="${msg ne null}">
	    <div class="col-md-4 mx-auto alert alert-success">${msg}</div>
	</c:if>
</body>
</html>