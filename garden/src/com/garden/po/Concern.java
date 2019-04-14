package com.garden.po;

public class Concern {
    private String userId;

    private String userConcerid;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserConcerid() {
        return userConcerid;
    }

    public void setUserConcerid(String userConcerid) {
        this.userConcerid = userConcerid == null ? null : userConcerid.trim();
    }
}