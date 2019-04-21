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
	@Override
	public DynamicQueryVo findDynamicByDynamicId(Integer DynamicId) {
		return newDynamicMapper.findDynamicByDynamicId(DynamicId);
	}
}
