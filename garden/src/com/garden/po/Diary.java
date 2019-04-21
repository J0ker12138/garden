package com.garden.po;

public class Diary {
    private Integer diaryId;

    private String diaryUserid;

    private String diaryPlantname;

    private String diarySpace;

    private String diaryMethod;

    private String diaryCity;

    private String diarySun;

    private String diaryWater;

    private String diaryTemperature;

    private String diarySoil;

    private String diaryTime;

    private String diaryImage;

    private Integer diaryPointnum;

    private String diaryFlowering;

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public String getDiaryUserid() {
        return diaryUserid;
    }

    public void setDiaryUserid(String diaryUserid) {
        this.diaryUserid = diaryUserid == null ? null : diaryUserid.trim();
    }

    public String getDiaryPlantname() {
        return diaryPlantname;
    }

    public void setDiaryPlantname(String diaryPlantname) {
        this.diaryPlantname = diaryPlantname == null ? null : diaryPlantname.trim();
    }

    public String getDiarySpace() {
        return diarySpace;
    }

    public void setDiarySpace(String diarySpace) {
        this.diarySpace = diarySpace == null ? null : diarySpace.trim();
    }

    public String getDiaryMethod() {
        return diaryMethod;
    }

    public void setDiaryMethod(String diaryMethod) {
        this.diaryMethod = diaryMethod == null ? null : diaryMethod.trim();
    }

    public String getDiaryCity() {
        return diaryCity;
    }

    public void setDiaryCity(String diaryCity) {
        this.diaryCity = diaryCity == null ? null : diaryCity.trim();
    }

    public String getDiarySun() {
        return diarySun;
    }

    public void setDiarySun(String diarySun) {
        this.diarySun = diarySun == null ? null : diarySun.trim();
    }

    public String getDiaryWater() {
        return diaryWater;
    }

    public void setDiaryWater(String diaryWater) {
        this.diaryWater = diaryWater == null ? null : diaryWater.trim();
    }

    public String getDiaryTemperature() {
        return diaryTemperature;
    }

    public void setDiaryTemperature(String diaryTemperature) {
        this.diaryTemperature = diaryTemperature == null ? null : diaryTemperature.trim();
    }

    public String getDiarySoil() {
        return diarySoil;
    }

    public void setDiarySoil(String diarySoil) {
        this.diarySoil = diarySoil == null ? null : diarySoil.trim();
    }

    public String getDiaryTime() {
        return diaryTime;
    }

    public void setDiaryTime(String diaryTime) {
        this.diaryTime = diaryTime == null ? null : diaryTime.trim();
    }

    public String getDiaryImage() {
        return diaryImage;
    }

    public void setDiaryImage(String diaryImage) {
        this.diaryImage = diaryImage == null ? null : diaryImage.trim();
    }

    public Integer getDiaryPointnum() {
        return diaryPointnum;
    }

    public void setDiaryPointnum(Integer diaryPointnum) {
        this.diaryPointnum = diaryPointnum;
    }

    public String getDiaryFlowering() {
        return diaryFlowering;
    }

    public void setDiaryFlowering(String diaryFlowering) {
        this.diaryFlowering = diaryFlowering == null ? null : diaryFlowering.trim();
    }
}