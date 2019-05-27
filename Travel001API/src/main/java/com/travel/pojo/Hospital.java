package com.travel.pojo;

import java.io.Serializable;

public class Hospital implements Serializable {
    private Integer hospitalId;

    private String hospitalName;

    private String belongType;

    private Integer countryId;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private String hospitalDetailedaddress;

    private String hospitalTelephone;

    private String hospitalImg;

    private Integer hospitalIntdescr;

    private String hospitalVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getBelongType() {
        return belongType;
    }

    public void setBelongType(String belongType) {
        this.belongType = belongType == null ? null : belongType.trim();
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public String getHospitalDetailedaddress() {
        return hospitalDetailedaddress;
    }

    public void setHospitalDetailedaddress(String hospitalDetailedaddress) {
        this.hospitalDetailedaddress = hospitalDetailedaddress == null ? null : hospitalDetailedaddress.trim();
    }

    public String getHospitalTelephone() {
        return hospitalTelephone;
    }

    public void setHospitalTelephone(String hospitalTelephone) {
        this.hospitalTelephone = hospitalTelephone == null ? null : hospitalTelephone.trim();
    }

    public String getHospitalImg() {
        return hospitalImg;
    }

    public void setHospitalImg(String hospitalImg) {
        this.hospitalImg = hospitalImg == null ? null : hospitalImg.trim();
    }

    public Integer getHospitalIntdescr() {
        return hospitalIntdescr;
    }

    public void setHospitalIntdescr(Integer hospitalIntdescr) {
        this.hospitalIntdescr = hospitalIntdescr;
    }

    public String getHospitalVardescr() {
        return hospitalVardescr;
    }

    public void setHospitalVardescr(String hospitalVardescr) {
        this.hospitalVardescr = hospitalVardescr == null ? null : hospitalVardescr.trim();
    }
}