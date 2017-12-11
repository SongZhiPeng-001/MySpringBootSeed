package com.company.project.model;

import javax.persistence.*;

@Table(name = "project_role_menu_operate")
public class ProjectRoleMenuOperate {
    /**
     * 角色-菜单-操作
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色表
     */
    @Column(name = "roleId")
    private Integer roleid;

    /**
     * 菜单Id
     */
    @Column(name = "menuId")
    private Integer menuid;

    /**
     * 操作Id
     */
    @Column(name = "operateId")
    private String operateid;

    /**
     * 自定义名称
     */
    @Column(name = "nikeName")
    private String nikename;

    /**
     * 获取角色-菜单-操作
     *
     * @return id - 角色-菜单-操作
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置角色-菜单-操作
     *
     * @param id 角色-菜单-操作
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色表
     *
     * @return roleId - 角色表
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置角色表
     *
     * @param roleid 角色表
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取菜单Id
     *
     * @return menuId - 菜单Id
     */
    public Integer getMenuid() {
        return menuid;
    }

    /**
     * 设置菜单Id
     *
     * @param menuid 菜单Id
     */
    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * 获取操作Id
     *
     * @return operateId - 操作Id
     */
    public String getOperateid() {
        return operateid;
    }

    /**
     * 设置操作Id
     *
     * @param operateid 操作Id
     */
    public void setOperateid(String operateid) {
        this.operateid = operateid;
    }

    /**
     * 获取自定义名称
     *
     * @return nikeName - 自定义名称
     */
    public String getNikename() {
        return nikename;
    }

    /**
     * 设置自定义名称
     *
     * @param nikename 自定义名称
     */
    public void setNikename(String nikename) {
        this.nikename = nikename;
    }
}