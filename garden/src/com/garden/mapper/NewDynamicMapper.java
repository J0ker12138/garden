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
	public DynamicAll findDynamicByDynamicId(Integer DynamicId);
	
<<<<<<< HEAD
	/**
	 * 根据动态查找回复
	 * @param DynamicId
	 * @return
	 */
	public List<CommentQueryVo> findCommitByDynamicId(Integer DynamicId);
	
	/**
	 * 添加评论
	 * @param comment
	 */
	public void addComment(Comment comment);
	
	/**
	 * 根据动态id增加浏览数
	 * @param DynamicId
	 */
	public void plusWatchNum(Integer DynamicId);
=======
	public List<Comment> findCommitByDynamicId(Integer DynamicId);
>>>>>>> 7ed14d4daac6de30667c83dab5c5c4761157726b
}
