package com.example.tccdemo.service;

import com.example.tccdemo.db131.dao.UserMapper;
import com.example.tccdemo.db131.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class UserService {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private CuratorFramework zkClient;


    public List<User> getAllUsers() {

        return userMapper.selectAllUsers();
    }

    public int delUser(Integer userId) {
        User user = userMapper.selectByPrimaryKey(userId);
        if (user!=null){
            log.info("用户存在，用户为："+userId);
            return userMapper.deleteByPrimaryKey(userId);
        }
        log.info("用户不存在存在，用户为："+userId);
        return 0;
    }

    public User selectById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public int insertUser(User user, String token) throws Exception {
        InterProcessMutex lock = new InterProcessMutex(zkClient, "/"+token);
        //指定token 第一次请求,直接返回true,之后的请求将等待15s,并返回false
        boolean isLock = lock.acquire(15, TimeUnit.SECONDS);
        if (isLock){
            int rows = userMapper.insertSelective(user);
            System.out.println("新增结果.."+rows);
            return rows;
        }
        return 0;
    }
}
