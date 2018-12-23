package com.ssm.service;

import com.ssm.pojo.User;

public interface UserServiceInterface {
	public User findUserByNameAndPass(String username , String password);
}
