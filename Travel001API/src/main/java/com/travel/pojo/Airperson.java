package com.travel.pojo;

import java.io.Serializable;

public class Airperson implements Serializable {
    private Integer airpersonId;

    private Integer airticketorderId;

    private String airpersonType;

    private String identifyType;

    private String identifyCode;

    private Integer airpersonIntdescr;

    private String airpersonVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getAirpersonId() {
        return airpersonId;
    }

    public void setAirpersonId(Integer airpersonId) {
        this.airpersonId = airpersonId;
    }

    public Integer getAirticketorderId() {
        return airticketorderId;
    }

    public void setAirticketorderId(Integer airticketorderId) {
        this.airticketorderId = airticketorderId;
    }

    public String getAirpersonType() {
        return airpersonType;
    }

    public void setAirpersonType(String airpersonType) {
        this.airpersonType = airpersonType == null ? null : airpersonType.trim();
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType == null ? null : identifyType.trim();
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode == null ? null : identifyCode.trim();
    }

    public Integer getAirpersonIntdescr() {
        return airpersonIntdescr;
    }

    public void setAirpersonIntdescr(Integer airpersonIntdescr) {
        this.airpersonIntdescr = airpersonIntdescr;
    }

    public String getAirpersonVardescr() {
        return airpersonVardescr;
    }

    public void setAirpersonVardescr(String airpersonVardescr) {
        this.airpersonVardescr = airpersonVardescr == null ? null : airpersonVardescr.trim();
    }
}