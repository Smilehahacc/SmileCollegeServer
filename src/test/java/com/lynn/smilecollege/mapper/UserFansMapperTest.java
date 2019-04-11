package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumReply;
import com.lynn.smilecollege.pojo.UserFans;
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
public class UserFansMapperTest {
    @Resource
    UserFansMapper userFansMapper;

    @Test
    public void findFansByUserId() {
        List<UserFans> us = userFansMapper.findFansByUserId(1);
        for(UserFans u:us) {
            System.out.println(u.getFans_id());
        }
        System.out.println("findByReplyId()通过用户id查询其粉丝--测试完成！");
    }

    @Test
    public void findUserByFansId() {
        List<UserFans> us = userFansMapper.findUserByFansId(2);
        for(UserFans u:us) {
            System.out.println(u.getUser_id());
        }
        System.out.println("findByReplyId()通过粉丝id查询其关注的用户--测试完成！");
    }

    @Test
    public void newFans() {
        UserFans u = new UserFans();
        u.setUser_id(2);
        u.setFans_id(1);
        userFansMapper.newFans(u);
        System.out.println("newFans()创建新粉丝关系--测试完成！");
    }

    @Test
    public void deleteFansById() {
//        userFansMapper.deleteFansByUserId();
        System.out.println("deleteFansById()通过关系对象删除粉丝关系--暂时不测试！");
    }

}