package com.garden.mapper;

import java.util.List;

import com.garden.po.Comment;
import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;

public interface NewDynamicMapper {
	/**
	 * 查询全部动态
	 * @return
	 */
	public List<DynamicQueryVo> selectDynamicList();
	/**
	 * 添加动态
	 * @param dynamicAll
	 */
	public void insertDynamic(DynamicAll dynamicAll);
	/**
	 * 点赞
	 * @param dynamicId
	 */
	public void plusPointNum(Integer dynamicId);
	/**
	 * 根据用户id查询用户动态
	 * @param userId
	 * @return
	 */
	public List<DynamicAll> findDynamicByUserId(String userId);
	/**
	 * 根据动态id查询详细动态
	 * @param DynamicId
	 * @return
	 */
	public DynamicQueryVo findDynamicByDynamicId(Integer DynamicId);
	
	public List<Comment> findCommitByDynamicId(Integer DynamicId);
}
