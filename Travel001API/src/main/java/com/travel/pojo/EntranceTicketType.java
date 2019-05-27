package com.travel.pojo;

import java.io.Serializable;

public class EntranceTicketType implements Serializable {
    private Integer entranceTicketTypeId;

    private String entranceTicketTypeName;

    private Double entranceTicketTypePrice;

    private Integer entranceTicketId;

    private String entranceTicketTypeVardescr;

    private Integer entranceTicketTypeIntdescr;

    private static final long serialVersionUID = 1L;

    public Integer getEntranceTicketTypeId() {
        return entranceTicketTypeId;
    }

    public void setEntranceTicketTypeId(Integer entranceTicketTypeId) {
        this.entranceTicketTypeId = entranceTicketTypeId;
    }

    public String getEntranceTicketTypeName() {
        return entranceTicketTypeName;
    }

    public void setEntranceTicketTypeName(String entranceTicketTypeName) {
        this.entranceTicketTypeName = entranceTicketTypeName == null ? null : entranceTicketTypeName.trim();
    }

    public Double getEntranceTicketTypePrice() {
        return entranceTicketTypePrice;
    }

    public void setEntranceTicketTypePrice(Double entranceTicketTypePrice) {
        this.entranceTicketTypePrice = entranceTicketTypePrice;
    }

    public Integer getEntranceTicketId() {
        return entranceTicketId;
    }

    public void setEntranceTicketId(Integer entranceTicketId) {
        this.entranceTicketId = entranceTicketId;
    }

    public String getEntranceTicketTypeVardescr() {
        return entranceTicketTypeVardescr;
    }

    public void setEntranceTicketTypeVardescr(String entranceTicketTypeVardescr) {
        this.entranceTicketTypeVardescr = entranceTicketTypeVardescr == null ? null : entranceTicketTypeVardescr.trim();
    }

    public Integer getEntranceTicketTypeIntdescr() {
        return entranceTicketTypeIntdescr;
    }

    public void setEntranceTicketTypeIntdescr(Integer entranceTicketTypeIntdescr) {
        this.entranceTicketTypeIntdescr = entranceTicketTypeIntdescr;
    }
}