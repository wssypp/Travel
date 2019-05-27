package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class Airticketorder implements Serializable {
    private Integer airticketorderId;

    private Integer usersId;

    private Date airticketorderDate;

    private Integer flightinfoId;

    private Double aircraftinfoPrice;

    private String aircraftinfoCangwei;

    private Integer airpersonId;

    private String airticketorderPerson;

    private String airticketorderPhone;

    private String airticketorderIntdescr;

    private Integer airticketorderVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getAirticketorderId() {
        return airticketorderId;
    }

    public void setAirticketorderId(Integer airticketorderId) {
        this.airticketorderId = airticketorderId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Date getAirticketorderDate() {
        return airticketorderDate;
    }

    public void setAirticketorderDate(Date airticketorderDate) {
        this.airticketorderDate = airticketorderDate;
    }

    public Integer getFlightinfoId() {
        return flightinfoId;
    }

    public void setFlightinfoId(Integer flightinfoId) {
        this.flightinfoId = flightinfoId;
    }

    public Double getAircraftinfoPrice() {
        return aircraftinfoPrice;
    }

    public void setAircraftinfoPrice(Double aircraftinfoPrice) {
        this.aircraftinfoPrice = aircraftinfoPrice;
    }

    public String getAircraftinfoCangwei() {
        return aircraftinfoCangwei;
    }

    public void setAircraftinfoCangwei(String aircraftinfoCangwei) {
        this.aircraftinfoCangwei = aircraftinfoCangwei == null ? null : aircraftinfoCangwei.trim();
    }

    public Integer getAirpersonId() {
        return airpersonId;
    }

    public void setAirpersonId(Integer airpersonId) {
        this.airpersonId = airpersonId;
    }

    public String getAirticketorderPerson() {
        return airticketorderPerson;
    }

    public void setAirticketorderPerson(String airticketorderPerson) {
        this.airticketorderPerson = airticketorderPerson == null ? null : airticketorderPerson.trim();
    }

    public String getAirticketorderPhone() {
        return airticketorderPhone;
    }

    public void setAirticketorderPhone(String airticketorderPhone) {
        this.airticketorderPhone = airticketorderPhone == null ? null : airticketorderPhone.trim();
    }

    public String getAirticketorderIntdescr() {
        return airticketorderIntdescr;
    }

    public void setAirticketorderIntdescr(String airticketorderIntdescr) {
        this.airticketorderIntdescr = airticketorderIntdescr == null ? null : airticketorderIntdescr.trim();
    }

    public Integer getAirticketorderVardescr() {
        return airticketorderVardescr;
    }

    public void setAirticketorderVardescr(Integer airticketorderVardescr) {
        this.airticketorderVardescr = airticketorderVardescr;
    }
}