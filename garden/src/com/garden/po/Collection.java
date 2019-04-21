package com.garden.po;

public class Collection {
    private String collUserid;

    private Integer collDynamicid;

    private Integer collPlantid;

    public String getCollUserid() {
        return collUserid;
    }

    public void setCollUserid(String collUserid) {
        this.collUserid = collUserid == null ? null : collUserid.trim();
    }

    public Integer getCollDynamicid() {
        return collDynamicid;
    }

    public void setCollDynamicid(Integer collDynamicid) {
        this.collDynamicid = collDynamicid;
    }

    public Integer getCollPlantid() {
        return collPlantid;
    }

    public void setCollPlantid(Integer collPlantid) {
        this.collPlantid = collPlantid;
    }
}