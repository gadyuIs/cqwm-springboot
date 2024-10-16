package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键/自增/种类编号
     */
    private Long id;

    /**
     * 分类类型
     * 1菜品分类 2套餐分类
     */
    private Integer type;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 用于分类数据的排序
     */
    private Integer sort;

    /**
     * 分类状态 0标识禁用 1表示启用
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
     * 创建人id
     */
    private Long createUser;

    /**
     * 修改人id
     */
    private Long updateUser;
}
