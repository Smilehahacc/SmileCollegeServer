package com.lynn.smilecollege.web;
import com.lynn.smilecollege.mapper.UserInforMapper;
import com.lynn.smilecollege.pojo.UserInfor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserInforController {
    @Autowired
    UserInforMapper userInforMapper;

    @RequestMapping(value ="/register" ,method = RequestMethod.GET)
    public void weekdayAdd(@RequestParam("name") String name,@RequestParam("password") String password,
                           @RequestParam("email") String email,@RequestParam("phone") String phone
    ){
        UserInfor userInfor = new UserInfor();
        userInfor.setInfor_name(name);
        userInfor.setInfor_password(password);
        userInfor.setInfor_email(email);
        userInfor.setInfor_phone(phone);
        userInforMapper.newUser(userInfor);
    }

    @RequestMapping(value ="/findAll" ,method = RequestMethod.GET)
    public List<UserInfor> getUserList(){
        System.out.println("查询所有执行");
        return  userInforMapper.findAll();
    }
}