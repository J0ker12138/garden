package com.garden.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garden.po.TechniqueQueryVo;
import com.garden.service.TechniqueService;



@Controller
public class TechniqueController {
	
	@Autowired
	private TechniqueService techservice;
	
	@RequestMapping(value="/search")
	public @ResponseBody TechniqueQueryVo searchAll(@RequestBody TechniqueQueryVo techvo){
		TechniqueQueryVo tech=techservice.searchAll(techvo);
		return tech;
		
	}
	@RequestMapping(value="/recommendTech")
	public @ResponseBody List<TechniqueQueryVo> recommendTech(){
		List<TechniqueQueryVo> techvolist=techservice.recommendTech();
		return techvolist;
		
	}
	
	@RequestMapping(value="/getAllTechnique")
	public @ResponseBody List<TechniqueQueryVo> getAllTechnique(String type){
		List<TechniqueQueryVo> list=new ArrayList<TechniqueQueryVo>();
		
		if (type!=null&&!type.equals("")&&!type.equals("全部")) {
			list=techservice.getTechniqueByType(type);
		}else{
			 list=techservice.getAllTechniques();
		}
		
		return list;
		
	}
	@RequestMapping(value="/getTechById")
	public @ResponseBody TechniqueQueryVo getTechById(String techid){
		TechniqueQueryVo vo=techservice.getTechniqueById(Integer.parseInt(techid));
		return vo;
		
	}
	@RequestMapping(value="/findcollection")
	public @ResponseBody String findcollection(String techid,String userid){
		String s=techservice.findcollection(techid,userid);
		return s;
		
	}
	@RequestMapping(value="/getMyCollectionList")
	public @ResponseBody List<TechniqueQueryVo> getMyCollectionList(String userid){
		List<TechniqueQueryVo> list=techservice.getMyCollectionList(userid);
		return list;
		
	}
	@RequestMapping(value="/collectTechById")
	public @ResponseBody String getTechById(Integer techid,String userid,String buer){
		System.out.println(techid.toString()+userid+buer);
		try {
			return techservice.collectTech(techid,userid,buer);
		} catch (Exception e) {
			return "fail";
		}
		
		
	}
}
