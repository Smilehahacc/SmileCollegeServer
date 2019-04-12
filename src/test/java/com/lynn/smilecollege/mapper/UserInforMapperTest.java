package com.lynn.smilecollege.mapper;

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
public class UserInforMapperTest {

    @Resource
    UserInforMapper userInforMapper;

    @Test
    public void findAll() {
        List<UserInfor> us = us = userInforMapper.findAll();
        for(UserInfor u:us) {
            System.out.println(u.getInfor_name());
        }
        System.out.println("findAll()查询所有用户--测试完成！");
    }

    @Test
    public void newUser() {
        UserInfor userInfor = new UserInfor();
        userInfor.setInfor_name("测试X");
        userInfor.setInfor_password("123456");
        userInfor.setInfor_email("66@qq.com");
        userInfor.setInfor_phone("18106983788");
        userInforMapper.newUser(userInfor);
        System.out.println("newUser()注册新用户--测试完成！");
    }

    @Test
    public void deleteById() {
        System.out.println("deleteById()注销--暂时不进行测试！");
    }

    @Test
    public void findByCondition() {
        UserInfor userInfor = new UserInfor();
        userInfor.setInfor_name("lynn");
        UserInfor us = userInforMapper.findByCondition(userInfor);
        System.out.println(us.getInfor_phone());
        System.out.println("findByCondition()条件查询用户--测试完成！");
    }

    @Test
    public void updateUser() {
        UserInfor userInfor = new UserInfor();
        userInfor.setUser_id(29);
        userInfor.setInfor_name("测试X");
        userInfor.setInfor_password("123456");
        userInfor.setInfor_email("66@qq.com");
//        userInfor.setInfor_phone("18106983743");
        userInforMapper.updateUser(userInfor);
        System.out.println("updateUser()更新用户信息--测试完成！");
    }
}