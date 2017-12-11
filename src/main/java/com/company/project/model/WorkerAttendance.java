package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "worker_attendance")
public class WorkerAttendance {
    /**
     * 考勤表主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 考勤卡号
     */
    @Column(name = "attendanceCode")
    private String attendancecode;

    /**
     * 考勤类型  1:进场 2出场
     */
    private Integer type;

    /**
     * 出入时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 项目id。project 外键
     */
    @Column(name = "projectId")
    private Integer projectid;

    /**
     * 卡类型 1 IC卡  2人脸识别 3 指纹识别
     */
    @Column(name = "cardType")
    private Integer cardtype;

    /**
     * 通过的考勤设备id，device表外键
     */
    @Column(name = "deviceId")
    private Integer deviceid;

    /**
     * 考勤图片id，upload_file 外键
     */
    @Column(name = "imageId")
    private Integer imageid;

    /**
     * 获取考勤表主键
     *
     * @return id - 考勤表主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置考勤表主键
     *
     * @param id 考勤表主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取考勤卡号
     *
     * @return attendanceCode - 考勤卡号
     */
    public String getAttendancecode() {
        return attendancecode;
    }

    /**
     * 设置考勤卡号
     *
     * @param attendancecode 考勤卡号
     */
    public void setAttendancecode(String attendancecode) {
        this.attendancecode = attendancecode;
    }

    /**
     * 获取考勤类型  1:进场 2出场
     *
     * @return type - 考勤类型  1:进场 2出场
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置考勤类型  1:进场 2出场
     *
     * @param type 考勤类型  1:进场 2出场
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取出入时间
     *
     * @return createTime - 出入时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置出入时间
     *
     * @param createtime 出入时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 获取项目id。project 外键
     *
     * @return projectId - 项目id。project 外键
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置项目id。project 外键
     *
     * @param projectid 项目id。project 外键
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * 获取卡类型 1 IC卡  2人脸识别 3 指纹识别
     *
     * @return cardType - 卡类型 1 IC卡  2人脸识别 3 指纹识别
     */
    public Integer getCardtype() {
        return cardtype;
    }

    /**
     * 设置卡类型 1 IC卡  2人脸识别 3 指纹识别
     *
     * @param cardtype 卡类型 1 IC卡  2人脸识别 3 指纹识别
     */
    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    /**
     * 获取通过的考勤设备id，device表外键
     *
     * @return deviceId - 通过的考勤设备id，device表外键
     */
    public Integer getDeviceid() {
        return deviceid;
    }

    /**
     * 设置通过的考勤设备id，device表外键
     *
     * @param deviceid 通过的考勤设备id，device表外键
     */
    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * 获取考勤图片id，upload_file 外键
     *
     * @return imageId - 考勤图片id，upload_file 外键
     */
    public Integer getImageid() {
        return imageid;
    }

    /**
     * 设置考勤图片id，upload_file 外键
     *
     * @param imageid 考勤图片id，upload_file 外键
     */
    public void setImageid(Integer imageid) {
        this.imageid = imageid;
    }
}