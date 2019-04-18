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
    @RequestMapping(value ="/findTopicByCollegeId")
    public List<ForumTopic> findTopicByCollegeId(@RequestParam("collegeId") String collegeId
    ){
        int id = Integer.parseInt(collegeId);
        List<ForumTopic> fs = forumTopicMapper.findTopicByCollegeId(id);
        for(ForumTopic f:fs) {
            System.out.println(f.getTopic_title());
        }
        return fs;
    }

    /**
     *通过college校园id和分类号来获取其所有的话题
     */
    @RequestMapping(value ="/findTopicBySort")
    public List<ForumTopic> getAllTopic(@RequestParam("collegeId") String collegeId,
                                        @RequestParam("topicSort") String topicSort
    ){
        int id = Integer.parseInt(collegeId);
        int sort = Integer.parseInt(topicSort);
        ForumTopic f = new ForumTopic();
        f.setCollege_id(id);
        f.setTopic_sort(sort);
        List<ForumTopic> fs = forumTopicMapper.findTopicBySort(f);
        for(ForumTopic k:fs) {
            System.out.println(k.getTopic_title());
        }
        return fs;
    }

    /**
     *根据帖子对象创建新的帖子
     */
    @RequestMapping(value ="/newTopic")
    public String newTopic(@RequestParam("collegeId") String collegeId,@RequestParam("userId") String userId,
                           @RequestParam("userName") String userName,@RequestParam("topicSort") String topicSort,
                           @RequestParam("topicTitle") String topicTitle,@RequestParam("topicContent") String topicContent,
                           @RequestParam("topicDate") String topicDate){
        int cId = Integer.parseInt(collegeId);
        int uId = Integer.parseInt(userId);
        int sort = Integer.parseInt(topicSort);
        int date = Integer.parseInt(topicDate);
        ForumTopic f = new ForumTopic();
        f.setCollege_id(cId);
        f.setUser_id(uId);
        f.setUser_name(userName);
        f.setTopic_sort(sort);
        f.setTopic_title(topicTitle);
        f.setTopic_content(topicContent);
        f.setTopic_date(date);
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