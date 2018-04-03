package com.jarorwar.tut.mapper;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jarorwar.tut.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	
	@Before
	public void beforeEach() {
//		userMapper.truncateTable();
	}
	
	public void testSave() {
		assertEquals(1, saveUser());
	}
	
	@Test
	public void testGetAllUsers() {
		saveUser();
		int totalCounts = userMapper.getAllUsers().size();
		assertEquals(0, totalCounts);
	}

	@Test
	public void testByNameLike() {
		//
		List<User> users = userMapper.getUserByNameLike("%'\" or 2498=2498 or \"'%'=");
		assertEquals(2, users.size());
	}
	
	private int saveUser() {
		User user = new User("java",29);
//		user.setAge(28);
//		user.setName("Java");
		return userMapper.saveUser(user);
	}
	
	

}
