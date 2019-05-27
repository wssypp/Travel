package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class Flightinfo implements Serializable {
    private Integer flightinfoId;

    private Integer aircompanyId;

    private Integer airplaneId;

    private Integer routeId;

    private Date startflyTime;

    private Date endflyTime;

    private String startflyAirport;

    private String endflyAirport;

    private Double flightinfoPrice;

    private Integer flightinfoIntdescr;

    private String flightinfoVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getFlightinfoId() {
        return flightinfoId;
    }

    public void setFlightinfoId(Integer flightinfoId) {
        this.flightinfoId = flightinfoId;
    }

    public Integer getAircompanyId() {
        return aircompanyId;
    }

    public void setAircompanyId(Integer aircompanyId) {
        this.aircompanyId = aircompanyId;
    }

    public Integer getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(Integer airplaneId) {
        this.airplaneId = airplaneId;
    }

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public Date getStartflyTime() {
        return startflyTime;
    }

    public void setStartflyTime(Date startflyTime) {
        this.startflyTime = startflyTime;
    }

    public Date getEndflyTime() {
        return endflyTime;
    }

    public void setEndflyTime(Date endflyTime) {
        this.endflyTime = endflyTime;
    }

    public String getStartflyAirport() {
        return startflyAirport;
    }

    public void setStartflyAirport(String startflyAirport) {
        this.startflyAirport = startflyAirport == null ? null : startflyAirport.trim();
    }

    public String getEndflyAirport() {
        return endflyAirport;
    }

    public void setEndflyAirport(String endflyAirport) {
        this.endflyAirport = endflyAirport == null ? null : endflyAirport.trim();
    }

    public Double getFlightinfoPrice() {
        return flightinfoPrice;
    }

    public void setFlightinfoPrice(Double flightinfoPrice) {
        this.flightinfoPrice = flightinfoPrice;
    }

    public Integer getFlightinfoIntdescr() {
        return flightinfoIntdescr;
    }

    public void setFlightinfoIntdescr(Integer flightinfoIntdescr) {
        this.flightinfoIntdescr = flightinfoIntdescr;
    }

    public String getFlightinfoVardescr() {
        return flightinfoVardescr;
    }

    public void setFlightinfoVardescr(String flightinfoVardescr) {
        this.flightinfoVardescr = flightinfoVardescr == null ? null : flightinfoVardescr.trim();
    }
}