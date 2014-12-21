package servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Movie;
import dao.MySqlMovieDao;

public class MovieUpdateServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		request.setAttribute("viewUrl", "/movie/MovieForm.jsp");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			ServletContext sc = this.getServletContext();
			MySqlMovieDao movieDao = (MySqlMovieDao)sc.getAttribute("movieDao");
			Movie movie = (Movie)request.getAttribute("movie");
			movieDao.update(movie);
			request.setAttribute("viewURl", "redirect:list.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
