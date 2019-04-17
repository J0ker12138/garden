package com.garden.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.mapper.NewDynamicMapper;
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
	@Override
	public void plusPointNum(Integer dynamicId) {
		newDynamicMapper.plusPointNum(dynamicId);
	}
	@Override
	public List<DynamicAll> findDynamicByUserId(String UserId) {
		return newDynamicMapper.findDynamicByUserId(UserId);
	}
<<<<<<< HEAD
	/**
	 * 根据动态id查找详细动态
	 * 根据动态id浏览数+1
	 */
=======
>>>>>>> 7ed14d4daac6de30667c83dab5c5c4761157726b
	@Override
	public DynamicAll findDynamicByDynamicId(Integer DynamicId) {
		newDynamicMapper.plusWatchNum(DynamicId);
		return newDynamicMapper.findDynamicByDynamicId(DynamicId);
	}
<<<<<<< HEAD
	
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
	

	
	
=======
>>>>>>> 7ed14d4daac6de30667c83dab5c5c4761157726b
}
