package com.example.demo.Mapper;

import com.example.demo.Pojo.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author PengZhang
 * @Date 2020/4/18 21:38
 * @Version 1.0
 */
@Repository
public interface RoleMapper {

    @Select("SELECT * FROM tb_role WHERE ID = #{ID}")
    Role findRolebyID(Long ID);

    @Select("SELECT * FROM user_role WHERE UID = #{ID}")
    Long[] findRolesIDByUserID(Long ID);
}
