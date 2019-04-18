package com.garden.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.garden.po.PlantQueryVo;
import com.garden.service.PlantService;
@Controller
public class PlantController {
		@Autowired
		PlantService plantservice;
		@RequestMapping("getPlantList")
		public @ResponseBody List<PlantQueryVo> getPlantList(String word){
			
			return null;
			
		}
}
