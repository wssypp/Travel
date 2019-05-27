package com.travel.pojo;

import java.io.Serializable;

public class County implements Serializable {
    private Integer countyId;

    private String countyName;

    private Integer cityId;

    private Integer countyIntdescr;

    private String countyVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName == null ? null : countyName.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountyIntdescr() {
        return countyIntdescr;
    }

    public void setCountyIntdescr(Integer countyIntdescr) {
        this.countyIntdescr = countyIntdescr;
    }

    public String getCountyVardescr() {
        return countyVardescr;
    }

    public void setCountyVardescr(String countyVardescr) {
        this.countyVardescr = countyVardescr == null ? null : countyVardescr.trim();
    }
}