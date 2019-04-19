package com.garden.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.mapper.NewDynamicMapper;
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
	 * 点赞+
	 */
	@Override
	public void plusPointNum(Integer dynamicId) {
		newDynamicMapper.plusPointNum(dynamicId);
	}
	
	/**
	 * 点赞-
	 */
	@Override
	public void delPointNum(Integer dynamicId) {
		newDynamicMapper.delPointNum(dynamicId);
	}
	
	/**
	 * 根据用户id查询用户动态
	 */
	@Override
	public List<DynamicAll> findDynamicByUserId(String UserId) {
		return newDynamicMapper.findDynamicByUserId(UserId);
	}
	
	/**
	 * 根据动态id查询详细动态
	 */
	@Override
	public DynamicAll findDynamicByDynamicId(Integer DynamicId) {
		return newDynamicMapper.findDynamicByDynamicId(DynamicId);
	}
	
	/**
	 * 根据动态id查询回复
	 */
	@Override
	public List<CommentQueryVo> findCommentByDynamicId(Integer DynamicId) {
		return  newDynamicMapper.findCommitByDynamicId(DynamicId);
	}

	/**
	 * 根据动态id浏览量+1
	 */
	@Override
	public void plusWatchNum(Integer DynamicId) {
		
	}
}
