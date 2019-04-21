package com.garden.po;

public class Plant {
    private Integer plantId;

    private String plantName;

    private String plantMethod;

    private String plantTimes;

    private String plantOthername;

    private String plantImage;

    private String plantDescription;

    private String plantJie;

    private String plantMu;

    private String plantKe;

    private String plantShu;

    private String plantZhong;

    private String plantType;

    private String plantFlowering;

    public Integer getPlantId() {
        return plantId;
    }

    public void setPlantId(Integer plantId) {
        this.plantId = plantId;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName == null ? null : plantName.trim();
    }

    public String getPlantMethod() {
        return plantMethod;
    }

    public void setPlantMethod(String plantMethod) {
        this.plantMethod = plantMethod == null ? null : plantMethod.trim();
    }

    public String getPlantTimes() {
        return plantTimes;
    }

    public void setPlantTimes(String plantTimes) {
        this.plantTimes = plantTimes == null ? null : plantTimes.trim();
    }

    public String getPlantOthername() {
        return plantOthername;
    }

    public void setPlantOthername(String plantOthername) {
        this.plantOthername = plantOthername == null ? null : plantOthername.trim();
    }

    public String getPlantImage() {
        return plantImage;
    }

    public void setPlantImage(String plantImage) {
        this.plantImage = plantImage == null ? null : plantImage.trim();
    }

    public String getPlantDescription() {
        return plantDescription;
    }

    public void setPlantDescription(String plantDescription) {
        this.plantDescription = plantDescription == null ? null : plantDescription.trim();
    }

    public String getPlantJie() {
        return plantJie;
    }

    public void setPlantJie(String plantJie) {
        this.plantJie = plantJie == null ? null : plantJie.trim();
    }

    public String getPlantMu() {
        return plantMu;
    }

    public void setPlantMu(String plantMu) {
        this.plantMu = plantMu == null ? null : plantMu.trim();
    }

    public String getPlantKe() {
        return plantKe;
    }

    public void setPlantKe(String plantKe) {
        this.plantKe = plantKe == null ? null : plantKe.trim();
    }

    public String getPlantShu() {
        return plantShu;
    }

    public void setPlantShu(String plantShu) {
        this.plantShu = plantShu == null ? null : plantShu.trim();
    }

    public String getPlantZhong() {
        return plantZhong;
    }

    public void setPlantZhong(String plantZhong) {
        this.plantZhong = plantZhong == null ? null : plantZhong.trim();
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType == null ? null : plantType.trim();
    }

    public String getPlantFlowering() {
        return plantFlowering;
    }

    public void setPlantFlowering(String plantFlowering) {
        this.plantFlowering = plantFlowering == null ? null : plantFlowering.trim();
    }
}