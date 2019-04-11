package com.lynn.smilecollege.pojo;

/**
 * 〈一句话功能简述〉<br>
 * 〈对应帖子的回复〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public class ForumReply {
    private int reply_id;
    private int topic_id;
    private int user_id;
    private String reply_content;
    private int reply_date;
    private int reply_praise;
    private String reply_image;

    public int getReply_id() {
        return reply_id;
    }

    public void setReply_id(int reply_id) {
        this.reply_id = reply_id;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getReply_contene() {
        return reply_content;
    }

    public void setReply_contene(String reply_content) {
        this.reply_content = reply_content;
    }

    public int getReply_date() {
        return reply_date;
    }

    public void setReply_date(int reply_date) {
        this.reply_date = reply_date;
    }

    public int getReply_praise() {
        return reply_praise;
    }

    public void setReply_praise(int reply_praise) {
        this.reply_praise = reply_praise;
    }

    public String getReply_image() {
        return reply_image;
    }

    public void setReply_image(String reply_image) {
        this.reply_image = reply_image;
    }
}
