package com.travel.pojo;

import java.io.Serializable;

public class City implements Serializable {
    private Integer cityId;

    private String cityName;

    private Integer provinceId;

    private Integer cityIntdescr;

    private String cityVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityIntdescr() {
        return cityIntdescr;
    }

    public void setCityIntdescr(Integer cityIntdescr) {
        this.cityIntdescr = cityIntdescr;
    }

    public String getCityVardescr() {
        return cityVardescr;
    }

    public void setCityVardescr(String cityVardescr) {
        this.cityVardescr = cityVardescr == null ? null : cityVardescr.trim();
    }
}