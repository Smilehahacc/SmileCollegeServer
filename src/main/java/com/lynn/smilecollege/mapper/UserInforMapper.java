package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.UserInfor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInforMapper {

    /**
     * 通过用户id来注销用户
     * @return Result<List>
     */
    List<UserInfor> findAll();

    /**
     * 通过用户id来注销用户
     * @param userInfor 用户的对象
     * @return Result<int>
     */
    int newUser(UserInfor userInfor);

    /**
     * 通过用户id来注销用户
     * @param id 用户的id
     * @return Result<int>
     */
    int deleteById(int id);

    /**
     * 通过用户id，用户名或者用户电话来查找用户
     * @param userInfor 用户信息对象
     * @return Result<UserInfor>
     */
    UserInfor findByCondition(UserInfor userInfor);

    /**
     * 传入对象，实现用户信息的更新
     * @param userInfor 用户信息对象
     * @return Result<int>
     */
    int updateUser(UserInfor userInfor);
}
