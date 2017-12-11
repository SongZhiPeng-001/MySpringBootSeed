package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "video_item")
public class VideoItem {
    /**
     * 视频设备管理表 （不懂找许琰）
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设备Id
     */
    @Column(name = "itemId")
    private String itemid;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String username;

    /**
     * 密码
     */
    @Column(name = "passWord")
    private String password;

    /**
     * 开始时间
     */
    @Column(name = "startVideoDate")
    private Date startvideodate;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 状态
     */
    private String status;

    /**
     * 截至日期
     */
    @Column(name = "stopVideoDate")
    private Date stopvideodate;

    /**
     * 联系人
     */
    @Column(name = "linkMan")
    private String linkman;

    /**
     * 联系人电话
     */
    @Column(name = "linkManTel")
    private String linkmantel;

    /**
     * 设备Ip
     */
    @Column(name = "itemIp")
    private String itemip;

    /**
     * 设备端口
     */
    @Column(name = "itemPort")
    private String itemport;

    /**
     * 版本
     */
    private String version;

    /**
     * 项目ID
     */
    @Column(name = "projectId")
    private Integer projectid;

    /**
     * 标段ID
     */
    @Column(name = "tendersId")
    private Integer tendersid;

    /**
     * 获取视频设备管理表 （不懂找许琰）
     *
     * @return id - 视频设备管理表 （不懂找许琰）
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置视频设备管理表 （不懂找许琰）
     *
     * @param id 视频设备管理表 （不懂找许琰）
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取设备Id
     *
     * @return itemId - 设备Id
     */
    public String getItemid() {
        return itemid;
    }

    /**
     * 设置设备Id
     *
     * @param itemid 设备Id
     */
    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    /**
     * 获取用户名
     *
     * @return userName - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return passWord - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取开始时间
     *
     * @return startVideoDate - 开始时间
     */
    public Date getStartvideodate() {
        return startvideodate;
    }

    /**
     * 设置开始时间
     *
     * @param startvideodate 开始时间
     */
    public void setStartvideodate(Date startvideodate) {
        this.startvideodate = startvideodate;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取创建者
     *
     * @return creator - 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取截至日期
     *
     * @return stopVideoDate - 截至日期
     */
    public Date getStopvideodate() {
        return stopvideodate;
    }

    /**
     * 设置截至日期
     *
     * @param stopvideodate 截至日期
     */
    public void setStopvideodate(Date stopvideodate) {
        this.stopvideodate = stopvideodate;
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
     * 获取联系人电话
     *
     * @return linkManTel - 联系人电话
     */
    public String getLinkmantel() {
        return linkmantel;
    }

    /**
     * 设置联系人电话
     *
     * @param linkmantel 联系人电话
     */
    public void setLinkmantel(String linkmantel) {
        this.linkmantel = linkmantel;
    }

    /**
     * 获取设备Ip
     *
     * @return itemIp - 设备Ip
     */
    public String getItemip() {
        return itemip;
    }

    /**
     * 设置设备Ip
     *
     * @param itemip 设备Ip
     */
    public void setItemip(String itemip) {
        this.itemip = itemip;
    }

    /**
     * 获取设备端口
     *
     * @return itemPort - 设备端口
     */
    public String getItemport() {
        return itemport;
    }

    /**
     * 设置设备端口
     *
     * @param itemport 设备端口
     */
    public void setItemport(String itemport) {
        this.itemport = itemport;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * 获取项目ID
     *
     * @return projectId - 项目ID
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置项目ID
     *
     * @param projectid 项目ID
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
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