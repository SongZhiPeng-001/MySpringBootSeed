package com.company.project.model;

import javax.persistence.*;

@Table(name = "worker_role_menu_operate")
public class WorkerRoleMenuOperate {
    /**
     * 劳工-角色-菜单-操作表
     */
    @Id
    @Column(name = "` id`")
    private Integer id;

    /**
     * worker表外键
     */
    @Column(name = "workerId")
    private Integer workerid;

    /**
     * 操作权限  operater表Id
     */
    @Column(name = "operateId")
    private String operateid;

    /**
     * 角色Id
     */
    @Column(name = "roleId")
    private String roleid;

    /**
     * 菜单表
     */
    @Column(name = "menuId")
    private Integer menuid;

    /**
     * 自定义名称
     */
    @Column(name = "nickName")
    private String nickname;

    /**
     * 自定义的父级ID 对应的project_nikename表的ID
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 获取劳工-角色-菜单-操作表
     *
     * @return  id - 劳工-角色-菜单-操作表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置劳工-角色-菜单-操作表
     *
     * @param id 劳工-角色-菜单-操作表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取worker表外键
     *
     * @return workerId - worker表外键
     */
    public Integer getWorkerid() {
        return workerid;
    }

    /**
     * 设置worker表外键
     *
     * @param workerid worker表外键
     */
    public void setWorkerid(Integer workerid) {
        this.workerid = workerid;
    }

    /**
     * 获取操作权限  operater表Id
     *
     * @return operateId - 操作权限  operater表Id
     */
    public String getOperateid() {
        return operateid;
    }

    /**
     * 设置操作权限  operater表Id
     *
     * @param operateid 操作权限  operater表Id
     */
    public void setOperateid(String operateid) {
        this.operateid = operateid;
    }

    /**
     * 获取角色Id
     *
     * @return roleId - 角色Id
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * 设置角色Id
     *
     * @param roleid 角色Id
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取菜单表
     *
     * @return menuId - 菜单表
     */
    public Integer getMenuid() {
        return menuid;
    }

    /**
     * 设置菜单表
     *
     * @param menuid 菜单表
     */
    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * 获取自定义名称
     *
     * @return nickName - 自定义名称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设置自定义名称
     *
     * @param nickname 自定义名称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取自定义的父级ID 对应的project_nikename表的ID
     *
     * @return parentId - 自定义的父级ID 对应的project_nikename表的ID
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置自定义的父级ID 对应的project_nikename表的ID
     *
     * @param parentid 自定义的父级ID 对应的project_nikename表的ID
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}