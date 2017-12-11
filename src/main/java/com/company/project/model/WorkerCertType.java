package com.company.project.model;

import javax.persistence.*;

@Table(name = "worker_cert_type")
public class WorkerCertType {
    /**
     * 证书类型表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 证书类型名称
     */
    private String name;

    /**
     * 获取证书类型表
     *
     * @return id - 证书类型表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置证书类型表
     *
     * @param id 证书类型表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取证书类型名称
     *
     * @return name - 证书类型名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置证书类型名称
     *
     * @param name 证书类型名称
     */
    public void setName(String name) {
        this.name = name;
    }
}