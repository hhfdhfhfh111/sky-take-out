package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.CategoryPageQueryDTO;
import com.sky.entity.Category;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {


    Page<Category> querypage(CategoryPageQueryDTO categoryPageQueryDTO);

    @Select("insert into category(name,type,sort,create_time,update_time,create_user,update_user,status)" +
            "    values (#{name},#{type},#{sort},#{createTime},#{updateTime},#{createUser},#{updateUser},#{status})")
    void insert(Category category);

    @Delete("delete from category where id = #{id}")
    void deleteById(Long id);

    void update(Category category);

    List<Category> list(Integer type);
}
