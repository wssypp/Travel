package com.travel.pojo;

import java.io.Serializable;

public class Station implements Serializable {
    private Integer stationId;

    private Integer countryId;

    private String stationName;

    private String belongType;

    private Integer cityId;

    private Integer provinceId;

    private Integer countyId;

    private String stationDetailedaddress;

    private String stationTelephone;

    private String stationImg;

    private Integer stationIntdescr;

    private String stationlVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getBelongType() {
        return belongType;
    }

    public void setBelongType(String belongType) {
        this.belongType = belongType == null ? null : belongType.trim();
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public String getStationDetailedaddress() {
        return stationDetailedaddress;
    }

    public void setStationDetailedaddress(String stationDetailedaddress) {
        this.stationDetailedaddress = stationDetailedaddress == null ? null : stationDetailedaddress.trim();
    }

    public String getStationTelephone() {
        return stationTelephone;
    }

    public void setStationTelephone(String stationTelephone) {
        this.stationTelephone = stationTelephone == null ? null : stationTelephone.trim();
    }

    public String getStationImg() {
        return stationImg;
    }

    public void setStationImg(String stationImg) {
        this.stationImg = stationImg == null ? null : stationImg.trim();
    }

    public Integer getStationIntdescr() {
        return stationIntdescr;
    }

    public void setStationIntdescr(Integer stationIntdescr) {
        this.stationIntdescr = stationIntdescr;
    }

    public String getStationlVardescr() {
        return stationlVardescr;
    }

    public void setStationlVardescr(String stationlVardescr) {
        this.stationlVardescr = stationlVardescr == null ? null : stationlVardescr.trim();
    }
}