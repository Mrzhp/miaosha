package com.example.demo.Controller;


import com.example.demo.Error.BusinessException;
import com.example.demo.Error.EmBusinessError;
import com.example.demo.Pojo.UserInfo;
import com.example.demo.Service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user",produces = "application/json; charset=utf-8")
public class LoginController extends BaseController{
    @Autowired
    UserServiceImp userServiceImp;
    @GetMapping("/currentuser")
    public UserInfo getUserInfo(@RequestParam(name = "id")Integer id) throws BusinessException {
        UserInfo userInfoById = userServiceImp.getUserInfoById(id);
        if(userInfoById == null){
            throw new BusinessException(EmBusinessError.USER_NOT_EXIST);
        }
        return userInfoById;
    }
}
