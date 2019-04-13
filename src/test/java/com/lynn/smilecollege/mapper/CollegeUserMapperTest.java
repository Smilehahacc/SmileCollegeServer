package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.CollegeUser;
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
public class CollegeUserMapperTest {
    @Resource
    CollegeUserMapper collegeUserMapper;

    @Test
    public void findUserByCollegeId() {
        List<CollegeUser> cs = collegeUserMapper.findUserByCollegeId(1);
        for(CollegeUser c:cs) {
            System.out.println(c.getUser_id());
        }
        System.out.println("findUserByCollegeId()通过校园id查询其关注用户--测试完成！");
    }

    @Test
    public void findCollegeByUserId() {
        List<CollegeUser> cs = collegeUserMapper.findCollegeByUserId(2);
        for(CollegeUser c:cs) {
            System.out.println(c.getCollege_id());
        }
        System.out.println("findCollegeByUserId()通过用户id查询其关注的校园--测试完成！");
    }

    @Test
    public void newUserFollow() {
        CollegeUser c = new CollegeUser();
        c.setCollege_id(2);
        c.setUser_id(1);
        collegeUserMapper.newUserFollow(c);
        System.out.println("newUserFollow()创建新校园-用户关系--测试完成！");
    }

    @Test
    public void deleteFollowById() {
//        collegeUserMapper.deleteFollowById();
        System.out.println("deleteFollowById()通过关系对象删除校园-用户关系--暂时不测试！");
    }

}