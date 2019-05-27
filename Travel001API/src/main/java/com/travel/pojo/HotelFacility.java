package com.travel.pojo;

import java.io.Serializable;

public class HotelFacility implements Serializable {
    private Integer hotelFacilityId;

    private String hotelFacilityName;

    private String hotelFacilityType;

    private Integer hotelId;

    private Integer hotelGuestroomIntdescr;

    private String hotelGuestroomVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getHotelFacilityId() {
        return hotelFacilityId;
    }

    public void setHotelFacilityId(Integer hotelFacilityId) {
        this.hotelFacilityId = hotelFacilityId;
    }

    public String getHotelFacilityName() {
        return hotelFacilityName;
    }

    public void setHotelFacilityName(String hotelFacilityName) {
        this.hotelFacilityName = hotelFacilityName == null ? null : hotelFacilityName.trim();
    }

    public String getHotelFacilityType() {
        return hotelFacilityType;
    }

    public void setHotelFacilityType(String hotelFacilityType) {
        this.hotelFacilityType = hotelFacilityType == null ? null : hotelFacilityType.trim();
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getHotelGuestroomIntdescr() {
        return hotelGuestroomIntdescr;
    }

    public void setHotelGuestroomIntdescr(Integer hotelGuestroomIntdescr) {
        this.hotelGuestroomIntdescr = hotelGuestroomIntdescr;
    }

    public String getHotelGuestroomVardescr() {
        return hotelGuestroomVardescr;
    }

    public void setHotelGuestroomVardescr(String hotelGuestroomVardescr) {
        this.hotelGuestroomVardescr = hotelGuestroomVardescr == null ? null : hotelGuestroomVardescr.trim();
    }
}