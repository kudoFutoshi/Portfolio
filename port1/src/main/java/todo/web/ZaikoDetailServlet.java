package todo.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/* タスク一覧を取得する */
@WebServlet("/ZaikoDetailServlet")
public class ZaikoDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ZaikoDetailServlet() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id =Integer.parseInt(request.getParameter("shouhin_id"));
		Todo dto;
		if (id >= 1) { 
			try (TodoDAO dao = new TodoDAO()) {
			dto = dao.detail(id);
			
			request.setAttribute("todo", dto);
			RequestDispatcher rd = request.getRequestDispatcher("/Zaikodetail.jsp");
			rd.forward(request, response);
			
			} catch (Exception e) {
				throw new ServletException(e);
			}
		} else {
			dto = new Todo();
			dto.setShouhin_id(0);
			
			request.setAttribute("todo", dto);
			RequestDispatcher rd = request.getRequestDispatcher("/sinnki_Zaikodetail.jsp");
			rd.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
