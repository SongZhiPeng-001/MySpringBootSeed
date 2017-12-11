package com.company.project.model;

import javax.persistence.*;

@Table(name = "lower_equipment")
public class LowerEquipment {
    /**
     * 下级设备表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 下级设备名称
     */
    @Column(name = "lowerEquipmentName")
    private String lowerequipmentname;

    /**
     * 获取下级设备表
     *
     * @return id - 下级设备表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置下级设备表
     *
     * @param id 下级设备表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取下级设备名称
     *
     * @return lowerEquipmentName - 下级设备名称
     */
    public String getLowerequipmentname() {
        return lowerequipmentname;
    }

    /**
     * 设置下级设备名称
     *
     * @param lowerequipmentname 下级设备名称
     */
    public void setLowerequipmentname(String lowerequipmentname) {
        this.lowerequipmentname = lowerequipmentname;
    }
}