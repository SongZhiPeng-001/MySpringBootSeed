package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "big_dev")
public class BigDev {
    /**
     * 塔吊 升降机设备表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设备名称
     */
    private String name;

    /**
     * 设备类型 塔吊 施工电梯 爬架
     */
    @Column(name = "dicType")
    private Integer dictype;

    /**
     * 设备状态 0待审核 1待操作 2已闭合
     */
    private Integer status;

    /**
     * 所处阶段
     */
    @Column(name = "dicPeriod")
    private Integer dicperiod;

    /**
     * 设备编号
     */
    @Column(name = "carneSerial")
    private String carneserial;

    /**
     * 启动日期
     */
    @Column(name = "createDate")
    private Date createdate;

    /**
     * 是否删除
     */
    @Column(name = "isDeleted")
    private Integer isdeleted;

    /**
     * 提交人
     */
    @Column(name = "createUser")
    private Integer createuser;

    /**
     * 是否正在被使用  1：使用中   2：闲置状态
     */
    @Column(name = "isUsing")
    private Integer isusing;

    /**
     * 获取塔吊 升降机设备表
     *
     * @return id - 塔吊 升降机设备表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置塔吊 升降机设备表
     *
     * @param id 塔吊 升降机设备表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取设备名称
     *
     * @return name - 设备名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置设备名称
     *
     * @param name 设备名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取设备类型 塔吊 施工电梯 爬架
     *
     * @return dicType - 设备类型 塔吊 施工电梯 爬架
     */
    public Integer getDictype() {
        return dictype;
    }

    /**
     * 设置设备类型 塔吊 施工电梯 爬架
     *
     * @param dictype 设备类型 塔吊 施工电梯 爬架
     */
    public void setDictype(Integer dictype) {
        this.dictype = dictype;
    }

    /**
     * 获取设备状态 0待审核 1待操作 2已闭合
     *
     * @return status - 设备状态 0待审核 1待操作 2已闭合
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置设备状态 0待审核 1待操作 2已闭合
     *
     * @param status 设备状态 0待审核 1待操作 2已闭合
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取所处阶段
     *
     * @return dicPeriod - 所处阶段
     */
    public Integer getDicperiod() {
        return dicperiod;
    }

    /**
     * 设置所处阶段
     *
     * @param dicperiod 所处阶段
     */
    public void setDicperiod(Integer dicperiod) {
        this.dicperiod = dicperiod;
    }

    /**
     * 获取设备编号
     *
     * @return carneSerial - 设备编号
     */
    public String getCarneserial() {
        return carneserial;
    }

    /**
     * 设置设备编号
     *
     * @param carneserial 设备编号
     */
    public void setCarneserial(String carneserial) {
        this.carneserial = carneserial;
    }

    /**
     * 获取启动日期
     *
     * @return createDate - 启动日期
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * 设置启动日期
     *
     * @param createdate 启动日期
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * 获取是否删除
     *
     * @return isDeleted - 是否删除
     */
    public Integer getIsdeleted() {
        return isdeleted;
    }

    /**
     * 设置是否删除
     *
     * @param isdeleted 是否删除
     */
    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    /**
     * 获取提交人
     *
     * @return createUser - 提交人
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     * 设置提交人
     *
     * @param createuser 提交人
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取是否正在被使用  1：使用中   2：闲置状态
     *
     * @return isUsing - 是否正在被使用  1：使用中   2：闲置状态
     */
    public Integer getIsusing() {
        return isusing;
    }

    /**
     * 设置是否正在被使用  1：使用中   2：闲置状态
     *
     * @param isusing 是否正在被使用  1：使用中   2：闲置状态
     */
    public void setIsusing(Integer isusing) {
        this.isusing = isusing;
    }
}