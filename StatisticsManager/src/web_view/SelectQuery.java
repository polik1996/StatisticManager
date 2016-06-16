package web_view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.JPAController;

/**
 * Servlet implementation class SelectQuery
 */
@WebServlet("/SelectQuery")
public class SelectQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectQuery() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JPAController controller = SelectTable.getController();
		String query = request.getParameter("query");
		if (query.equals("mostGoal")) {
			request.setAttribute("model", controller.getTableModelForQuery1());
			request.setAttribute("tableName", "�������� ����������");
		}else if (query.equals("mostAssist")) {
			request.setAttribute("model", controller.getTableModelForQuery2());
			request.setAttribute("tableName", "�������� ���������");
		}else if (query.equals("minsOnMatch")) {
			request.setAttribute("model", controller.getTableModelForQuery3());
			request.setAttribute("tableName", "��������� ��� �� ���");
		}else if (query.equals("mostStatus")) {
			request.setAttribute("model", controller.getTableModelForQuery4());
			request.setAttribute("tableName", "��� � ������� FIFA");
		}else if (query.equals("mostPoint")) {
			request.setAttribute("model", controller.getTableModelForQuery5());
			request.setAttribute("tableName", "��� �� ������� �������� ����");
		}else if (query.equals("mostScored")) {
			request.setAttribute("model", controller.getTableModelForQuery6());
			request.setAttribute("tableName", "��� �� ������� ������� ����");
		}else if (query.equals("mostMissing")) {
			request.setAttribute("model", controller.getTableModelForQuery7());
			request.setAttribute("tableName", "��� �� ������� ���������� ����");
		}else if (query.equals("mostDifference")) {
			request.setAttribute("model", controller.getTableModelForQuery8());
			request.setAttribute("tableName", "��� �� ������� �������/����������");
		}		
		request.getRequestDispatcher("showTable.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
