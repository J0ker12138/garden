package com.garden.po;

import java.util.Date;

public class CommentQueryVo extends Comment{

    private String user_id;

    private String user_name;

    private String user_image;
    
    private String dynamic_description;
    
    private String dynamic_image;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_image() {
		return user_image;
	}

	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}

	public String getDynamic_description() {
		return dynamic_description;
	}

	public void setDynamic_description(String dynamic_description) {
		this.dynamic_description = dynamic_description;
	}

	public String getDynamic_image() {
		return dynamic_image;
	}

	public void setDynamic_image(String dynamic_image) {
		this.dynamic_image = dynamic_image;
	}
    
}
