package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumCollege;
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
public class ForumCollegeMapperTest {

    @Resource
    ForumCollegeMapper forumCollegeMapper;

    @Test
    public void findAllCollege() {
        List<ForumCollege> fs= forumCollegeMapper.findAllCollege();
        for(ForumCollege f:fs) {
            System.out.println(f.getCollege_name());
        }
        System.out.println("findAllCollege()查询所有的校园信息--测试完成！");
    }

    @Test
    public void findCollegeByName() {
        ForumCollege forumCollege = forumCollegeMapper.findCollegeByName("厦门理工学院");
        System.out.println(forumCollege.getCollege_summary());
        System.out.println("findCollegeByName()通过校园名称查询校园--测试完成！");
    }

    @Test
    public void newCollege() {
        ForumCollege forumCollege = new ForumCollege();
        forumCollege.setCollege_name("厦门大学");
        forumCollege.setCollege_summary("这里是厦门大学的简介");
        forumCollegeMapper.newCollege(forumCollege);
        System.out.println("newCollege()通过校园信息对象创建新的校园--测试完成！");
    }

    @Test
    public void deleteCollegeByName() {

        System.out.println("deleteCollegeByName()通过校园名称删除校园--暂时不测试！");
    }
}