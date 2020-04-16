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
	<h2 class="text-center">Add Employee</h2>
	<c:if test="${msg ne null}">
		<div class="col-md-4 mx-auto alert alert-danger">${msg}</div>
	</c:if>
	<form action="add" method="post">
		<table class="col-md-4 table table-striped mx-auto">
			<tr>
				<td>Emp ID</td>
				<td><input type="number" required name="empId"
					value="${emodel.empId}" /></td>
			</tr>
			<tr>
				<td>Emp Name</td>
				<td><input type="text" required name="empName"
					value="${emodel.empName}" /></td>
			</tr>
			<tr>
				<td>Emp Sal</td>
				<td><input type="number" required name="empSal"
					value="${emodel.empSal}" /></td>
			</tr>
			<tr>
				<td>Dept</td>
				<td><select name="dept.deptId" required>
						<option value="">---select dept---</option>
						<c:forEach items="${dlist}" var="d">
							<c:choose>
								<c:when test="${emodel.dept.deptId eq d.deptId}">
									<option value="${d.deptId}" selected>${d.deptName}</option>

								</c:when>
								<c:otherwise>
									<option value="${d.deptId}">${d.deptName}</option>
								</c:otherwise>
							</c:choose>

						</c:forEach>

				</select></td>
			</tr>
			<tr>
				<td>DOJ</td>
				<td><input type="date" required name="doj"
					value="${emodel.doj}" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="save"
					/></td>
			</tr>
		</table>

	</form>
</body>
</html>