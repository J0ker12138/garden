package com.garden.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.garden.po.Comment;
import com.garden.po.CommentQueryVo;
import com.garden.po.DynamicAll;
import com.garden.po.DynamicQueryVo;
import com.garden.service.DynamicService;
import com.garden.service.impl.OSSClientUtil;

@Controller
public class DynamicController {

	@Autowired
	DynamicService dynamicService;
	@Autowired
	private OSSClientUtil ossutil;
	
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
	public @ResponseBody DynamicAll insertDynamic(@RequestBody DynamicAll dynamicAll, MultipartFile file) {
		String url="";
		try {
			if (!file.isEmpty()) {
				url=ossutil.uploadImg2Oss(file);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			dynamicService.insertDynamic(dynamicAll);
			e.printStackTrace();
		}
		dynamicAll.setDynamic_image(url);
		dynamicService.insertDynamic(dynamicAll);

		return dynamicAll;
	}
	/**
	 * 点赞
	 * @param dynamicId
	 */
	@RequestMapping("/plusPointNum")
	public @ResponseBody DynamicAll plusPointNum(@RequestBody DynamicAll DynamicAll) {
		dynamicService.plusPointNum(DynamicAll.getDynamic_id());
		return DynamicAll;
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
	
	/**
	 * 根据动态id查询评论
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/findCommitByDynamicId")
	public @ResponseBody List<CommentQueryVo> findCommitByDynamicId(@RequestBody DynamicAll dynamicAll){
		return dynamicService.findCommitByDynamicId(dynamicAll.getDynamic_id());
	}
	
	/**
	 * 添加评论
	 * @param comment
	 * @return
	 */
	@RequestMapping("/addComment")
	public @ResponseBody Comment addComment(Comment comment) {
		dynamicService.addComment(comment);
		return comment;
	}
}
