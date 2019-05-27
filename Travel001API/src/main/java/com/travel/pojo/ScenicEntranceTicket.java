package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class ScenicEntranceTicket implements Serializable {
    private Integer scenicEntranceTicketId;

    private String scenicEntranceTicketName;

    private Date scenicEntranceTicketTime;

    private String scenicEntranceTicketNotice;

    private Integer scenicEntranceTicketTypeId;

    private Integer scenicOrderId;

    private Integer scenicEntranceTicketCount;

    private String scenicEntranceTicketImg;

    private Integer scenicEntranceTicketIntdescr;

    private String scenicEntranceTicketVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getScenicEntranceTicketId() {
        return scenicEntranceTicketId;
    }

    public void setScenicEntranceTicketId(Integer scenicEntranceTicketId) {
        this.scenicEntranceTicketId = scenicEntranceTicketId;
    }

    public String getScenicEntranceTicketName() {
        return scenicEntranceTicketName;
    }

    public void setScenicEntranceTicketName(String scenicEntranceTicketName) {
        this.scenicEntranceTicketName = scenicEntranceTicketName == null ? null : scenicEntranceTicketName.trim();
    }

    public Date getScenicEntranceTicketTime() {
        return scenicEntranceTicketTime;
    }

    public void setScenicEntranceTicketTime(Date scenicEntranceTicketTime) {
        this.scenicEntranceTicketTime = scenicEntranceTicketTime;
    }

    public String getScenicEntranceTicketNotice() {
        return scenicEntranceTicketNotice;
    }

    public void setScenicEntranceTicketNotice(String scenicEntranceTicketNotice) {
        this.scenicEntranceTicketNotice = scenicEntranceTicketNotice == null ? null : scenicEntranceTicketNotice.trim();
    }

    public Integer getScenicEntranceTicketTypeId() {
        return scenicEntranceTicketTypeId;
    }

    public void setScenicEntranceTicketTypeId(Integer scenicEntranceTicketTypeId) {
        this.scenicEntranceTicketTypeId = scenicEntranceTicketTypeId;
    }

    public Integer getScenicOrderId() {
        return scenicOrderId;
    }

    public void setScenicOrderId(Integer scenicOrderId) {
        this.scenicOrderId = scenicOrderId;
    }

    public Integer getScenicEntranceTicketCount() {
        return scenicEntranceTicketCount;
    }

    public void setScenicEntranceTicketCount(Integer scenicEntranceTicketCount) {
        this.scenicEntranceTicketCount = scenicEntranceTicketCount;
    }

    public String getScenicEntranceTicketImg() {
        return scenicEntranceTicketImg;
    }

    public void setScenicEntranceTicketImg(String scenicEntranceTicketImg) {
        this.scenicEntranceTicketImg = scenicEntranceTicketImg == null ? null : scenicEntranceTicketImg.trim();
    }

    public Integer getScenicEntranceTicketIntdescr() {
        return scenicEntranceTicketIntdescr;
    }

    public void setScenicEntranceTicketIntdescr(Integer scenicEntranceTicketIntdescr) {
        this.scenicEntranceTicketIntdescr = scenicEntranceTicketIntdescr;
    }

    public String getScenicEntranceTicketVardescr() {
        return scenicEntranceTicketVardescr;
    }

    public void setScenicEntranceTicketVardescr(String scenicEntranceTicketVardescr) {
        this.scenicEntranceTicketVardescr = scenicEntranceTicketVardescr == null ? null : scenicEntranceTicketVardescr.trim();
    }
}