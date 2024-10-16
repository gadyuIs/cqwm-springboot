package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 菜品口味
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DishFlavor implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 菜品口味编号
     */
    private Long id;

    /**
     * 菜品id
     * 一个菜对应多个口味
     */
    private Long dishId;

    /**
     * 口味名称(应在在前端是固定传递的)
     */
    private String name;

    /**
     * 具体多种口味值(格式是数组字符串)
     */
    private String value;
}
