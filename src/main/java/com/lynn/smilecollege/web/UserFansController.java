package com.lynn.smilecollege.web;

import com.lynn.smilecollege.mapper.ForumReplyMapper;
import com.lynn.smilecollege.mapper.UserFansMapper;
import com.lynn.smilecollege.pojo.ForumReply;
import com.lynn.smilecollege.pojo.UserFans;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserFansController {
    /**
     *创建forum_reply回复表操作接口对象
     */
    @Autowired
    UserFansMapper userFansMapper;

    /**
     *通过粉丝id查询其关注的用户
     */
    @RequestMapping(value ="/findUserByFansId")
    public List<UserFans> findUserByFansId(@RequestParam("fansId") int fansId
    ){
        List<UserFans> us = userFansMapper.findUserByFansId(fansId);
        for(UserFans u:us) {
            System.out.println(u.getUser_id());
        }
        System.out.println("findByReplyId()通过粉丝id查询其关注的用户--完成！");
        return us;
    }

    /**
     *通过用户id查询其粉丝
     */
    @RequestMapping(value ="/findFansByUserId")
    public List<UserFans> findFansByUserId(@RequestParam("userId") int userId
    ){
        List<UserFans> us = userFansMapper.findFansByUserId(userId);
        for(UserFans u:us) {
            System.out.println(u.getFans_id());
        }
        System.out.println("findByReplyId()通过用户id查询其粉丝--完成！");
        return us;
    }

    /**
     *通过对象建立新的用户-粉丝关系
     */
    @RequestMapping(value ="/newFans")
    public String newFans(@RequestParam("userId") int userId,
                          @RequestParam("fansId") int fansId
    ){
        UserFans u = new UserFans();
        u.setUser_id(userId);
        u.setFans_id(fansId);
        userFansMapper.newFans(u);
        System.out.println("newFans()新建一组关系--完成！");
        return "SUCCESS";
    }

    /**
     *通过对象删除一组用户-粉丝关系
     */
    @RequestMapping(value ="/deleteFansById")
    public String deleteFansById(@RequestParam("userId") int userId,
                                 @RequestParam("fansId") int fansId
    ){
        UserFans u = new UserFans();
        u.setUser_id(userId);
        u.setFans_id(fansId);
        userFansMapper.deleteFansById(u);
        System.out.println("deleteFansById()删除一组关系--完成！");
        return "SUCCESS";
    }

}