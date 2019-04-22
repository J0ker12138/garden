package com.garden.po;

import java.util.Date;

public class Comment {
    private Integer comment_id;

    private Integer comment_dynamicid;

    private String comment_description;

    private Date comment_date;

    private Integer comment_pointnum;
    
    private String comment_userid;

	public Integer getComment_id() {
		return comment_id;
	}

	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
	}

	public Integer getComment_dynamicid() {
		return comment_dynamicid;
	}

	public void setComment_dynamicid(Integer comment_dynamicid) {
		this.comment_dynamicid = comment_dynamicid;
	}

	public String getComment_description() {
		return comment_description;
	}

	public void setComment_description(String comment_description) {
		this.comment_description = comment_description;
	}

	public Date getComment_date() {
		return comment_date;
	}

	public void setComment_date(Date comment_date) {
		this.comment_date = comment_date;
	}

	public Integer getComment_pointnum() {
		return comment_pointnum;
	}

	public void setComment_pointnum(Integer comment_pointnum) {
		this.comment_pointnum = comment_pointnum;
	}

	public String getComment_userid() {
		return comment_userid;
	}

	public void setComment_userid(String comment_userid) {
		this.comment_userid = comment_userid;
	}

}