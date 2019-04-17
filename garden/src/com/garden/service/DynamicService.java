package com.garden.service;

import java.util.List;

import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;

public interface DynamicService {

	public List<DynamicQueryVo> selectDynamicList();
	
	public DynamicAll insertDynamic(DynamicAll dynamicAll);
	
	public void plusPointNum(Integer dynamicId);
	
	public List<DynamicAll> findDynamicByUserId(String string);
	
<<<<<<< HEAD
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
	

=======
	public DynamicAll findDynamicByDynamicId(Integer DynamicId);
>>>>>>> 7ed14d4daac6de30667c83dab5c5c4761157726b
}
