package com.travel.pojo;

import java.io.Serializable;

public class Bank implements Serializable {
    private Integer bankId;

    private String bankName;

    private String belongType;

    private Integer countryId;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private String bankDetailedaddress;

    private String bankTelephone;

    private String bankImg;

    private Integer bankIntdescr;

    private String bankVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
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

    public String getBankDetailedaddress() {
        return bankDetailedaddress;
    }

    public void setBankDetailedaddress(String bankDetailedaddress) {
        this.bankDetailedaddress = bankDetailedaddress == null ? null : bankDetailedaddress.trim();
    }

    public String getBankTelephone() {
        return bankTelephone;
    }

    public void setBankTelephone(String bankTelephone) {
        this.bankTelephone = bankTelephone == null ? null : bankTelephone.trim();
    }

    public String getBankImg() {
        return bankImg;
    }

    public void setBankImg(String bankImg) {
        this.bankImg = bankImg == null ? null : bankImg.trim();
    }

    public Integer getBankIntdescr() {
        return bankIntdescr;
    }

    public void setBankIntdescr(Integer bankIntdescr) {
        this.bankIntdescr = bankIntdescr;
    }

    public String getBankVardescr() {
        return bankVardescr;
    }

    public void setBankVardescr(String bankVardescr) {
        this.bankVardescr = bankVardescr == null ? null : bankVardescr.trim();
    }
}