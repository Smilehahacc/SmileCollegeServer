package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumReply;
import com.lynn.smilecollege.pojo.ForumTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Run.class)
@EnableAutoConfiguration
public class ForumReplyMapperTest {

    @Resource
    ForumReplyMapper forumReplyMapper;

    @Test
    public void findByReplyId() {
        List<ForumReply> fs = forumReplyMapper.findReplyByTopicId(1);
        for(ForumReply f:fs) {
            System.out.println(f.getReply_content());
        }
        System.out.println("findByReplyId()通过帖子id查询回复--测试完成！");
    }

    @Test
    public void newReply() {
        ForumReply f = new ForumReply();
        f.setTopic_id(2);
        f.setUser_id(1);
        f.setReply_content("回复的内容");
        f.setReply_date(1554955837);
        f.setReply_image("");
        forumReplyMapper.newReply(f);
        System.out.println("newReply()创建新的回复--测试完成！");
    }

    @Test
    public void deleteByReplyId() {
//        forumTopicMapper.deleteByTopicId(3);
        System.out.println("deleteByReplyId()通过回复id删除回复--暂时不测试！");
    }
}