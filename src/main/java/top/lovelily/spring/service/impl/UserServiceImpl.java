package top.lovelily.spring.service.impl;

import top.lovelily.spring.entity.User;
import top.lovelily.spring.service.UserService;

/**
 * Desc: UserServiceImpl
 * Author: Xu He
 * created: 2021/5/14 16:04
 */

public class UserServiceImpl implements UserService {
    public User get() {
        return new User();
    }

    public void save(User user) {
        System.out.println("save: " + user);
    }
}
