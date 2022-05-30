package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Major;
import com.example.demo.entity.User;
import com.example.demo.service.MajorService;
import com.example.demo.service.UserService;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
            SpringApplication.run(SpringJdbcApplication.class, args);

        UserService userService = context.getBean(UserService.class);
        MajorService majorService = context.getBean(MajorService.class);
        
        List<User> list = userService.findAll();
        List<Major> mList = majorService.findAll();
        
        System.out.println("【student】");
        for (User u : list) {
            System.out.println(u.getUserInfo());
        }
        
        System.out.println("【major】");
        for (Major m : mList) {
        	System.out.println(m.getMajorInfo());
        }
    }
}
