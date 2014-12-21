package com.control;

import java.util.Map;

import dao.MySqlUserDao;

public class UserListController implements Controller {

	@Override
	public String execute(Map<String, Object> model) throws Exception {
		// TODO Auto-generated method stub
		MySqlUserDao mySqlUserDao = (MySqlUserDao)model.get("userDao");
		model.put("users", mySqlUserDao.selectList());
		return "/user/UserList.jsp";
	}

}
