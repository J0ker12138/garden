package com.garden.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.garden.po.Plant;
import com.garden.po.PlantQueryVo;

public interface PlantService {
		public List<PlantQueryVo> searchAllPlantByWord(String plantname);

		public List<PlantQueryVo> getAllPlant();

		public List<PlantQueryVo> getPlantListByType(String type);

		public PlantQueryVo getPlantById(int parseInt, String userid);

		public String collectPlant(String userid, String plantid);

		public List<Plant> selectRandomplant();

		public void deletePlantByid(String userid, String plantid);
}
