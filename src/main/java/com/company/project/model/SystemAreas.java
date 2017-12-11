package com.company.project.model;

import javax.persistence.*;

@Table(name = "system_areas")
public class SystemAreas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String areaid;

    private String area;

    private String cityid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return areaid
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * @param areaid
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    /**
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return cityid
     */
    public String getCityid() {
        return cityid;
    }

    /**
     * @param cityid
     */
    public void setCityid(String cityid) {
        this.cityid = cityid;
    }
}