package com.company.project.model;

import javax.persistence.*;

@Table(name = "goverment_user")
public class GovermentUser {
    /**
     * 政务用户表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 账号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 类型 1市 2区
     */
    @Column(name = "areaType")
    private Integer areatype;

    /**
     * 区域Id
     */
    @Column(name = "areaId")
    private Integer areaid;

    /**
     * 政务部门Id
     */
    @Column(name = "govermentDepartmentId")
    private Integer govermentdepartmentid;

    /**
     * 政务角色Id
     */
    @Column(name = "govermentRoleId")
    private Integer govermentroleid;

    /**
     * 描述
     */
    private String descption;

    /**
     * 账号对应的标段ID
     */
    @Column(name = "tendersId")
    private String tendersid;

    /**
     * 该账号所属的人的名字
     */
    private String name;

    /**
     * 获取政务用户表
     *
     * @return id - 政务用户表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置政务用户表
     *
     * @param id 政务用户表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取账号
     *
     * @return username - 账号
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置账号
     *
     * @param username 账号
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取类型 1市 2区
     *
     * @return areaType - 类型 1市 2区
     */
    public Integer getAreatype() {
        return areatype;
    }

    /**
     * 设置类型 1市 2区
     *
     * @param areatype 类型 1市 2区
     */
    public void setAreatype(Integer areatype) {
        this.areatype = areatype;
    }

    /**
     * 获取区域Id
     *
     * @return areaId - 区域Id
     */
    public Integer getAreaid() {
        return areaid;
    }

    /**
     * 设置区域Id
     *
     * @param areaid 区域Id
     */
    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    /**
     * 获取政务部门Id
     *
     * @return govermentDepartmentId - 政务部门Id
     */
    public Integer getGovermentdepartmentid() {
        return govermentdepartmentid;
    }

    /**
     * 设置政务部门Id
     *
     * @param govermentdepartmentid 政务部门Id
     */
    public void setGovermentdepartmentid(Integer govermentdepartmentid) {
        this.govermentdepartmentid = govermentdepartmentid;
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
     * 获取账号对应的标段ID
     *
     * @return tendersId - 账号对应的标段ID
     */
    public String getTendersid() {
        return tendersid;
    }

    /**
     * 设置账号对应的标段ID
     *
     * @param tendersid 账号对应的标段ID
     */
    public void setTendersid(String tendersid) {
        this.tendersid = tendersid;
    }

    /**
     * 获取该账号所属的人的名字
     *
     * @return name - 该账号所属的人的名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置该账号所属的人的名字
     *
     * @param name 该账号所属的人的名字
     */
    public void setName(String name) {
        this.name = name;
    }
}