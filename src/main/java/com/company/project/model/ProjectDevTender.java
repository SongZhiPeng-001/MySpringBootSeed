package com.company.project.model;

import javax.persistence.*;

@Table(name = "project_dev_tender")
public class ProjectDevTender {
    /**
     * 项目-标段-设备关联表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目Id
     */
    @Column(name = "projectId")
    private Integer projectid;

    /**
     * 标段Id
     */
    @Column(name = "tendersId")
    private Integer tendersid;

    /**
     * 设备Id
     */
    @Column(name = "deviceId")
    private Integer deviceid;

    /**
     * 设备类型
     */
    private Integer type;

    /**
     * 获取项目-标段-设备关联表
     *
     * @return id - 项目-标段-设备关联表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置项目-标段-设备关联表
     *
     * @param id 项目-标段-设备关联表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取项目Id
     *
     * @return projectId - 项目Id
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置项目Id
     *
     * @param projectid 项目Id
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * 获取标段Id
     *
     * @return tendersId - 标段Id
     */
    public Integer getTendersid() {
        return tendersid;
    }

    /**
     * 设置标段Id
     *
     * @param tendersid 标段Id
     */
    public void setTendersid(Integer tendersid) {
        this.tendersid = tendersid;
    }

    /**
     * 获取设备Id
     *
     * @return deviceId - 设备Id
     */
    public Integer getDeviceid() {
        return deviceid;
    }

    /**
     * 设置设备Id
     *
     * @param deviceid 设备Id
     */
    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * 获取设备类型
     *
     * @return type - 设备类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置设备类型
     *
     * @param type 设备类型
     */
    public void setType(Integer type) {
        this.type = type;
    }
}