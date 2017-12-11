package com.company.project.model;

import javax.persistence.*;

@Table(name = "gov_role_menu_operate")
public class GovRoleMenuOperate {
    /**
     * 政务-角色-菜单-操作
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 政务角色Id
     */
    @Column(name = "govermentRoleId")
    private Integer govermentroleid;

    /**
     * 菜单Id
     */
    @Column(name = "baseMenuId")
    private Integer basemenuid;

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
     * 获取政务-角色-菜单-操作
     *
     * @return id - 政务-角色-菜单-操作
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置政务-角色-菜单-操作
     *
     * @param id 政务-角色-菜单-操作
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取政务角色Id
     *
     * @return govermentRoleId - 政务角色Id
     */
    public Integer getGovermentroleid() {
        return govermentroleid;
    }

    /**
     * 设置政务角色Id
     *
     * @param govermentroleid 政务角色Id
     */
    public void setGovermentroleid(Integer govermentroleid) {
        this.govermentroleid = govermentroleid;
    }

    /**
     * 获取菜单Id
     *
     * @return baseMenuId - 菜单Id
     */
    public Integer getBasemenuid() {
        return basemenuid;
    }

    /**
     * 设置菜单Id
     *
     * @param basemenuid 菜单Id
     */
    public void setBasemenuid(Integer basemenuid) {
        this.basemenuid = basemenuid;
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