package com.example.demo.Service;

import com.example.demo.Pojo.Role;

/**
 * @Author PengZhang
 * @Date 2020/4/18 21:30
 * @Version 1.0
 */
public interface RoleService {
    Role findRolebyID(Long ID);

    Long[] findRolesIDByUserID(Long ID);
}
