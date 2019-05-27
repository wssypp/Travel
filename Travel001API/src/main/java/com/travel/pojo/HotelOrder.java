package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class HotelOrder implements Serializable {
    private Integer hotelOrderId;

    private Date hotelOrderTime;

    private Date hotelOrderChecktime;

    private Date hotelOrderLeavetime;

    private Integer hotelOrderNumber;

    private Integer usersId;

    private Integer hotelId;

    private Double hotelOrderTotalprice;

    private Integer scenicCommentIntdescr;

    private String scenicCommentVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getHotelOrderId() {
        return hotelOrderId;
    }

    public void setHotelOrderId(Integer hotelOrderId) {
        this.hotelOrderId = hotelOrderId;
    }

    public Date getHotelOrderTime() {
        return hotelOrderTime;
    }

    public void setHotelOrderTime(Date hotelOrderTime) {
        this.hotelOrderTime = hotelOrderTime;
    }

    public Date getHotelOrderChecktime() {
        return hotelOrderChecktime;
    }

    public void setHotelOrderChecktime(Date hotelOrderChecktime) {
        this.hotelOrderChecktime = hotelOrderChecktime;
    }

    public Date getHotelOrderLeavetime() {
        return hotelOrderLeavetime;
    }

    public void setHotelOrderLeavetime(Date hotelOrderLeavetime) {
        this.hotelOrderLeavetime = hotelOrderLeavetime;
    }

    public Integer getHotelOrderNumber() {
        return hotelOrderNumber;
    }

    public void setHotelOrderNumber(Integer hotelOrderNumber) {
        this.hotelOrderNumber = hotelOrderNumber;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Double getHotelOrderTotalprice() {
        return hotelOrderTotalprice;
    }

    public void setHotelOrderTotalprice(Double hotelOrderTotalprice) {
        this.hotelOrderTotalprice = hotelOrderTotalprice;
    }

    public Integer getScenicCommentIntdescr() {
        return scenicCommentIntdescr;
    }

    public void setScenicCommentIntdescr(Integer scenicCommentIntdescr) {
        this.scenicCommentIntdescr = scenicCommentIntdescr;
    }

    public String getScenicCommentVardescr() {
        return scenicCommentVardescr;
    }

    public void setScenicCommentVardescr(String scenicCommentVardescr) {
        this.scenicCommentVardescr = scenicCommentVardescr == null ? null : scenicCommentVardescr.trim();
    }
}