package com.travel.pojo;

import java.io.Serializable;

public class Country implements Serializable {
    private Integer countryId;

    private String countryChinesename;

    private String countryEnglishname;

    private String countryContinent;

    private String countryFlag;

    private Integer countryIntdescr;

    private String countryVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryChinesename() {
        return countryChinesename;
    }

    public void setCountryChinesename(String countryChinesename) {
        this.countryChinesename = countryChinesename == null ? null : countryChinesename.trim();
    }

    public String getCountryEnglishname() {
        return countryEnglishname;
    }

    public void setCountryEnglishname(String countryEnglishname) {
        this.countryEnglishname = countryEnglishname == null ? null : countryEnglishname.trim();
    }

    public String getCountryContinent() {
        return countryContinent;
    }

    public void setCountryContinent(String countryContinent) {
        this.countryContinent = countryContinent == null ? null : countryContinent.trim();
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag == null ? null : countryFlag.trim();
    }

    public Integer getCountryIntdescr() {
        return countryIntdescr;
    }

    public void setCountryIntdescr(Integer countryIntdescr) {
        this.countryIntdescr = countryIntdescr;
    }

    public String getCountryVardescr() {
        return countryVardescr;
    }

    public void setCountryVardescr(String countryVardescr) {
        this.countryVardescr = countryVardescr == null ? null : countryVardescr.trim();
    }
}