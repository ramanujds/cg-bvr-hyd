<%@page import="com.capg.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>

<style type="text/css">
div{
padding:20px;
border:1 solid red;
background-color: gray;
}

</style>
</head>
<body>

<div>
<h2>Employee ID : ${employee.getEmpId()}</h2>
<h2>Employee Name : ${employee.getEmpName()}</h2>
<h2>Age : ${employee.getAge()}</h2>
<h2>Salary : ${employee.getSalary()}</h2>
</div>
</body>
</html>