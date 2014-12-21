package servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MySqlMovieDao;
import dao.MySqlUserDao;

public class UserListServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			ServletContext sc = this.getServletContext();
			MySqlUserDao userDao = (MySqlUserDao)sc.getAttribute("userDao");
			request.setAttribute("users", userDao.selectList());
			request.setAttribute("viewUrl", "/users/ShowUser.jsp");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
