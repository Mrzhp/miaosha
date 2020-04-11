package com.example.demo.Mapper;

import com.example.demo.Pojo.Item;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @Author PengZhang
 * @Date 2020/4/11 23:10
 * @Version 1.0
 */
@Repository
public interface mappertest {
    @Select("SELECT * FROM item WHERE id = #{id}")
    Item getItemById(Integer id);
}
