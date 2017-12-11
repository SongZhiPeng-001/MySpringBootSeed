package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "company_qualification")
public class CompanyQualification {
    /**
     * 企业资质
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 资质序列  1为施工劳务  2为施工总承包  3为专业承包
     */
    @Column(name = "qualificationSequence")
    private Integer qualificationsequence;

    /**
     * 资质类别表外键id
     */
    @Column(name = "qualificationCategoryId")
    private Integer qualificationcategoryid;

    /**
     * 资质主增项  1为主项  2为增项
     */
    @Column(name = "qualificationMain")
    private Integer qualificationmain;

    /**
     * 资质等级  1为一级  2为二级  3为三级  4为特级
     */
    @Column(name = "qualificationLevel")
    private Integer qualificationlevel;

    /**
     * 资质审批时间
     */
    @Column(name = "qualificationApprovalTime")
    private Date qualificationapprovaltime;

    /**
     * 获取企业资质
     *
     * @return id - 企业资质
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置企业资质
     *
     * @param id 企业资质
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取资质序列  1为施工劳务  2为施工总承包  3为专业承包
     *
     * @return qualificationSequence - 资质序列  1为施工劳务  2为施工总承包  3为专业承包
     */
    public Integer getQualificationsequence() {
        return qualificationsequence;
    }

    /**
     * 设置资质序列  1为施工劳务  2为施工总承包  3为专业承包
     *
     * @param qualificationsequence 资质序列  1为施工劳务  2为施工总承包  3为专业承包
     */
    public void setQualificationsequence(Integer qualificationsequence) {
        this.qualificationsequence = qualificationsequence;
    }

    /**
     * 获取资质类别表外键id
     *
     * @return qualificationCategoryId - 资质类别表外键id
     */
    public Integer getQualificationcategoryid() {
        return qualificationcategoryid;
    }

    /**
     * 设置资质类别表外键id
     *
     * @param qualificationcategoryid 资质类别表外键id
     */
    public void setQualificationcategoryid(Integer qualificationcategoryid) {
        this.qualificationcategoryid = qualificationcategoryid;
    }

    /**
     * 获取资质主增项  1为主项  2为增项
     *
     * @return qualificationMain - 资质主增项  1为主项  2为增项
     */
    public Integer getQualificationmain() {
        return qualificationmain;
    }

    /**
     * 设置资质主增项  1为主项  2为增项
     *
     * @param qualificationmain 资质主增项  1为主项  2为增项
     */
    public void setQualificationmain(Integer qualificationmain) {
        this.qualificationmain = qualificationmain;
    }

    /**
     * 获取资质等级  1为一级  2为二级  3为三级  4为特级
     *
     * @return qualificationLevel - 资质等级  1为一级  2为二级  3为三级  4为特级
     */
    public Integer getQualificationlevel() {
        return qualificationlevel;
    }

    /**
     * 设置资质等级  1为一级  2为二级  3为三级  4为特级
     *
     * @param qualificationlevel 资质等级  1为一级  2为二级  3为三级  4为特级
     */
    public void setQualificationlevel(Integer qualificationlevel) {
        this.qualificationlevel = qualificationlevel;
    }

    /**
     * 获取资质审批时间
     *
     * @return qualificationApprovalTime - 资质审批时间
     */
    public Date getQualificationapprovaltime() {
        return qualificationapprovaltime;
    }

    /**
     * 设置资质审批时间
     *
     * @param qualificationapprovaltime 资质审批时间
     */
    public void setQualificationapprovaltime(Date qualificationapprovaltime) {
        this.qualificationapprovaltime = qualificationapprovaltime;
    }
}