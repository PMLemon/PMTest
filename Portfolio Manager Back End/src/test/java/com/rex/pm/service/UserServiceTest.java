package com.rex.pm.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rex.pm.Application;
import com.rex.pm.annotation.InitDatabase;
import com.rex.pm.entities.User;

import junit.framework.Assert;


/** 
* @author Curry
* @date Aug 6, 2017
* @version 0.1
*/
@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
    @Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Test
	@InitDatabase
	public void addTest() {
		int id = 11;
		String name = "Kerr";
		String username = "kerr";
		String password = "123456";
		String userType = "Administrator";
		User user = new User(id, name, username, password, userType);
		User add = userService.add(user);
		Assert.assertEquals(user, add);
	}
	
	@Test
	@InitDatabase
	public void deleteTest() {
		int id = 1;
		userService.delete(id);
		String sql = "select * from user where id = ?";
		Object[] args = {1};
		User delete = jdbcTemplate.queryForObject(sql, args, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet resultSet, int index) throws SQLException {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String username = resultSet.getString("username");
				String password = resultSet.getString("password");
				String userType = resultSet.getString("user_type");
				User user = new User(id, name, username, password, userType);
				return user;
			}
			
		});
		Assert.assertEquals(null, delete);
	}
}
