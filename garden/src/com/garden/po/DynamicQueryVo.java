package com.garden.po;

import java.util.Date;
import java.util.List;
/**
 * 动态的全部实现
 * @author 73230
 *
 */
public class DynamicQueryVo extends DynamicAll{

	private List<Integer> dynamicIdList;
	
	private String user_name;

    private String user_image;
    
    private Integer comment_num;


	public Integer getComment_num() {
		return comment_num;
	}

	public void setComment_num(Integer comment_num) {
		this.comment_num = comment_num;
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

	public List<Integer> getList() {
		return dynamicIdList;
	}

	public void setList(List<Integer> dynamicIdList) {
		this.dynamicIdList = dynamicIdList;
	}
}
