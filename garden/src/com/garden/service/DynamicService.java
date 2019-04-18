package com.garden.service;

import java.util.List;

import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;

public interface DynamicService {

	public List<DynamicQueryVo> selectDynamicList();
	
	public DynamicAll insertDynamic(DynamicAll dynamicAll);
	
	public void plusPointNum(Integer dynamicId);
	public void delPointNum(Integer dynamicId);
	
	public List<DynamicAll> findDynamicByUserId(String string);
	
	public DynamicAll findDynamicByDynamicId(Integer DynamicId);
}
