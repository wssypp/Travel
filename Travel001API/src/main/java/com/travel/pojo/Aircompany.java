package com.travel.pojo;

import java.io.Serializable;

public class Aircompany implements Serializable {
    private Integer aircompanyId;

    private String aircompanyName;

    private Integer aircompanyNumber;

    private String aircompanyImg;

    private String hotelTel;

    private Integer countryId;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private String aircompanyDetailedaddress;

    private String aircompanyDescr;

    private Integer aircompanyIntdescr;

    private String aircompanyVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getAircompanyId() {
        return aircompanyId;
    }

    public void setAircompanyId(Integer aircompanyId) {
        this.aircompanyId = aircompanyId;
    }

    public String getAircompanyName() {
        return aircompanyName;
    }

    public void setAircompanyName(String aircompanyName) {
        this.aircompanyName = aircompanyName == null ? null : aircompanyName.trim();
    }

    public Integer getAircompanyNumber() {
        return aircompanyNumber;
    }

    public void setAircompanyNumber(Integer aircompanyNumber) {
        this.aircompanyNumber = aircompanyNumber;
    }

    public String getAircompanyImg() {
        return aircompanyImg;
    }

    public void setAircompanyImg(String aircompanyImg) {
        this.aircompanyImg = aircompanyImg == null ? null : aircompanyImg.trim();
    }

    public String getHotelTel() {
        return hotelTel;
    }

    public void setHotelTel(String hotelTel) {
        this.hotelTel = hotelTel == null ? null : hotelTel.trim();
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

    public String getAircompanyDetailedaddress() {
        return aircompanyDetailedaddress;
    }

    public void setAircompanyDetailedaddress(String aircompanyDetailedaddress) {
        this.aircompanyDetailedaddress = aircompanyDetailedaddress == null ? null : aircompanyDetailedaddress.trim();
    }

    public String getAircompanyDescr() {
        return aircompanyDescr;
    }

    public void setAircompanyDescr(String aircompanyDescr) {
        this.aircompanyDescr = aircompanyDescr == null ? null : aircompanyDescr.trim();
    }

    public Integer getAircompanyIntdescr() {
        return aircompanyIntdescr;
    }

    public void setAircompanyIntdescr(Integer aircompanyIntdescr) {
        this.aircompanyIntdescr = aircompanyIntdescr;
    }

    public String getAircompanyVardescr() {
        return aircompanyVardescr;
    }

    public void setAircompanyVardescr(String aircompanyVardescr) {
        this.aircompanyVardescr = aircompanyVardescr == null ? null : aircompanyVardescr.trim();
    }
}