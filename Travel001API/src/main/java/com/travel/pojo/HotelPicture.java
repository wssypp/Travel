package com.travel.pojo;

import java.io.Serializable;

public class HotelPicture implements Serializable {
    private Integer hotelPictureId;

    private Integer hotelGuestroomId;

    private String hotelPicturePath;

    private Integer spotIntdescr;

    private String spotVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getHotelPictureId() {
        return hotelPictureId;
    }

    public void setHotelPictureId(Integer hotelPictureId) {
        this.hotelPictureId = hotelPictureId;
    }

    public Integer getHotelGuestroomId() {
        return hotelGuestroomId;
    }

    public void setHotelGuestroomId(Integer hotelGuestroomId) {
        this.hotelGuestroomId = hotelGuestroomId;
    }

    public String getHotelPicturePath() {
        return hotelPicturePath;
    }

    public void setHotelPicturePath(String hotelPicturePath) {
        this.hotelPicturePath = hotelPicturePath == null ? null : hotelPicturePath.trim();
    }

    public Integer getSpotIntdescr() {
        return spotIntdescr;
    }

    public void setSpotIntdescr(Integer spotIntdescr) {
        this.spotIntdescr = spotIntdescr;
    }

    public String getSpotVardescr() {
        return spotVardescr;
    }

    public void setSpotVardescr(String spotVardescr) {
        this.spotVardescr = spotVardescr == null ? null : spotVardescr.trim();
    }
}