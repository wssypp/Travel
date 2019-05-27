package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class Permission implements Serializable {
    private Integer permissionId;

    private String permissionName;

    private Date permissionCreatetime;

    private Integer permissionIntdescr;

    private String permissionVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public Date getPermissionCreatetime() {
        return permissionCreatetime;
    }

    public void setPermissionCreatetime(Date permissionCreatetime) {
        this.permissionCreatetime = permissionCreatetime;
    }

    public Integer getPermissionIntdescr() {
        return permissionIntdescr;
    }

    public void setPermissionIntdescr(Integer permissionIntdescr) {
        this.permissionIntdescr = permissionIntdescr;
    }

    public String getPermissionVardescr() {
        return permissionVardescr;
    }

    public void setPermissionVardescr(String permissionVardescr) {
        this.permissionVardescr = permissionVardescr == null ? null : permissionVardescr.trim();
    }
}