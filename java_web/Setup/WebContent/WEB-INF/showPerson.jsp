<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Person Page</title>
</head>
<body>
	<%-- <% Person person = (Person) request.getAttribute("person"); %> --%>
	<h1>Hello World</h1>
<%-- 	<h2><%= person.greeting() %></h2>
 --%>
	<h2><c:out value="${person.greeting()}"/></h2>
</body>
</html>