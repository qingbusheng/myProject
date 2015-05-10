package org.tie.service;

import java.util.List;

import org.tie.dao.UserDAO;
import org.tie.vo.User;

public class UserService {
	private UserDAO userDAO;
	
	public User regist(User user){
		List users = userDAO.findByUsername(user.getUsername());
		if(users.size() > 0){
			return null;
		}
		userDAO.save(user);
		return user;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
