package com.lzgc.aduo.service;

import java.util.List;
import java.util.Set;

import com.lzgc.aduo.entity.User;

public interface UserService {
	User getUserById(Integer id);

	public List<User> getUserList();

	public int add(User user);

	public int update(Integer id, User user);

	public int delete(Integer id);

	User selectByLoginName(String account);

	User getUserByLoginName(String username);

	Set<String> findRoles(String username);

	Set<String> findPermissions(String username);
}
