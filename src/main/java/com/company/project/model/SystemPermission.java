package com.company.project.model;

import javax.persistence.*;

@Table(name = "system_permission")
public class SystemPermission {
    /**
     * 系统权限表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 模块id，对应前段按钮id或者栏目id
     */
    @Column(name = "moduleId")
    private String moduleid;

    /**
     * 父级id 从属关系,0则为最高级栏目
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 对应url，短路径
     */
    private String url;

    /**
     * 状态 1正常 -1删除
     */
    private String status;

    /**
     * 获取系统权限表
     *
     * @return id - 系统权限表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置系统权限表
     *
     * @param id 系统权限表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限名称
     *
     * @return name - 权限名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置权限名称
     *
     * @param name 权限名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取模块id，对应前段按钮id或者栏目id
     *
     * @return moduleId - 模块id，对应前段按钮id或者栏目id
     */
    public String getModuleid() {
        return moduleid;
    }

    /**
     * 设置模块id，对应前段按钮id或者栏目id
     *
     * @param moduleid 模块id，对应前段按钮id或者栏目id
     */
    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    /**
     * 获取父级id 从属关系,0则为最高级栏目
     *
     * @return parentId - 父级id 从属关系,0则为最高级栏目
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父级id 从属关系,0则为最高级栏目
     *
     * @param parentid 父级id 从属关系,0则为最高级栏目
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取对应url，短路径
     *
     * @return url - 对应url，短路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置对应url，短路径
     *
     * @param url 对应url，短路径
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取状态 1正常 -1删除
     *
     * @return status - 状态 1正常 -1删除
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 1正常 -1删除
     *
     * @param status 状态 1正常 -1删除
     */
    public void setStatus(String status) {
        this.status = status;
    }
}