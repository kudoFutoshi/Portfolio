<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="todo.web.Todo, java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style_Top.css" media="all">
<title>在庫調整</title>
</head>
<body>
<div style="text-align:center">
<%
 String loginUser =(String)request.getUserPrincipal().getName();
 session.setAttribute("loginUser", loginUser);
 
%>

<p>ユーザー：${ loginUser }</p>
<br>
<h1>在庫調整画面</h1>
<%

	Todo todo = (Todo)request.getAttribute("todo");
	pageContext.setAttribute("todo",todo);

%>

<form action="ZaikoRegisterServlet" method="POST">
	
	<table align="center" border="1">
	<thead>
	<tr>
		<th>番号</th>
		<td>${todo.shouhin_id }</td>
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
		<td><input type="text" name="shouhin_quantity" value="${ todo.shouhin_quantity }" size="20"/></td>
	</tr>
	<tr>
		<th>シリアル番号</th>
		<td><input type="text" name="serial_number" value="${ todo.serial_number }" size="20"/></td>
	</tr>
	<tr>
		<th>登録日</th>
		<td><input type="text" name="torokubi" value="${ todo.torokubi }" size="20"/></td>
	</tr>
	</thead>	
</table>

<br>
<input type="hidden" name="shouhin_id" value="${todo.shouhin_id }" />
<input type="submit" value="調整登録完了" />
</form>

<br>
<form action="DeleteServlet" method="POST">
	<input type="hidden" name="shouhin_id" value="${todo.shouhin_id }" />
	<input type="submit" value="在庫削除" />
</form>
<br>
<a href="ZaikoSelect.html">在庫検索へ戻る</a>
<br>
<a href="Top.jsp">メインメニューへ戻る</a><br>

<%
List<String> msgs = (List<String>)request.getAttribute("errorMessages");
if(msgs != null){
	for(int i = 0; i < msgs.size(); i++){
		String msg = msgs.get(i);
		
%>
<br>
・<%=msg%>
<%

	}
}
%>

</div>
</body>
</html>
