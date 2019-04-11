package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumReply;
import com.lynn.smilecollege.pojo.ReplyExtra;
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
public class ReplyExtraMapperTest {

    @Resource
    ReplyExtraMapper replyExtraMapper;

    @Test
    public void findByReplyId() {
        List<ReplyExtra> rs = replyExtraMapper.findExtraByReplyId(1);
        for(ReplyExtra r:rs) {
            System.out.println(r.getExtra_content());
        }
        System.out.println("findByReplyId()通过回复id查询额外回复--测试完成！");
    }

    @Test
    public void newExtra() {
        ReplyExtra r = new ReplyExtra();
        r.setReply_id(1);
        r.setUser_id(1);
        r.setExtra_content("额外回复的内容2");
        r.setExtra_date(1554955837);
        replyExtraMapper.newExtra(r);
        System.out.println("newReply()创建新的额外回复--测试完成！");
    }

    @Test
    public void deleteByExtraId() {
//        forumTopicMapper.deleteExtraByExtraId(3);
        System.out.println("deleteByReplyId()通过额外回复id删除额外回复--暂时不测试！");
    }
}