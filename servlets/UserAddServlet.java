package servlets;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.User;
import dao.MySqlUserDao;

@WebServlet("/user/add")
public class UserAddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		request.setAttribute("viewUrl", "/user/UserForm.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	{

		try {
			ServletContext sc = this.getServletContext();
			MySqlUserDao userDao = (MySqlUserDao)sc.getAttribute("userDao");
			User user = (User)request.getAttribute("user");
			userDao.insert(user);
			
			request.setAttribute("viewURl", "redirect:list.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
