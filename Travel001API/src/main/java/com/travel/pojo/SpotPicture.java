package com.travel.pojo;

import java.io.Serializable;

public class SpotPicture implements Serializable {
    private Integer spotPictureId;

    private String spotPicturePath;

    private Integer spotPictureIntdescr;

    private String spotPictureVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getSpotPictureId() {
        return spotPictureId;
    }

    public void setSpotPictureId(Integer spotPictureId) {
        this.spotPictureId = spotPictureId;
    }

    public String getSpotPicturePath() {
        return spotPicturePath;
    }

    public void setSpotPicturePath(String spotPicturePath) {
        this.spotPicturePath = spotPicturePath == null ? null : spotPicturePath.trim();
    }

    public Integer getSpotPictureIntdescr() {
        return spotPictureIntdescr;
    }

    public void setSpotPictureIntdescr(Integer spotPictureIntdescr) {
        this.spotPictureIntdescr = spotPictureIntdescr;
    }

    public String getSpotPictureVardescr() {
        return spotPictureVardescr;
    }

    public void setSpotPictureVardescr(String spotPictureVardescr) {
        this.spotPictureVardescr = spotPictureVardescr == null ? null : spotPictureVardescr.trim();
    }
}