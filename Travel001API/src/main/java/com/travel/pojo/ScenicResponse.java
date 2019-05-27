package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class ScenicResponse implements Serializable {
    private Integer scenicResponseId;

    private Date scenicResponseTime;

    private String scenicResponseImg;

    private String scenicResponseContent;

    private Integer usersId;

    private Integer scenicCommentId;

    private Integer scenicResponseIntdescr;

    private String scenicResponseVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getScenicResponseId() {
        return scenicResponseId;
    }

    public void setScenicResponseId(Integer scenicResponseId) {
        this.scenicResponseId = scenicResponseId;
    }

    public Date getScenicResponseTime() {
        return scenicResponseTime;
    }

    public void setScenicResponseTime(Date scenicResponseTime) {
        this.scenicResponseTime = scenicResponseTime;
    }

    public String getScenicResponseImg() {
        return scenicResponseImg;
    }

    public void setScenicResponseImg(String scenicResponseImg) {
        this.scenicResponseImg = scenicResponseImg == null ? null : scenicResponseImg.trim();
    }

    public String getScenicResponseContent() {
        return scenicResponseContent;
    }

    public void setScenicResponseContent(String scenicResponseContent) {
        this.scenicResponseContent = scenicResponseContent == null ? null : scenicResponseContent.trim();
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getScenicCommentId() {
        return scenicCommentId;
    }

    public void setScenicCommentId(Integer scenicCommentId) {
        this.scenicCommentId = scenicCommentId;
    }

    public Integer getScenicResponseIntdescr() {
        return scenicResponseIntdescr;
    }

    public void setScenicResponseIntdescr(Integer scenicResponseIntdescr) {
        this.scenicResponseIntdescr = scenicResponseIntdescr;
    }

    public String getScenicResponseVardescr() {
        return scenicResponseVardescr;
    }

    public void setScenicResponseVardescr(String scenicResponseVardescr) {
        this.scenicResponseVardescr = scenicResponseVardescr == null ? null : scenicResponseVardescr.trim();
    }
}