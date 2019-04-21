package com.garden.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garden.po.Plant;
import com.garden.po.PlantQueryVo;
import com.garden.service.PlantService;
@Controller
public class PlantController {
		@Autowired
		PlantService plantservice;
		@RequestMapping("getPlantList")
		public @ResponseBody List<PlantQueryVo> getPlantList(String word){
			List<PlantQueryVo> list=plantservice.getAllPlant();
			return list;
			
		}
		@RequestMapping("getPlantListByType")
		public @ResponseBody List<PlantQueryVo> getPlantListByType(String type){
			List<PlantQueryVo> list=plantservice.getPlantListByType(type);
			return list;
			
		}
		@RequestMapping("getPlantById")
		public Plant getPlantById(String id){
			Plant p=plantservice.getPlantById(Integer.parseInt(id));
			return p;
			
		}
}
