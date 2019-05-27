package com.travel.pojo;

import java.io.Serializable;

public class Airport implements Serializable {
    private Integer airportId;

    private Integer cityId;

    private String airportName;

    private Float airportDistance;

    private String airportDescr;

    private Integer aircompanyIntdescr;

    private String aircompanyVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getAirportId() {
        return airportId;
    }

    public void setAirportId(Integer airportId) {
        this.airportId = airportId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName == null ? null : airportName.trim();
    }

    public Float getAirportDistance() {
        return airportDistance;
    }

    public void setAirportDistance(Float airportDistance) {
        this.airportDistance = airportDistance;
    }

    public String getAirportDescr() {
        return airportDescr;
    }

    public void setAirportDescr(String airportDescr) {
        this.airportDescr = airportDescr == null ? null : airportDescr.trim();
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