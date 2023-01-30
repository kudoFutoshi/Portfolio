<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style_Top.css" media="all">
<body>
<div style="text-align:center">
<h1>◆在庫管理システム◆</h1>
<%
 String loginUser =(String)request.getUserPrincipal().getName();
 session.setAttribute("loginUser", loginUser);
 
%>

<p>ユーザー：${ loginUser }</p>
<br>
<h2>-在庫管理メニュー-</h2>

<form action="ZaikoSelect.html" method="POST">
<input type="hidden" name = "shouhin_id" value="0"/>
<input type="submit" value="在庫検索メニュー">
</form>
<br>

<form action="Zaikotyousei.html" method="POST">
<input type="hidden" name = "shouhin_id" value="0"/>
<input type="submit" value="在庫調整メニュー">
</form>
<br>

<form action="Arrival_ZaikoDetailServlet" method="GET">
<input type="hidden" name = "shouhin_id" value="0"/>
<input type="submit" value="入荷入力メニュー">
</form>
<br>


</div>
</body>
</html>