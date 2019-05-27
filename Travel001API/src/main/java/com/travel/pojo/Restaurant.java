package com.travel.pojo;

import java.io.Serializable;

public class Restaurant implements Serializable {
    private Integer restaurantId;

    private String restaurantName;

    private String belongType;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private Integer countryId;

    private String restaurantDetailedaddress;

    private String restaurantkTelephone;

    private String restaurantImg;

    private Integer restaurantIntdescr;

    private String restaurantVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName == null ? null : restaurantName.trim();
    }

    public String getBelongType() {
        return belongType;
    }

    public void setBelongType(String belongType) {
        this.belongType = belongType == null ? null : belongType.trim();
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

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getRestaurantDetailedaddress() {
        return restaurantDetailedaddress;
    }

    public void setRestaurantDetailedaddress(String restaurantDetailedaddress) {
        this.restaurantDetailedaddress = restaurantDetailedaddress == null ? null : restaurantDetailedaddress.trim();
    }

    public String getRestaurantkTelephone() {
        return restaurantkTelephone;
    }

    public void setRestaurantkTelephone(String restaurantkTelephone) {
        this.restaurantkTelephone = restaurantkTelephone == null ? null : restaurantkTelephone.trim();
    }

    public String getRestaurantImg() {
        return restaurantImg;
    }

    public void setRestaurantImg(String restaurantImg) {
        this.restaurantImg = restaurantImg == null ? null : restaurantImg.trim();
    }

    public Integer getRestaurantIntdescr() {
        return restaurantIntdescr;
    }

    public void setRestaurantIntdescr(Integer restaurantIntdescr) {
        this.restaurantIntdescr = restaurantIntdescr;
    }

    public String getRestaurantVardescr() {
        return restaurantVardescr;
    }

    public void setRestaurantVardescr(String restaurantVardescr) {
        this.restaurantVardescr = restaurantVardescr == null ? null : restaurantVardescr.trim();
    }
}