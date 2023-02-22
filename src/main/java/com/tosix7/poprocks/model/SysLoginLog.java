package com.tosix7.poprocks.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 系统登录日志
    */
@ApiModel(description="系统登录日志")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysLoginLog {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long id;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String userName;

    /**
    * 登录状态（online:在线，登录初始状态，方便统计在线人数；login:退出登录后将online置为login；logout:退出登录）
    */
    @ApiModelProperty(value="登录状态（online:在线，登录初始状态，方便统计在线人数；login:退出登录后将online置为login；logout:退出登录）")
    private String status;

    /**
    * IP地址
    */
    @ApiModelProperty(value="IP地址")
    private String ip;

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
}