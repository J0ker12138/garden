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
import com.garden.po.Diarylog;
import com.garden.po.DiarylogQueryVo;
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
	 * @throws Exception 
	 */
	@RequestMapping("/insertDynamic")
	public @ResponseBody String insertDynamic(String dynamic_description, String dynamic_userid,MultipartFile file) throws Exception {
		System.out.println(dynamic_description);
		System.out.println(dynamic_userid);
		String url="";
		if (!file.isEmpty()) {
		url=ossutil.uploadImg2Oss(file);
		}
		System.out.println(url);
		DynamicAll dynamicAll=new DynamicAll();
		
		dynamicAll.setDynamic_description(dynamic_description);
		dynamicAll.setDynamic_userid(dynamic_userid);
		dynamicAll.setDynamic_image(url);
		
		dynamicService.insertDynamic(dynamicAll);
		
		return "ok";
	}
	
	/**
	 * 点赞加
	 * @param dynamicId
	 */
	//-------------------------------------------------------------------------------------------
	/*
	 * @RequestMapping("/plusPointNum") public @ResponseBody DynamicAll
	 * plusPointNum(@RequestBody DynamicAll DynamicAll) {
	 * dynamicService.plusPointNum(DynamicAll.getDynamic_id()); return DynamicAll; }
	 */
	/**
	 * 点赞减
	 * @param dynamicAll
	 * @return
	 */
	/*
	 * @RequestMapping("/delPointNum") public @ResponseBody DynamicAll
	 * delPointNum(@RequestBody DynamicAll dynamicAll) {
	 * dynamicService.delPointNum(dynamicAll.getDynamic_id()); return dynamicAll; }
	 */
	//--------------------------------------------------------------------------------------------
	
	//====================================================================测试代码
	/**
	 * 根据动态id和用户id设置点赞
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/pointNum")
	public @ResponseBody String pointNum(@RequestBody DynamicAll dynamicAll) {
		Integer zhuang_tai = dynamicService.PointNum(dynamicAll);
		if(zhuang_tai == -1) {
			return "false";
		}
			String i = zhuang_tai.toString();
		return i;
	}

	//==================================================================================
	
	
	
	
	/**
	 * 根据用户id查询该用户的动态
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/findDynamicByUserId")
	public @ResponseBody List<DynamicQueryVo> findDynamicByUserId(@RequestBody DynamicAll dynamicAll) {
		return dynamicService.findDynamicByUserId(dynamicAll.getDynamic_userid());
	}
	/**
	 * 根据动态id查询评论
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/findCommentByDynamicId")
	public @ResponseBody List<CommentQueryVo> findCommitByDynamicId(@RequestBody DynamicAll dynamicAll){
		return dynamicService.findCommentByDynamicId(dynamicAll.getDynamic_id());
	}
	
	/**
	 * 根据动态id查询具体动态
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/findDynamicByDynamicId")
	public @ResponseBody DynamicQueryVo findDynamicByDynamicId(@RequestBody DynamicAll dynamicAll) {
		//根据动态id增加浏览量
		dynamicService.plusWatchNum(dynamicAll.getDynamic_id());
		return dynamicService.findDynamicByDynamicId(dynamicAll.getDynamic_id());
	}
	/**
	 * 添加评论
	 * @param comment
	 * @return
	 */
	@RequestMapping("/addComment")
	public @ResponseBody String addComment(@RequestBody Comment comment) {
		dynamicService.addComment(comment);
		return "ok";
	}
	
	/**
	 * 根据动态id删除动态
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/delDynamicByDynamicId")
	public @ResponseBody String delDynamicByDynamicId(@RequestBody DynamicAll dynamicAll) {
		System.out.println(dynamicAll.getDynamic_id());
		dynamicService.delDynamicByDynamicId(dynamicAll.getDynamic_id());
		return "ok";
	}
	
	/**
	 * 根据评论id删除评论
	 * @param comment
	 * @return
	 */
	@RequestMapping("/delCommentByCommentId")
	public @ResponseBody String delCommentByCommentId(@RequestBody CommentQueryVo comment) {
		System.out.println(comment.getComment_id());
		dynamicService.delCommentByCommentId(comment.getComment_id());
		return "ok";
	}

	/**
	 * 根据userid查询评论
	 * @param dynamicAll
	 */
	@RequestMapping("/findMyCommentByDynamicId")
	public @ResponseBody List<CommentQueryVo> findMyCommentByDynamicId (String dynamic_userid) {
		return dynamicService.findMyCommentByDynamicId(dynamic_userid);
	}
}