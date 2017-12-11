package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "worker_experience")
public class WorkerExperience {
    /**
     * 劳务工人履历表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 工作的项目名称
     */
    @Column(name = "proName")
    private String proname;

    /**
     * worker表外键
     */
    @Column(name = "workerId")
    private Integer workerid;

    /**
     * 开始时间
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 工作的单位名称
     */
    @Column(name = "companyName")
    private String companyname;

    /**
     * 从事工种  worker_type 外键
     */
    @Column(name = "workerTypeId")
    private Integer workertypeid;

    /**
     * 合同照片 upload_file 外键
     */
    @Column(name = "contractImageId")
    private Integer contractimageid;

    /**
     * 出工时长 （小时）
     */
    @Column(name = "workHours")
    private Integer workhours;

    /**
     * 已发工资(元)
     */
    @Column(name = "sendedWages")
    private Integer sendedwages;

    /**
     * 个人评价
     */
    @Column(name = "personComment")
    private String personcomment;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 创建人 system_user 外键
     */
    @Column(name = "createUser")
    private Integer createuser;

    /**
     * worker_info_poisition 外键 职称
     */
    private Integer position;

    /**
     * 获取劳务工人履历表
     *
     * @return id - 劳务工人履历表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置劳务工人履历表
     *
     * @param id 劳务工人履历表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取工作的项目名称
     *
     * @return proName - 工作的项目名称
     */
    public String getProname() {
        return proname;
    }

    /**
     * 设置工作的项目名称
     *
     * @param proname 工作的项目名称
     */
    public void setProname(String proname) {
        this.proname = proname;
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
     * 获取开始时间
     *
     * @return startTime - 开始时间
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置开始时间
     *
     * @param starttime 开始时间
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取结束时间
     *
     * @return endTime - 结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取工作的单位名称
     *
     * @return companyName - 工作的单位名称
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * 设置工作的单位名称
     *
     * @param companyname 工作的单位名称
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    /**
     * 获取从事工种  worker_type 外键
     *
     * @return workerTypeId - 从事工种  worker_type 外键
     */
    public Integer getWorkertypeid() {
        return workertypeid;
    }

    /**
     * 设置从事工种  worker_type 外键
     *
     * @param workertypeid 从事工种  worker_type 外键
     */
    public void setWorkertypeid(Integer workertypeid) {
        this.workertypeid = workertypeid;
    }

    /**
     * 获取合同照片 upload_file 外键
     *
     * @return contractImageId - 合同照片 upload_file 外键
     */
    public Integer getContractimageid() {
        return contractimageid;
    }

    /**
     * 设置合同照片 upload_file 外键
     *
     * @param contractimageid 合同照片 upload_file 外键
     */
    public void setContractimageid(Integer contractimageid) {
        this.contractimageid = contractimageid;
    }

    /**
     * 获取出工时长 （小时）
     *
     * @return workHours - 出工时长 （小时）
     */
    public Integer getWorkhours() {
        return workhours;
    }

    /**
     * 设置出工时长 （小时）
     *
     * @param workhours 出工时长 （小时）
     */
    public void setWorkhours(Integer workhours) {
        this.workhours = workhours;
    }

    /**
     * 获取已发工资(元)
     *
     * @return sendedWages - 已发工资(元)
     */
    public Integer getSendedwages() {
        return sendedwages;
    }

    /**
     * 设置已发工资(元)
     *
     * @param sendedwages 已发工资(元)
     */
    public void setSendedwages(Integer sendedwages) {
        this.sendedwages = sendedwages;
    }

    /**
     * 获取个人评价
     *
     * @return personComment - 个人评价
     */
    public String getPersoncomment() {
        return personcomment;
    }

    /**
     * 设置个人评价
     *
     * @param personcomment 个人评价
     */
    public void setPersoncomment(String personcomment) {
        this.personcomment = personcomment;
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
     * 获取创建人 system_user 外键
     *
     * @return createUser - 创建人 system_user 外键
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     * 设置创建人 system_user 外键
     *
     * @param createuser 创建人 system_user 外键
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取worker_info_poisition 外键 职称
     *
     * @return position - worker_info_poisition 外键 职称
     */
    public Integer getPosition() {
        return position;
    }

    /**
     * 设置worker_info_poisition 外键 职称
     *
     * @param position worker_info_poisition 外键 职称
     */
    public void setPosition(Integer position) {
        this.position = position;
    }
}