<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hii MVC CRUD OPERATION</h1>

<h1> Enter Employee Details</h1>
<spring:form action="saveemployee" method="post" modelAttribute="employee">
 Name:<input type="text" name="name"><br>
Mobile:<input type="text" name="mobile"><br>
Salary:<input type="text" name="salary"><br>
Data of Joining:<input type="date" name="date"><br>
<button type="reset" >Reset</button><button>Save</button>
</spring:form>
</form>
</body>
</html>