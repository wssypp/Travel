package com.travel.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    private Integer usersId;

    private String usersName;

    private String usersPass;

    private String usersImg;

    private String usersIntroduce;

    private Date usersCreatetime;

    private Integer usersIntdescr;

    private String usersVardescr;

    private static final long serialVersionUID = 1L;

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsersName() {
        return usersName;
    }

    public void setUsersName(String usersName) {
        this.usersName = usersName == null ? null : usersName.trim();
    }

    public String getUsersPass() {
        return usersPass;
    }

    public void setUsersPass(String usersPass) {
        this.usersPass = usersPass == null ? null : usersPass.trim();
    }

    public String getUsersImg() {
        return usersImg;
    }

    public void setUsersImg(String usersImg) {
        this.usersImg = usersImg == null ? null : usersImg.trim();
    }

    public String getUsersIntroduce() {
        return usersIntroduce;
    }

    public void setUsersIntroduce(String usersIntroduce) {
        this.usersIntroduce = usersIntroduce == null ? null : usersIntroduce.trim();
    }

    public Date getUsersCreatetime() {
        return usersCreatetime;
    }

    public void setUsersCreatetime(Date usersCreatetime) {
        this.usersCreatetime = usersCreatetime;
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