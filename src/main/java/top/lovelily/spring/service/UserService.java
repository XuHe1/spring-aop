package top.lovelily.spring.service;

import top.lovelily.spring.entity.User;

/**
 * Desc: UserService
 * Author: Xu He
 * created: 2021/5/14 16:04
 */
public interface UserService {
    User get();
    void save(User user);
}
