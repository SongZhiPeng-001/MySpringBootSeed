package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "system_user")
public class SystemUser {
    /**
     * 登录用户账号表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 登录账号
     */
    private String account;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 角色外键id
     */
    @Column(name = "roleId")
    private String roleid;

    /**
     * 作用区域， 1为省级范围，2为市级范围，3区域级范围
     */
    @Column(name = "scopeType")
    private Integer scopetype;

    /**
     * 区域编码根据scopeType不同对应不同表
     */
    @Column(name = "areaCode")
    private String areacode;

    /**
     * 真实姓名
     */
    @Column(name = "realName")
    private String realname;

    /**
     * 负责所属项目区域id
     */
    @Column(name = "projectScopeId")
    private Integer projectscopeid;

    /**
     *  1正常 0拉黑 -1 删除注销
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 账号Id
     */
    @Column(name = "accountId")
    private Integer accountid;

    /**
     * 账号类型 3.worker账号 2.company_user账号 1.government_user账号
     */
    @Column(name = "accountType")
    private Integer accounttype;

    /**
     * 获取登录用户账号表
     *
     * @return id - 登录用户账号表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置登录用户账号表
     *
     * @param id 登录用户账号表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取登录账号
     *
     * @return account - 登录账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置登录账号
     *
     * @param account 登录账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取登录密码
     *
     * @return password - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取角色外键id
     *
     * @return roleId - 角色外键id
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * 设置角色外键id
     *
     * @param roleid 角色外键id
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取作用区域， 1为省级范围，2为市级范围，3区域级范围
     *
     * @return scopeType - 作用区域， 1为省级范围，2为市级范围，3区域级范围
     */
    public Integer getScopetype() {
        return scopetype;
    }

    /**
     * 设置作用区域， 1为省级范围，2为市级范围，3区域级范围
     *
     * @param scopetype 作用区域， 1为省级范围，2为市级范围，3区域级范围
     */
    public void setScopetype(Integer scopetype) {
        this.scopetype = scopetype;
    }

    /**
     * 获取区域编码根据scopeType不同对应不同表
     *
     * @return areaCode - 区域编码根据scopeType不同对应不同表
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * 设置区域编码根据scopeType不同对应不同表
     *
     * @param areacode 区域编码根据scopeType不同对应不同表
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    /**
     * 获取真实姓名
     *
     * @return realName - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取负责所属项目区域id
     *
     * @return projectScopeId - 负责所属项目区域id
     */
    public Integer getProjectscopeid() {
        return projectscopeid;
    }

    /**
     * 设置负责所属项目区域id
     *
     * @param projectscopeid 负责所属项目区域id
     */
    public void setProjectscopeid(Integer projectscopeid) {
        this.projectscopeid = projectscopeid;
    }

    /**
     * 获取 1正常 0拉黑 -1 删除注销
     *
     * @return status -  1正常 0拉黑 -1 删除注销
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置 1正常 0拉黑 -1 删除注销
     *
     * @param status  1正常 0拉黑 -1 删除注销
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取账号Id
     *
     * @return accountId - 账号Id
     */
    public Integer getAccountid() {
        return accountid;
    }

    /**
     * 设置账号Id
     *
     * @param accountid 账号Id
     */
    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    /**
     * 获取账号类型 3.worker账号 2.company_user账号 1.government_user账号
     *
     * @return accountType - 账号类型 3.worker账号 2.company_user账号 1.government_user账号
     */
    public Integer getAccounttype() {
        return accounttype;
    }

    /**
     * 设置账号类型 3.worker账号 2.company_user账号 1.government_user账号
     *
     * @param accounttype 账号类型 3.worker账号 2.company_user账号 1.government_user账号
     */
    public void setAccounttype(Integer accounttype) {
        this.accounttype = accounttype;
    }
}