package com.travel.pojo;

import java.io.Serializable;

public class Route implements Serializable {
    private Integer routeId;

    private String routeStart;

    private String routeEnd;

    private Integer routeIntdescr;

    private String routeVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getRouteId() {
        return routeId;
    }

    public void setRouteId(Integer routeId) {
        this.routeId = routeId;
    }

    public String getRouteStart() {
        return routeStart;
    }

    public void setRouteStart(String routeStart) {
        this.routeStart = routeStart == null ? null : routeStart.trim();
    }

    public String getRouteEnd() {
        return routeEnd;
    }

    public void setRouteEnd(String routeEnd) {
        this.routeEnd = routeEnd == null ? null : routeEnd.trim();
    }

    public Integer getRouteIntdescr() {
        return routeIntdescr;
    }

    public void setRouteIntdescr(Integer routeIntdescr) {
        this.routeIntdescr = routeIntdescr;
    }

    public String getRouteVardescr() {
        return routeVardescr;
    }

    public void setRouteVardescr(String routeVardescr) {
        this.routeVardescr = routeVardescr == null ? null : routeVardescr.trim();
    }
}