<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="todo.web.Todo, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8">
<title>検索結果</title>
</head>
<body>
	<h1>検索結果</h1>
<%
	// ログインユーザ名の取得
	String loginUser = (String)request.getUserPrincipal().getName();
	session.setAttribute("loginUser", loginUser);
%>
<p>ログインユーザ：${ loginUser }</p>
	
	<table border="1">
		<tr>
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
		List<Todo> todos = (ArrayList<Todo>)request.getAttribute("list");
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
			<td><a herf="ZaikoDetailServlet?id=<%=todo.getShouhin_id()%>">在庫調整へ</a></td>
		</tr>
		<%
			}
		}
		%>
		<a herf="ZaikoSelect.html"><h4>在庫検索へ戻る</h4></a><br>
		<a herf="Top.html"><h4>メインメニューへ戻る</h4></a>
	</table>
	
</body>
</html>
