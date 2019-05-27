package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class Scenic implements Serializable {
    private Integer scenicId;

    private String scenicName;

    private Integer scenicCommentvolume;

    private Integer scenicVisitation;

    private Integer countryId;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private String scenicDetailedaddress;

    private String scenicContact;

    private String scenicTel;

    private String scenicType;

    private String scenicPicture;

    private String scenicStarlevel;

    private Double scenicScore;

    private String scenicNotice;

    private Double scenicLowseasonticket;

    private Double scenicHighseasonticket;

    private String scenicTransportion;

    private Date scenicOpentime;

    private String scenicDescr;

    private Double scenicDistance;

    private Integer countyIntdescr;

    private String countyVardescr;

    private Date scenicRegistetime;

    private static final long serialVersionUID = 1L;

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName == null ? null : scenicName.trim();
    }

    public Integer getScenicCommentvolume() {
        return scenicCommentvolume;
    }

    public void setScenicCommentvolume(Integer scenicCommentvolume) {
        this.scenicCommentvolume = scenicCommentvolume;
    }

    public Integer getScenicVisitation() {
        return scenicVisitation;
    }

    public void setScenicVisitation(Integer scenicVisitation) {
        this.scenicVisitation = scenicVisitation;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public String getScenicDetailedaddress() {
        return scenicDetailedaddress;
    }

    public void setScenicDetailedaddress(String scenicDetailedaddress) {
        this.scenicDetailedaddress = scenicDetailedaddress == null ? null : scenicDetailedaddress.trim();
    }

    public String getScenicContact() {
        return scenicContact;
    }

    public void setScenicContact(String scenicContact) {
        this.scenicContact = scenicContact == null ? null : scenicContact.trim();
    }

    public String getScenicTel() {
        return scenicTel;
    }

    public void setScenicTel(String scenicTel) {
        this.scenicTel = scenicTel == null ? null : scenicTel.trim();
    }

    public String getScenicType() {
        return scenicType;
    }

    public void setScenicType(String scenicType) {
        this.scenicType = scenicType == null ? null : scenicType.trim();
    }

    public String getScenicPicture() {
        return scenicPicture;
    }

    public void setScenicPicture(String scenicPicture) {
        this.scenicPicture = scenicPicture == null ? null : scenicPicture.trim();
    }

    public String getScenicStarlevel() {
        return scenicStarlevel;
    }

    public void setScenicStarlevel(String scenicStarlevel) {
        this.scenicStarlevel = scenicStarlevel == null ? null : scenicStarlevel.trim();
    }

    public Double getScenicScore() {
        return scenicScore;
    }

    public void setScenicScore(Double scenicScore) {
        this.scenicScore = scenicScore;
    }

    public String getScenicNotice() {
        return scenicNotice;
    }

    public void setScenicNotice(String scenicNotice) {
        this.scenicNotice = scenicNotice == null ? null : scenicNotice.trim();
    }

    public Double getScenicLowseasonticket() {
        return scenicLowseasonticket;
    }

    public void setScenicLowseasonticket(Double scenicLowseasonticket) {
        this.scenicLowseasonticket = scenicLowseasonticket;
    }

    public Double getScenicHighseasonticket() {
        return scenicHighseasonticket;
    }

    public void setScenicHighseasonticket(Double scenicHighseasonticket) {
        this.scenicHighseasonticket = scenicHighseasonticket;
    }

    public String getScenicTransportion() {
        return scenicTransportion;
    }

    public void setScenicTransportion(String scenicTransportion) {
        this.scenicTransportion = scenicTransportion == null ? null : scenicTransportion.trim();
    }

    public Date getScenicOpentime() {
        return scenicOpentime;
    }

    public void setScenicOpentime(Date scenicOpentime) {
        this.scenicOpentime = scenicOpentime;
    }

    public String getScenicDescr() {
        return scenicDescr;
    }

    public void setScenicDescr(String scenicDescr) {
        this.scenicDescr = scenicDescr == null ? null : scenicDescr.trim();
    }

    public Double getScenicDistance() {
        return scenicDistance;
    }

    public void setScenicDistance(Double scenicDistance) {
        this.scenicDistance = scenicDistance;
    }

    public Integer getCountyIntdescr() {
        return countyIntdescr;
    }

    public void setCountyIntdescr(Integer countyIntdescr) {
        this.countyIntdescr = countyIntdescr;
    }

    public String getCountyVardescr() {
        return countyVardescr;
    }

    public void setCountyVardescr(String countyVardescr) {
        this.countyVardescr = countyVardescr == null ? null : countyVardescr.trim();
    }

    public Date getScenicRegistetime() {
        return scenicRegistetime;
    }

    public void setScenicRegistetime(Date scenicRegistetime) {
        this.scenicRegistetime = scenicRegistetime;
    }
}