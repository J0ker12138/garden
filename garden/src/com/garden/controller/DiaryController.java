package com.garden.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.aliyun.oss.OSSClient;
import com.garden.po.Diary;
import com.garden.po.DiaryQueryVo;
import com.garden.po.Diarylog;
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
	 * @throws Exception 
	 */
	
	@RequestMapping(value="/createDiary")
	public @ResponseBody String createDiary(Diary diary ,MultipartFile file) throws Exception{
		DiaryQueryVo vo=new DiaryQueryVo();
		vo.setDiary(diary);
		String url="";
		try {
			if (!file.isEmpty()) {
				url=ossutil.uploadImg2Oss(file);
			
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		vo.getDiary().setDiaryImage(url);
	
		diaryService.addDiary(vo);
		System.out.println(url);
		return "ok";
	
	}
	/**
	 * 创建日记记录
	 * @param diaryvo
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value="/createDiarylog")
	public String createDiarylog(String logDescription, String logDiaryid,MultipartFile file) throws Exception{
		System.out.println(logDescription);
		System.out.println(logDiaryid);
		String url="";
		if (!file.isEmpty()) {
		url=ossutil.uploadImg2Oss(file);
		}
		System.out.println(url);
		DiarylogQueryVo dvo=new DiarylogQueryVo();
		Diarylog log=new Diarylog();
		log.setLogImage(url);
		log.setLogDescription(logDescription);
		log.setLogDiaryid(Integer.parseInt(logDiaryid));
		dvo.setDiarylog(log);
		diaryService.addDiarylog(dvo);
		
		
		return "ok";
	
	}
	/**
	 * 修改日记记录
	 * @param dia
	 * @return
	 */
	/*// 添加
		@RequestMapping(method = RequestMethod.POST, value = "/createDiarylog", produces = "text/plain;charset=utf-8")
		@ResponseBody
		
		  public String upload( Diarylog di,HttpServletRequest request) throws
		  Exception{ 
		
			
			 * System.out.println(df.format(new Date()));//new Date()为获取当前系统时间
			 * 
			 * System.out.println(request.getParameter("title"));
			 
		  //保存数据库的路径 
		  String sqlPath = null;
		
		  //定义文件保存的本地路径
		  String localPath=null;	  
		  //定义 文件名
		  String filename=null; 
		  if(!di.getFile().isEmpty()){ //生成uuid作为文件名称
		  String uuid = UUID.randomUUID().toString().replaceAll("-","");
		  //获得文件类型（可以判断如果不是图片，禁止上传）
		  String contentType=di.getFile().getContentType();
		 //获得文件后缀名
		  String suffixName=contentType.substring(contentType.indexOf("/")+1);
		  //得到 文件名
		  filename=uuid+"."+suffixName; sqlPath = filename;
		  System.out.println(filename); 
		  //文件保存路径
		  di.getFile().transferTo(new File(localPath+filename));
		  } //把图片的相对路径保存至数据库 
		  sqlPath = "/images/"+filename;
		  System.out.println(sqlPath); 
		  di.setLogImage(sqlPath);
		  DiarylogQueryVo vo=new DiarylogQueryVo();
		  vo.setDiarylog(di);
		  diaryService.addDiarylog(vo);
		
		  
		  return "添加成功"; 
		 
		
	}
*/
	@RequestMapping(value="/updateDiarylog")
	public @ResponseBody DiarylogQueryVo updateDiarylog(@RequestBody DiarylogQueryVo dia){
		diaryService.updateDiarylog(dia);		
		
		return dia;
		
	}
	@RequestMapping(value="/updateDiary")
	public @ResponseBody String updateDiary(@RequestBody DiaryQueryVo dia){
		try {
			diaryService.updateDiary(dia);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return "fail";
		}		
		
		return "ok";
		
	}
	@RequestMapping(value="/index")
	public @ResponseBody List<DiaryQueryVo> indexDiary(String userId){
	User user=new User();
	user.setUserId(userId);
		List<DiaryQueryVo> list=diaryService.getDiaryAndDiarylog(user);		
		
		return list;
		
	}
	@RequestMapping(value="/getLoglist")
	public @ResponseBody List<DiarylogQueryVo> indexDiary(@RequestBody DiaryQueryVo dia){
		List<DiarylogQueryVo> list=diaryService.getDiaryLogList(dia.getDiary().getDiaryId());
		
		return list;
		
	}
	@RequestMapping(value="/deleteDiary")
	public @ResponseBody String deleteDiary(String diaryid){
		
		diaryService.deleteDiary(diaryid);
		
		return "ok";
		
	}
}
