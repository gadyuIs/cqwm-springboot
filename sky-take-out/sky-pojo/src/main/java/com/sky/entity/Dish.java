package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 菜品
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dish implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键/自增/菜品编号
     */
    private Long id;

    /**
     * unique/菜品名称
     */
    private String name;

    /**
     * 菜品分类id 逻辑外键
     */
    private Long categoryId;

    /**
     * 菜品价格
     */
    private BigDecimal price;

    /**
     * 图片路径
     */
    private String image;

    /**
     * 描述信息
     */
    private String description;

    /**
     * 售卖状态 0 停售 1 起售
     */
    private Integer status;

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
     * 更新人id/公共字段
     */
    private Long updateUser;

}
