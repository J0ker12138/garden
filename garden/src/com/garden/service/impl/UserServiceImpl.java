package com.garden.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.mapper.UserMapper;
import com.garden.po.User;
import com.garden.po.UserExample;
import com.garden.po.UserExample.Criteria;
import com.garden.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper usermapper;
	@Override
	public User getUserById(String userid) {
		// TODO Auto-generated method stub
		User u=usermapper.selectByPrimaryKey(userid);
		return u;
	}

}
