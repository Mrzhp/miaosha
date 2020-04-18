package com.example.demo.Service.imp;

import com.example.demo.Mapper.UserInfoMapper;
import com.example.demo.Pojo.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author PengZhang
 * @Date 2020/4/13 20:06
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public User findUserByName(String name) {
        User userInfo = userInfoMapper.findByLoginName(name);
        return userInfo;
    }

}
