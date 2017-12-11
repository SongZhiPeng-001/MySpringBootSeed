package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "worker_wages_grant")
public class WorkerWagesGrant {
    /**
     * 人员薪资表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 劳务人员id，worker外键
     */
    @Column(name = "workerId")
    private Integer workerid;

    /**
     * 年份
     */
    private String year;

    /**
     * 月份
     */
    private String month;

    /**
     * 预计工资
     */
    private BigDecimal mount;

    /**
     * 状态  0 未审核 1已审核 2未通过 
     */
    private Integer status;

    /**
     * 发放时间
     */
    @Column(name = "grantTime")
    private Date granttime;

    /**
     * 核算工资
     */
    private BigDecimal payroll;

    /**
     * 是否核算  1为未核算  2为已经核算
     */
    @Column(name = "computationStatus")
    private Integer computationstatus;

    /**
     * 工资计算规则表ID
     */
    @Column(name = "ruleId")
    private Integer ruleid;

    /**
     * 领导确认
     */
    private String leader;

    /**
     * 其他说明
     */
    @Column(name = "otherExplain")
    private String otherexplain;

    /**
     * 发放形式 1 打卡 2现金
     */
    @Column(name = "grantType")
    private Integer granttype;

    /**
     * 项目id project外键
     */
    @Column(name = "projectId")
    private Integer projectid;

    /**
     * 奖金
     */
    @Column(name = "awardFee")
    private BigDecimal awardfee;

    /**
     * 罚金
     */
    @Column(name = "punishmentFee")
    private BigDecimal punishmentfee;

    /**
     * 保险金
     */
    @Column(name = "insuranceFee")
    private BigDecimal insurancefee;

    /**
     * 预支金
     */
    @Column(name = "adviceFee")
    private BigDecimal advicefee;

    /**
     * 其他资金
     */
    @Column(name = "otherFee")
    private BigDecimal otherfee;

    /**
     * 获取人员薪资表
     *
     * @return id - 人员薪资表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置人员薪资表
     *
     * @param id 人员薪资表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取劳务人员id，worker外键
     *
     * @return workerId - 劳务人员id，worker外键
     */
    public Integer getWorkerid() {
        return workerid;
    }

    /**
     * 设置劳务人员id，worker外键
     *
     * @param workerid 劳务人员id，worker外键
     */
    public void setWorkerid(Integer workerid) {
        this.workerid = workerid;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public String getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * 获取月份
     *
     * @return month - 月份
     */
    public String getMonth() {
        return month;
    }

    /**
     * 设置月份
     *
     * @param month 月份
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * 获取预计工资
     *
     * @return mount - 预计工资
     */
    public BigDecimal getMount() {
        return mount;
    }

    /**
     * 设置预计工资
     *
     * @param mount 预计工资
     */
    public void setMount(BigDecimal mount) {
        this.mount = mount;
    }

    /**
     * 获取状态  0 未审核 1已审核 2未通过 
     *
     * @return status - 状态  0 未审核 1已审核 2未通过 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态  0 未审核 1已审核 2未通过 
     *
     * @param status 状态  0 未审核 1已审核 2未通过 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取发放时间
     *
     * @return grantTime - 发放时间
     */
    public Date getGranttime() {
        return granttime;
    }

    /**
     * 设置发放时间
     *
     * @param granttime 发放时间
     */
    public void setGranttime(Date granttime) {
        this.granttime = granttime;
    }

    /**
     * 获取核算工资
     *
     * @return payroll - 核算工资
     */
    public BigDecimal getPayroll() {
        return payroll;
    }

    /**
     * 设置核算工资
     *
     * @param payroll 核算工资
     */
    public void setPayroll(BigDecimal payroll) {
        this.payroll = payroll;
    }

    /**
     * 获取是否核算  1为未核算  2为已经核算
     *
     * @return computationStatus - 是否核算  1为未核算  2为已经核算
     */
    public Integer getComputationstatus() {
        return computationstatus;
    }

    /**
     * 设置是否核算  1为未核算  2为已经核算
     *
     * @param computationstatus 是否核算  1为未核算  2为已经核算
     */
    public void setComputationstatus(Integer computationstatus) {
        this.computationstatus = computationstatus;
    }

    /**
     * 获取工资计算规则表ID
     *
     * @return ruleId - 工资计算规则表ID
     */
    public Integer getRuleid() {
        return ruleid;
    }

    /**
     * 设置工资计算规则表ID
     *
     * @param ruleid 工资计算规则表ID
     */
    public void setRuleid(Integer ruleid) {
        this.ruleid = ruleid;
    }

    /**
     * 获取领导确认
     *
     * @return leader - 领导确认
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 设置领导确认
     *
     * @param leader 领导确认
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }

    /**
     * 获取其他说明
     *
     * @return otherExplain - 其他说明
     */
    public String getOtherexplain() {
        return otherexplain;
    }

    /**
     * 设置其他说明
     *
     * @param otherexplain 其他说明
     */
    public void setOtherexplain(String otherexplain) {
        this.otherexplain = otherexplain;
    }

    /**
     * 获取发放形式 1 打卡 2现金
     *
     * @return grantType - 发放形式 1 打卡 2现金
     */
    public Integer getGranttype() {
        return granttype;
    }

    /**
     * 设置发放形式 1 打卡 2现金
     *
     * @param granttype 发放形式 1 打卡 2现金
     */
    public void setGranttype(Integer granttype) {
        this.granttype = granttype;
    }

    /**
     * 获取项目id project外键
     *
     * @return projectId - 项目id project外键
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置项目id project外键
     *
     * @param projectid 项目id project外键
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * 获取奖金
     *
     * @return awardFee - 奖金
     */
    public BigDecimal getAwardfee() {
        return awardfee;
    }

    /**
     * 设置奖金
     *
     * @param awardfee 奖金
     */
    public void setAwardfee(BigDecimal awardfee) {
        this.awardfee = awardfee;
    }

    /**
     * 获取罚金
     *
     * @return punishmentFee - 罚金
     */
    public BigDecimal getPunishmentfee() {
        return punishmentfee;
    }

    /**
     * 设置罚金
     *
     * @param punishmentfee 罚金
     */
    public void setPunishmentfee(BigDecimal punishmentfee) {
        this.punishmentfee = punishmentfee;
    }

    /**
     * 获取保险金
     *
     * @return insuranceFee - 保险金
     */
    public BigDecimal getInsurancefee() {
        return insurancefee;
    }

    /**
     * 设置保险金
     *
     * @param insurancefee 保险金
     */
    public void setInsurancefee(BigDecimal insurancefee) {
        this.insurancefee = insurancefee;
    }

    /**
     * 获取预支金
     *
     * @return adviceFee - 预支金
     */
    public BigDecimal getAdvicefee() {
        return advicefee;
    }

    /**
     * 设置预支金
     *
     * @param advicefee 预支金
     */
    public void setAdvicefee(BigDecimal advicefee) {
        this.advicefee = advicefee;
    }

    /**
     * 获取其他资金
     *
     * @return otherFee - 其他资金
     */
    public BigDecimal getOtherfee() {
        return otherfee;
    }

    /**
     * 设置其他资金
     *
     * @param otherfee 其他资金
     */
    public void setOtherfee(BigDecimal otherfee) {
        this.otherfee = otherfee;
    }
}