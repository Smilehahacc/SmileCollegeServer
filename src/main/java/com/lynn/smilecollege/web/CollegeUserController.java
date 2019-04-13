package com.lynn.smilecollege.web;

import com.lynn.smilecollege.mapper.CollegeUserMapper;
import com.lynn.smilecollege.pojo.CollegeUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CollegeUserController {
    /**
     *创建college_user表操作接口对象
     */
    @Autowired
    CollegeUserMapper collegeUserMapper;

    /**
     *通过校园id查询其关注用户
     */
    @RequestMapping(value ="/findUserByCollegeId")
    public List<CollegeUser> findUserByCollegeId(@RequestParam("collegeId") String collegeId
    ){
        int id = Integer.parseInt(collegeId);
        List<CollegeUser> us = collegeUserMapper.findUserByCollegeId(id);
        for(CollegeUser u:us) {
            System.out.println(u.getUser_id());
        }
        System.out.println("findUserByCollegeId()通过用户id查询其粉丝--完成！");
        return us;
    }

    /**
     *通过用户id查询其关注的校园
     */
    @RequestMapping(value ="/findCollegeByUserId")
    public List<CollegeUser> findCollegeByUserId(@RequestParam("userId") String userId
    ){
        int id = Integer.parseInt(userId);
        List<CollegeUser> cs = collegeUserMapper.findCollegeByUserId(id);
        for(CollegeUser c:cs) {
            System.out.println(c.getCollege_id());
        }
        System.out.println("findCollegeByUserId()通过粉丝id查询其关注的用户--完成！");
        return cs;
    }

    /**
     *通过对象建立新的一组校园-用户关系
     */
    @RequestMapping(value ="/newUserFollow")
    public String newUserFollow(@RequestParam("collegeId") int collegeId,
                          @RequestParam("userId") int userId
    ){
        CollegeUser c = new CollegeUser();
        c.setCollege_id(collegeId);
        c.setUser_id(userId);
        collegeUserMapper.newUserFollow(c);
        System.out.println("newUserFollow()新建一组关系--完成！");
        return "SUCCESS";
    }

    /**
     *通过对象删除一组校园-用户关系
     */
    @RequestMapping(value ="/deleteFollowById")
    public String deleteFollowById(@RequestParam("collegeId") int collegeId,
                                 @RequestParam("userId") int userId
    ){
        CollegeUser c = new CollegeUser();
        c.setCollege_id(collegeId);
        c.setUser_id(userId);
        collegeUserMapper.deleteFollowById(c);
        System.out.println("deleteFollowById()删除一组关系--完成！");
        return "SUCCESS";
    }

}