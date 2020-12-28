<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>

<jsp:include page="productform.html"></jsp:include>

<%
if (request.getParameter("productName") == null || request.getParameter("productPrice") == null)
{
	//response.sendRedirect("producterror.jsp");
}
%>
</body>
</html>