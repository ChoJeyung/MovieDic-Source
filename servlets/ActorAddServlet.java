package servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Actor;
import dao.MySqlActorDao;

public class ActorAddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		request.setAttribute("viewUrl", "/actor/ActorForm.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	{

		try {
			ServletContext sc = this.getServletContext();
			MySqlActorDao actorDao = (MySqlActorDao)sc.getAttribute("actorDao");
			Actor actor = (Actor)request.getAttribute("actor");
			actorDao.insert(actor);
			
			request.setAttribute("viewURl", "redirect:list.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
