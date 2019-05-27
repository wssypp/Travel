package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class ScenicComment implements Serializable {
    private Integer scenicCommentId;

    private Date scenicCommentTime;

    private String scenicCommentImg;

    private String scenicCommentContent;

    private Integer scenicCommentLike;

    private String scenicCommentType;

    private Integer usersId;

    private Integer scenicId;

    private Integer scenicCommentIntdescr;

    private String scenicCommentVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getScenicCommentId() {
        return scenicCommentId;
    }

    public void setScenicCommentId(Integer scenicCommentId) {
        this.scenicCommentId = scenicCommentId;
    }

    public Date getScenicCommentTime() {
        return scenicCommentTime;
    }

    public void setScenicCommentTime(Date scenicCommentTime) {
        this.scenicCommentTime = scenicCommentTime;
    }

    public String getScenicCommentImg() {
        return scenicCommentImg;
    }

    public void setScenicCommentImg(String scenicCommentImg) {
        this.scenicCommentImg = scenicCommentImg == null ? null : scenicCommentImg.trim();
    }

    public String getScenicCommentContent() {
        return scenicCommentContent;
    }

    public void setScenicCommentContent(String scenicCommentContent) {
        this.scenicCommentContent = scenicCommentContent == null ? null : scenicCommentContent.trim();
    }

    public Integer getScenicCommentLike() {
        return scenicCommentLike;
    }

    public void setScenicCommentLike(Integer scenicCommentLike) {
        this.scenicCommentLike = scenicCommentLike;
    }

    public String getScenicCommentType() {
        return scenicCommentType;
    }

    public void setScenicCommentType(String scenicCommentType) {
        this.scenicCommentType = scenicCommentType == null ? null : scenicCommentType.trim();
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
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