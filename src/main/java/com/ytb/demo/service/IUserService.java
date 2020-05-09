package com.ytb.demo.service;

import java.util.List;

import com.ytb.demo.pojo.User;

/**
 * user service
 *
 * @author you_ybin
 */
public interface IUserService {
	
	/**
	 * 获取用户
	 * @param id
	 * @return
	 */
	User getUser(Integer id);
	
	/**
	 * 获取所有用户
	 * @return
	 */
	List<User> getAll();
	
	/**
	 * 添加用户
	 * @param user
	 */
	Boolean addUser(User user);
	
	/**
	 * 修改用户
	 * @param user
	 */
	Boolean updateUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 */
	Boolean deleteUser(Integer id);
	
	/**
	 * 删除用户, 从节点测试
	 * @param id
	 */
	Boolean deleteUserSlave(Integer id);

}
