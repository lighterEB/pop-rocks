package com.tosix7.poprocks.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 字典表
    */
@ApiModel(description="字典表")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysDict {
    /**
    * 编号
    */
    @ApiModelProperty(value="编号")
    private Long id;

    /**
    * 数据值
    */
    @ApiModelProperty(value="数据值")
    private String value;

    /**
    * 标签名
    */
    @ApiModelProperty(value="标签名")
    private String label;

    /**
    * 类型
    */
    @ApiModelProperty(value="类型")
    private String type;

    /**
    * 描述
    */
    @ApiModelProperty(value="描述")
    private String description;

    /**
    * 排序（升序）
    */
    @ApiModelProperty(value="排序（升序）")
    private Long sort;

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
    * 备注信息
    */
    @ApiModelProperty(value="备注信息")
    private String remarks;

    /**
    * 是否删除  -1：已删除  0：正常
    */
    @ApiModelProperty(value="是否删除  -1：已删除  0：正常")
    private Byte delFlag;
}