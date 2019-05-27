package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class ScenicOrder implements Serializable {
    private Integer scenicOrderId;

    private Integer usersId;

    private Integer scenicId;

    private Date scenicOrderSubmittime;

    private Integer scenicOrderNumber;

    private Integer scenicOrderTiceketCount;

    private Double scenicOrderTotalprice;

    private Integer scenicOrderIntdescr;

    private String scenicOrderVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getScenicOrderId() {
        return scenicOrderId;
    }

    public void setScenicOrderId(Integer scenicOrderId) {
        this.scenicOrderId = scenicOrderId;
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

    public Date getScenicOrderSubmittime() {
        return scenicOrderSubmittime;
    }

    public void setScenicOrderSubmittime(Date scenicOrderSubmittime) {
        this.scenicOrderSubmittime = scenicOrderSubmittime;
    }

    public Integer getScenicOrderNumber() {
        return scenicOrderNumber;
    }

    public void setScenicOrderNumber(Integer scenicOrderNumber) {
        this.scenicOrderNumber = scenicOrderNumber;
    }

    public Integer getScenicOrderTiceketCount() {
        return scenicOrderTiceketCount;
    }

    public void setScenicOrderTiceketCount(Integer scenicOrderTiceketCount) {
        this.scenicOrderTiceketCount = scenicOrderTiceketCount;
    }

    public Double getScenicOrderTotalprice() {
        return scenicOrderTotalprice;
    }

    public void setScenicOrderTotalprice(Double scenicOrderTotalprice) {
        this.scenicOrderTotalprice = scenicOrderTotalprice;
    }

    public Integer getScenicOrderIntdescr() {
        return scenicOrderIntdescr;
    }

    public void setScenicOrderIntdescr(Integer scenicOrderIntdescr) {
        this.scenicOrderIntdescr = scenicOrderIntdescr;
    }

    public String getScenicOrderVardescr() {
        return scenicOrderVardescr;
    }

    public void setScenicOrderVardescr(String scenicOrderVardescr) {
        this.scenicOrderVardescr = scenicOrderVardescr == null ? null : scenicOrderVardescr.trim();
    }
}