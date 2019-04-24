package com.garden.controller;






import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garden.mapper.FeedbackMapper;
import com.garden.po.Feedback;
import com.garden.po.TechniqueQueryVo;
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
		@Autowired
		FeedbackMapper feedbackmapper;
	
		@RequestMapping("addUserUrl")
		public @ResponseBody String addUserUrl(@RequestBody User user,String id){
			System.out.println(id);
			return userservice.addUserImage(user.getUserId(),user.getUserImage(),user.getUserName());
			
		}
		@RequestMapping("feedback")
		public @ResponseBody String feedback(String userid,String details){
			try {
				Feedback f=new Feedback();
				f.setUserid(userid);
				f.setMsg(details);
				feedbackmapper.insert(f);
				return "ok";
			} catch (Exception e) {
				// TODO Auto-generated catch block
			
				e.printStackTrace();
				return "fail";
			}
			
			
		}
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


	            openid = (String) json.get("openid");

	        } catch (ParseException e) {

	            e.printStackTrace();

	        }
	        userservice.addUser(openid);
			return openid;

			
		}
	
}
