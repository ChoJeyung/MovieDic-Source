package servlets;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MySqlMovieDao;

@WebServlet("/movies/showMovies")
public class MovieListServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			ServletContext sc = this.getServletContext();
			MySqlMovieDao movieDao = (MySqlMovieDao)sc.getAttribute("movieDao");
			request.setAttribute("movies", movieDao.selectList());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
