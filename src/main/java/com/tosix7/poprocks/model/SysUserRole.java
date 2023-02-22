package com.tosix7.poprocks.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 用户角色
    */
@ApiModel(description="用户角色")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysUserRole {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long id;

    /**
    * 用户ID
    */
    @ApiModelProperty(value="用户ID")
    private Long userId;

    /**
    * 角色ID
    */
    @ApiModelProperty(value="角色ID")
    private Long roleId;

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