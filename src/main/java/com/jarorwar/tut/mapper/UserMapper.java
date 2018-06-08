package com.jarorwar.tut.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jarorwar.tut.entity.User;

@Mapper
public interface UserMapper {

	public void truncateTable();
	public int saveUser(@Param("u")User user);
	public List<User> getAllUsers();
	public List<User> getUserByNameLike(String name);
	public User getById(@Param("uid")int id);
}