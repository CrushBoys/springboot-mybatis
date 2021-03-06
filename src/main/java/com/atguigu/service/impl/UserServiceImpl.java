package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.domain.User;
import com.atguigu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    //@Resource
    UserDao userDao;

    @Autowired
    RedisTemplate redisTemplate;

    //@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = true)
    @Override
    public List<User> findAll() {
        String key = "樱桃";
        List<User> userList = (List<User>) redisTemplate.boundValueOps(key).get();
        if (userList != null) {
            System.out.println("从redis中获取数据：" + userList);
            return userList;
        }
        userList = userDao.findAll();
        redisTemplate.boundValueOps(key).set(userList);
        System.out.println("从数据库中获取数据：" + userList);
        return userList;
    }


}
