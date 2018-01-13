<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AxEmployee Registration</title>
</head>
<body>
	<%@include file="Master.jsp"%>
	<h1>Welcome to AxEmployee Register page</h1>
	<h2>AxEmployee Registration</h2>
	<form action="insertAxEmp" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name=" axEmpId" /></td>
			</tr>
			<tr>
				<td>NAME:</td>
				<td><input type="text" name="axEmpName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="axEmpEmail" /></td>
			</tr>
			<tr>
				<td>TYPE:</td>
				<td><input type="radio" name="axEmpType" value="regural" />Regular
					<input type="radio" name="axEmpType" value="contract" />Contract</td>
			</tr>
			<tr>
				<td>Location:</td>
				<td><input type="radio" name="axEmpLoc" value="rural" />Rural
					<input type="radio" name="axEmpLoc" value="urban" />Urban</td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="axEmpGender" value="male" />Male
					<input type="radio" name="axEmpGender" value="female" />Female</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear" /></td>
			</tr>
			</form>
			<!-- <a href='showAxEmp'>ALLRECORDS</a> -->
		</table>
		${msg}
</body>
</html>