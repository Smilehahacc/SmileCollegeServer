package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.ForumCollege;
import com.lynn.smilecollege.pojo.ReplyExtra;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈校园对应的接口方法〉
 *
 * @author 景景
 * @create 2019/4/11
 * @since 1.0.0
 */

@Mapper
public interface ForumCollegeMapper {


    /**
     * 查询所有的校园
     * @return Result<List>
     */
    List<ForumCollege> findAllCollege();

    /**
     * 通过传入的对象来创建新的额外回复
     * @param collegeName 校园的名称
     * @return Result<List>
     */
    ForumCollege findCollegeByName(String collegeName);

    /**
     * 通过传入的对象来创建新的校园
     * @param forumCollege 校园的对象
     * @return Result<int>
     */
    int newCollege(ForumCollege forumCollege);

    /**
     * 通过校园名称来删除校园
     * @param collegeName 校园的名称
     * @return Result<int>
     */
    int deleteCollegeByName(String collegeName);
}
