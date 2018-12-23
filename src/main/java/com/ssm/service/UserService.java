package com.ssm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.pojo.User;
import com.ssm.pojo.UserExample;
import com.ssm.pojo.UserExample.Criteria;

@Service
public class UserService implements UserServiceInterface{
	
	@Autowired
	UserMapper userMapper;
	public User findUserByNameAndPass(String username, String password) {
		// TODO Auto-generated method stub
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<User> userList = userMapper.selectByExample(userExample);
		
		if(userList.size() <= 0){
			return null;
		}
		return userList.get(0);
	}

}
