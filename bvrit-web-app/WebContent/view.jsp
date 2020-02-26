<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
p{
color: navy;
padding: 10px;
border: 3px dashed red;
background-color: silver;
}
h2{
color: green;
padding: 50px;
border: 3px dashed red;
background-color: yellow;
}
div{
color: blue;
font-size:larger;
float:right;
border: 3px solid red;
background-color: pink;
}
</style>
</head>
<body>

<h2>Result = <%=session.getAttribute("square")%></h2>

<div>
Current Date : <%=new Date()%>
</div>
<%
for(int i=1;i<=10;i++){
	out.print("<p>Hello : "+i+"</p>");
}

%>

</body>
</html>