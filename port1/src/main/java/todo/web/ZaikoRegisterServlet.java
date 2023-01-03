package todo.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/* タスク一覧を取得する（list.jspへフォワード） */
@WebServlet("/ZaikoRegisterServlet")
public class ZaikoRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ZaikoRegisterServlet() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// リクエストパラメータを受け取り、DTOに格納する準備をする。
		int shouhin_id = Integer.parseInt(request.getParameter("shouhin_id"));
		String shohin_coode = request.getParameter("shohin_coode");
		String shohin_lot = request.getParameter("shohin_lot");
		String shohin_mei = request.getParameter("shohin_mei");
		String shohin_bunrui = request.getParameter("shohin_bunrui");
		int shouhin_quantity = Integer.parseInt(request.getParameter("shouhin_quantity"));
		int serial_number = Integer.parseInt(request.getParameter("serial_number"));
		String torokubi = request.getParameter("torokubi");
		
		
		// DTOへ格納する。
		Todo dto = new Todo();
		dto.setShouhin_id(shouhin_id);
		dto.setShohin_coode(shohin_coode);
		dto.setShohin_lot(shohin_lot);
		dto.setShohin_mei(shohin_mei);
		dto.setShohin_bunrui(shohin_bunrui);
		dto.setShouhin_quantity(shouhin_quantity);
		dto.setSerial_number(serial_number);
		dto.setTorokubi(torokubi);
		
		// 入力チェックし、エラーメッセージがあれば元の詳細画面へ戻る
		if (dto.valueCheck() == false ) {
			request.setAttribute("errorMessages", dto.getErrorMessages());
			// 取得したtodo_listテーブルのデータをリクエスト属性へ格納する
			request.setAttribute("todo", dto);
			// 詳細画面を表示する
			RequestDispatcher rd = request.getRequestDispatcher("/detail.jsp");
			rd.forward(request, response);
			return;
		}

		try(TodoDAO dao = new TodoDAO()) {
			// 更新または登録処理を行う
			// idが0のときは新規登録、id>=1のときは更新
			if (shouhin_id == 0) {
				dao.registerInsert(dto);
			} else {
				dao.registerUpdate(dto);
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}

		// 更新または登録後のタスク一覧を画面表示する
		RequestDispatcher rd = request.getRequestDispatcher("/AllSearchServlet");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
