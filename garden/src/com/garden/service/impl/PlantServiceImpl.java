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
		}
		return null;
		}
		
		


	
	

}
