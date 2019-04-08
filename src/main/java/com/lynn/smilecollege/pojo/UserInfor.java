package com.lynn.smilecollege.pojo;

/**
 * @author Lynn
 */
public class UserInfor {

    private int id;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String portrait;
    private String autograph;
    private int topicNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public int getTopicNum() {
        return topicNum;
    }

    public void setTopicNum(int topicNum) {
        this.topicNum = topicNum;
    }
}