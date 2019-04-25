package com.garden.service;

import java.util.List;

import com.garden.po.Comment;
import com.garden.po.CommentQueryVo;
import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;
import com.garden.po.User;

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
	 * 点赞加
	 * @param dynamicId
	 */
	public void plusPointNum(Integer dynamicId);
	
	/**
	 * 根据动态id取消点赞
	 * @param dynamicId
	 */
	public void delPointNum(Integer dynamicId);
	
	/**
	 * 根据用户id查询动态
	 * @param string
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
	
	/**
	 * 根据
	 * @param cqv
	 * @return
	 */
	public List<CommentQueryVo> findMyCommentByDynamicId(String userid);
}
