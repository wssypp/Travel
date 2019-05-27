package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private Integer roleId;

    private String roleName;

    private Date roleCreatetime;

    private Integer usersIntdescr;

    private String usersVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Date getRoleCreatetime() {
        return roleCreatetime;
    }

    public void setRoleCreatetime(Date roleCreatetime) {
        this.roleCreatetime = roleCreatetime;
    }

    public Integer getUsersIntdescr() {
        return usersIntdescr;
    }

    public void setUsersIntdescr(Integer usersIntdescr) {
        this.usersIntdescr = usersIntdescr;
    }

    public String getUsersVardescr() {
        return usersVardescr;
    }

    public void setUsersVardescr(String usersVardescr) {
        this.usersVardescr = usersVardescr == null ? null : usersVardescr.trim();
    }
}