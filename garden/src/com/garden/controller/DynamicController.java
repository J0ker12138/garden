package com.garden.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garden.po.Comment;
import com.garden.po.CommentQueryVo;
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
	 * 点赞+
	 * @param dynamicId
	 */
	@RequestMapping("/plusPointNum")
	public @ResponseBody DynamicAll plusPointNum(@RequestBody DynamicAll DynamicAll) {
		dynamicService.plusPointNum(DynamicAll.getDynamic_id());
		return DynamicAll;
	}
	/**
	 * 点赞减
	 * @param dynamicAll
	 * @return
	 */
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
	public @ResponseBody Comment addComment(@RequestBody Comment comment) {
		dynamicService.addComment(comment);
		return comment;
	}
	
	/**
	 * 根据动态id删除动态
	 * @param dynamicAll
	 * @return
	 */
	@RequestMapping("/delDynamicByDynamicId")
	public @ResponseBody DynamicAll delDynamicByDynamicId(@RequestBody DynamicAll dynamicAll) {
		dynamicService.delDynamicByDynamicId(dynamicAll.getDynamic_id());
		return dynamicAll;
	}
	
	/**
	 * 根据评论id删除评论
	 * @param comment
	 * @return
	 */
	public @ResponseBody Comment delCommentByCommentId(@RequestBody CommentQueryVo comment) {
		dynamicService.delCommentByCommentId(comment.getComment_id());
		return comment;
	}
}
