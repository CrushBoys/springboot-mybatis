package com.atguigu.test;

import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {

    @Autowired
    UserService userService;

    @Test
    public void testA(){
        System.out.println("樱桃哦");
        List<User> list = userService.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    //=========================================
    @Autowired
    DataSource dataSource;

    @Test
    public void testDateSource(){
        //class com.zaxxer.hikari.HikariDataSource
        //class com.alibaba.druid.pool.DruidDataSource
        System.out.println(dataSource.getClass());
    }
}
