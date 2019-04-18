package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumTopic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Run.class)
@EnableAutoConfiguration
public class ForumTopicMapperTest {

    @Resource
    ForumTopicMapper forumTopicMapper;

    @Test
    public void findTopicByCollegeId() {
        List<ForumTopic> fs = forumTopicMapper.findTopicByCollegeId(1);
        for(ForumTopic f:fs) {
            System.out.println(f.getTopic_title());
        }
        System.out.println("findByForumId()通过id查询帖子--测试完成！");
    }

    @Test
    public void findTopicBySort() {
        ForumTopic f = new ForumTopic();
        f.setCollege_id(1);
        f.setTopic_sort(1);
        List<ForumTopic> fs = forumTopicMapper.findTopicBySort(f);
        for(ForumTopic k:fs) {
            System.out.println(k.getTopic_title());
        }
        System.out.println("findByForumId()通过id和分类查询帖子--测试完成！");
    }



    @Test
    public void newTopic() {
        ForumTopic f = new ForumTopic();
        f.setCollege_id(1);
        f.setUser_id(1);
        f.setUser_name("lynn");
        f.setTopic_sort(1);
        f.setTopic_title("第1类的第二个帖子");
        f.setTopic_content("帖子的内容啦啦啦阿拉啦");
        f.setTopic_date(1555216423);
        forumTopicMapper.newTopic(f);
        System.out.println("newTopic()创建新的帖子--测试完成！");
    }

    @Test
    public void deleteByTopicId() {
//        forumTopicMapper.deleteByTopicId(3);
        System.out.println("deleteByTopicId()通过帖子id删除帖子--暂时不测试！");
    }
}