package com.kikoroc.kit.model;

import java.io.Serializable;

/**
 * Project : kit
 * Package : com.kikoroc.kit.model
 * Date : 11/14/14 1:50 AM
 * Author : wangpeng(http://iampeng.wang/)
 * kikoroc@gmail.com
 * https://github.com/kikoroc
 */
public class Account implements Serializable {
    private static final long serialVersionUID = -4538204195785761873L;

    private long id;

    private String name;

    private int sex;

    private String icon;

    private int flag;

    private long regtime;

    private long uptime;

    public Account() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public long getRegtime() {
        return regtime;
    }

    public void setRegtime(long regtime) {
        this.regtime = regtime;
    }

    public long getUptime() {
        return uptime;
    }

    public void setUptime(long uptime) {
        this.uptime = uptime;
    }
}
