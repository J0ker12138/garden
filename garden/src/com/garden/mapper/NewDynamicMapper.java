package com.garden.mapper;

import java.util.List;

import com.garden.po.Comment;
import com.garden.po.CommentQueryVo;
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
	 * 点赞加
	 * @param dynamicId
	 */
	public void plusPointNum(Integer dynamicId);
	/**
	 * 点赞减
	 * @param dynamicId
	 */
	public void delPointNum(Integer dynamicId);
	/**
	 * 根据用户id查询用户动态
	 * @param userId
	 * @return
	 */
	public List<DynamicQueryVo> findDynamicByUserId(String UserId);
	/**
	 * 根据动态id查询详细动态
	 * @param DynamicId
	 * @return
	 */
	public DynamicQueryVo findDynamicByDynamicId(Integer DynamicId);
	/**
	 * 根据动态id查询评论
	 * @param DynamicId
	 * @return
	 */
	public List<CommentQueryVo> findCommitByDynamicId(Integer DynamicId);
	/**
	 * 增加访问量
	 * @param DynamicId
	 */
	public void plusWatchNum(Integer DynamicId);
	
	/**
	 * 添加评论
	 * @param comment
	 */
	public void addComment(Comment comment);
	
	/**
	 * 根据动态id删除动态
	 * @param dynamicId
	 */
	public void delDynamicByDynamicId(Integer dynamicId);
	
	/**
	 * 根据评论id删除评论
	 * @param commentId
	 */
	public void delCommentByCommentId(Integer commentId);
}
