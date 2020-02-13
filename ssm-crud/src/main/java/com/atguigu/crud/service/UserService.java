package com.atguigu.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.crud.bean.User;
import com.atguigu.crud.dao.UserMapper;
@Service
public class UserService {
	@Autowired
UserMapper userMapper;
	public User findUser(String username,String password) {
		// TODO Auto-generated method stub
		User user=userMapper.findUser(username, password);
		return user;
	}

}
