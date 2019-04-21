package com.garden.service;

import java.util.List;

import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;

public interface DynamicService {

	public List<DynamicQueryVo> selectDynamicList();
	
	public DynamicAll insertDynamic(DynamicAll dynamicAll);
	
	public void plusPointNum(Integer dynamicId);
	
	public List<DynamicAll> findDynamicByUserId(String string);
	

	/**
	 * 根据动态id查询详细动态
	 * @param DynamicId
	 * @return
	 */
	public DynamicQueryVo findDynamicByDynamicId(Integer DynamicId);
	
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

	public DynamicAll findDynamicByDynamicId(Integer DynamicId);

}
