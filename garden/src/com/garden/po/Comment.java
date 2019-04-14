package com.garden.po;

import java.util.Date;

public class Comment {
    private Integer comment_id;

    private Integer comment_dynamicid;

    private String comment_description;

    private Date comment_date;

    private Integer comment_pointnum;
    
    private String comment_userid;

    public Integer getCommentId() {
        return comment_id;
    }

    public void setCommentId(Integer commentId) {
        this.comment_id = commentId;
    }

    public Integer getCommentDynamicid() {
        return comment_dynamicid;
    }

    public void setCommentDynamicid(Integer commentDynamicid) {
        this.comment_dynamicid = commentDynamicid;
    }

    public String getCommentDescription() {
        return comment_description;
    }

    public void setCommentDescription(String commentDescription) {
        this.comment_description = commentDescription == null ? null : commentDescription.trim();
    }

    public Date getCommentDate() {
        return comment_date;
    }

    public void setCommentDate(Date commentDate) {
        this.comment_date = commentDate;
    }

    public Integer getCommentPointnum() {
        return comment_pointnum;
    }

    public void setCommentPointnum(Integer commentPointnum) {
        this.comment_pointnum = commentPointnum;
    }

	public String getComment_userid() {
		return comment_userid;
	}

	public void setComment_userid(String comment_userid) {
		this.comment_userid = comment_userid;
	}
	
    
}