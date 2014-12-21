package servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MySqlActorDao;

public class ActorListServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			ServletContext sc = this.getServletContext();
			MySqlActorDao actorDao = (MySqlActorDao)sc.getAttribute("actorDao");
			request.setAttribute("actors", actorDao.selectList());
			request.setAttribute("viewUrl", "/actors/showActors.jsp");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
