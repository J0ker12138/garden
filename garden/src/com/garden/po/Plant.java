package com.garden.po;

public class Plant {
    private Integer plantId;

    private String plantName;

    private String plantMethod;

    private String plantTimes;

    private String plantFlowering;

    private String plantOthername;

    private String plantImage;

    private String plantDescription;

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

    public String getPlantFlowering() {
        return plantFlowering;
    }

    public void setPlantFlowering(String plantFlowering) {
        this.plantFlowering = plantFlowering == null ? null : plantFlowering.trim();
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
}