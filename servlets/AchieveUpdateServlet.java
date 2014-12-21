package servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.User;
import dao.MySqlUserDao;

public class AchieveUpdateServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		request.setAttribute("viewUrl", "/user/UserForm.jsp");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			ServletContext sc = this.getServletContext();
			MySqlUserDao userDao = (MySqlUserDao)sc.getAttribute("userDao");
			User user = (User)request.getAttribute("user");
			userDao.update(user);
			
			request.setAttribute("viewURl", "redirect:list.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
