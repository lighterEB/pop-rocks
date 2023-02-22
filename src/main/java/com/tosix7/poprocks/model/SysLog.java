package com.tosix7.poprocks.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 系统操作日志
    */
@ApiModel(description="系统操作日志")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysLog {
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
    * 用户操作
    */
    @ApiModelProperty(value="用户操作")
    private String operation;

    /**
    * 请求方法
    */
    @ApiModelProperty(value="请求方法")
    private String method;

    /**
    * 请求参数
    */
    @ApiModelProperty(value="请求参数")
    private String params;

    /**
    * 执行时长(毫秒)
    */
    @ApiModelProperty(value="执行时长(毫秒)")
    private Long time;

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