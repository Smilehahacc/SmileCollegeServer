package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.Category;
import com.lynn.smilecollege.pojo.UserInfor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInforMapper {

    List<UserInfor> findAll();

    int newUser(UserInfor userInfor);

    void delete(int id);

    UserInfor findById(int id);

    UserInfor findByName(String name);

    UserInfor findByPhone(String phone);

    int updateUser(UserInfor userInfor);
}
