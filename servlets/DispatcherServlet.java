package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.Achievement;
import vo.User;

public class DispatcherServlet extends HttpServlet {
	protected void service(HttpServletRequest request,
			HttpServletResponse response) {
		response.setContentType("text/html; charset=UTF-8");
		String servletPath = request.getServletPath();
		try {
			String pageControllerPath = null;

			if ("/member/list.do".equals(servletPath)) {
				pageControllerPath = "/member/list";
			} else if ("/user/add.do".equals(servletPath)) {
				pageControllerPath = "/user/add";
				if (request.getParameter("email") != null) {
					request.setAttribute(
							"member",
							new User()
									.setEmail(request.getParameter("email"))
									.setName(request.getParameter("name"))
									.setPassword(
											request.getParameter("password")));
				}
			} else if ("/user/update.do".equals(servletPath)) {
				pageControllerPath = "/user/update";
				if (request.getParameter("email") != null) {
					request.setAttribute(
							"member",
							new User()
									.setEmail(request.getParameter("email"))
									.setName(request.getParameter("name"))
									.setPassword(
											request.getParameter("password")));
				}
			} else if ("/auth/login.do".equals(servletPath)) {
				pageControllerPath = "/auth/login";
			} else if ("/auth/logout.do".equals(servletPath)) {
				pageControllerPath = "/auth/logout";
			} else if ("/movies/showMovies".equals(servletPath)) {
				pageControllerPath = "/movies/showMovies";
			} else if ("/movies/selectMovie".equals(servletPath)) {
				pageControllerPath = "/movies/selectMovie";
			} else if ("/actors/showActors".equals(servletPath)) {
				pageControllerPath = "/actors/showActors";
			} else if ("/actors/selectActor".equals(servletPath)) {
				pageControllerPath = "/actors/selectActor";
			} else if ("/achieve/showAchieves".equals(servletPath)) {
				pageControllerPath="/achieve/showAchieves";
			} else if ("/achieve/addAchieve".equals(servletPath)){
				pageControllerPath="/achieve/addAchieve";
				if (request.getParameter("AchiveName") != null) {
					request.setAttribute("Achieve", new Achievement().setId(request.getParameter("achieveId")));
				}
			}

			RequestDispatcher rd = request
					.getRequestDispatcher(pageControllerPath);

			rd.include(request, response);

			String viewUrl = (String) request.getAttribute("viewUrl");
			if (viewUrl.startsWith("redirect:")) {
				response.sendRedirect(viewUrl.substring(9));
				return;
			} else {
				rd = request.getRequestDispatcher(viewUrl);
				rd.include(request, response);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
