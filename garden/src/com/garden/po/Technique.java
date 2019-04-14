package com.garden.po;

import java.util.Date;

public class Technique {
    private Integer techId;

    private String techName;

    private String techType;

    private String techDescription;

    private String techImage;

    private Integer techPointnum;

    private Date techDate;

    private Integer techViewnum;

    private String techUserid;

    private String techTypetop;

    public Integer getTechId() {
        return techId;
    }

    public void setTechId(Integer techId) {
        this.techId = techId;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName == null ? null : techName.trim();
    }

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType == null ? null : techType.trim();
    }

    public String getTechDescription() {
        return techDescription;
    }

    public void setTechDescription(String techDescription) {
        this.techDescription = techDescription == null ? null : techDescription.trim();
    }

    public String getTechImage() {
        return techImage;
    }

    public void setTechImage(String techImage) {
        this.techImage = techImage == null ? null : techImage.trim();
    }

    public Integer getTechPointnum() {
        return techPointnum;
    }

    public void setTechPointnum(Integer techPointnum) {
        this.techPointnum = techPointnum;
    }

    public Date getTechDate() {
        return techDate;
    }

    public void setTechDate(Date techDate) {
        this.techDate = techDate;
    }

    public Integer getTechViewnum() {
        return techViewnum;
    }

    public void setTechViewnum(Integer techViewnum) {
        this.techViewnum = techViewnum;
    }

    public String getTechUserid() {
        return techUserid;
    }

    public void setTechUserid(String techUserid) {
        this.techUserid = techUserid == null ? null : techUserid.trim();
    }

    public String getTechTypetop() {
        return techTypetop;
    }

    public void setTechTypetop(String techTypetop) {
        this.techTypetop = techTypetop == null ? null : techTypetop.trim();
    }
}