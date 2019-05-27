package com.travel.pojo;

import java.io.Serializable;

public class HotelService implements Serializable {
    private Integer hotelServiceId;

    private String hotelServiceName;

    private String hotelServiceType;

    private String hotelPicturePath;

    private Integer hotelId;

    private Integer hotelGuestroomIntdescr;

    private String hotelGuestroomVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getHotelServiceId() {
        return hotelServiceId;
    }

    public void setHotelServiceId(Integer hotelServiceId) {
        this.hotelServiceId = hotelServiceId;
    }

    public String getHotelServiceName() {
        return hotelServiceName;
    }

    public void setHotelServiceName(String hotelServiceName) {
        this.hotelServiceName = hotelServiceName == null ? null : hotelServiceName.trim();
    }

    public String getHotelServiceType() {
        return hotelServiceType;
    }

    public void setHotelServiceType(String hotelServiceType) {
        this.hotelServiceType = hotelServiceType == null ? null : hotelServiceType.trim();
    }

    public String getHotelPicturePath() {
        return hotelPicturePath;
    }

    public void setHotelPicturePath(String hotelPicturePath) {
        this.hotelPicturePath = hotelPicturePath == null ? null : hotelPicturePath.trim();
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