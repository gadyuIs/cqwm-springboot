package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 地址簿
 * 地址表，用于存储C端用户的收货地址信息
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddressBook implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键/自增/地址编号
     */
    private Long id;

    /**
     * 地址对应的用户id 逻辑外键
     */
    //用户id
    private Long userId;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 性别
     * 0 女 1 男
     */
    //性别 0 女 1 男
    private String sex;

    /**
     * 省份编码
     */
    private String provinceCode;

    /**
     * 省份名称
     */
    private String provinceName;

    /**
     * 城市编码
     */
    private String cityCode;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 区县编码
     */
    private String districtCode;

    /**
     * 区县名称
     */
    private String districtName;

    /**
     * 详细地址信息
     */
    private String detail;

    /**
     * 标签
     */
    private String label;

    /**
     * 是否默认地址
     * 是否默认 0否 1是
     */
    private Integer isDefault;
}
