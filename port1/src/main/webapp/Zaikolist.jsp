<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="todo.web.Todo, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset="UTF-8"> 
<link rel="stylesheet" href="style_Top.css" media="all">

<title>検索結果</title>
</head>
<body>
<div style="text-align:center">
	<h1>検索結果</h1>

	
	<table align="center" border="1">
	<thead>
		<tr>
		    <th>番号</th>
			<th>商品CD</th>
			<th>商品ロット</th>
			<th>商品名</th>
			<th>商品分類</th>
			<th>数量</th>
			<th>シリアルナンバー</th>
			<th>在庫登録日</th>
			<th>在庫調整</th>
		</tr>
		<%
		List<Todo> todos = (ArrayList<Todo>)request.getAttribute("TodoSelectList");
				if (todos != null) {
			Todo todo;
			for (int i = 0; i < todos.size(); i++) {
				todo = todos.get(i);
		%>
		<tr>
			<td><%=todo.getShouhin_id()%></td>
			<td><%=todo.getShohin_coode()%></td>
			<td><%=todo.getShohin_lot()%></td>
			<td><%=todo.getShohin_mei()%></td>
			<td><%=todo.getShohin_bunrui()%></td>
			<td><%=todo.getShouhin_quantity()%></td>
			<td><%=todo.getSerial_number()%></td>
			<td><%=todo.getTorokubi()%></td>
			<td><a href="ZaikoDetailServlet?shouhin_id=<%=todo.getShouhin_id()%>">在庫調整へ</a></td>
		</tr>
		<%
			}
		}
		%>
		</table>
		</thead>
		<a href="ZaikoSelect.html">在庫検索へ戻る</a><br>
		<a href="Top.html">メインメニューへ戻る</a> 
	</div>
</body>
</html>
