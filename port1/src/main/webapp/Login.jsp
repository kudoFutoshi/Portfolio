<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
<form action="j_security_check" method="POST">
<p>ユーザID：<input type="text" name="j_username"></p>
<p>パスワード：<input type="password" name="j_password"></p>
<input type="submit" value="ログイン">
<input type="reset" value="リセット">
</form>
</body>
</html>
