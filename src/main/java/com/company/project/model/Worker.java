package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Worker {
    /**
     * 工人及管理人员信息表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别 1 男 0女
     */
    private Integer sex;

    /**
     * 身份证号码
     */
    @Column(name = "personCard")
    private String personcard;

    /**
     * 民族
     */
    private String nation;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 婚姻状态：0 未婚 1已婚 2离异 3丧偶
     */
    @Column(name = "marriageStatus")
    private Integer marriagestatus;

    /**
     * 籍贯
     */
    @Column(name = "originPlace")
    private String originplace;

    /**
     * 联系号码
     */
    @Column(name = "selfMobile")
    private String selfmobile;

    /**
     * 学历：0 没有 1初中 2中专 3高中 4专科 5本科 6硕士 7博士 8博士后
     */
    @Column(name = "educationStatus")
    private Integer educationstatus;

    /**
     * 紧急联系人
     */
    @Column(name = "urgentLinkMan")
    private String urgentlinkman;

    /**
     * 紧急联系电话
     */
    @Column(name = "urgentLinkInfo")
    private String urgentlinkinfo;

    /**
     * 身份证正面照id，upload_file外键
     */
    @Column(name = "cardUpImageId")
    private Integer cardupimageid;

    /**
     * 身份证背面图片id upload_file 外键
     */
    @Column(name = "cardBackImageId")
    private Integer cardbackimageid;

    /**
     * 现场采集照片，upload_file外键
     */
    @Column(name = "sceneImageId")
    private Integer sceneimageid;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 创建人 system_user外键
     */
    @Column(name = "createUser")
    private Integer createuser;

    /**
     * 健康状态 0：不好  1：良  2：好
     */
    @Column(name = "healthStatus")
    private Integer healthstatus;

    /**
     * 签发机关
     */
    private String authority;

    /**
     * 最新住址
     */
    @Column(name = "latestAddress")
    private String latestaddress;

    /**
     * 是否是黑名单  blackList的外键
     */
    @Column(name = "blackListId")
    private Integer blacklistid;

    /**
     * 身份证有效期开始时间
     */
    @Column(name = "startPersonCard")
    private Date startpersoncard;

    /**
     * 身份证有效期截止时间
     */
    @Column(name = "endPersonCard")
    private Date endpersoncard;

    /**
     * 大头照id upload_file 外键
     */
    @Column(name = "bigCardImageId")
    private Integer bigcardimageid;

    /**
     * 获取工人及管理人员信息表
     *
     * @return id - 工人及管理人员信息表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置工人及管理人员信息表
     *
     * @param id 工人及管理人员信息表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别 1 男 0女
     *
     * @return sex - 性别 1 男 0女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别 1 男 0女
     *
     * @param sex 性别 1 男 0女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取身份证号码
     *
     * @return personCard - 身份证号码
     */
    public String getPersoncard() {
        return personcard;
    }

    /**
     * 设置身份证号码
     *
     * @param personcard 身份证号码
     */
    public void setPersoncard(String personcard) {
        this.personcard = personcard;
    }

    /**
     * 获取民族
     *
     * @return nation - 民族
     */
    public String getNation() {
        return nation;
    }

    /**
     * 设置民族
     *
     * @param nation 民族
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * 获取出生日期
     *
     * @return birthday - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取婚姻状态：0 未婚 1已婚 2离异 3丧偶
     *
     * @return marriageStatus - 婚姻状态：0 未婚 1已婚 2离异 3丧偶
     */
    public Integer getMarriagestatus() {
        return marriagestatus;
    }

    /**
     * 设置婚姻状态：0 未婚 1已婚 2离异 3丧偶
     *
     * @param marriagestatus 婚姻状态：0 未婚 1已婚 2离异 3丧偶
     */
    public void setMarriagestatus(Integer marriagestatus) {
        this.marriagestatus = marriagestatus;
    }

    /**
     * 获取籍贯
     *
     * @return originPlace - 籍贯
     */
    public String getOriginplace() {
        return originplace;
    }

    /**
     * 设置籍贯
     *
     * @param originplace 籍贯
     */
    public void setOriginplace(String originplace) {
        this.originplace = originplace;
    }

    /**
     * 获取联系号码
     *
     * @return selfMobile - 联系号码
     */
    public String getSelfmobile() {
        return selfmobile;
    }

    /**
     * 设置联系号码
     *
     * @param selfmobile 联系号码
     */
    public void setSelfmobile(String selfmobile) {
        this.selfmobile = selfmobile;
    }

    /**
     * 获取学历：0 没有 1初中 2中专 3高中 4专科 5本科 6硕士 7博士 8博士后
     *
     * @return educationStatus - 学历：0 没有 1初中 2中专 3高中 4专科 5本科 6硕士 7博士 8博士后
     */
    public Integer getEducationstatus() {
        return educationstatus;
    }

    /**
     * 设置学历：0 没有 1初中 2中专 3高中 4专科 5本科 6硕士 7博士 8博士后
     *
     * @param educationstatus 学历：0 没有 1初中 2中专 3高中 4专科 5本科 6硕士 7博士 8博士后
     */
    public void setEducationstatus(Integer educationstatus) {
        this.educationstatus = educationstatus;
    }

    /**
     * 获取紧急联系人
     *
     * @return urgentLinkMan - 紧急联系人
     */
    public String getUrgentlinkman() {
        return urgentlinkman;
    }

    /**
     * 设置紧急联系人
     *
     * @param urgentlinkman 紧急联系人
     */
    public void setUrgentlinkman(String urgentlinkman) {
        this.urgentlinkman = urgentlinkman;
    }

    /**
     * 获取紧急联系电话
     *
     * @return urgentLinkInfo - 紧急联系电话
     */
    public String getUrgentlinkinfo() {
        return urgentlinkinfo;
    }

    /**
     * 设置紧急联系电话
     *
     * @param urgentlinkinfo 紧急联系电话
     */
    public void setUrgentlinkinfo(String urgentlinkinfo) {
        this.urgentlinkinfo = urgentlinkinfo;
    }

    /**
     * 获取身份证正面照id，upload_file外键
     *
     * @return cardUpImageId - 身份证正面照id，upload_file外键
     */
    public Integer getCardupimageid() {
        return cardupimageid;
    }

    /**
     * 设置身份证正面照id，upload_file外键
     *
     * @param cardupimageid 身份证正面照id，upload_file外键
     */
    public void setCardupimageid(Integer cardupimageid) {
        this.cardupimageid = cardupimageid;
    }

    /**
     * 获取身份证背面图片id upload_file 外键
     *
     * @return cardBackImageId - 身份证背面图片id upload_file 外键
     */
    public Integer getCardbackimageid() {
        return cardbackimageid;
    }

    /**
     * 设置身份证背面图片id upload_file 外键
     *
     * @param cardbackimageid 身份证背面图片id upload_file 外键
     */
    public void setCardbackimageid(Integer cardbackimageid) {
        this.cardbackimageid = cardbackimageid;
    }

    /**
     * 获取现场采集照片，upload_file外键
     *
     * @return sceneImageId - 现场采集照片，upload_file外键
     */
    public Integer getSceneimageid() {
        return sceneimageid;
    }

    /**
     * 设置现场采集照片，upload_file外键
     *
     * @param sceneimageid 现场采集照片，upload_file外键
     */
    public void setSceneimageid(Integer sceneimageid) {
        this.sceneimageid = sceneimageid;
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
     * 获取创建人 system_user外键
     *
     * @return createUser - 创建人 system_user外键
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     * 设置创建人 system_user外键
     *
     * @param createuser 创建人 system_user外键
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取健康状态 0：不好  1：良  2：好
     *
     * @return healthStatus - 健康状态 0：不好  1：良  2：好
     */
    public Integer getHealthstatus() {
        return healthstatus;
    }

    /**
     * 设置健康状态 0：不好  1：良  2：好
     *
     * @param healthstatus 健康状态 0：不好  1：良  2：好
     */
    public void setHealthstatus(Integer healthstatus) {
        this.healthstatus = healthstatus;
    }

    /**
     * 获取签发机关
     *
     * @return authority - 签发机关
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * 设置签发机关
     *
     * @param authority 签发机关
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    /**
     * 获取最新住址
     *
     * @return latestAddress - 最新住址
     */
    public String getLatestaddress() {
        return latestaddress;
    }

    /**
     * 设置最新住址
     *
     * @param latestaddress 最新住址
     */
    public void setLatestaddress(String latestaddress) {
        this.latestaddress = latestaddress;
    }

    /**
     * 获取是否是黑名单  blackList的外键
     *
     * @return blackListId - 是否是黑名单  blackList的外键
     */
    public Integer getBlacklistid() {
        return blacklistid;
    }

    /**
     * 设置是否是黑名单  blackList的外键
     *
     * @param blacklistid 是否是黑名单  blackList的外键
     */
    public void setBlacklistid(Integer blacklistid) {
        this.blacklistid = blacklistid;
    }

    /**
     * 获取身份证有效期开始时间
     *
     * @return startPersonCard - 身份证有效期开始时间
     */
    public Date getStartpersoncard() {
        return startpersoncard;
    }

    /**
     * 设置身份证有效期开始时间
     *
     * @param startpersoncard 身份证有效期开始时间
     */
    public void setStartpersoncard(Date startpersoncard) {
        this.startpersoncard = startpersoncard;
    }

    /**
     * 获取身份证有效期截止时间
     *
     * @return endPersonCard - 身份证有效期截止时间
     */
    public Date getEndpersoncard() {
        return endpersoncard;
    }

    /**
     * 设置身份证有效期截止时间
     *
     * @param endpersoncard 身份证有效期截止时间
     */
    public void setEndpersoncard(Date endpersoncard) {
        this.endpersoncard = endpersoncard;
    }

    /**
     * 获取大头照id upload_file 外键
     *
     * @return bigCardImageId - 大头照id upload_file 外键
     */
    public Integer getBigcardimageid() {
        return bigcardimageid;
    }

    /**
     * 设置大头照id upload_file 外键
     *
     * @param bigcardimageid 大头照id upload_file 外键
     */
    public void setBigcardimageid(Integer bigcardimageid) {
        this.bigcardimageid = bigcardimageid;
    }
}