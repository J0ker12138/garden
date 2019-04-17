package com.garden.service;

import com.garden.po.User;

public interface UserService {
	/**
	 * 通过id得到user
	 * @param userid
	 * @return
	 */
		public User getUserById(String userid);



	public String addUserImage(String userid, String userImage, String userName);



	public void addUser(String openid);
}
