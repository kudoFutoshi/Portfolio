package todo.web;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/* タスク一覧を取得する（list.jspへフォワード） */
@WebServlet("/AllSearchServlet")
public class AllSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AllSearchServlet() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try (TodoDAO dao = new TodoDAO()) {
			
			List<Todo> list = dao.todoList();
			request.setAttribute("TodoList", list);
		} catch (Exception e) {
			throw new ServletException(e);
		}

		
		RequestDispatcher rd = request.getRequestDispatcher("/Alllist.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
