package com.garden.po;

public class Collection {
    private String collUserid;

    private Integer collDynamicid;

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
}