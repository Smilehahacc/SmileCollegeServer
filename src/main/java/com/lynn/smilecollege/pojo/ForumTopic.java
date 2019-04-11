package com.lynn.smilecollege.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈对应帖子的详细内容〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public class ForumTopic {
    private int topic_id;
    private int college_id;
    private int user_id;
    private int topic_sort;
    private int topic_date;
    private String topic_title;
    private String topic_content;
    private int topic_praise;

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
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

    public int getTopic_sort() {
        return topic_sort;
    }

    public void setTopic_sort(int topic_sort) {
        this.topic_sort = topic_sort;
    }

    public int getTopic_data() {
        return topic_date;
    }

    public void setTopic_data(int topic_date) {
        this.topic_date = topic_date;
    }

    public String getTopic_title() {
        return topic_title;
    }

    public void setTopic_title(String topic_title) {
        this.topic_title = topic_title;
    }

    public String getTopic_content() {
        return topic_content;
    }

    public void setTopic_content(String topic_content) {
        this.topic_content = topic_content;
    }

    public int getTopic_praise() {
        return topic_praise;
    }

    public void setTopic_praise(int topic_praise) {
        this.topic_praise = topic_praise;
    }

}
