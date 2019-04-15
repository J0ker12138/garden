package com.garden.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.mapper.CollectionMapper;
import com.garden.mapper.TechniqueMapper;
import com.garden.mapper.UserMapper;
import com.garden.po.Collection;
import com.garden.po.CollectionExample;
import com.garden.po.PlantQueryVo;
import com.garden.po.Technique;
import com.garden.po.TechniqueExample;
import com.garden.po.TechniqueExample.Criteria;
import com.garden.po.TechniqueQueryVo;
import com.garden.po.User;
import com.garden.service.TechniqueService;
@Service
public class TechniqueServiceImpl implements TechniqueService {
	@Autowired
	TechniqueMapper techniquemapper;
	
	@Autowired
	PlantServiceImpl psi;

	@Autowired
	UserMapper usermapper;
	@Autowired
	CollectionMapper collectionmapper;
	@Override
	public TechniqueQueryVo searchAll(TechniqueQueryVo tech) {
		// TODO Auto-generated method stub
		if (tech.getSearchword()!=null&&!tech.getSearchword().equals("")) {
			String word=tech.getSearchword();
			
			TechniqueQueryVo techvo=new TechniqueQueryVo();
			
			techvo.setPlantlist(psi.searchAllPlantByWord(tech.getSearchword()));
			TechniqueExample tex=new TechniqueExample();
			Criteria criteria=tex.createCriteria();
			criteria.andTechTypeLike("%"+tech.getSearchword()+"%");
			List<Technique> selectByExample  = techniquemapper.selectByExample(tex);
			TechniqueQueryVo techvoreturn=new TechniqueQueryVo();
			List<TechniqueQueryVo> techvolist=new ArrayList<>();
			for (int i = 0; i < selectByExample.size(); i++) {
				TechniqueQueryVo techvoi=new TechniqueQueryVo();
				techvoi.setTech(selectByExample.get(i));
				techvo.setUser(usermapper.selectByPrimaryKey(selectByExample.get(i).getTechUserid()));
				techvolist.add(techvoi);
			}
			techvo.setTechlist(techvolist);
			return techvo;
			
		}
		return null;
			
	}


	@Override
	public List<TechniqueQueryVo> getAllTechniques() {
		// TODO Auto-generated method stub
		TechniqueExample tex=new TechniqueExample();
		Criteria criteria=tex.createCriteria();
		List<TechniqueQueryVo> list=new ArrayList<>();
		List<Technique> selectByExample = techniquemapper.selectByExample(null);
		for (int i = 0; i < selectByExample.size(); i++) {
			TechniqueQueryVo techvo=new TechniqueQueryVo();
			techvo.setTech(selectByExample.get(i));
			User u=new User();
			techvo.setUser(usermapper.selectByPrimaryKey(selectByExample.get(i).getTechUserid()));
			list.add(techvo);
		}
		return list;
	}


	@Override
	public TechniqueQueryVo getTechniqueById(Integer parseInt) {
		// TODO Auto-generated method stub
		TechniqueQueryVo techvo=new TechniqueQueryVo();
		Technique tech=techniquemapper.selectByPrimaryKey(parseInt);
		tech.setTechViewnum(tech.getTechViewnum()+1);
		techvo.setTech(tech);
		return techvo;
	}


	@Override
	public List<TechniqueQueryVo> getTechniqueByType(String type) {
		// TODO Auto-generated method stub
		List<TechniqueQueryVo> listvo=new ArrayList<>();
		TechniqueExample ex=new TechniqueExample();
		Criteria criteria=ex.createCriteria();
		criteria.andTechTypetopEqualTo(type);
		List<Technique> list=techniquemapper.selectByExample(ex);
		for (int i = 0; i < list.size(); i++) {
			Technique tech=list.get(i);
			TechniqueQueryVo techvo=new TechniqueQueryVo();
			techvo.setTech(tech);
			listvo.add(techvo);
		}
		return listvo;
	}


	@Override
	public List<TechniqueQueryVo> recommendTech() {
		// TODO Auto-generated method stub
		TechniqueExample tex=new TechniqueExample();
		Criteria criteria=tex.createCriteria();
		tex.setOrderByClause("tech_pointnum desc");
		List<TechniqueQueryVo> listvo=new ArrayList<>();
		List<Technique> list=techniquemapper.selectByExample(tex);
		for (int i = 0; i < list.size(); i++) {
			Technique tech=list.get(i);
			TechniqueQueryVo techvo=new TechniqueQueryVo();
			techvo.setTech(tech);
			listvo.add(techvo);
		}
		return listvo;
	}

@Override
	public String collectTech(Integer techid, String userid,String buer) {
		// TODO Auto-generated method stub
	Collection co=new Collection();
	co.setCollDynamicid(techid);
	co.setCollUserid(userid);
	
	if ("true".equals(buer)) {
		
		
		
		collectionmapper.insert(co);
		return "ok";
	}else{
		CollectionExample ex=new CollectionExample();
		ex.createCriteria().andCollDynamicidEqualTo(techid);
		ex.createCriteria().andCollUseridEqualTo(userid);
		collectionmapper.deleteByExample(ex);
		return "fail";
	}
		
	}


@Override
public String findcollection(String techid, String userid) {
	// TODO Auto-generated method stub
	Collection co=new Collection();
	CollectionExample cex=new CollectionExample();
	cex.createCriteria().andCollDynamicidEqualTo(Integer.parseInt(techid));
	cex.createCriteria().andCollUseridEqualTo(userid);
	List<Collection> list=new ArrayList<>();
	list=collectionmapper.selectByExample(cex);
	if (list.size()<1&&list!=null) {
		return "true";
	}
	return "false";
}
@Override
public List<TechniqueQueryVo> getMyCollectionList(String userid) {
	// TODO Auto-generated method stub
	List<TechniqueQueryVo> listvo=new ArrayList<>();
	TechniqueExample tex=new TechniqueExample();
	tex.createCriteria().andTechUseridEqualTo(userid);
	List<Technique> list=techniquemapper.selectByExample(tex);
	for (int i = 0; i < list.size(); i++) {
		TechniqueQueryVo techvo=new TechniqueQueryVo();
		techvo.setTech(list.get(i));
		User u=new User();
		listvo.add(techvo);
		
	}
	return listvo;
}

}
