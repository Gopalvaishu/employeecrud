<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@taglib prefix = "x" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result for fetch all data</title>
</head>
<body>
<h1> Employee Details are</h1>
<br>
<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Mobile</th>
<th>salary</th>

<th>Edit</th>
<th>Delete</th>
</tr>
<x:forEach var="employee" items="${list }">
<tr>
<th>${employee.getId() }</th>
<th>${employee.getName() }</th>
<th>${employee.getMobile() }</th>
<th>${employee.getSalary() }</th>

<th><button>Edit</button></th>
<th><a href="delete?id=${employee.getId()}"><button>Delete</button></a></th>
</tr>
</x:forEach>
</table>
</body>
</html>