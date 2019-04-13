package com.lynn.smilecollege.pojo;

/**
 * 〈一句话功能简述〉<br>
 * 〈额外回复，回复下面的回复〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public class ReplyExtra {

    private int extra_id;
    private int reply_id;
    private int user_id;
    private String user_name;
    private String extra_content;
    private int extra_date;

    public int getExtra_id() {
        return extra_id;
    }

    public void setExtra_id(int extra_id) {
        this.extra_id = extra_id;
    }

    public int getReply_id() {
        return reply_id;
    }

    public void setReply_id(int reply_id) {
        this.reply_id = reply_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getExtra_content() {
        return extra_content;
    }

    public void setExtra_content(String extra_content) {
        this.extra_content = extra_content;
    }

    public int getExtra_date() {
        return extra_date;
    }

    public void setExtra_date(int extra_date) {
        this.extra_date = extra_date;
    }
}
