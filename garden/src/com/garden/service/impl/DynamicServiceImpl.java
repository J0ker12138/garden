package com.garden.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.mapper.NewDynamicMapper;
import com.garden.po.Comment;
import com.garden.po.CommentQueryVo;
import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;
import com.garden.service.DynamicService;

@Service
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
	 * 点赞
	 */
	public void plusPointNum(Integer dynamicId) {
		newDynamicMapper.plusPointNum(dynamicId);
	}
	/**
	 * 根据用户id查找动态
	 */
	@Override
	public List<DynamicAll> findDynamicByUserId(String UserId) {
		return newDynamicMapper.findDynamicByUserId(UserId);
	}
	/**
	 * 根据动态id查找详细动态
	 * 根据动态id浏览数+1
	 */
	@Override
	public DynamicAll findDynamicByDynamicId(Integer DynamicId) {
		newDynamicMapper.plusWatchNum(DynamicId);
		return newDynamicMapper.findDynamicByDynamicId(DynamicId);
	}
	
	/**
	 * 根据动态id查评论
	 */
	@Override
	public List<CommentQueryVo> findCommitByDynamicId(Integer DynamicId) {
		return newDynamicMapper.findCommitByDynamicId(DynamicId);
	}
	
	/**
	 * 添加评论
	 */
	@Override
	public void addComment(Comment comment) {
		newDynamicMapper.addComment(comment);
	}
	

	
	
}
