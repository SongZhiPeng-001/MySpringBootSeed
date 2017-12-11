package com.company.project.model;

import javax.persistence.*;

@Table(name = "department_group")
public class DepartmentGroup {
    /**
     * 部门班组表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 部门或者班组名称
     */
    private String name;

    /**
     * 类型  1班组 2 部门
     */
    private Integer type;

    /**
     * 父级ID
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * tenders表外键
     */
    @Column(name = "tendersId")
    private Integer tendersid;

    /**
     * project表外键
     */
    @Column(name = "projectId")
    private Integer projectid;

    /**
     * 负责人外键
     */
    @Column(name = "workerId")
    private Integer workerid;

    /**
     * 获取部门班组表
     *
     * @return id - 部门班组表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置部门班组表
     *
     * @param id 部门班组表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门或者班组名称
     *
     * @return name - 部门或者班组名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门或者班组名称
     *
     * @param name 部门或者班组名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类型  1班组 2 部门
     *
     * @return type - 类型  1班组 2 部门
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型  1班组 2 部门
     *
     * @param type 类型  1班组 2 部门
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取父级ID
     *
     * @return parentId - 父级ID
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父级ID
     *
     * @param parentid 父级ID
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取tenders表外键
     *
     * @return tendersId - tenders表外键
     */
    public Integer getTendersid() {
        return tendersid;
    }

    /**
     * 设置tenders表外键
     *
     * @param tendersid tenders表外键
     */
    public void setTendersid(Integer tendersid) {
        this.tendersid = tendersid;
    }

    /**
     * 获取project表外键
     *
     * @return projectId - project表外键
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置project表外键
     *
     * @param projectid project表外键
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * 获取负责人外键
     *
     * @return workerId - 负责人外键
     */
    public Integer getWorkerid() {
        return workerid;
    }

    /**
     * 设置负责人外键
     *
     * @param workerid 负责人外键
     */
    public void setWorkerid(Integer workerid) {
        this.workerid = workerid;
    }
}