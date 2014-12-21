package servlets;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Achievement;
import dao.MySqlAchievementDao;

public class AchieveAddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	{
		request.setAttribute("viewUrl", "/achieve/AchieveForm.jsp");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	{

		try {
			ServletContext sc = this.getServletContext();
			MySqlAchievementDao achieveDao = (MySqlAchievementDao)sc.getAttribute("achieveDao");
			Achievement achieve = (Achievement)request.getAttribute("achieve");
			achieveDao.insert(achieve);
			
			request.setAttribute("viewURl", "redirect:list.do");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
