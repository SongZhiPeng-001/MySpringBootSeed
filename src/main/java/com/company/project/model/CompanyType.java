package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "company_type")
public class CompanyType {
    /**
     * 企业类型表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 企业类型名称
     */
    @Column(name = "companyTypeName")
    private String companytypename;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 获取企业类型表
     *
     * @return id - 企业类型表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置企业类型表
     *
     * @param id 企业类型表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取企业类型名称
     *
     * @return companyTypeName - 企业类型名称
     */
    public String getCompanytypename() {
        return companytypename;
    }

    /**
     * 设置企业类型名称
     *
     * @param companytypename 企业类型名称
     */
    public void setCompanytypename(String companytypename) {
        this.companytypename = companytypename;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
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
}