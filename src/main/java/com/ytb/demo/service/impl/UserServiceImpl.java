package com.ytb.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ytb.demo.dao.UserDao;
import com.ytb.demo.pojo.User;
import com.ytb.demo.service.IUserService;

/**
 * user service impl
 *
 * @author you_tbin
 */
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public User getUser(Integer id) {
		
		return userDao.getUser(id);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

	@Override
	public Boolean addUser(User user) {
		
		return userDao.addUser(user.getName(), user.getSex(), user.getAge(), user.getAddress());
	}

	@Override
	public Boolean updateUser(User user) {
		
		return userDao.updateUser(user.getId(), user.getName(), user.getSex(), user.getAge(), user.getAddress());
	}

	@Override
	public Boolean deleteUser(Integer id) {
		
		return userDao.deleteUser(id);
	}

	@Override
	public Boolean deleteUserSlave(Integer id) {
		
		return userDao.deleteUserSlave(id);
	}

}
