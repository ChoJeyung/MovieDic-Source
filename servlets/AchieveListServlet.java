package servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MySqlAchievementDao;
import dao.MySqlUserDao;

public class AchieveListServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			ServletContext sc = this.getServletContext();
			MySqlAchievementDao achieveDao = (MySqlAchievementDao)sc.getAttribute("achievementDao");
			request.setAttribute("achievements", achieveDao.selectList());
			request.setAttribute("viewUrl", "achieve/showAchieves.jsp");
		} catch (Exception e) {
			// TODO: handle exception
		}
}
