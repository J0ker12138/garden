package com.garden.po;

import java.util.Date;

public class Dynamic {
    private Integer dynamicId;

    private String dynamicUserid;

    private String dynamicDescription;

    private String dynamicImage;

    private Date dynamicDate;

    private Integer dynamicPointnum;

    private Integer dynamicViewnum;

    public Integer getDynamicId() {
        return dynamicId;
    }

    public void setDynamicId(Integer dynamicId) {
        this.dynamicId = dynamicId;
    }

    public String getDynamicUserid() {
        return dynamicUserid;
    }

    public void setDynamicUserid(String dynamicUserid) {
        this.dynamicUserid = dynamicUserid == null ? null : dynamicUserid.trim();
    }

    public String getDynamicDescription() {
        return dynamicDescription;
    }

    public void setDynamicDescription(String dynamicDescription) {
        this.dynamicDescription = dynamicDescription == null ? null : dynamicDescription.trim();
    }

    public String getDynamicImage() {
        return dynamicImage;
    }

    public void setDynamicImage(String dynamicImage) {
        this.dynamicImage = dynamicImage == null ? null : dynamicImage.trim();
    }

    public Date getDynamicDate() {
        return dynamicDate;
    }

    public void setDynamicDate(Date dynamicDate) {
        this.dynamicDate = dynamicDate;
    }

    public Integer getDynamicPointnum() {
        return dynamicPointnum;
    }

    public void setDynamicPointnum(Integer dynamicPointnum) {
        this.dynamicPointnum = dynamicPointnum;
    }

    public Integer getDynamicViewnum() {
        return dynamicViewnum;
    }

    public void setDynamicViewnum(Integer dynamicViewnum) {
        this.dynamicViewnum = dynamicViewnum;
    }
}