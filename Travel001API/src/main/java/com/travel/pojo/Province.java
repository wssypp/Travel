package com.travel.pojo;

import java.io.Serializable;

public class Province implements Serializable {
    private Integer provinceId;

    private String provinceName;

    private Integer countryId;

    private Integer provinceIntdescr;

    private String provinceVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getProvinceIntdescr() {
        return provinceIntdescr;
    }

    public void setProvinceIntdescr(Integer provinceIntdescr) {
        this.provinceIntdescr = provinceIntdescr;
    }

    public String getProvinceVardescr() {
        return provinceVardescr;
    }

    public void setProvinceVardescr(String provinceVardescr) {
        this.provinceVardescr = provinceVardescr == null ? null : provinceVardescr.trim();
    }
}