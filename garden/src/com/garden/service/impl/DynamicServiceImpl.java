package com.garden.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.mapper.NewDynamicMapper;
import com.garden.po.Comment;
import com.garden.po.CommentQueryVo;
import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;
import com.garden.po.User;
import com.garden.service.DynamicService;

@Service("dynamicService")
public class DynamicServiceImpl implements DynamicService {

	@Autowired
	NewDynamicMapper newDynamicMapper;
	/**
	 * 查询所有动态
	 */
	@Override
	public List<DynamicQueryVo> selectDynamicList() {
		return newDynamicMapper.selectDynamicList();
	}
	/**
	 * 添加动态
	 */
	public DynamicAll insertDynamic(DynamicAll dynamicAll) {
		newDynamicMapper.insertDynamic(dynamicAll); 
		return dynamicAll;
	}
	/**
	 * 点赞+
	 */
	/*
	 * @Override public void plusPointNum(Integer dynamicId) {
	 * newDynamicMapper.plusPointNum(dynamicId); }
	 */
	/**
	 * 点赞减
	 */

	/*
	 * public void delPointNum(Integer dynamicId) {
	 * newDynamicMapper.delPointNum(dynamicId); }
	 */
	/**
	 * 根据用户id查询动态
	 */
	@Override
	public List<DynamicQueryVo> findDynamicByUserId(String UserId) {
		return newDynamicMapper.findDynamicByUserId(UserId);
	}
	/**
	 * 根据动态id查询详细动态
	 */
	@Override
	public DynamicQueryVo findDynamicByDynamicId(Integer DynamicId) {
		return newDynamicMapper.findDynamicByDynamicId(DynamicId);
	}
	/**
	 * 根据动态id查询评论
	 */
	@Override
	public List<CommentQueryVo> findCommentByDynamicId(Integer DynamicId) {
		return newDynamicMapper.findCommitByDynamicId(DynamicId);
	}
	/**
	 * 添加评论
	 * @param comment
	 */
	public void addComment(Comment comment) {
		newDynamicMapper.addComment(comment);
		Integer integer = newDynamicMapper.countCommentNum(comment.getComment_dynamicid());
		DynamicAll dynamicAll = newDynamicMapper.findDynamicAllByDynamicId(comment.getComment_dynamicid());
		dynamicAll.setDynamic_commentnum(integer);
		newDynamicMapper.updateCommentNum(dynamicAll);
	}
	/**
	 * 观看量+
	 */
	@Override
	public void plusWatchNum(Integer DynamicId) {
		newDynamicMapper.plusWatchNum(DynamicId);
	}
	
	/**
	 * 根据动态id删除动态
	 */
	@Override
	public void delDynamicByDynamicId(Integer dynamicId) {
		newDynamicMapper.delCommentByDynamicId(dynamicId);
		newDynamicMapper.delDynamicByDynamicId(dynamicId);
	}
	
	/**
	 * 根据评论id删除评论
	 */
	@Override
	public void delCommentByCommentId(Integer commentId) {
		newDynamicMapper.delCommentByCommentId(commentId);
		Integer integer = newDynamicMapper.countCommentNum(commentId);
		DynamicAll dynamicAll = newDynamicMapper.findDynamicAllByDynamicId(commentId);
		dynamicAll.setDynamic_commentnum(integer);
		newDynamicMapper.updateCommentNum(dynamicAll);
	}
	
	/**
	 * 传入userid,查询动态id后,使用动态id查询评论.
	 */
	@Override
	public List<CommentQueryVo> findMyCommentByDynamicId(String userid) {
		List<Integer> list = newDynamicMapper.getDynamicIdByUserId(userid);
		DynamicQueryVo dqv = new DynamicQueryVo();
		dqv.setList(list);
		return newDynamicMapper.findMyCommentByDynamicId(dqv);
	}
	
	
	
	
	//=====================================================测试代码
	/**
	 * 点赞
	 */
	@Override
	public Integer PointNum(DynamicAll dynamicAll) {
		Integer zhuan_tai = newDynamicMapper.findDynamiclikeByUseridAndDynamicId(dynamicAll);
		if(zhuan_tai == null) {
			newDynamicMapper.insertDynamiclikeByUseridAndDynamicId(dynamicAll);
			zhuan_tai = 1;
			return zhuan_tai;
		}else if(zhuan_tai == 1) {
			newDynamicMapper.delDynamiclikeByUseridAndDynamicId(dynamicAll);
			zhuan_tai = 0;
			return zhuan_tai;
		}else if (zhuan_tai == 0) {
			newDynamicMapper.addDynamiclikeByUseridAndDynamicId(dynamicAll);
			zhuan_tai = 1;
			return zhuan_tai;
		}
		return -1;
	}
	
}