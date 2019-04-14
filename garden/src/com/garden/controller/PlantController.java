package com.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garden.service.PlantService;
@Controller
public class PlantController {
		@Autowired
		PlantService plantservice;

}
