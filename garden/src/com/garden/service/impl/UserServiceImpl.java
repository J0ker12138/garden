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

	@Override
	public String addUserImage(String userid, String userImage,String userName) {
		// TODO Auto-generated method stub
		try {
			User user=new User();
			user.setUsername(userName);
			user.setUserId(userid);
			user.setUserImage(userImage);
			UserExample uex=new UserExample();
			uex.createCriteria().andUserIdEqualTo(userid);
			usermapper.updateByExample(user, uex);
			return "ok";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		
		}
	}

	@Override
	public void addUser(String openid) {
		// TODO Auto-generated method stub
		User u=new User();
		u.setUserId(openid);
		usermapper.insert(u);
	}

}
