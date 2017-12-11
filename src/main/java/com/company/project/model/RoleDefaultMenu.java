package com.company.project.model;

import javax.persistence.*;

@Table(name = "role_default_menu")
public class RoleDefaultMenu {
    /**
     * 角色权限表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * base_menu表的外键
     */
    @Column(name = "menuId")
    private Integer menuid;

    /**
     * operate外键。可操作内容 1,2,3
     */
    @Column(name = "operateId")
    private String operateid;

    /**
     * worker_role表外键，角色的权限与用户权限区分
     */
    @Column(name = "roleId")
    private Integer roleid;

    /**
     * 状态： 1.正常 0删除
     */
    private Integer status;

    /**
     * 获取角色权限表
     *
     * @return id - 角色权限表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置角色权限表
     *
     * @param id 角色权限表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取base_menu表的外键
     *
     * @return menuId - base_menu表的外键
     */
    public Integer getMenuid() {
        return menuid;
    }

    /**
     * 设置base_menu表的外键
     *
     * @param menuid base_menu表的外键
     */
    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * 获取operate外键。可操作内容 1,2,3
     *
     * @return operateId - operate外键。可操作内容 1,2,3
     */
    public String getOperateid() {
        return operateid;
    }

    /**
     * 设置operate外键。可操作内容 1,2,3
     *
     * @param operateid operate外键。可操作内容 1,2,3
     */
    public void setOperateid(String operateid) {
        this.operateid = operateid;
    }

    /**
     * 获取worker_role表外键，角色的权限与用户权限区分
     *
     * @return roleId - worker_role表外键，角色的权限与用户权限区分
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置worker_role表外键，角色的权限与用户权限区分
     *
     * @param roleid worker_role表外键，角色的权限与用户权限区分
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取状态： 1.正常 0删除
     *
     * @return status - 状态： 1.正常 0删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态： 1.正常 0删除
     *
     * @param status 状态： 1.正常 0删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}