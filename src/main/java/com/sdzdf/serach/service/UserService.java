package com.sdzdf.serach.service;

import com.sdzdf.serach.entity.SysUser;

public interface UserService {

    /**
     * 根据用户名获取系统用户
     */
    SysUser getUserByName(String username);

}
