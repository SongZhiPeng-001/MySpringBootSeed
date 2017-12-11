package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Project {
    /**
     * 项目信息表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目名称
     */
    @Column(name = "projectName")
    private String projectname;

    /**
     * 项目编号
     */
    @Column(name = "projectNo")
    private String projectno;

    /**
     * 项目预算
     */
    private String budget;

    /**
     * 建设单位
     */
    @Column(name = "buildDepartment")
    private String builddepartment;

    /**
     * 施工单位 enterprise 表外键
     */
    @Column(name = "enterpriseId")
    private Integer enterpriseid;

    /**
     * 监管单位
     */
    @Column(name = "superviseDepartment")
    private String supervisedepartment;

    /**
     * 项目联系人姓名
     */
    @Column(name = "proLinkName")
    private String prolinkname;

    /**
     * 项目联系人号码
     */
    @Column(name = "proLinkInfo")
    private String prolinkinfo;

    /**
     * 劳资管理员姓名
     */
    @Column(name = "wagesManager")
    private String wagesmanager;

    /**
     * 劳资管理员联系方式
     */
    @Column(name = "wagesLinkInfo")
    private String wageslinkinfo;

    /**
     * 项目区域id，scopeType=1省表外键 =2市外键 =3区县外键
     */
    @Column(name = "scopeId")
    private Integer scopeid;

    /**
     * 区域类型：1省级项目 2市项目 3区县项目
     */
    @Column(name = "scopeType")
    private Integer scopetype;

    /**
     * 项目状态 0 待审核 1已审核 2未通过
     */
    private Integer status;

    /**
     * 是否开工 0未开工 1已经开工 2已竣工
     */
    @Column(name = "isStart")
    private Integer isstart;

    /**
     * 劳资专用银行账号
     */
    @Column(name = "wagesBankCode")
    private String wagesbankcode;

    /**
     * 合同照片id  upload_file表外键
     */
    @Column(name = "contractImageId")
    private String contractimageid;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 交纳保证金金额
     */
    @Column(name = "promiseFee")
    private BigDecimal promisefee;

    /**
     * 建设性质：
     */
    @Column(name = "buildingType")
    private Integer buildingtype;

    /**
     * 项目描述
     */
    private String description;

    /**
     * 获取项目信息表
     *
     * @return id - 项目信息表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置项目信息表
     *
     * @param id 项目信息表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取项目名称
     *
     * @return projectName - 项目名称
     */
    public String getProjectname() {
        return projectname;
    }

    /**
     * 设置项目名称
     *
     * @param projectname 项目名称
     */
    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    /**
     * 获取项目编号
     *
     * @return projectNo - 项目编号
     */
    public String getProjectno() {
        return projectno;
    }

    /**
     * 设置项目编号
     *
     * @param projectno 项目编号
     */
    public void setProjectno(String projectno) {
        this.projectno = projectno;
    }

    /**
     * 获取项目预算
     *
     * @return budget - 项目预算
     */
    public String getBudget() {
        return budget;
    }

    /**
     * 设置项目预算
     *
     * @param budget 项目预算
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

    /**
     * 获取建设单位
     *
     * @return buildDepartment - 建设单位
     */
    public String getBuilddepartment() {
        return builddepartment;
    }

    /**
     * 设置建设单位
     *
     * @param builddepartment 建设单位
     */
    public void setBuilddepartment(String builddepartment) {
        this.builddepartment = builddepartment;
    }

    /**
     * 获取施工单位 enterprise 表外键
     *
     * @return enterpriseId - 施工单位 enterprise 表外键
     */
    public Integer getEnterpriseid() {
        return enterpriseid;
    }

    /**
     * 设置施工单位 enterprise 表外键
     *
     * @param enterpriseid 施工单位 enterprise 表外键
     */
    public void setEnterpriseid(Integer enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    /**
     * 获取监管单位
     *
     * @return superviseDepartment - 监管单位
     */
    public String getSupervisedepartment() {
        return supervisedepartment;
    }

    /**
     * 设置监管单位
     *
     * @param supervisedepartment 监管单位
     */
    public void setSupervisedepartment(String supervisedepartment) {
        this.supervisedepartment = supervisedepartment;
    }

    /**
     * 获取项目联系人姓名
     *
     * @return proLinkName - 项目联系人姓名
     */
    public String getProlinkname() {
        return prolinkname;
    }

    /**
     * 设置项目联系人姓名
     *
     * @param prolinkname 项目联系人姓名
     */
    public void setProlinkname(String prolinkname) {
        this.prolinkname = prolinkname;
    }

    /**
     * 获取项目联系人号码
     *
     * @return proLinkInfo - 项目联系人号码
     */
    public String getProlinkinfo() {
        return prolinkinfo;
    }

    /**
     * 设置项目联系人号码
     *
     * @param prolinkinfo 项目联系人号码
     */
    public void setProlinkinfo(String prolinkinfo) {
        this.prolinkinfo = prolinkinfo;
    }

    /**
     * 获取劳资管理员姓名
     *
     * @return wagesManager - 劳资管理员姓名
     */
    public String getWagesmanager() {
        return wagesmanager;
    }

    /**
     * 设置劳资管理员姓名
     *
     * @param wagesmanager 劳资管理员姓名
     */
    public void setWagesmanager(String wagesmanager) {
        this.wagesmanager = wagesmanager;
    }

    /**
     * 获取劳资管理员联系方式
     *
     * @return wagesLinkInfo - 劳资管理员联系方式
     */
    public String getWageslinkinfo() {
        return wageslinkinfo;
    }

    /**
     * 设置劳资管理员联系方式
     *
     * @param wageslinkinfo 劳资管理员联系方式
     */
    public void setWageslinkinfo(String wageslinkinfo) {
        this.wageslinkinfo = wageslinkinfo;
    }

    /**
     * 获取项目区域id，scopeType=1省表外键 =2市外键 =3区县外键
     *
     * @return scopeId - 项目区域id，scopeType=1省表外键 =2市外键 =3区县外键
     */
    public Integer getScopeid() {
        return scopeid;
    }

    /**
     * 设置项目区域id，scopeType=1省表外键 =2市外键 =3区县外键
     *
     * @param scopeid 项目区域id，scopeType=1省表外键 =2市外键 =3区县外键
     */
    public void setScopeid(Integer scopeid) {
        this.scopeid = scopeid;
    }

    /**
     * 获取区域类型：1省级项目 2市项目 3区县项目
     *
     * @return scopeType - 区域类型：1省级项目 2市项目 3区县项目
     */
    public Integer getScopetype() {
        return scopetype;
    }

    /**
     * 设置区域类型：1省级项目 2市项目 3区县项目
     *
     * @param scopetype 区域类型：1省级项目 2市项目 3区县项目
     */
    public void setScopetype(Integer scopetype) {
        this.scopetype = scopetype;
    }

    /**
     * 获取项目状态 0 待审核 1已审核 2未通过
     *
     * @return status - 项目状态 0 待审核 1已审核 2未通过
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置项目状态 0 待审核 1已审核 2未通过
     *
     * @param status 项目状态 0 待审核 1已审核 2未通过
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否开工 0未开工 1已经开工 2已竣工
     *
     * @return isStart - 是否开工 0未开工 1已经开工 2已竣工
     */
    public Integer getIsstart() {
        return isstart;
    }

    /**
     * 设置是否开工 0未开工 1已经开工 2已竣工
     *
     * @param isstart 是否开工 0未开工 1已经开工 2已竣工
     */
    public void setIsstart(Integer isstart) {
        this.isstart = isstart;
    }

    /**
     * 获取劳资专用银行账号
     *
     * @return wagesBankCode - 劳资专用银行账号
     */
    public String getWagesbankcode() {
        return wagesbankcode;
    }

    /**
     * 设置劳资专用银行账号
     *
     * @param wagesbankcode 劳资专用银行账号
     */
    public void setWagesbankcode(String wagesbankcode) {
        this.wagesbankcode = wagesbankcode;
    }

    /**
     * 获取合同照片id  upload_file表外键
     *
     * @return contractImageId - 合同照片id  upload_file表外键
     */
    public String getContractimageid() {
        return contractimageid;
    }

    /**
     * 设置合同照片id  upload_file表外键
     *
     * @param contractimageid 合同照片id  upload_file表外键
     */
    public void setContractimageid(String contractimageid) {
        this.contractimageid = contractimageid;
    }

    /**
     * 获取创建时间
     *
     * @return createTime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取交纳保证金金额
     *
     * @return promiseFee - 交纳保证金金额
     */
    public BigDecimal getPromisefee() {
        return promisefee;
    }

    /**
     * 设置交纳保证金金额
     *
     * @param promisefee 交纳保证金金额
     */
    public void setPromisefee(BigDecimal promisefee) {
        this.promisefee = promisefee;
    }

    /**
     * 获取建设性质：
     *
     * @return buildingType - 建设性质：
     */
    public Integer getBuildingtype() {
        return buildingtype;
    }

    /**
     * 设置建设性质：
     *
     * @param buildingtype 建设性质：
     */
    public void setBuildingtype(Integer buildingtype) {
        this.buildingtype = buildingtype;
    }

    /**
     * 获取项目描述
     *
     * @return description - 项目描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置项目描述
     *
     * @param description 项目描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
}