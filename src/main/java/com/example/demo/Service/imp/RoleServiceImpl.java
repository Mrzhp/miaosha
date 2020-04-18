package com.example.demo.Service.imp;

import com.example.demo.Mapper.RoleMapper;
import com.example.demo.Pojo.Role;
import com.example.demo.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author PengZhang
 * @Date 2020/4/18 21:30
 * @Version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Override
    public Role findRolebyID(Long ID) {
        Role role = roleMapper.findRolebyID(ID);
        return role;
    }

    @Override
    public Long[] findRolesIDByUserID(Long ID) {
        return new Long[0];
    }
}
