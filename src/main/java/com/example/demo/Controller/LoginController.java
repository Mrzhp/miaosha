package com.example.demo.Controller;

import com.example.demo.Mapper.mappertest;
import com.example.demo.Pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private mappertest mappertest;

    @GetMapping("/")
    public Item testSql(){
        Item  item = mappertest.getItemById(6);
        if(item == null)
        {
            System.out.println("垃圾");
            return null;
        }
        return item;
    }
}
