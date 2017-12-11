package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Supplier {
    /**
     * 供应商表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 供应商名称
     */
    private String name;

    /**
     * 授权验证码
     */
    @Column(name = "verifyCode")
    private String verifycode;

    /**
     * 授权验证时间
     */
    @Column(name = "verifyDate")
    private Date verifydate;

    /**
     * 联系人
     */
    @Column(name = "linkMan")
    private String linkman;

    /**
     * 联系电话
     */
    @Column(name = "linkMobile")
    private String linkmobile;

    /**
     * 创建人
     */
    @Column(name = "createUser")
    private Integer createuser;

    /**
     * 创建时间
     */
    @Column(name = "createDate")
    private Date createdate;

    /**
     * 是否有上级
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 是否删除   2为删除1为存在
     */
    @Column(name = "isDeleted")
    private Integer isdeleted;

    /**
     * 设备类型 1 塔吊和升降机监控 2实名制设备 3绿色施工设备 4视频设备
     */
    private Integer type;

    /**
     * 供应商状态
     */
    private Integer status;

    /**
     * 下级设备
     */
    @Column(name = "lowerEquipmentId")
    private Integer lowerequipmentid;

    /**
     * 获取供应商表
     *
     * @return id - 供应商表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置供应商表
     *
     * @param id 供应商表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取供应商名称
     *
     * @return name - 供应商名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置供应商名称
     *
     * @param name 供应商名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取授权验证码
     *
     * @return verifyCode - 授权验证码
     */
    public String getVerifycode() {
        return verifycode;
    }

    /**
     * 设置授权验证码
     *
     * @param verifycode 授权验证码
     */
    public void setVerifycode(String verifycode) {
        this.verifycode = verifycode;
    }

    /**
     * 获取授权验证时间
     *
     * @return verifyDate - 授权验证时间
     */
    public Date getVerifydate() {
        return verifydate;
    }

    /**
     * 设置授权验证时间
     *
     * @param verifydate 授权验证时间
     */
    public void setVerifydate(Date verifydate) {
        this.verifydate = verifydate;
    }

    /**
     * 获取联系人
     *
     * @return linkMan - 联系人
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * 设置联系人
     *
     * @param linkman 联系人
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
     * 获取联系电话
     *
     * @return linkMobile - 联系电话
     */
    public String getLinkmobile() {
        return linkmobile;
    }

    /**
     * 设置联系电话
     *
     * @param linkmobile 联系电话
     */
    public void setLinkmobile(String linkmobile) {
        this.linkmobile = linkmobile;
    }

    /**
     * 获取创建人
     *
     * @return createUser - 创建人
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     * 设置创建人
     *
     * @param createuser 创建人
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取创建时间
     *
     * @return createDate - 创建时间
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置创建时间
     *
     * @param createdate 创建时间
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取是否有上级
     *
     * @return parentId - 是否有上级
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置是否有上级
     *
     * @param parentid 是否有上级
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取是否删除   2为删除1为存在
     *
     * @return isDeleted - 是否删除   2为删除1为存在
     */
    public Integer getIsdeleted() {
        return isdeleted;
    }

    /**
     * 设置是否删除   2为删除1为存在
     *
     * @param isdeleted 是否删除   2为删除1为存在
     */
    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    /**
     * 获取设备类型 1 塔吊和升降机监控 2实名制设备 3绿色施工设备 4视频设备
     *
     * @return type - 设备类型 1 塔吊和升降机监控 2实名制设备 3绿色施工设备 4视频设备
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置设备类型 1 塔吊和升降机监控 2实名制设备 3绿色施工设备 4视频设备
     *
     * @param type 设备类型 1 塔吊和升降机监控 2实名制设备 3绿色施工设备 4视频设备
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取供应商状态
     *
     * @return status - 供应商状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置供应商状态
     *
     * @param status 供应商状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取下级设备
     *
     * @return lowerEquipmentId - 下级设备
     */
    public Integer getLowerequipmentid() {
        return lowerequipmentid;
    }

    /**
     * 设置下级设备
     *
     * @param lowerequipmentid 下级设备
     */
    public void setLowerequipmentid(Integer lowerequipmentid) {
        this.lowerequipmentid = lowerequipmentid;
    }
}