<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.container {
    overflow: hidden;
    background-color: #333;
    font-family: Arial;
}

.container a {
    float: left;
    font-size: 16px;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

.dropdown {
    float: left;
    overflow: hidden;
}

.dropdown .dropbtn {
    font-size: 16px;    
    border: none;
    outline: none;
    color: white;
    padding: 14px 16px;
    background-color: inherit;
}

.container a:hover, .dropdown:hover .dropbtn {
    background-color: red;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

.dropdown-content a {
    float: none;
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {
    background-color: #ddd;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>
</head>
<body>
<img src="../images/banner.jpg" width="800"/>
<div class="container">
 <!--  <a href="#home">Home</a>
  <a href="#news">News</a> -->
  <div class="dropdown">
    <button class="dropbtn">AxEmployee</button>
    <div class="dropdown-content">
      <a href="axEmpReg">Register</a>
      <a href="showAxEmp">View All</a>
    </div>
  </div> 
  <!-- <div class="dropdown">
    <button class="dropbtn">Vendor</button>
    <div class="dropdown-content">
      <a href="showVenReg">Register</a>
      <a href="showVens">View All</a>
    </div>
  </div> 
   <a href="showDoc">Document</a>
  <a href="generateChart">Report</a>
  <a href="#news">Logout</a> -->
</div>
</body>
</html>