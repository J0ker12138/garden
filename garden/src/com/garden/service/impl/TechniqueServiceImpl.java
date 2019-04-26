package com.garden.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garden.mapper.CollectionMapper;
import com.garden.mapper.PlantMapper;
import com.garden.mapper.TechniqueMapper;
import com.garden.mapper.UserMapper;
import com.garden.po.Collection;
import com.garden.po.CollectionExample;
import com.garden.po.Plant;
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
	@Autowired
	PlantMapper plantmapper;
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
			
		}else{
			TechniqueQueryVo techvo=new TechniqueQueryVo();
			List<Technique> selectByExample  = techniquemapper.selectByExample(null);
			techvo.setPlantlist(psi.searchAllPlantByWord(tech.getSearchword()));
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
		int i=tech.getTechViewnum();
		tech.setTechViewnum(++i);
		techniquemapper.updateByPrimaryKey(tech);
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

	/*Integer limit*/
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
	public String collectTech(Integer techid, String 	userid){
			CollectionExample ex=new CollectionExample();
	com.garden.po.CollectionExample.Criteria criteria=ex.createCriteria();
	criteria.andCollDynamicidEqualTo(techid);
	criteria.andCollUseridEqualTo(userid);
	Collection coll=new Collection();
	coll.setCollUserid(userid);
	coll.setCollDynamicid(techid);
	List<Collection> selectByExample = collectionmapper.selectByExample(ex);
	if (selectByExample.size()==0) {
		collectionmapper.insert(coll);
		return "ok";
	}else{
		collectionmapper.deleteByExample(ex);
		return "fail";
	}
	
		
		
		

	
		
		
	}
		
	


@Override
public String findcollection(String techid, String userid) {
	// TODO Auto-generated method stub
	Collection co=new Collection();
	CollectionExample cex=new CollectionExample();
	com.garden.po.CollectionExample.Criteria criteria=cex.createCriteria();
	criteria.andCollDynamicidEqualTo(Integer.parseInt(techid));
	criteria.andCollUseridEqualTo(userid);
	List<Collection> list=new ArrayList<>();
	list=collectionmapper.selectByExample(cex);
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i).getCollDynamicid());
		System.out.println(list.get(i).getCollUserid());
	}
	if (list.size()!=0) {
		return "true";
	}
	return "false";
}
@Override
public TechniqueQueryVo getMyCollectionList(String userid) {
	// TODO Auto-generated method stub
	List<TechniqueQueryVo> listvo=new ArrayList<>();
	List<PlantQueryVo> plantvolist=new ArrayList<>();
	CollectionExample cex=new CollectionExample();
	com.garden.po.CollectionExample.Criteria criteria=cex.createCriteria();
	criteria.andCollUseridEqualTo(userid);
	List<Collection> list=collectionmapper.selectByExample(cex);
	for (int i = 0; i < list.size(); i++) {
		if (list.get(i).getCollDynamicid()!=null) {
			Technique tech=techniquemapper.selectByPrimaryKey(list.get(i).getCollDynamicid());
			TechniqueQueryVo vo=new TechniqueQueryVo();
			vo.setTech(tech);
			listvo.add(vo);
		}
		if(list.get(i).getCollPlantid()!=null){
			Plant plant=plantmapper.selectByPrimaryKey(list.get(i).getCollPlantid());
			PlantQueryVo vo=new PlantQueryVo();
			vo.setPlant(plant);
			plantvolist.add(vo);
		}
	}
	TechniqueQueryVo techvo=new TechniqueQueryVo();
	techvo.setPlantlist(plantvolist);
	techvo.setTechlist(listvo);
	return techvo;
}


@Override
public List<Technique> getrandowTech() {
	// TODO Auto-generated method stub
	
	
	return techniquemapper.selectRandomTech();
}


@Override
public void deleteTechById(String techid,String userid) {
	// TODO Auto-generated method stub
	CollectionExample cex=new CollectionExample();
	com.garden.po.CollectionExample.Criteria criteria=cex.createCriteria();
	criteria.andCollDynamicidEqualTo(Integer.parseInt(techid));
	criteria.andCollUseridEqualTo(userid);
	collectionmapper.deleteByExample(cex);
	
}


}
