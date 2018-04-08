package com.jk.dao;

import com.jk.model.Tree;
import com.jk.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/4/4 0004.
 */
@Repository
public interface UserMapper {
    List<User> queryUser();

    List<Tree> getTree();
}
