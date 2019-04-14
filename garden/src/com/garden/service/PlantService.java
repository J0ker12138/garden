package com.garden.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.garden.po.PlantQueryVo;

public interface PlantService {
		public List<PlantQueryVo> searchAllPlantByWord(String plantname);
}
