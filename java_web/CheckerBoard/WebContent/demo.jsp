<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>DEMO JSP</title>
	<link rel="stylesheet" type="text/css" href="checkerboard.css">
	
</head>
<body>
	
	<%-- <%!
	public int add(int a, int b){
		return a+b;
	}
	%> --%>
	<%
		/* int i = 2;
		int j = 4; */
		int count = 0;
		int width;
		int height;
		if(request.getParameter("width") == null){
			width = 10;
		}
		else{
			width = Integer.parseInt(request.getParameter("width"));
		}
		if(request.getParameter("height") == null){
			height = 10;
		}
		else{
			height = Integer.parseInt(request.getParameter("height"));
		}
	%>
	
	<%-- <h3><%= add(i, j) %></h3>
	
	<% for(int idx = 0; idx < 5; idx++){ %>
		<h1><%= idx %></h1>
	<% } %>
	
	<p>The time is: <%= new Date() %></p> --%>
	<h1>Checkerboard settings: <%= width %>W x <%= height %>H</h1>
	<% for(int idx = 0; idx < height; idx++){ %>
		<div>
		<% for(int y = 0; y < width; y++){ %>
			<% if(count % 2 != 0){ %>
				<div id="one"></div>
			<% } %>
			<% if (count % 2 == 0){ %>
				<div id="two"></div>
			<% } %>
		<% count++; } %>
		</div>
	<% count++; } %>
</body>
</html>