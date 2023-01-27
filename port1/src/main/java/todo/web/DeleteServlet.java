package todo.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/* タスク一覧を取得する（list.jspへフォワード） */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータから選択したタスク番号idを取得する
		int shouhin_id = Integer.parseInt(request.getParameter("shouhin_id"));

		try(TodoDAO dao = new TodoDAO()) {
			// タスク番号に示された１件のデータを削除する。
			dao.delete(shouhin_id);
		} catch (Exception e) {
			throw new ServletException(e);
		}

		// 1件削除後のタスク一覧を画面表示する
		RequestDispatcher rd = request.getRequestDispatcher("/AllSearchServlet");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
