package com.tosix7.poprocks.service;

import com.tosix7.poprocks.model.SysUser;

import java.util.List;

public interface SysUserService {

    /**
     * 查询所有用户
     * @return
     */
    List<SysUser> findAll();
}
