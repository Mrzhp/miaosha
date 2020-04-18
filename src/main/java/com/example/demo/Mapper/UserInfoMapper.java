package com.example.demo.Mapper;


import com.example.demo.Pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @Author PengZhang
 * @Date 2020/4/13 20:30
 * @Version 1.0
 */
@Repository
public interface UserInfoMapper {
    @Select("SELECT * FROM tb_user where nickName = #{name}")
    public User findByLoginName(String name);
}
