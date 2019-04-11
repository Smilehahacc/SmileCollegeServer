package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumReply;
import com.lynn.smilecollege.pojo.ForumTopic;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈帖子的回复对应数据库操作接口〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public interface ForumReplyMapper {

    /**
     * 通过帖子的id来查找回复
     * @param topicId 帖子的id
     * @return Result<List>
     */
    List<ForumReply> findReplyByTopicId(int topicId);

    /**
     * 通过传入的对象来创建新的回复
     * @param forumReply 帖子的对象
     * @return Result<int>
     */
    int newReply(ForumReply forumReply);

    /**
     * 通过回复的id来删除对应回复
     * @param replyId 帖子主题的id
     * @return Result<int>
     */
    int deleteByReplyId(int replyId);
}
