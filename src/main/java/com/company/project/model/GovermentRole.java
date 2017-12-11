package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "goverment_role")
public class GovermentRole {
    /**
     * 政务角色表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色名称
     */
    @Column(name = "roleName")
    private String rolename;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 描述
     */
    private String descption;

    /**
     * 获取政务角色表
     *
     * @return id - 政务角色表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置政务角色表
     *
     * @param id 政务角色表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取角色名称
     *
     * @return roleName - 角色名称
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * 设置角色名称
     *
     * @param rolename 角色名称
     */
    public void setRolename(String rolename) {
        this.rolename = rolename;
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
     * 获取描述
     *
     * @return descption - 描述
     */
    public String getDescption() {
        return descption;
    }

    /**
     * 设置描述
     *
     * @param descption 描述
     */
    public void setDescption(String descption) {
        this.descption = descption;
    }
}