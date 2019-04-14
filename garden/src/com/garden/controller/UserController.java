package com.garden.controller;

import java.net.HttpURLConnection;

import org.json.JSONObject;
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
		String appid="wx434fffa9cc16ad61";
		String secret="ca5b714e13ebfafaf325c37324e5afd7";
		String url="https://api.weixin.qq.com/sns/jscode2session";
		@RequestMapping("login")
		public @ResponseBody User getUserMsg(String code) throws org.json.simple.parser.ParseException{
			String params = "appid=" + appid + "&secret=" + secret + "&js_code=" + code +

	                "&grant_type=authorization_code";

	        String result = com.garden.controller.HttpURLConnection.sendGet(url,params);
	        System.out.println(result);
	        JSONObject json = null;

	        String session_key=null;

	        String openid = null;

	        User user = new User();

	        System.out.println("进入");

	        try {

	             json = (JSONObject) (new JSONParser().parse(result));

	            session_key = (String) json.get("session_key");

	            openid = (String) json.get("openid");

	        } catch (ParseException e) {

	            e.printStackTrace();

	        }
			return user;
			
		}
}
