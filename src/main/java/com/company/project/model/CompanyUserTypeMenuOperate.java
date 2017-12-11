package com.company.project.model;

import javax.persistence.*;

@Table(name = "company_user_type_menu_operate")
public class CompanyUserTypeMenuOperate {
    /**
     * 企业用户-菜单-操作-自定义-企业类型
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 企业用户Id
     */
    @Column(name = "companyUserId")
    private Integer companyuserid;

    /**
     * 企业类型Id
     */
    @Column(name = "companyTypeId")
    private Integer companytypeid;

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
     * 昵称
     */
    @Column(name = "nikeName")
    private String nikename;

    /**
     * 获取企业用户-菜单-操作-自定义-企业类型
     *
     * @return id - 企业用户-菜单-操作-自定义-企业类型
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置企业用户-菜单-操作-自定义-企业类型
     *
     * @param id 企业用户-菜单-操作-自定义-企业类型
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取企业用户Id
     *
     * @return companyUserId - 企业用户Id
     */
    public Integer getCompanyuserid() {
        return companyuserid;
    }

    /**
     * 设置企业用户Id
     *
     * @param companyuserid 企业用户Id
     */
    public void setCompanyuserid(Integer companyuserid) {
        this.companyuserid = companyuserid;
    }

    /**
     * 获取企业类型Id
     *
     * @return companyTypeId - 企业类型Id
     */
    public Integer getCompanytypeid() {
        return companytypeid;
    }

    /**
     * 设置企业类型Id
     *
     * @param companytypeid 企业类型Id
     */
    public void setCompanytypeid(Integer companytypeid) {
        this.companytypeid = companytypeid;
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