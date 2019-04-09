package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.UserInfor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInforMapper {

    List<UserInfor> findAll();

    int newUser(UserInfor userInfor);

    void deleteById(int id);

    UserInfor findByCondition(UserInfor userInfor);

    int updateUser(UserInfor userInfor);
}
