package org.yangxin.service;

import org.yangxin.pojo.Users;
import org.yangxin.pojo.bo.UserBO;

/**
 * 用户Service
 *
 * @author yangxin
 * 2019/11/13 21:31
 */
public interface UserService {
    /**
     * 判断用户名是否存在
     *
     * @param username 用户名
     * @return 是否存在
     */
    boolean queryUsernameIsExist(String username);

    /**
     * 创建用户
     */
    Users createUser(UserBO userBO);
}
