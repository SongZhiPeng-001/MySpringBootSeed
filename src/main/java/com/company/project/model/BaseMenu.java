package com.company.project.model;

import javax.persistence.*;

@Table(name = "base_menu")
public class BaseMenu {
    /**
     * 菜单表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 模块对应的URL 
     */
    @Column(name = "moudleUrl")
    private String moudleurl;

    /**
     * 状态 1启用   -1禁用
     */
    private Integer status;

    /**
     * 父级菜单Id 若为# 代表一级菜单
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 获取菜单表
     *
     * @return id - 菜单表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置菜单表
     *
     * @param id 菜单表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取菜单名称
     *
     * @return name - 菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单名称
     *
     * @param name 菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取模块对应的URL 
     *
     * @return moudleUrl - 模块对应的URL 
     */
    public String getMoudleurl() {
        return moudleurl;
    }

    /**
     * 设置模块对应的URL 
     *
     * @param moudleurl 模块对应的URL 
     */
    public void setMoudleurl(String moudleurl) {
        this.moudleurl = moudleurl;
    }

    /**
     * 获取状态 1启用   -1禁用
     *
     * @return status - 状态 1启用   -1禁用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1启用   -1禁用
     *
     * @param status 状态 1启用   -1禁用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取父级菜单Id 若为# 代表一级菜单
     *
     * @return parentId - 父级菜单Id 若为# 代表一级菜单
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父级菜单Id 若为# 代表一级菜单
     *
     * @param parentid 父级菜单Id 若为# 代表一级菜单
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}