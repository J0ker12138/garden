package com.garden.service;

import java.util.List;

import com.garden.po.Comment;
import com.garden.po.CommentQueryVo;
import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;

public interface DynamicService {

	/**
	 * 查询全部动态
	 * @return
	 */
	public List<DynamicQueryVo> selectDynamicList();
	
	/**
	 * 添加动态
	 * @param dynamicAll
	 * @return
	 */
	public DynamicAll insertDynamic(DynamicAll dynamicAll);
	
	/**
	 * 点赞
	 * @param dynamicId
	 */
	public void plusPointNum(Integer dynamicId);
	
	/**
	 * 根据用户id查询动态
	 * @param string
	 * @return
	 */
	public List<DynamicAll> findDynamicByUserId(String string);
	
	/**
	 * 根据动态id查询详细动态
	 * 根据动态id浏览数+1
	 * @param DynamicId
	 * @return
	 */
	public DynamicAll findDynamicByDynamicId(Integer DynamicId);
	
	/**
	 * 根据动态id查询评论
	 * @param DynamicId
	 * @return
	 */
	public List<CommentQueryVo> findCommitByDynamicId(Integer DynamicId);
	
	/**
	 * 添加评论
	 * @param comment
	 */
	public void addComment(Comment comment);
	

}
