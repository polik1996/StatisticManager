package web_view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectOperation
 */
@WebServlet("/SelectOperation")
public class SelectOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int operation;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		operation = Integer.parseInt(request.getParameter("operation"));
		String tableClassName = SelectTable.tableName;
		String formName = "";
		if(operation == 4){
			formName = "getId.html";
		}else if(tableClassName.equals("model.Coach")){
			if(operation == 1){
				formName = "inputCoach.html";
			}else if(operation == 2){
				formName = "editCoach.html";
			}
		}else if(tableClassName.equals("model.Game")){
			if(operation == 1){
				formName = "inputGame.html";
			}else if(operation == 2){
				formName = "editGame.html";
			}
		}else if(tableClassName.equals("model.Group")){
			if(operation == 1){
				formName = "inputGroup.html";
			}else if(operation == 2){
				formName = "editGroup.html";
			}
		}else if(tableClassName.equals("model.Player")){
			if(operation == 1){
				formName = "inputPlayer.html";
			}else if(operation == 2){
				formName = "editPlayer.html";
			}
		}else if(tableClassName.equals("model.Team")){
			if(operation == 1){
				formName = "inputTeam.html";
			}else if(operation == 2){
				formName = "editTeam.html";
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
