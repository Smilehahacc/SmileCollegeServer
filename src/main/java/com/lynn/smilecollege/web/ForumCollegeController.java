package com.lynn.smilecollege.web;

import com.lynn.smilecollege.mapper.ForumCollegeMapper;
import com.lynn.smilecollege.pojo.ForumCollege;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ForumCollegeController {
    /**
     *创建forum_college校园表操作接口对象
     */
    @Autowired
    ForumCollegeMapper forumCollegeMapper;

    /**
     *查询所有校园
     */
    @RequestMapping(value ="/findAllCollege")
    public List<ForumCollege> findAllCollege(){
        List<ForumCollege> fs= forumCollegeMapper.findAllCollege();
        for(ForumCollege f:fs) {
            System.out.println(f.getCollege_name());
        }
        System.out.println("findAllCollege()查询所有的校园信息--完成！");
        return fs;
    }

    /**
     *通过校园名称查询校园
     */
    @RequestMapping(value ="/findCollegeByName")
    public ForumCollege findCollegeByName(@RequestParam("collegeName") String collegeName
    ){
        ForumCollege f = forumCollegeMapper.findCollegeByName(collegeName);
        System.out.println(f.getCollege_summary());
        System.out.println("findCollegeByName()通过校园名称查询校园--测试完成！");
        return f;
    }

    /**
     *通过校园信息对象创建新的校园
     */
    @RequestMapping(value ="/newCollege")
    public String newCollege(@RequestParam("collegeName") String collegeName,
                             @RequestParam("userId") String collegeSummary
    ){
        ForumCollege forumCollege = new ForumCollege();
        forumCollege.setCollege_name(collegeName);
        forumCollege.setCollege_summary(collegeSummary);
        forumCollegeMapper.newCollege(forumCollege);
        System.out.println("newCollege()通过校园信息对象创建新的校园--完成！");
        return "SUCCESS";
    }

    /**
     *通过校园名称删除校园
     */
    @RequestMapping(value ="/deleteCollegeByName")
    public String deleteCollegeByName(@RequestParam("extraId") String collegeName){
        forumCollegeMapper.deleteCollegeByName(collegeName);
        return "SUCCESS";
    }

}