<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログアウト</title>
</head>
<body>
<%
	session.invalidate();
%>
	<p>ログアウトしました。</p>
	<p><a href="login.jsp">ログイン</a></p>
</body>
</html>
