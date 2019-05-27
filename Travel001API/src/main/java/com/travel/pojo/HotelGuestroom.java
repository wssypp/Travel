package com.travel.pojo;

import java.io.Serializable;

public class HotelGuestroom implements Serializable {
    private Integer hotelGuestroomId;

    private String hotelGuestroomName;

    private String hotelGuestroomStatus;

    private Integer hotelId;

    private Double hotelGuestroomPrice;

    private String hotelGuestroomDescr;

    private Integer hotelGuestroomIntdescr;

    private String hotelGuestroomVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getHotelGuestroomId() {
        return hotelGuestroomId;
    }

    public void setHotelGuestroomId(Integer hotelGuestroomId) {
        this.hotelGuestroomId = hotelGuestroomId;
    }

    public String getHotelGuestroomName() {
        return hotelGuestroomName;
    }

    public void setHotelGuestroomName(String hotelGuestroomName) {
        this.hotelGuestroomName = hotelGuestroomName == null ? null : hotelGuestroomName.trim();
    }

    public String getHotelGuestroomStatus() {
        return hotelGuestroomStatus;
    }

    public void setHotelGuestroomStatus(String hotelGuestroomStatus) {
        this.hotelGuestroomStatus = hotelGuestroomStatus == null ? null : hotelGuestroomStatus.trim();
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Double getHotelGuestroomPrice() {
        return hotelGuestroomPrice;
    }

    public void setHotelGuestroomPrice(Double hotelGuestroomPrice) {
        this.hotelGuestroomPrice = hotelGuestroomPrice;
    }

    public String getHotelGuestroomDescr() {
        return hotelGuestroomDescr;
    }

    public void setHotelGuestroomDescr(String hotelGuestroomDescr) {
        this.hotelGuestroomDescr = hotelGuestroomDescr == null ? null : hotelGuestroomDescr.trim();
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