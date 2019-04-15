package com.garden.controller;






import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garden.po.User;
import com.garden.service.UserService;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

@Controller
public class UserController {
		@Autowired
		UserService userservice;
		String appid="wx33954bed3b72bf3c";
		String secret="279f2dfe5182330c8146be980a5942b3";
		
		String url="https://api.weixin.qq.com/sns/jscode2session";
		@RequestMapping("login")
		public @ResponseBody String getUserMsg(String code) throws org.json.simple.parser.ParseException{
			String params = "appid=" + appid + "&secret=" + secret + "&js_code=" + code +

	                "&grant_type=authorization_code";

	        String result = HttpURLConnection.sendGet(url,params);

	        JSONObject json = null;

	        String session_key=null;

	        String openid = null;

	        User user = new User();

	        System.out.println(result);

	        try {

	             json = (JSONObject) (new JSONParser().parse(result));

	            session_key = (String) json.get("session_key");

	            openid = (String) json.get("openid");

	        } catch (ParseException e) {

	            e.printStackTrace();

	        }
	        userservice.addUser(openid);
			return openid;

			
		}
		@RequestMapping("addUserImageUrl")
		public String addUserImageUrl(String userid,String userImage,String userName){
			
			return userservice.addUserImage(userid,userImage,userName);
			
		}
}
