package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class HotelResponse implements Serializable {
    private Integer hotelResponseId;

    private Date hotelResponseTime;

    private String hotelResponseImg;

    private String hotelResponseContentt;

    private Integer usersId;

    private Integer hotelCommentId;

    private Integer commentResponseIntdescr;

    private String commentResponseVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getHotelResponseId() {
        return hotelResponseId;
    }

    public void setHotelResponseId(Integer hotelResponseId) {
        this.hotelResponseId = hotelResponseId;
    }

    public Date getHotelResponseTime() {
        return hotelResponseTime;
    }

    public void setHotelResponseTime(Date hotelResponseTime) {
        this.hotelResponseTime = hotelResponseTime;
    }

    public String getHotelResponseImg() {
        return hotelResponseImg;
    }

    public void setHotelResponseImg(String hotelResponseImg) {
        this.hotelResponseImg = hotelResponseImg == null ? null : hotelResponseImg.trim();
    }

    public String getHotelResponseContentt() {
        return hotelResponseContentt;
    }

    public void setHotelResponseContentt(String hotelResponseContentt) {
        this.hotelResponseContentt = hotelResponseContentt == null ? null : hotelResponseContentt.trim();
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getHotelCommentId() {
        return hotelCommentId;
    }

    public void setHotelCommentId(Integer hotelCommentId) {
        this.hotelCommentId = hotelCommentId;
    }

    public Integer getCommentResponseIntdescr() {
        return commentResponseIntdescr;
    }

    public void setCommentResponseIntdescr(Integer commentResponseIntdescr) {
        this.commentResponseIntdescr = commentResponseIntdescr;
    }

    public String getCommentResponseVardescr() {
        return commentResponseVardescr;
    }

    public void setCommentResponseVardescr(String commentResponseVardescr) {
        this.commentResponseVardescr = commentResponseVardescr == null ? null : commentResponseVardescr.trim();
    }
}