package com.tosix7.poprocks.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 用户管理
    */
@ApiModel(description="用户管理")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUser {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long id;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String name;

    /**
    * 昵称
    */
    @ApiModelProperty(value="昵称")
    private String nickName;

    /**
    * 头像
    */
    @ApiModelProperty(value="头像")
    private String avatar;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String password;

    /**
    * 加密盐
    */
    @ApiModelProperty(value="加密盐")
    private String salt;

    /**
    * 邮箱
    */
    @ApiModelProperty(value="邮箱")
    private String email;

    /**
    * 手机号
    */
    @ApiModelProperty(value="手机号")
    private String mobile;

    /**
    * 状态  0：禁用   1：正常
    */
    @ApiModelProperty(value="状态  0：禁用   1：正常")
    private Byte status;

    /**
    * 机构ID
    */
    @ApiModelProperty(value="机构ID")
    private Long deptId;

    /**
    * 创建人
    */
    @ApiModelProperty(value="创建人")
    private String createBy;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 更新人
    */
    @ApiModelProperty(value="更新人")
    private String lastUpdateBy;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private Date lastUpdateTime;

    /**
    * 是否删除  -1：已删除  0：正常
    */
    @ApiModelProperty(value="是否删除  -1：已删除  0：正常")
    private Byte delFlag;
}