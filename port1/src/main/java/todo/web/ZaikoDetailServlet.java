package todo.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/* タスク一覧を取得する（list.jspへフォワード） */
@WebServlet("/ZaikoDetailServlet")
public class ZaikoDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ZaikoDetailServlet() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータから選択したタスク番号idを取得する
		int id =Integer.parseInt(request.getParameter("shouhin_id"));

		Todo dto;
		if (id >= 1) { // idが１以上ならば
			try (TodoDAO dao = new TodoDAO()) {
				// タスク番号に示された1件のタスク内容を取得
				dto = dao.detail(id);
			} catch (Exception e) {
				throw new ServletException(e);
			}
		} else {
			// idが0ならば新規なのでデータは取得せず、空のTodoインスタンスを取得
			dto = new Todo();
			dto.setShouhin_id(0); // idは0に設定
		}

		// 取得したtodo_listテーブルのデータをリクエスト属性へ格納する
		request.setAttribute("todo", dto);

		// タスク詳細を表示する（detail.jspへフォワード）
		RequestDispatcher rd = request.getRequestDispatcher("/Zaikodetail.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
