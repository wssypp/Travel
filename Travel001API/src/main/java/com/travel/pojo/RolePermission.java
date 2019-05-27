package com.travel.pojo;

import java.io.Serializable;

public class RolePermission implements Serializable {
    private Integer rolePermissionId;

    private Integer roleId;

    private Integer permissionId;

    private Integer rolePermissionIntdescr;

    private String rolePermissionVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getRolePermissionId() {
        return rolePermissionId;
    }

    public void setRolePermissionId(Integer rolePermissionId) {
        this.rolePermissionId = rolePermissionId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getRolePermissionIntdescr() {
        return rolePermissionIntdescr;
    }

    public void setRolePermissionIntdescr(Integer rolePermissionIntdescr) {
        this.rolePermissionIntdescr = rolePermissionIntdescr;
    }

    public String getRolePermissionVardescr() {
        return rolePermissionVardescr;
    }

    public void setRolePermissionVardescr(String rolePermissionVardescr) {
        this.rolePermissionVardescr = rolePermissionVardescr == null ? null : rolePermissionVardescr.trim();
    }
}