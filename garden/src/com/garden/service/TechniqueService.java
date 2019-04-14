package com.garden.service;

import java.util.List;

import com.garden.po.PlantQueryVo;
import com.garden.po.TechniqueQueryVo;

public interface TechniqueService {

	TechniqueQueryVo searchAll(TechniqueQueryVo techvo);

	List<TechniqueQueryVo> getAllTechniques();

	TechniqueQueryVo getTechniqueById(Integer parseInt);

	List<TechniqueQueryVo> getTechniqueByType(String type);

	List<TechniqueQueryVo> recommendTech();

	void collectTech(Integer techid, String userid);

}
