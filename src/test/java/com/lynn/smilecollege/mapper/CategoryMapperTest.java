package com.lynn.smilecollege.mapper;

import com.lynn.smilecollege.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Run.class)
@EnableAutoConfiguration
public class CategoryMapperTest {

    @Resource
    CategoryMapper categoryMapper;

    @Test
    public void findAll() {
        List<Category> cs = categoryMapper.findAll();
        for (Category c : cs) {
            System.out.println(c.getName());
        }
    }

    @Test
    public void save() {
        Category c = new Category();
        c.setName("我喜欢你");
        categoryMapper.save(c);
        System.out.println("保存新数据成功！");
    }

    @Test
    public void delete() {
        categoryMapper.delete(7);
        System.out.println("删除数据成功！");
    }

    @Test
    public void get() {
        Category c = categoryMapper.get(5);
        System.out.println(c.getName());
    }

    @Test
    public void update() {
        Category c = new Category();
        c.setId(5);
        c.setName("hahaPlus");
        categoryMapper.update(c);
        findAll();
    }
}