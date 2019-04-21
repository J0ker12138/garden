package com.garden.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.mapper.PlantMapper;
import com.garden.mapper.TechniqueMapper;
import com.garden.po.Plant;
import com.garden.po.PlantExample;
import com.garden.po.PlantQueryVo;
import com.garden.po.Technique;
import com.garden.po.TechniqueExample;
import com.garden.po.TechniqueExample.Criteria;
import com.garden.po.TechniqueQueryVo;
import com.garden.service.PlantService;
import com.garden.service.TechniqueService;
@Service
public class PlantServiceImpl implements PlantService {
	@Autowired
	PlantMapper plantMapper;

	@Override
	public List<PlantQueryVo> searchAllPlantByWord(String plantname) {
		// TODO Auto-generated method stub
		if (plantname!=null&&!plantname.equals("")) {
			PlantExample pex=new PlantExample();
			com.garden.po.PlantExample.Criteria criteria=pex.createCriteria();
			criteria.andPlantNameLike("%"+plantname+"%");
			List<PlantQueryVo> listvo=new ArrayList<>();
			List<Plant> selectByExample = plantMapper.selectByExample(pex);
			if (selectByExample!=null) {
				for (int i = 0; i < selectByExample.size(); i++) {
					PlantQueryVo plantvo=new PlantQueryVo();
					plantvo.setPlant(selectByExample.get(i));
					listvo.add(plantvo);
				}
				return listvo;
			}
			return listvo;
		}else{
			List<Plant> selectByExample = plantMapper.selectByExample(null);
			List<PlantQueryVo> listvo=new ArrayList<>();
			if (selectByExample!=null) {
				for (int i = 0; i < selectByExample.size(); i++) {
					PlantQueryVo plantvo=new PlantQueryVo();
					plantvo.setPlant(selectByExample.get(i));
					listvo.add(plantvo);
				}
				return listvo;
			}
			return null;
		}
		
		}

	@Override
	public List<PlantQueryVo> getAllPlant() {
		// TODO Auto-generated method stub
		List<PlantQueryVo> plantList=new ArrayList<>();
		List<Plant> list=plantMapper.selectByExample(null);
	
		for (int i = 0; i < list.size(); i++) {
			PlantQueryVo vo=new PlantQueryVo();
			vo.setPlant(list.get(i));
			plantList.add(vo);
		}
		return plantList;
	}

	@Override
	public List<PlantQueryVo> getPlantListByType(String word) {
		// TODO Auto-generated method stub
		if (word.equals("全部")) {
			List<PlantQueryVo> plantList=new ArrayList<>();
			List<Plant> list=plantMapper.selectByExample(null);
		
			for (int i = 0; i < list.size(); i++) {
				PlantQueryVo vo=new PlantQueryVo();
				vo.setPlant(list.get(i));
				plantList.add(vo);
			}
			return plantList;
		}else{
			PlantExample pex=new PlantExample();
			List<PlantQueryVo> plantList=new ArrayList<>();
			pex.createCriteria().andPlantTypeEqualTo(word);
			List<Plant> list=plantMapper.selectByExample(pex);
			for (int i = 0; i < list.size(); i++) {
				PlantQueryVo vo=new PlantQueryVo();
				vo.setPlant(list.get(i));
				plantList.add(vo);
			}
			return plantList;
		}
	
	}


	@Override
	public Plant getPlantById(int parseInt) {
		// TODO Auto-generated method stub
		
		return plantMapper.selectByPrimaryKey(parseInt);
	}
		
		


	
	

}
