package com.company.project.model;

import javax.persistence.*;

@Table(name = "project_nikename")
public class ProjectNikename {
    /**
     * 项目自定义菜单表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 自定义菜单名称
     */
    @Column(name = "nikeName")
    private String nikename;

    /**
     * 获取项目自定义菜单表
     *
     * @return id - 项目自定义菜单表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置项目自定义菜单表
     *
     * @param id 项目自定义菜单表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取自定义菜单名称
     *
     * @return nikeName - 自定义菜单名称
     */
    public String getNikename() {
        return nikename;
    }

    /**
     * 设置自定义菜单名称
     *
     * @param nikename 自定义菜单名称
     */
    public void setNikename(String nikename) {
        this.nikename = nikename;
    }
}