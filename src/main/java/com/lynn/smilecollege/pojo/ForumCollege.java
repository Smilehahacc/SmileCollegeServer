package com.lynn.smilecollege.pojo;

/**
 * 〈一句话功能简述〉<br>
 * 〈额外回复，回复下面的回复〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public class ForumCollege {

    private int college_id;
    private String college_name;
    private String college_summary;
    private int college_follow;
    private int college_topic;

    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }

    public String getCollege_name() {
        return college_name;
    }

    public void setCollege_name(String college_name) {
        this.college_name = college_name;
    }

    public String getCollege_summary() {
        return college_summary;
    }

    public void setCollege_summary(String college_summary) {
        this.college_summary = college_summary;
    }

    public int getCollege_follow() {
        return college_follow;
    }

    public void setCollege_follow(int college_follow) {
        this.college_follow = college_follow;
    }

    public int getCollege_topic() {
        return college_topic;
    }

    public void setCollege_topic(int college_topic) {
        this.college_topic = college_topic;
    }
}
