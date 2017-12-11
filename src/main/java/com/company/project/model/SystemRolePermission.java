package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "system_role_permission")
public class SystemRolePermission {
    /**
     * 角色权限表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 权限id， system_permission 外键
     */
    @Column(name = "permissionId")
    private Integer permissionid;

    /**
     * 角色id，system_role外键
     */
    @Column(name = "roleId")
    private Integer roleid;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 创建人id ，syste_user外键
     */
    @Column(name = "createUser")
    private Integer createuser;

    /**
     * 状态 1 正常 -1 删除
     */
    private Integer status;

    /**
     * 获取角色权限表
     *
     * @return id - 角色权限表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置角色权限表
     *
     * @param id 角色权限表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限id， system_permission 外键
     *
     * @return permissionId - 权限id， system_permission 外键
     */
    public Integer getPermissionid() {
        return permissionid;
    }

    /**
     * 设置权限id， system_permission 外键
     *
     * @param permissionid 权限id， system_permission 外键
     */
    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    /**
     * 获取角色id，system_role外键
     *
     * @return roleId - 角色id，system_role外键
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * 设置角色id，system_role外键
     *
     * @param roleid 角色id，system_role外键
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
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
     * 获取创建人id ，syste_user外键
     *
     * @return createUser - 创建人id ，syste_user外键
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     * 设置创建人id ，syste_user外键
     *
     * @param createuser 创建人id ，syste_user外键
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取状态 1 正常 -1 删除
     *
     * @return status - 状态 1 正常 -1 删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1 正常 -1 删除
     *
     * @param status 状态 1 正常 -1 删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}