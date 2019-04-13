package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.CollegeUser;
import com.lynn.smilecollege.pojo.UserFans;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户与粉丝关联表对应的数据库接口〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

@Mapper
public interface CollegeUserMapper {
    /**
     * 通过校园id来查询其所有的关注用户id
     * @param collegeId 校园的id
     * @return Result<int>
     */
    List<CollegeUser> findUserByCollegeId(int collegeId);

    /**
     * 通过用户id来查询其关注的所有校园
     * @param userId 用户的id
     * @return Result<int>
     */
    List<CollegeUser> findCollegeByUserId(int userId);

    /**
     * 通过对象来建立一组新的校园关注关系
     * @param collegeUser 校园-用户关系对象
     * @return Result<int>
     */
    int newUserFollow(CollegeUser collegeUser);

    /**
     * 通过对象来删除一组对应校园关注关系
     * @param collegeUser 校园-用户关系对象
     * @return Result<int>
     */
    int deleteFollowById(CollegeUser collegeUser);
}
