package com.company.project.model;

import javax.persistence.*;

@Table(name = "system_provinces")
public class SystemProvinces {
    /**
     * 省份表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 省份Id
     */
    private String provinceid;

    /**
     * 省份名称
     */
    private String province;

    /**
     * 获取省份表
     *
     * @return id - 省份表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置省份表
     *
     * @param id 省份表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取省份Id
     *
     * @return provinceid - 省份Id
     */
    public String getProvinceid() {
        return provinceid;
    }

    /**
     * 设置省份Id
     *
     * @param provinceid 省份Id
     */
    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    /**
     * 获取省份名称
     *
     * @return province - 省份名称
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份名称
     *
     * @param province 省份名称
     */
    public void setProvince(String province) {
        this.province = province;
    }
}