<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="todo.web.Todo, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>在庫調整</title>
</head>
<body>
<h1>在庫調整画面</h1>
<%

	Todo todo = (Todo)request.getAttribute("todo");
	pageContext.setAttribute("todo",todo);

%>

<form action="ZaikoRegisterServlet" method="POST">
	<table align="center">
	<tr>
		<th>番号</th>
<%
	if (todo.getShouhin_id() > 0) {
%>
		<td>${ todo.shouhin_id }</td>
<%
	} else {
%>
		<td>在庫新規登録</td>
<%
	}
%>
	</tr>
	<tr>
		<th>商品CD</th>
		<td><input type="text" name="shohin_coode" value="${ todo.shohin_coode }" size="20"/></td>
	</tr>
	<tr>
		<th>商品ロット</th>
		<td><input type="text" name="shohin_lot" value="${ todo.shohin_lot }" size="20"/></td>
	</tr>
	<tr>
		<th>商品名</th>
		<td><input type="text" name="shohin_mei" value="${ todo.shohin_mei }" size="20"/></td>
	</tr>
	<tr>
		<th>商品分類</th>
		<td><input type="text" name="shohin_bunrui" value="${ todo.shohin_bunrui }" size="20"/></td>
	</tr>
	<tr>
		<th>個数</th>
		<td><input type="text" name="shouhin_quantity" value="${ todo.shouhin_quantity }" size="8"/></td>
	</tr>
		<tr>
		<th>シリアル番号</th>
		<td><input type="text" name="serial_number" value="${ todo.serial_number }" size="10"/></td>
	</tr>
		
	
</table>
<br>
<input type="hidden" name="id" value="${ todo.id }" />
<input type="submit" value="登録" />
</form>

<%
	if (todo.getShouhin_id() > 0) {
%>
<br>
<form action="DeleteServlet" method="POST">
	<input type="hidden" name="id" value="${ todo.id }" />
	<input type="submit" value="在庫削除" />
</form>
<%
	}
%>
<%
	List<String> msgs = (List<String>)request.getAttribute("errorMessages");
	if (msgs != null) {
		for (int i = 0; i < msgs.size(); i++) {
			String msg = msgs.get(i);
%>
			<br>
			・<%= msg %>
<%
		}
	}
%>
</body>
</html>
