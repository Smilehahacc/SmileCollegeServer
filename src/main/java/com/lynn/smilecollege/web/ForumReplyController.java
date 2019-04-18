package com.lynn.smilecollege.web;

import com.lynn.smilecollege.mapper.ForumReplyMapper;
import com.lynn.smilecollege.mapper.ForumTopicMapper;
import com.lynn.smilecollege.pojo.ForumReply;
import com.lynn.smilecollege.pojo.ForumTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ForumReplyController {
    /**
     *创建forum_reply回复表操作接口对象
     */
    @Autowired
    ForumReplyMapper forumReplyMapper;

    /**
     *通过帖子id查询下面的所有回复
     */
    @RequestMapping(value ="/findReplyByTopicId")
    public List<ForumReply> findReplyByTopicId(@RequestParam("topicId") int topicId
    ){
        List<ForumReply> fs = forumReplyMapper.findReplyByTopicId(topicId);
        for(ForumReply f:fs) {
            System.out.println(f.getReply_content());
        }
        System.out.println("findByReplyId()通过帖子id查询回复--完成！");
        return fs;
    }

    /**
     *通过对象，创建对应帖子底下的回复
     */
    @RequestMapping(value ="/newReply")
    public String newTopic(@RequestParam("topicId") String topicId,@RequestParam("userId") String userId,
                           @RequestParam("userName") String userName,@RequestParam("replyContent") String replyContent,
                           @RequestParam("replyDate") String replyDate, @RequestParam("replyImage") String replyImage){
        int cId = Integer.parseInt(topicId);
        int uId = Integer.parseInt(userId);
        int date = Integer.parseInt(replyDate);
        ForumReply f = new ForumReply();
        f.setTopic_id(cId);
        f.setUser_id(uId);
        f.setUser_name(userName);
        f.setReply_content(replyContent);
        f.setReply_date(date);
        f.setReply_image(replyImage);
        forumReplyMapper.newReply(f);
        System.out.println("newReply()创建新的回复--完成！");
        return "SUCCESS";
    }

    /**
     *通过reply_id回复id删除对应回复
     */
    @RequestMapping(value ="/deleteReplyByReplyId")
    public String deleteReplyByReplyId(@RequestParam("replyId") int replyId){
        forumReplyMapper.deleteReplyByReplyId(replyId);
        return "SUCCESS";
    }

}