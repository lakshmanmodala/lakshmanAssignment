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
	<h2 class="text-center">Edit Employee</h2>
	<form action="update" method="post">
		<table class="col-md-4 table table-striped mx-auto">
			<tr>
				<td>Emp ID</td>
				<td><input type="number" readonly name="empId"
					value="${emodel.empId}" class="form-control" /></td>
			</tr>
			<tr>
				<td>Emp Name</td>
				<td><input type="text" required name="empName"
					value="${emodel.empName}" /></td>
			</tr>
			<td>Emp Sal</td>
			<td><input type="number" required name="empSal"
				value="${emodel.empSal}" /></td>
			</tr>
			<td>Dept</td>
			<td><input type="date" required name="doj" value="${emodel.doj}" />
				<input type="hidden" name="txtdept" value="${param.dname}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="save" /></td>
			</tr>

		</table>
	</form>
</body>
</html>