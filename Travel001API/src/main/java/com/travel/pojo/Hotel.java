package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class Hotel implements Serializable {
    private Integer hotelId;

    private String hotelName;

    private String belongType;

    private String hotelType;

    private Date hotelRegistetime;

    private Integer countryId;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private String hotelDetailedaddress;

    private String hotelTel;

    private String hotelContact;

    private String hotelImg;

    private Double hotelScore;

    private Integer hotelComment;

    private Integer hotelLive;

    private Integer hotelIntdescr;

    private String hotelVardescr;

    private Float hotelDistance;

    private static final long serialVersionUID = 1L;

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public String getBelongType() {
        return belongType;
    }

    public void setBelongType(String belongType) {
        this.belongType = belongType == null ? null : belongType.trim();
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType == null ? null : hotelType.trim();
    }

    public Date getHotelRegistetime() {
        return hotelRegistetime;
    }

    public void setHotelRegistetime(Date hotelRegistetime) {
        this.hotelRegistetime = hotelRegistetime;
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

    public String getHotelDetailedaddress() {
        return hotelDetailedaddress;
    }

    public void setHotelDetailedaddress(String hotelDetailedaddress) {
        this.hotelDetailedaddress = hotelDetailedaddress == null ? null : hotelDetailedaddress.trim();
    }

    public String getHotelTel() {
        return hotelTel;
    }

    public void setHotelTel(String hotelTel) {
        this.hotelTel = hotelTel == null ? null : hotelTel.trim();
    }

    public String getHotelContact() {
        return hotelContact;
    }

    public void setHotelContact(String hotelContact) {
        this.hotelContact = hotelContact == null ? null : hotelContact.trim();
    }

    public String getHotelImg() {
        return hotelImg;
    }

    public void setHotelImg(String hotelImg) {
        this.hotelImg = hotelImg == null ? null : hotelImg.trim();
    }

    public Double getHotelScore() {
        return hotelScore;
    }

    public void setHotelScore(Double hotelScore) {
        this.hotelScore = hotelScore;
    }

    public Integer getHotelComment() {
        return hotelComment;
    }

    public void setHotelComment(Integer hotelComment) {
        this.hotelComment = hotelComment;
    }

    public Integer getHotelLive() {
        return hotelLive;
    }

    public void setHotelLive(Integer hotelLive) {
        this.hotelLive = hotelLive;
    }

    public Integer getHotelIntdescr() {
        return hotelIntdescr;
    }

    public void setHotelIntdescr(Integer hotelIntdescr) {
        this.hotelIntdescr = hotelIntdescr;
    }

    public String getHotelVardescr() {
        return hotelVardescr;
    }

    public void setHotelVardescr(String hotelVardescr) {
        this.hotelVardescr = hotelVardescr == null ? null : hotelVardescr.trim();
    }

    public Float getHotelDistance() {
        return hotelDistance;
    }

    public void setHotelDistance(Float hotelDistance) {
        this.hotelDistance = hotelDistance;
    }
}