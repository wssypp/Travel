package com.travel.pojo;

import java.io.Serializable;

public class Spot implements Serializable {
    private Integer spotId;

    private String spotName;

    private Integer scenicId;

    private Integer spotDescr;

    private String bankTelephone;

    private Integer spotIntdescr;

    private String spotVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getSpotId() {
        return spotId;
    }

    public void setSpotId(Integer spotId) {
        this.spotId = spotId;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName == null ? null : spotName.trim();
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Integer getSpotDescr() {
        return spotDescr;
    }

    public void setSpotDescr(Integer spotDescr) {
        this.spotDescr = spotDescr;
    }

    public String getBankTelephone() {
        return bankTelephone;
    }

    public void setBankTelephone(String bankTelephone) {
        this.bankTelephone = bankTelephone == null ? null : bankTelephone.trim();
    }

    public Integer getSpotIntdescr() {
        return spotIntdescr;
    }

    public void setSpotIntdescr(Integer spotIntdescr) {
        this.spotIntdescr = spotIntdescr;
    }

    public String getSpotVardescr() {
        return spotVardescr;
    }

    public void setSpotVardescr(String spotVardescr) {
        this.spotVardescr = spotVardescr == null ? null : spotVardescr.trim();
    }
}