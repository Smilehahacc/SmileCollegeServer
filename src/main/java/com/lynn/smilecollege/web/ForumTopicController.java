package com.lynn.smilecollege.web;

import com.lynn.smilecollege.mapper.ForumTopicMapper;
import com.lynn.smilecollege.pojo.ForumTopic;
import com.lynn.smilecollege.pojo.UserInfor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ForumTopicController {
    /**
     *创建forum_topic帖子主题表操作接口对象
     */
    @Autowired
    ForumTopicMapper forumTopicMapper;

    /**
     *通过college校园id来获取其所有的话题（不考虑分类，所有）
     */
    @RequestMapping(value ="/getAllTopic")
    public List<ForumTopic> getAllTopic(@RequestParam("collegeId") int collegeId
    ){
        List<ForumTopic> fs = forumTopicMapper.findTopicByCollegeId(collegeId);
        for(ForumTopic f:fs) {
            System.out.println(f.getTopic_title());
        }
        return fs;
    }

    /**
     *根据帖子对象创建新的帖子
     */
    @RequestMapping(value ="/newTopic")
    public String newTopic(@RequestParam("collegeId") int collegeId,@RequestParam("userId") int userId,
                           @RequestParam("userName") String userName,@RequestParam("topicSort") int topicSort,
                           @RequestParam("topicTitle") String topicTitle,@RequestParam("topicContent") String topicContent,
                           @RequestParam("topicDate") int topicDate){
        ForumTopic f = new ForumTopic();
        f.setCollege_id(collegeId);
        f.setUser_id(userId);
        f.setUser_name(userName);
        f.setTopic_sort(topicSort);
        f.setTopic_title(topicTitle);
        f.setTopic_content(topicContent);
        f.setTopic_date(topicDate);
        forumTopicMapper.newTopic(f);
        System.out.println("newTopic()创建新的帖子--完成！");
        return "SUCCESS";
    }

    /**
     *通过帖子id删除对应的帖子
     */
    @RequestMapping(value ="/deleteTopicByTopicId")
    public String deleteTopicByTopicId(@RequestParam("topicId") int topicId){
        forumTopicMapper.deleteTopicByTopicId(topicId);
        return "SUCCESS";
    }

}