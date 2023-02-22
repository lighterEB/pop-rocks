package com.tosix7.poprocks.mapper;

import com.tosix7.poprocks.model.SysUser;

import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 查询所有
     * @return
     */
    List<SysUser> findAll();
}