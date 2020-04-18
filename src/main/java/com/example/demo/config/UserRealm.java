package com.example.demo.config;



import com.example.demo.Pojo.Permission;
import com.example.demo.Pojo.Role;
import com.example.demo.Pojo.User;
import com.example.demo.Service.imp.PermissionServiceImpl;
import com.example.demo.Service.imp.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;


@Component
public class UserRealm extends AbstractUserRealm{

    @Autowired
    RoleServiceImpl roleService;

    @Autowired
    PermissionServiceImpl permissionService;

    @Override
    public UserRolesAndPermissions doGetGroupAuthorizationInfo(User userInfo) {
        Set<String> userRoles = new HashSet<>();
        Set<String> userPermissions = new HashSet<>();
        //获取当前用户下拥有的所有角色及权限
        Long[] roleIDs=roleService.findRolesByUser(userInfo.getId());
        for(Long id:roleIDs){
            Role role=roleService.findRolebyID(id);
            if(null!=role){
                userRoles.add(role.getName());
                //取出每个角色的所有权限
                Long[] permisionIDs =permissionService.findPermissionsByRole(role.getId());
                for(Long pid:permisionIDs){
                    Permission permission=permissionService.findPermissionByID(pid);
                    if(null!=permission){
                        if(!userPermissions.contains(permission.getName())){
                            userPermissions.add(permission.getName());
                        }
                    }
                }
            }
        }
        return new UserRolesAndPermissions(userRoles, userPermissions);
    }

    @Override
    public UserRolesAndPermissions doGetRoleAuthorizationInfo(User userInfo) {
        return doGetGroupAuthorizationInfo(userInfo);
    }
}
