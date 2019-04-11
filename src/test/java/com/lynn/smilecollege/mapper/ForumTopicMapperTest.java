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
        List<ForumTopic> fs = forumTopicMapper.findTopicByCollegeId(1);
        for(ForumTopic f:fs) {
            System.out.println(f.getTopic_title());
        }
        System.out.println("findByForumId()通过id查询帖子--测试完成！");
    }

    @Test
    public void newTopic() {
        ForumTopic f = new ForumTopic();
        f.setCollege_id(1);
        f.setUser_id(1);
        f.setTopic_sort(3);
        f.setTopic_title("现在是测试的标题");
        f.setTopic_content("帖子的内容");
        f.setTopic_date(1554955837);
        forumTopicMapper.newTopic(f);
        System.out.println("newTopic()创建新的帖子--测试完成！");
    }

    @Test
    public void deleteByTopicId() {
//        forumTopicMapper.deleteByTopicId(3);
        System.out.println("deleteByTopicId()通过帖子id删除帖子--暂时不测试！");
    }
}