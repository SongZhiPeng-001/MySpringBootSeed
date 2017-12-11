package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "video_info_item")
public class VideoInfoItem {
    /**
     * 摄像头具体点位信息表（不懂找许琰）
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设备Id
     */
    @Column(name = "itemId")
    private Integer itemid;

    /**
     * 设备名称
     */
    @Column(name = "videoName")
    private String videoname;

    /**
     * 相机Id
     */
    @Column(name = "videoCameraId")
    private Integer videocameraid;

    /**
     * 创建时间
     */
    @Column(name = "createDate")
    private Date createdate;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否云台控制
     */
    @Column(name = "isHasPan")
    private String ishaspan;

    /**
     * 控制
     */
    private String seq;

    /**
     * 安装位置
     */
    private String position;

    /**
     * 设备在线
     */
    @Column(name = "dicOnLine")
    private String diconline;

    /**
     * 设备IP
     */
    @Column(name = "videoIp")
    private String videoip;

    /**
     * 获取摄像头具体点位信息表（不懂找许琰）
     *
     * @return id - 摄像头具体点位信息表（不懂找许琰）
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置摄像头具体点位信息表（不懂找许琰）
     *
     * @param id 摄像头具体点位信息表（不懂找许琰）
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取设备Id
     *
     * @return itemId - 设备Id
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * 设置设备Id
     *
     * @param itemid 设备Id
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * 获取设备名称
     *
     * @return videoName - 设备名称
     */
    public String getVideoname() {
        return videoname;
    }

    /**
     * 设置设备名称
     *
     * @param videoname 设备名称
     */
    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    /**
     * 获取相机Id
     *
     * @return videoCameraId - 相机Id
     */
    public Integer getVideocameraid() {
        return videocameraid;
    }

    /**
     * 设置相机Id
     *
     * @param videocameraid 相机Id
     */
    public void setVideocameraid(Integer videocameraid) {
        this.videocameraid = videocameraid;
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
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
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
     * 获取是否云台控制
     *
     * @return isHasPan - 是否云台控制
     */
    public String getIshaspan() {
        return ishaspan;
    }

    /**
     * 设置是否云台控制
     *
     * @param ishaspan 是否云台控制
     */
    public void setIshaspan(String ishaspan) {
        this.ishaspan = ishaspan;
    }

    /**
     * 获取控制
     *
     * @return seq - 控制
     */
    public String getSeq() {
        return seq;
    }

    /**
     * 设置控制
     *
     * @param seq 控制
     */
    public void setSeq(String seq) {
        this.seq = seq;
    }

    /**
     * 获取安装位置
     *
     * @return position - 安装位置
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置安装位置
     *
     * @param position 安装位置
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取设备在线
     *
     * @return dicOnLine - 设备在线
     */
    public String getDiconline() {
        return diconline;
    }

    /**
     * 设置设备在线
     *
     * @param diconline 设备在线
     */
    public void setDiconline(String diconline) {
        this.diconline = diconline;
    }

    /**
     * 获取设备IP
     *
     * @return videoIp - 设备IP
     */
    public String getVideoip() {
        return videoip;
    }

    /**
     * 设置设备IP
     *
     * @param videoip 设备IP
     */
    public void setVideoip(String videoip) {
        this.videoip = videoip;
    }
}