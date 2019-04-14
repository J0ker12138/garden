package com.garden.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aliyun.oss.OSSClient;
import com.garden.po.Diary;
import com.garden.po.DiaryQueryVo;
import com.garden.po.DiarylogQueryVo;
import com.garden.po.User;
import com.garden.po.UserQueryVo;
import com.garden.service.DiaryService;
import com.garden.service.impl.OSSClientUtil;

@Controller
public class DiaryController {
	@Autowired
	private DiaryService diaryService;
	@Autowired
	private OSSClientUtil ossutil;
	/**
	 * 日记信息
	 * @param diaryvo
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/myDiary")
	public @ResponseBody DiaryQueryVo selectDynamicList(String diary) throws Exception{

		
		DiaryQueryVo vo=diaryService.getDiaryVo(Integer.parseInt(diary));
		return vo;
/*
		try {
			String uploadImg2Oss = ossutil.uploadImg2Oss(file);
			System.out.println(uploadImg2Oss);
			ossutil.getUrl(uploadImg2Oss);
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;*/
		
	
	}
	/**
	 * 创建日记
	 * @param model
	 * @param u
	 * @return
	 */
	
	@RequestMapping(value="/createDiary")
	public @ResponseBody DiaryQueryVo createDiary(@RequestBody DiaryQueryVo diaryvo ,MultipartFile file){
		String url="";
		try {
			if (!file.isEmpty()) {
				url=ossutil.uploadImg2Oss(file);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			diaryService.addDiary(diaryvo);
			e.printStackTrace();
		}
		diaryvo.getDiary().setDiaryImage(url);
	
		diaryService.addDiary(diaryvo);
		return diaryvo;
	
	}
	/**
	 * 创建日记记录
	 * @param diaryvo
	 * @return
	 */
	@RequestMapping(value="/createDiarylog")
	public @ResponseBody DiarylogQueryVo createDiarylogList(@RequestBody DiarylogQueryVo dia ,MultipartFile file){
		
		diaryService.addDiarylog(dia);
	
		
		return dia;
	
	}
	/**
	 * 修改日记记录
	 * @param dia
	 * @return
	 */
	@RequestMapping(value="/updateDiarylog")
	public @ResponseBody DiarylogQueryVo updateDiarylog(@RequestBody DiarylogQueryVo dia){
		diaryService.updateDiarylog(dia);		
		
		return dia;
		
	}
	@RequestMapping(value="/updateDiary")
	public @ResponseBody DiaryQueryVo updateDiary(@RequestBody DiaryQueryVo dia){
		diaryService.updateDiary(dia);		
		
		return dia;
		
	}
	@RequestMapping(value="/index")
	public @ResponseBody List<DiaryQueryVo> indexDiary(@RequestBody User u){
		List<DiaryQueryVo> list=diaryService.getDiaryAndDiarylog(u);		
		
		return list;
		
	}
	@RequestMapping(value="/getLoglist")
	public @ResponseBody List<DiarylogQueryVo> indexDiary(@RequestBody DiaryQueryVo dia){
		List<DiarylogQueryVo> list=diaryService.getDiaryLogList(dia.getDiary().getDiaryId());
		
		return list;
		
	}
}
