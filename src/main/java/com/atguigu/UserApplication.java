package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement //开启事务声明
@MapperScan("com.atguigu.dao")
@ServletComponentScan//扫面web组件：@WebListener @WebFilter @WebServlet
@SpringBootApplication
public class UserApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserApplication.class,args);
        System.out.println("11111111111111111MMMMMMMMMM");
        System.out.println("11111111111111111DDDDDDDD");
        System.out.println("猪猪侠");
        System.out.println("孙悟空");
    }
}
