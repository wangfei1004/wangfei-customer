package com.jk.service;

import com.jk.dao.UserMapper;
import com.jk.model.Tree;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/4/4 0004.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> queryUser() {
        return userMapper.queryUser();
    }

    public List<Tree> getTree() {
        return userMapper.getTree();
    }
}
