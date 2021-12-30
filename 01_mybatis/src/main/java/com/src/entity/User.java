package com.src.entity;

import java.util.Date;

/**
 *
 */
public class User {
    private  Integer userId;
    private  String userName;
    private  Date  createTime;
    //无参构造器
    public User() {
    }
    //有参构造器


    public User(String userName, Date createTime) {
        this.userName = userName;
        this.createTime = createTime;
    }

    //toSTring方法
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
    //set方法
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    //get方法
    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Date getCreateTime() {
        return createTime;
    }
}
