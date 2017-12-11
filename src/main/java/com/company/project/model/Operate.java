package com.company.project.model;

import javax.persistence.*;

public class Operate {
    /**
     * 操作表(增删改查 导出 权限）
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 描述
     */
    private String desc;

    /**
     * 获取操作表(增删改查 导出 权限）
     *
     * @return id - 操作表(增删改查 导出 权限）
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置操作表(增删改查 导出 权限）
     *
     * @param id 操作表(增删改查 导出 权限）
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取描述
     *
     * @return desc - 描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置描述
     *
     * @param desc 描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}