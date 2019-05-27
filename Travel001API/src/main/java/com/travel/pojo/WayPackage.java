package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class WayPackage implements Serializable {
    private Integer wayPackageId;

    private String wayPackageName;

    private String wayPackageContent;

    private Integer scenicId;

    private Double wayPackagePrice;

    private Integer wayPackageIntdescr;

    private String wayPackageVardescr;

    private Date wayPackagePublishtime;

    private static final long serialVersionUID = 1L;

    public Integer getWayPackageId() {
        return wayPackageId;
    }

    public void setWayPackageId(Integer wayPackageId) {
        this.wayPackageId = wayPackageId;
    }

    public String getWayPackageName() {
        return wayPackageName;
    }

    public void setWayPackageName(String wayPackageName) {
        this.wayPackageName = wayPackageName == null ? null : wayPackageName.trim();
    }

    public String getWayPackageContent() {
        return wayPackageContent;
    }

    public void setWayPackageContent(String wayPackageContent) {
        this.wayPackageContent = wayPackageContent == null ? null : wayPackageContent.trim();
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Double getWayPackagePrice() {
        return wayPackagePrice;
    }

    public void setWayPackagePrice(Double wayPackagePrice) {
        this.wayPackagePrice = wayPackagePrice;
    }

    public Integer getWayPackageIntdescr() {
        return wayPackageIntdescr;
    }

    public void setWayPackageIntdescr(Integer wayPackageIntdescr) {
        this.wayPackageIntdescr = wayPackageIntdescr;
    }

    public String getWayPackageVardescr() {
        return wayPackageVardescr;
    }

    public void setWayPackageVardescr(String wayPackageVardescr) {
        this.wayPackageVardescr = wayPackageVardescr == null ? null : wayPackageVardescr.trim();
    }

    public Date getWayPackagePublishtime() {
        return wayPackagePublishtime;
    }

    public void setWayPackagePublishtime(Date wayPackagePublishtime) {
        this.wayPackagePublishtime = wayPackagePublishtime;
    }
}