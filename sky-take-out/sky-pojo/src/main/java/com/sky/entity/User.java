package com.sky.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

/**
 * user表为用户表，用于存储C端用户的信息
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键/自增/用户编号
     */
    private Long id;

    /**
     * 微信用户的唯一标识
     */
    private String openid;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 性别 0 女 1 男
     */
    private String sex;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 微信用户头像路径
     */
    private String avatar;

    /**
     * 注册时间
     */
    private LocalDateTime createTime;
}