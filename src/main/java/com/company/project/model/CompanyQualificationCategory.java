package com.company.project.model;

import javax.persistence.*;

@Table(name = "company_qualification_category")
public class CompanyQualificationCategory {
    /**
     * 企业资质类别
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 获取企业资质类别
     *
     * @return id - 企业资质类别
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置企业资质类别
     *
     * @param id 企业资质类别
     */
    public void setId(Integer id) {
        this.id = id;
    }
}