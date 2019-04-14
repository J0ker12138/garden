package com.garden.po;

import java.util.List;

public class TechniqueQueryVo {
   private Technique tech;
   private List<PlantQueryVo> plantlist;
   private List<TechniqueQueryVo> techlist;
   private User user;
   public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public List<TechniqueQueryVo> getTechlist() {
	return techlist;
}

public void setTechlist(List<TechniqueQueryVo> techlist) {
	this.techlist = techlist;
}

public List<PlantQueryVo> getPlantlist() {
	return plantlist;
}

public void setPlantlist(List<PlantQueryVo> plantlist) {
	this.plantlist = plantlist;
}

private String searchword;

public String getSearchword() {
	return searchword;
}

public void setSearchword(String searchword) {
	this.searchword = searchword;
}

public Technique getTech() {
	return tech;
}

public void setTech(Technique tech) {
	this.tech = tech;
}


   
}