package com.company.project.model;

import javax.persistence.*;

@Table(name = "gov_user_role_menu_operater")
public class GovUserRoleMenuOperater {
    /**
     * 政务-用户-角色-菜单-操作
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 政务用户表Id
     */
    @Column(name = "govermentUserId")
    private Integer govermentuserid;

    /**
     * 角色Id
     */
    @Column(name = "govermentRoleId")
    private Integer govermentroleid;

    /**
     * 菜单表Id
     */
    @Column(name = "baseMenuId")
    private Integer basemenuid;

    /**
     * 操作权限表
     */
    @Column(name = "govermentOperater")
    private String govermentoperater;

    /**
     * 自定义名称
     */
    @Column(name = "nikeName")
    private String nikename;

    /**
     * 获取政务-用户-角色-菜单-操作
     *
     * @return id - 政务-用户-角色-菜单-操作
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置政务-用户-角色-菜单-操作
     *
     * @param id 政务-用户-角色-菜单-操作
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取政务用户表Id
     *
     * @return govermentUserId - 政务用户表Id
     */
    public Integer getGovermentuserid() {
        return govermentuserid;
    }

    /**
     * 设置政务用户表Id
     *
     * @param govermentuserid 政务用户表Id
     */
    public void setGovermentuserid(Integer govermentuserid) {
        this.govermentuserid = govermentuserid;
    }

    /**
     * 获取角色Id
     *
     * @return govermentRoleId - 角色Id
     */
    public Integer getGovermentroleid() {
        return govermentroleid;
    }

    /**
     * 设置角色Id
     *
     * @param govermentroleid 角色Id
     */
    public void setGovermentroleid(Integer govermentroleid) {
        this.govermentroleid = govermentroleid;
    }

    /**
     * 获取菜单表Id
     *
     * @return baseMenuId - 菜单表Id
     */
    public Integer getBasemenuid() {
        return basemenuid;
    }

    /**
     * 设置菜单表Id
     *
     * @param basemenuid 菜单表Id
     */
    public void setBasemenuid(Integer basemenuid) {
        this.basemenuid = basemenuid;
    }

    /**
     * 获取操作权限表
     *
     * @return govermentOperater - 操作权限表
     */
    public String getGovermentoperater() {
        return govermentoperater;
    }

    /**
     * 设置操作权限表
     *
     * @param govermentoperater 操作权限表
     */
    public void setGovermentoperater(String govermentoperater) {
        this.govermentoperater = govermentoperater;
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