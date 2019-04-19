package com.garden.service;

import java.util.List;

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
	 * 点赞+
	 * @param dynamicId
	 */
	public void plusPointNum(Integer dynamicId);
	/**
	 * 点赞-
	 * @param dynamicId
	 */
	public void delPointNum(Integer dynamicId);
	
	/**
	 * 根据用户id查询用户动态
	 * @param string
	 * @return
	 */
	public List<DynamicAll> findDynamicByUserId(String string);
	
	/**
	 * 根据动态id查询详细动态
	 * @param DynamicId
	 * @return
	 */
	public DynamicAll findDynamicByDynamicId(Integer DynamicId);
	
	/**
	 * 根据动态id查询回复
	 * @param DynamicId
	 * @return
	 */
	public List<CommentQueryVo> findCommentByDynamicId(Integer DynamicId);
	
	
	/**
	 * 根据动态id浏览量+1
	 * @param DynamicId
	 */
	public void plusWatchNum(Integer DynamicId);
}
