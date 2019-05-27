package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class HotelComment implements Serializable {
    private Integer hotelCommentId;

    private String hotelCommenttContent;

    private Date hotelCommentTime;

    private String hotelCommentImg;

    private Integer hotelCommentLike;

    private Integer usersId;

    private Integer hotelId;

    private Double hotelCommentScore;

    private Integer scenicCommentIntdescr;

    private String scenicCommentVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getHotelCommentId() {
        return hotelCommentId;
    }

    public void setHotelCommentId(Integer hotelCommentId) {
        this.hotelCommentId = hotelCommentId;
    }

    public String getHotelCommenttContent() {
        return hotelCommenttContent;
    }

    public void setHotelCommenttContent(String hotelCommenttContent) {
        this.hotelCommenttContent = hotelCommenttContent == null ? null : hotelCommenttContent.trim();
    }

    public Date getHotelCommentTime() {
        return hotelCommentTime;
    }

    public void setHotelCommentTime(Date hotelCommentTime) {
        this.hotelCommentTime = hotelCommentTime;
    }

    public String getHotelCommentImg() {
        return hotelCommentImg;
    }

    public void setHotelCommentImg(String hotelCommentImg) {
        this.hotelCommentImg = hotelCommentImg == null ? null : hotelCommentImg.trim();
    }

    public Integer getHotelCommentLike() {
        return hotelCommentLike;
    }

    public void setHotelCommentLike(Integer hotelCommentLike) {
        this.hotelCommentLike = hotelCommentLike;
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

    public Double getHotelCommentScore() {
        return hotelCommentScore;
    }

    public void setHotelCommentScore(Double hotelCommentScore) {
        this.hotelCommentScore = hotelCommentScore;
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