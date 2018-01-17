<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table tr th { color: white; background-color: black}
</style>
</head>
<body>
<%@include file="Master.jsp" %>
	<h1>WELCOME TO AXEMPLOYEE DATA PAGE</h1>
	<form action="axEmpMultDelete" method="post">
	<table border="1">
		<tr>
		<!-- 1 -->
			<th>ID</th>
			<th>ID</th>
			<th>NAME</th>
			<th>TYPE</th>
			<th>LOCATION</th>
			<th>EMAIL</th>
			<th>GENDER</th>
		</tr>
		<c:forEach items="${listobjAxEmp}" var="axEmp">
			<tr>
			<!-- 2 -->
			<td><input type="check.box" name="multi" value="${axEmp.axEmpId }"></td>
			<td><c:out value="${axEmp.axEmpId}"/></td>
			<td><c:out value="${axEmp.axEmpName}"/></td>
			<td><c:out value="${axEmp.axEmpType}"/></td>
			<td><c:out value="${axEmp.axEmpLoc}"/></td>
			<td><c:out value="${axEmp.axEmpEmail}"/></td>
			<td><c:out value="${axEmp.axEmpGender}"/></td>
			<td><a href='deleteAxEmp?axEmpId=${axEmp.axEmpId}'><img src="../Images/delete.png" width="20" height="20"/></a></td>
 			<%-- <td><a href='editLoc?locId=${loc.locId}'><img src="../Images/edit.png" width="20" height="20"/></a></td> --%>
			</tr>
		</c:forEach>
	</table>
	<br/>
<!-- <input type="submit" value="Delete selected"> -->
</form>
</body>
</html>