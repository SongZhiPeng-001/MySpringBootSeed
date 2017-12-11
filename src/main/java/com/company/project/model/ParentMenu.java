package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "parent_menu")
public class ParentMenu {
    /**
     * 自定义菜单表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 登录账号id  system_user
     */
    @Column(name = "userId")
    private Integer userid;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 获取自定义菜单表
     *
     * @return id - 自定义菜单表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自定义菜单表
     *
     * @param id 自定义菜单表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取登录账号id  system_user
     *
     * @return userId - 登录账号id  system_user
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * 设置登录账号id  system_user
     *
     * @param userid 登录账号id  system_user
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
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
}