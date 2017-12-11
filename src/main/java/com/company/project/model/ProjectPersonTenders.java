package com.company.project.model;

import javax.persistence.*;

@Table(name = "project_person_tenders")
public class ProjectPersonTenders {
    /**
     * 项目-人员关系表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目表Id
     */
    @Column(name = "projectId")
    private Integer projectid;

    /**
     * 工作信息表 worker_work_info 的 Id
     */
    @Column(name = "workerId")
    private Integer workerid;

    /**
     * 标段ID
     */
    @Column(name = "tendersId")
    private Integer tendersid;

    /**
     * 获取项目-人员关系表
     *
     * @return id - 项目-人员关系表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置项目-人员关系表
     *
     * @param id 项目-人员关系表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取项目表Id
     *
     * @return projectId - 项目表Id
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置项目表Id
     *
     * @param projectid 项目表Id
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * 获取工作信息表 worker_work_info 的 Id
     *
     * @return workerId - 工作信息表 worker_work_info 的 Id
     */
    public Integer getWorkerid() {
        return workerid;
    }

    /**
     * 设置工作信息表 worker_work_info 的 Id
     *
     * @param workerid 工作信息表 worker_work_info 的 Id
     */
    public void setWorkerid(Integer workerid) {
        this.workerid = workerid;
    }

    /**
     * 获取标段ID
     *
     * @return tendersId - 标段ID
     */
    public Integer getTendersid() {
        return tendersid;
    }

    /**
     * 设置标段ID
     *
     * @param tendersid 标段ID
     */
    public void setTendersid(Integer tendersid) {
        this.tendersid = tendersid;
    }
}