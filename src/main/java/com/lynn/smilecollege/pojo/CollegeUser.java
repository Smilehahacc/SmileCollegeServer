package com.lynn.smilecollege.pojo;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户表，提供校园的用户查询，即关注此校园的用户〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public class CollegeUser {

    private int id;
    private int college_id;
    private int user_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
