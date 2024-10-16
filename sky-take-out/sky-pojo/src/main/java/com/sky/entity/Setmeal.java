package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 套餐
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Setmeal implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键/自增/套餐编号
     */
    private Long id;

    /**
     * 套餐编号 逻辑外键
     * 因为还有一个类型表
     */
    private Long categoryId;

    /**
     * 套餐名称
     */
    private String name;

    /**
     * 套餐价格
     */
    private BigDecimal price;

    /**
     * 套餐状态
     *  0:停用 1:启用
     */
    private Integer status;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 图片路径
     */
    private String image;

    /**
     * 创建时间/公共字段
     */
    private LocalDateTime createTime;

    /**
     * 更新时间/公共字段
     */
    private LocalDateTime updateTime;

    /**
     * 创建人id/公共字段
     */
    private Long createUser;

    /**
     * 修改人id/公共字段
     */
    private Long updateUser;
}
