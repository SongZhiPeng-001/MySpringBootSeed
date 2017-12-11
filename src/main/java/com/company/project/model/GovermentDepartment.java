package com.company.project.model;

import javax.persistence.*;

@Table(name = "goverment_department")
public class GovermentDepartment {
    /**
     * 政务端部门表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 父级Id  当为null 时为父级部门
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 描述
     */
    private String descption;

    /**
     * 部门负责人
     */
    private String manager;

    /**
     * 部门负责人电话号码
     */
    private String telephone;

    /**
     * 获取政务端部门表
     *
     * @return id - 政务端部门表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置政务端部门表
     *
     * @param id 政务端部门表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门名称
     *
     * @return name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父级Id  当为null 时为父级部门
     *
     * @return parentId - 父级Id  当为null 时为父级部门
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父级Id  当为null 时为父级部门
     *
     * @param parentid 父级Id  当为null 时为父级部门
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取描述
     *
     * @return descption - 描述
     */
    public String getDescption() {
        return descption;
    }

    /**
     * 设置描述
     *
     * @param descption 描述
     */
    public void setDescption(String descption) {
        this.descption = descption;
    }

    /**
     * 获取部门负责人
     *
     * @return manager - 部门负责人
     */
    public String getManager() {
        return manager;
    }

    /**
     * 设置部门负责人
     *
     * @param manager 部门负责人
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * 获取部门负责人电话号码
     *
     * @return telephone - 部门负责人电话号码
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置部门负责人电话号码
     *
     * @param telephone 部门负责人电话号码
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}