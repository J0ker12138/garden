package com.garden.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;
import com.garden.service.DynamicService;

@Controller
public class DynamicController {

	@Autowired
	DynamicService dynamicService;
	/**
	 * 查询全部动态
	 * @return
	 */
	@RequestMapping("/selectDynamic")
	public @ResponseBody List<DynamicQueryVo> selectDynamicList(){
		return dynamicService.selectDynamicList();
	}
	
	/**
	 * 添加动态
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/insertDynamic")
	public @ResponseBody DynamicAll insertDynamic(@RequestBody DynamicAll dynamicAll) {
		System.out.println(dynamicAll.getDynamic_image());
		dynamicService.insertDynamic(dynamicAll);
		return dynamicAll;
	}
	
	/**
	 * 点赞
	 * @param dynamicId
	 */
	@RequestMapping("/plusPointNum")
	public @ResponseBody DynamicAll plusPointNum(@RequestBody DynamicAll dynamicAll) {
		dynamicService.plusPointNum(dynamicAll.getDynamic_id());
		return dynamicAll;
	}
	
	@RequestMapping("/delPointNum")
	public @ResponseBody DynamicAll delPointNum(@RequestBody DynamicAll dynamicAll) {
		dynamicService.delPointNum(dynamicAll.getDynamic_id());
		return dynamicAll;
	}

	/**
	 * 根据用户id查询该用户的动态
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/findDynamicByUserId")
	public @ResponseBody List<DynamicAll> findDynamicByUserId(@RequestBody DynamicAll dynamicAll) {
		return dynamicService.findDynamicByUserId(dynamicAll.getDynamic_userid());
	}
	
	/**
	 * 根据动态id查询具体动态
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/findDynamicByDynamicId")
	public @ResponseBody DynamicAll findDynamicByDynamicId(@RequestBody DynamicAll dynamicAll) {
		return dynamicService.findDynamicByDynamicId(dynamicAll.getDynamic_id());
	}
	
	
}
