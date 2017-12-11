package com.company.project.model;

import javax.persistence.*;

@Table(name = "worker_info_position")
public class WorkerInfoPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 职位名称
     */
    @Column(name = "positionName")
    private String positionname;

    /**
     * 1启用 0禁用 -1删除
     */
    private Integer status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取职位名称
     *
     * @return positionName - 职位名称
     */
    public String getPositionname() {
        return positionname;
    }

    /**
     * 设置职位名称
     *
     * @param positionname 职位名称
     */
    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    /**
     * 获取1启用 0禁用 -1删除
     *
     * @return status - 1启用 0禁用 -1删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置1启用 0禁用 -1删除
     *
     * @param status 1启用 0禁用 -1删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}