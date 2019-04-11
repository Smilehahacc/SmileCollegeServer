package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.UserFans;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户与粉丝关联表对应的数据库接口〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

public interface UserFansMapper {
    /**
     * 通过用户id来查询其所对应的所有粉丝id
     * @param userId 帖子主题的id
     * @return Result<int>
     */
    List<UserFans> findFansByUserId(int userId);

    /**
     * 通过粉丝id来查询其关注的用户id
     * @param fansId 帖子主题的id
     * @return Result<int>
     */
    List<UserFans> findUserByFansId(int fansId);

    /**
     * 通过粉丝对象来建立一组新的粉丝关系
     * @param userFans 帖子主题的id
     * @return Result<int>
     */
    int newFans(UserFans userFans);

    /**
     * 通过粉丝对象来删除一组对应粉丝关系
     * @param userFans 帖子主题的id
     * @return Result<int>
     */
    int deleteFansByFansId(UserFans userFans);
}
