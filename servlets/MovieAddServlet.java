package servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Movie;
import vo.User;
import dao.MySqlMovieDao;

public class MovieAddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		request.setAttribute("viewUrl", "/movie/MovieForm.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	{

		try {
			ServletContext sc = this.getServletContext();
			MySqlMovieDao movieDao = (MySqlMovieDao)sc.getAttribute("movieDao");
			Movie movie = (Movie)request.getAttribute("movie");
			User user = (User)request.getAttribute("user");
			movieDao.insert(movie);
			
			request.setAttribute("viewURl", "redirect:list.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
