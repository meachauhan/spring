<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
 Result is: <%= request.getAttribute("result") %>
 
 Result Display using EL:
 
 Result is: ${result}
</body>
</html>