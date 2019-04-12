package com.lynn.smilecollege.web;
import com.lynn.smilecollege.mapper.UserInforMapper;
import com.lynn.smilecollege.pojo.ForumTopic;
import com.lynn.smilecollege.pojo.UserInfor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserInforController {
    /**
     *创建数据库操作接口对象
     */
    @Autowired
    UserInforMapper userInforMapper;

    /**
     *用户登录
     */
    @RequestMapping(value ="/login")
    public String login(@RequestParam("name") String name,
                          @RequestParam("password") String password
    ){
        UserInfor userInfor = new UserInfor();
        userInfor.setInfor_name(name);
        UserInfor u = userInforMapper.findByCondition(userInfor);
        // 判断输入的用户是否存在，密码是否正确
        if(u!=null) {
            if(u.getInfor_password().equals(password)) {
                return "SUCCESS";
            } else {
                return "ERROR";
            }
        }
        return "ERROR";
    }

    /**
     *接收RequestBody为Json串时的请求
     */
    @RequestMapping(value ="/loginJson")
    public String login(@RequestBody Map requestBody){
        UserInfor userInfor = new UserInfor();
        userInfor.setInfor_name((String)requestBody.get("name"));
        UserInfor u = userInforMapper.findByCondition(userInfor);
        // 判断输入的用户是否存在，密码是否正确
        if(u!=null) {
            if(u.getInfor_password().equals((String)requestBody.get("password"))) {
                return "SUCCESS";
            } else {
                return "ERROR";
            }
        }
        return "ERROR";
    }

    /**
     *用户注册
     */
    @RequestMapping(value ="/register")
    public String addUser(@RequestParam("name") String name,@RequestParam("password") String password,
                          @RequestParam("email") String email,@RequestParam("phone") String phone
    ){
        UserInfor userInfor = new UserInfor();
        userInfor.setInfor_name(name);
        if(userInforMapper.findByCondition(userInfor)!=null) {
            return "ERROR";
        }
        UserInfor userInfor1 = new UserInfor();
        userInfor1.setInfor_phone(phone);
        if(userInforMapper.findByCondition(userInfor1)!=null) {
            return "ERROR";
        }
        userInfor.setInfor_password(password);
        userInfor.setInfor_email(email);
        userInfor.setInfor_phone(phone);
        userInforMapper.newUser(userInfor);
        return "SUCCESS";
    }

    /**
     *通过用户名id来获取用户所有信息
     */
    @RequestMapping(value ="/findByCondition")
    public UserInfor findByCondition(@RequestParam("name") String name
    ){
        UserInfor userInfor = new UserInfor();
        userInfor.setInfor_name(name);
        UserInfor us = userInforMapper.findByCondition(userInfor);
        System.out.println("获取用户信息--完成！");
        return us;
    }

    /**
     *查找所有用户
     */
    @RequestMapping(value ="/findAll")
    public List<UserInfor> getUserList(){
        System.out.println("查询所有执行！");
        return  userInforMapper.findAll();
    }
}