package todo.web;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ShohinselectServlet")
public class ShohinselectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ShohinselectServlet()  { super(); }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try (TodoDAO dao = new TodoDAO()) {
			
			String shouhin_id = request.getParameter("shohin_coode");
			
			List<Todo> resultList  = dao.select(shouhin_id);
			
			request.setAttribute("TodoSelectList", resultList);
			
			request.getRequestDispatcher("/Zaikolist.jsp").forward(request, response);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
