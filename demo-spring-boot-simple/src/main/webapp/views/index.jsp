<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Find User</h3>
<div>
<form action="get-user" method="get">

Email <input type="email" name="tEmail">

<button type="submit">Enter</button>

</form>


</div>
<br>
<br>
<h1>Delete User</h1>
<div>
<form action="delete" method="get">

Email <input type="email" name="tEmail">

<button type="submit">Delete</button>

</form>

</div>


<br>
<br>
<h3>Add User</h3>
<form action="add" method="post">
Name <input type="text" name="userName"><br>
Email <input type="email" name="email"><br>
DOB <input type="date" name="dob"><br>
Age <input type="number" name="age"><br>
<button type="submit">Enter</button>

</form>
</body>
</html>