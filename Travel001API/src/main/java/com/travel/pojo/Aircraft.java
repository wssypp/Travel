package com.travel.pojo;

import java.io.Serializable;

public class Aircraft implements Serializable {
    private Integer aircraftId;

    private Integer aircompanyId;

    private String aircraftName;

    private String aircraftType;

    private Integer aircraftIntdescr;

    private String aircraftVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Integer aircraftId) {
        this.aircraftId = aircraftId;
    }

    public Integer getAircompanyId() {
        return aircompanyId;
    }

    public void setAircompanyId(Integer aircompanyId) {
        this.aircompanyId = aircompanyId;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName == null ? null : aircraftName.trim();
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType == null ? null : aircraftType.trim();
    }

    public Integer getAircraftIntdescr() {
        return aircraftIntdescr;
    }

    public void setAircraftIntdescr(Integer aircraftIntdescr) {
        this.aircraftIntdescr = aircraftIntdescr;
    }

    public String getAircraftVardescr() {
        return aircraftVardescr;
    }

    public void setAircraftVardescr(String aircraftVardescr) {
        this.aircraftVardescr = aircraftVardescr == null ? null : aircraftVardescr.trim();
    }
}