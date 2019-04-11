package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumTopic;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈帖子主题〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public interface ForumTopicMapper {
    /**
     * 通过帖子的id来查找帖子
     * @param forumId 帖子的id
     * @return Result<List>
     */
    List<ForumTopic> findByForumId(int forumId);

    /**
     * 传入对象来创建新的帖子主题
     * @param forumTopic 帖子的对象
     * @return Result<int>
     */
    int newTopic(ForumTopic forumTopic);

    /**
     * 通过主题的id来删除对应的帖子
     * @param topicId 帖子主题的id
     * @return Result<int>
     */
    int deleteByTopicId(int topicId);

}
