package com.company.project.model;

import javax.persistence.*;

@Table(name = "worker_type")
public class WorkerType {
    /**
     * 工种信息表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 工种名称
     */
    @Column(name = "typeName")
    private String typename;

    /**
     * 获取工种信息表
     *
     * @return id - 工种信息表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置工种信息表
     *
     * @param id 工种信息表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取工种名称
     *
     * @return typeName - 工种名称
     */
    public String getTypename() {
        return typename;
    }

    /**
     * 设置工种名称
     *
     * @param typename 工种名称
     */
    public void setTypename(String typename) {
        this.typename = typename;
    }
}