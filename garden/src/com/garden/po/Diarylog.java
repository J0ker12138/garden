package com.garden.po;

import java.util.Date;

public class Diarylog {
    private Integer logId;

    private Integer logDiaryid;

    private Integer logPointnum;

    private Date logDate;

    private String logImage;

    private String logDescription;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getLogDiaryid() {
        return logDiaryid;
    }

    public void setLogDiaryid(Integer logDiaryid) {
        this.logDiaryid = logDiaryid;
    }

    public Integer getLogPointnum() {
        return logPointnum;
    }

    public void setLogPointnum(Integer logPointnum) {
        this.logPointnum = logPointnum;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public String getLogImage() {
        return logImage;
    }

    public void setLogImage(String logImage) {
        this.logImage = logImage == null ? null : logImage.trim();
    }

    public String getLogDescription() {
        return logDescription;
    }

    public void setLogDescription(String logDescription) {
        this.logDescription = logDescription == null ? null : logDescription.trim();
    }
}