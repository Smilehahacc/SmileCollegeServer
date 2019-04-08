package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<Category> findAll();

    int save(Category category);

    void delete(int id);

    Category get(int id);

    int update(Category category);
}
