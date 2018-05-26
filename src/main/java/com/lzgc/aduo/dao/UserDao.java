package com.lzgc.aduo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lzgc.aduo.entity.User;

@Repository
public interface UserDao {
	
	User getUserById(Integer id);
	
	public List<User> getUserList();
	
	public int addUser(User user);
	
	public int removeUser(Integer id);
	
	public int update(@Param("id") Integer id, @Param("user") User user);
}
