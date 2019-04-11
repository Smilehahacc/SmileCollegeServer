package com.lynn.smilecollege.pojo;

/**
 * 〈一句话功能简述〉<br>
 * 〈粉丝表，提供用户之间的对应粉丝关系〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public class UserFans {

    private int id;
    private int user_id;
    private int fans_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getFans_id() {
        return fans_id;
    }

    public void setFans_id(int fans_id) {
        this.fans_id = fans_id;
    }
}
