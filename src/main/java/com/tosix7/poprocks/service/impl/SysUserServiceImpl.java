package com.tosix7.poprocks.service.impl;

import com.tosix7.poprocks.mapper.SysUserMapper;
import com.tosix7.poprocks.model.SysUser;
import com.tosix7.poprocks.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }
}
