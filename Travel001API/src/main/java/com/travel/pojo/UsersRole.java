package com.travel.pojo;

import java.io.Serializable;

public class UsersRole implements Serializable {
    private Integer usersRoleId;

    private Integer usersId;

    private Integer roleId;

    private Integer usersRoleIntdescr;

    private String usersRoleVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getUsersRoleId() {
        return usersRoleId;
    }

    public void setUsersRoleId(Integer usersRoleId) {
        this.usersRoleId = usersRoleId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUsersRoleIntdescr() {
        return usersRoleIntdescr;
    }

    public void setUsersRoleIntdescr(Integer usersRoleIntdescr) {
        this.usersRoleIntdescr = usersRoleIntdescr;
    }

    public String getUsersRoleVardescr() {
        return usersRoleVardescr;
    }

    public void setUsersRoleVardescr(String usersRoleVardescr) {
        this.usersRoleVardescr = usersRoleVardescr == null ? null : usersRoleVardescr.trim();
    }
}