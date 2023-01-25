package todo.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/* タスク一覧を取得する（list.jspへフォワード） */
@WebServlet("/DeleteAllServlet")
public class DeleteAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteAllServlet() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(TodoDAO dao = new TodoDAO()) {
			// すべてのタスクデータを削除する。
			dao.deleteAll();
		} catch (Exception e) {
			throw new ServletException(e);
		}

		// 全データ削除後のタスク一覧を画面表示する
		RequestDispatcher rd = request.getRequestDispatcher("/AllSearchServlet");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
