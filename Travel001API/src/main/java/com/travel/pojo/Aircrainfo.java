package com.travel.pojo;

import java.io.Serializable;

public class Aircrainfo implements Serializable {
    private Integer aircrainfoId;

    private Integer aircraftId;

    private String aircraftinfoCangwei;

    private Double aircraftinfoPrice;

    private Integer aircraftinfoIntdescr;

    private String aircraftinfoVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getAircrainfoId() {
        return aircrainfoId;
    }

    public void setAircrainfoId(Integer aircrainfoId) {
        this.aircrainfoId = aircrainfoId;
    }

    public Integer getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Integer aircraftId) {
        this.aircraftId = aircraftId;
    }

    public String getAircraftinfoCangwei() {
        return aircraftinfoCangwei;
    }

    public void setAircraftinfoCangwei(String aircraftinfoCangwei) {
        this.aircraftinfoCangwei = aircraftinfoCangwei == null ? null : aircraftinfoCangwei.trim();
    }

    public Double getAircraftinfoPrice() {
        return aircraftinfoPrice;
    }

    public void setAircraftinfoPrice(Double aircraftinfoPrice) {
        this.aircraftinfoPrice = aircraftinfoPrice;
    }

    public Integer getAircraftinfoIntdescr() {
        return aircraftinfoIntdescr;
    }

    public void setAircraftinfoIntdescr(Integer aircraftinfoIntdescr) {
        this.aircraftinfoIntdescr = aircraftinfoIntdescr;
    }

    public String getAircraftinfoVardescr() {
        return aircraftinfoVardescr;
    }

    public void setAircraftinfoVardescr(String aircraftinfoVardescr) {
        this.aircraftinfoVardescr = aircraftinfoVardescr == null ? null : aircraftinfoVardescr.trim();
    }
}