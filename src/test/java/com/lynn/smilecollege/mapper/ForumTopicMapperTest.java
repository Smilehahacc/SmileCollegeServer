package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumTopic;
import com.lynn.smilecollege.pojo.UserInfor;
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
public class ForumTopicMapperTest {

    @Resource
    ForumTopicMapper forumTopicMapper;

    @Test
    public void findByForumId() {
        List<ForumTopic> fs = forumTopicMapper.findByForumId(1);
        for(ForumTopic f:fs) {
            System.out.println(f.getTopic_title());
        }
        System.out.println("findByForumId()通过id查询帖子--测试完成！");
    }

    @Test
    public void newTopic() {
        ForumTopic f = new ForumTopic();
        f.setCollege_id();
        f.setUser_id();
        f.setTopic_sort();
        f.setTopic_title();
        f.setTopic_content();
        f.setTopic_data();
        System.out.println("newTopic()创建新的帖子--测试完成！");
    }

    @Test
    public void deleteByTopicId() {
        System.out.println("deleteByTopicId()通过帖子id删除帖子--测试完成！");
    }
}