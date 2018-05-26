package com.lzgc.aduo.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lzgc.aduo.dao.UserDao;
import com.lzgc.aduo.entity.User;
import com.lzgc.aduo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private @Autowired UserDao userDao;
	
	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public int add(User user) {
		return userDao.addUser(user);
	}

	@Override
	public int update(Integer id, User user) {
		return userDao.update(id, user);
	}

	@Override
	public int delete(Integer id) {
		return userDao.removeUser(id);
	}

	@Override
	public User selectByLoginName(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserByLoginName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> findRoles(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> findPermissions(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
