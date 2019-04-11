package com.lynn.smilecollege.web;

import com.lynn.smilecollege.mapper.ReplyExtraMapper;
import com.lynn.smilecollege.pojo.ReplyExtra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReplyExtraController {
    /**
     *创建reply_extra额外回复表操作接口对象
     */
    @Autowired
    ReplyExtraMapper replyExtraMapper;

    /**
     *通过回复id查询额外回复
     */
    @RequestMapping(value ="/findExtraByReplyId")
    public List<ReplyExtra> findExtraByReplyId(@RequestParam("replyId") int replyId
    ){
        List<ReplyExtra> rs = replyExtraMapper.findExtraByReplyId(replyId);
        for(ReplyExtra r:rs) {
            System.out.println(r.getExtra_content());
        }
        System.out.println("findExtraByReplyId()通过回复id查询额外回复--测试完成！");
        return rs;
    }

    /**
     *通过传入参数创建新的额外回复
     */
    @RequestMapping(value ="/newReply")
    public String newTopic(@RequestParam("replyId") int replyId,@RequestParam("userId") int userId,
                           @RequestParam("extraContent") String extraContent,@RequestParam("extraDate") int extraDate
    ){
        ReplyExtra r = new ReplyExtra();
        r.setReply_id(replyId);
        r.setUser_id(userId);
        r.setExtra_content(extraContent);
        r.setExtra_date(extraDate);
        replyExtraMapper.newExtra(r);
        System.out.println("newReply()创建新的额外回复--测试完成！");
        return "SUCCESS";
    }

    /**
     *
     */
    @RequestMapping(value ="/deleteExtraByExtraId")
    public String deleteExtraByExtraId(@RequestParam("extraId") int extraId){
        replyExtraMapper.deleteExtraByExtraId(extraId);
        return "SUCCESS";
    }

}