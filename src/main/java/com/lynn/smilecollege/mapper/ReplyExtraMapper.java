package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumReply;
import com.lynn.smilecollege.pojo.ReplyExtra;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈额外回复对应的接口方法〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public interface ReplyExtraMapper {

    /**
     * 通过传入的对象来创建新的额外回复
     * @param replyId 额外回复的id
     * @return Result<List>
     */
    List<ReplyExtra> findExtraByReplyId(int replyId);

    /**
     * 通过传入的对象来创建新的额外回复
     * @param replyExtra 帖子的对象
     * @return Result<int>
     */
    int newExtra(ReplyExtra replyExtra);

    /**
     * 通过额外回复id来删除额外回复
     * @param extraId 回复的id
     * @return Result<int>
     */
    int deleteExtraById(int extraId);
}
