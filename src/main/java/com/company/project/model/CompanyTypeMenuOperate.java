package com.company.project.model;

import javax.persistence.*;

@Table(name = "company_type_menu_operate")
public class CompanyTypeMenuOperate {
    /**
     * 企业角色对应的菜单操作表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 基础菜单Id
     */
    @Column(name = "baseMenuId")
    private Integer basemenuid;

    /**
     * 角色类型表外键
     */
    @Column(name = "companyTypeId")
    private Integer companytypeid;

    /**
     * 菜单操作Id
     */
    @Column(name = "operateId")
    private String operateid;

    /**
     * 昵称
     */
    @Column(name = "nikeName")
    private String nikename;

    /**
     * 获取企业角色对应的菜单操作表
     *
     * @return id - 企业角色对应的菜单操作表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置企业角色对应的菜单操作表
     *
     * @param id 企业角色对应的菜单操作表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取基础菜单Id
     *
     * @return baseMenuId - 基础菜单Id
     */
    public Integer getBasemenuid() {
        return basemenuid;
    }

    /**
     * 设置基础菜单Id
     *
     * @param basemenuid 基础菜单Id
     */
    public void setBasemenuid(Integer basemenuid) {
        this.basemenuid = basemenuid;
    }

    /**
     * 获取角色类型表外键
     *
     * @return companyTypeId - 角色类型表外键
     */
    public Integer getCompanytypeid() {
        return companytypeid;
    }

    /**
     * 设置角色类型表外键
     *
     * @param companytypeid 角色类型表外键
     */
    public void setCompanytypeid(Integer companytypeid) {
        this.companytypeid = companytypeid;
    }

    /**
     * 获取菜单操作Id
     *
     * @return operateId - 菜单操作Id
     */
    public String getOperateid() {
        return operateid;
    }

    /**
     * 设置菜单操作Id
     *
     * @param operateid 菜单操作Id
     */
    public void setOperateid(String operateid) {
        this.operateid = operateid;
    }

    /**
     * 获取昵称
     *
     * @return nikeName - 昵称
     */
    public String getNikename() {
        return nikename;
    }

    /**
     * 设置昵称
     *
     * @param nikename 昵称
     */
    public void setNikename(String nikename) {
        this.nikename = nikename;
    }
}