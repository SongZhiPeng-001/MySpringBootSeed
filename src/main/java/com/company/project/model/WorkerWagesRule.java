package com.company.project.model;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "worker_wages_rule")
public class WorkerWagesRule {
    /**
     * 工资计算规则表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 规则名称
     */
    @Column(name = "ruleName")
    private String rulename;

    /**
     * 单价
     */
    @Column(name = "singlePrice")
    private BigDecimal singleprice;

    /**
     * 类型 1按天计算 2按小时计算 3固定工资
     */
    private Integer type;

    /**
     * 状态：1启用 0禁用 -1 删除
     */
    private Integer status;

    /**
     * 对应工种 workerType 外键  暂时弃用
     */
    @Column(name = "workerTypeId")
    private Integer workertypeid;

    /**
     * 每小时工资 （单位为分）
     */
    @Column(name = "oneHourMoney")
    private Integer onehourmoney;

    /**
     * 一天工资（单位分）
     */
    @Column(name = "oneDayMoney")
    private Integer onedaymoney;

    /**
     * 每月工资（单位分）
     */
    @Column(name = "oneMonthMoney")
    private Integer onemonthmoney;

    /**
     * 获取工资计算规则表
     *
     * @return id - 工资计算规则表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置工资计算规则表
     *
     * @param id 工资计算规则表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取规则名称
     *
     * @return ruleName - 规则名称
     */
    public String getRulename() {
        return rulename;
    }

    /**
     * 设置规则名称
     *
     * @param rulename 规则名称
     */
    public void setRulename(String rulename) {
        this.rulename = rulename;
    }

    /**
     * 获取单价
     *
     * @return singlePrice - 单价
     */
    public BigDecimal getSingleprice() {
        return singleprice;
    }

    /**
     * 设置单价
     *
     * @param singleprice 单价
     */
    public void setSingleprice(BigDecimal singleprice) {
        this.singleprice = singleprice;
    }

    /**
     * 获取类型 1按天计算 2按小时计算 3固定工资
     *
     * @return type - 类型 1按天计算 2按小时计算 3固定工资
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型 1按天计算 2按小时计算 3固定工资
     *
     * @param type 类型 1按天计算 2按小时计算 3固定工资
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取状态：1启用 0禁用 -1 删除
     *
     * @return status - 状态：1启用 0禁用 -1 删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态：1启用 0禁用 -1 删除
     *
     * @param status 状态：1启用 0禁用 -1 删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取对应工种 workerType 外键  暂时弃用
     *
     * @return workerTypeId - 对应工种 workerType 外键  暂时弃用
     */
    public Integer getWorkertypeid() {
        return workertypeid;
    }

    /**
     * 设置对应工种 workerType 外键  暂时弃用
     *
     * @param workertypeid 对应工种 workerType 外键  暂时弃用
     */
    public void setWorkertypeid(Integer workertypeid) {
        this.workertypeid = workertypeid;
    }

    /**
     * 获取每小时工资 （单位为分）
     *
     * @return oneHourMoney - 每小时工资 （单位为分）
     */
    public Integer getOnehourmoney() {
        return onehourmoney;
    }

    /**
     * 设置每小时工资 （单位为分）
     *
     * @param onehourmoney 每小时工资 （单位为分）
     */
    public void setOnehourmoney(Integer onehourmoney) {
        this.onehourmoney = onehourmoney;
    }

    /**
     * 获取一天工资（单位分）
     *
     * @return oneDayMoney - 一天工资（单位分）
     */
    public Integer getOnedaymoney() {
        return onedaymoney;
    }

    /**
     * 设置一天工资（单位分）
     *
     * @param onedaymoney 一天工资（单位分）
     */
    public void setOnedaymoney(Integer onedaymoney) {
        this.onedaymoney = onedaymoney;
    }

    /**
     * 获取每月工资（单位分）
     *
     * @return oneMonthMoney - 每月工资（单位分）
     */
    public Integer getOnemonthmoney() {
        return onemonthmoney;
    }

    /**
     * 设置每月工资（单位分）
     *
     * @param onemonthmoney 每月工资（单位分）
     */
    public void setOnemonthmoney(Integer onemonthmoney) {
        this.onemonthmoney = onemonthmoney;
    }
}