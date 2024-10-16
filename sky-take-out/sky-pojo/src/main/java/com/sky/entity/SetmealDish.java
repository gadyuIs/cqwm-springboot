package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 套餐菜品关系
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetmealDish implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键/自增/套餐菜品关系对应编号
     */
    private Long id;

    /**
     * 套餐id/逻辑外键
     */
    private Long setmealId;

    /**
     * 逻辑外键
     */
    private Long dishId;

    /**
     * 菜品名称 （冗余字段）
     */
    private String name;

    /**
     * 菜品原价 (冗余字段)
     */
    private BigDecimal price;

    /**
     * 菜品份数
     */
    private Integer copies;
}