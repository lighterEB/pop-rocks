package com.tosix7.poprocks.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 机构管理
    */
@ApiModel(description="机构管理")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysDept {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long id;

    /**
    * 机构名称
    */
    @ApiModelProperty(value="机构名称")
    private String name;

    /**
    * 上级机构ID，一级机构为0
    */
    @ApiModelProperty(value="上级机构ID，一级机构为0")
    private Long parentId;

    /**
    * 排序
    */
    @ApiModelProperty(value="排序")
    private Integer orderNum;

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