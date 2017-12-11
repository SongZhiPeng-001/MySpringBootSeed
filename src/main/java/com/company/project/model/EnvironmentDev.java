package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "environment_dev")
public class EnvironmentDev {
    /**
     * 绿色设备表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 设备Id
     */
    @Column(name = "deviceId")
    private String deviceid;

    /**
     * 联系电话
     */
    private String tel;

    /**
     * 是否关闭 1为开 2为关
     */
    @Column(name = "isClosed")
    private Integer isclosed;

    /**
     * 显示的名字
     */
    @Column(name = "showName")
    private String showname;

    /**
     * 设备名
     */
    @Column(name = "deviceName")
    private String devicename;

    /**
     * 地址
     */
    private String address;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createtime;

    /**
     * 设备所在经度
     */
    private String lng;

    /**
     * 设备所在纬度
     */
    private String lat;

    /**
     * 备注1
     */
    @Column(name = "remarksOne")
    private String remarksone;

    /**
     * 备注2
     */
    @Column(name = "remarksTwo")
    private String remarkstwo;

    /**
     * 噪声K参数
     */
    @Column(name = "noiseK")
    private String noisek;

    /**
     * 噪声B参数
     */
    @Column(name = "noiseB")
    private String noiseb;

    /**
     * 扬尘K参数
     */
    @Column(name = "dustK")
    private String dustk;

    /**
     * 扬尘B参数
     */
    @Column(name = "dustB")
    private String dustb;

    /**
     * 风速K参数
     */
    @Column(name = "windspeedK")
    private String windspeedk;

    /**
     * 风速B参数
     */
    @Column(name = "windspeedB")
    private String windspeedb;

    /**
     * 风速K参数
     */
    @Column(name = "windDirectionK")
    private String winddirectionk;

    /**
     * 风速B参数
     */
    @Column(name = "windDirectionB")
    private String winddirectionb;

    /**
     * 湿度K参数
     */
    @Column(name = "temperatureK")
    private String temperaturek;

    /**
     * 湿度B参数
     */
    @Column(name = "temperatureB")
    private String temperatureb;

    /**
     * 湿度K参数
     */
    @Column(name = "humidityK")
    private String humidityk;

    /**
     * 湿度B参数
     */
    @Column(name = "humidityB")
    private String humidityb;

    /**
     * 气压K参数
     */
    @Column(name = "airpressureK")
    private String airpressurek;

    /**
     * 气压B参数
     */
    @Column(name = "airpressureB")
    private String airpressureb;

    /**
     * 电压K参数
     */
    @Column(name = "voltageK")
    private String voltagek;

    /**
     * 电压B参数
     */
    @Column(name = "voltageB")
    private String voltageb;

    /**
     * 设备序列号
     */
    @Column(name = "serialNumber")
    private String serialnumber;

    /**
     * 供应商表外键ID
     */
    @Column(name = "supplierId")
    private Integer supplierid;

    /**
     * 获取绿色设备表
     *
     * @return id - 绿色设备表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置绿色设备表
     *
     * @param id 绿色设备表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取设备Id
     *
     * @return deviceId - 设备Id
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * 设置设备Id
     *
     * @param deviceid 设备Id
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * 获取联系电话
     *
     * @return tel - 联系电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置联系电话
     *
     * @param tel 联系电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取是否关闭 1为开 2为关
     *
     * @return isClosed - 是否关闭 1为开 2为关
     */
    public Integer getIsclosed() {
        return isclosed;
    }

    /**
     * 设置是否关闭 1为开 2为关
     *
     * @param isclosed 是否关闭 1为开 2为关
     */
    public void setIsclosed(Integer isclosed) {
        this.isclosed = isclosed;
    }

    /**
     * 获取显示的名字
     *
     * @return showName - 显示的名字
     */
    public String getShowname() {
        return showname;
    }

    /**
     * 设置显示的名字
     *
     * @param showname 显示的名字
     */
    public void setShowname(String showname) {
        this.showname = showname;
    }

    /**
     * 获取设备名
     *
     * @return deviceName - 设备名
     */
    public String getDevicename() {
        return devicename;
    }

    /**
     * 设置设备名
     *
     * @param devicename 设备名
     */
    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
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
     * 获取设备所在经度
     *
     * @return lng - 设备所在经度
     */
    public String getLng() {
        return lng;
    }

    /**
     * 设置设备所在经度
     *
     * @param lng 设备所在经度
     */
    public void setLng(String lng) {
        this.lng = lng;
    }

    /**
     * 获取设备所在纬度
     *
     * @return lat - 设备所在纬度
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置设备所在纬度
     *
     * @param lat 设备所在纬度
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * 获取备注1
     *
     * @return remarksOne - 备注1
     */
    public String getRemarksone() {
        return remarksone;
    }

    /**
     * 设置备注1
     *
     * @param remarksone 备注1
     */
    public void setRemarksone(String remarksone) {
        this.remarksone = remarksone;
    }

    /**
     * 获取备注2
     *
     * @return remarksTwo - 备注2
     */
    public String getRemarkstwo() {
        return remarkstwo;
    }

    /**
     * 设置备注2
     *
     * @param remarkstwo 备注2
     */
    public void setRemarkstwo(String remarkstwo) {
        this.remarkstwo = remarkstwo;
    }

    /**
     * 获取噪声K参数
     *
     * @return noiseK - 噪声K参数
     */
    public String getNoisek() {
        return noisek;
    }

    /**
     * 设置噪声K参数
     *
     * @param noisek 噪声K参数
     */
    public void setNoisek(String noisek) {
        this.noisek = noisek;
    }

    /**
     * 获取噪声B参数
     *
     * @return noiseB - 噪声B参数
     */
    public String getNoiseb() {
        return noiseb;
    }

    /**
     * 设置噪声B参数
     *
     * @param noiseb 噪声B参数
     */
    public void setNoiseb(String noiseb) {
        this.noiseb = noiseb;
    }

    /**
     * 获取扬尘K参数
     *
     * @return dustK - 扬尘K参数
     */
    public String getDustk() {
        return dustk;
    }

    /**
     * 设置扬尘K参数
     *
     * @param dustk 扬尘K参数
     */
    public void setDustk(String dustk) {
        this.dustk = dustk;
    }

    /**
     * 获取扬尘B参数
     *
     * @return dustB - 扬尘B参数
     */
    public String getDustb() {
        return dustb;
    }

    /**
     * 设置扬尘B参数
     *
     * @param dustb 扬尘B参数
     */
    public void setDustb(String dustb) {
        this.dustb = dustb;
    }

    /**
     * 获取风速K参数
     *
     * @return windspeedK - 风速K参数
     */
    public String getWindspeedk() {
        return windspeedk;
    }

    /**
     * 设置风速K参数
     *
     * @param windspeedk 风速K参数
     */
    public void setWindspeedk(String windspeedk) {
        this.windspeedk = windspeedk;
    }

    /**
     * 获取风速B参数
     *
     * @return windspeedB - 风速B参数
     */
    public String getWindspeedb() {
        return windspeedb;
    }

    /**
     * 设置风速B参数
     *
     * @param windspeedb 风速B参数
     */
    public void setWindspeedb(String windspeedb) {
        this.windspeedb = windspeedb;
    }

    /**
     * 获取风速K参数
     *
     * @return windDirectionK - 风速K参数
     */
    public String getWinddirectionk() {
        return winddirectionk;
    }

    /**
     * 设置风速K参数
     *
     * @param winddirectionk 风速K参数
     */
    public void setWinddirectionk(String winddirectionk) {
        this.winddirectionk = winddirectionk;
    }

    /**
     * 获取风速B参数
     *
     * @return windDirectionB - 风速B参数
     */
    public String getWinddirectionb() {
        return winddirectionb;
    }

    /**
     * 设置风速B参数
     *
     * @param winddirectionb 风速B参数
     */
    public void setWinddirectionb(String winddirectionb) {
        this.winddirectionb = winddirectionb;
    }

    /**
     * 获取湿度K参数
     *
     * @return temperatureK - 湿度K参数
     */
    public String getTemperaturek() {
        return temperaturek;
    }

    /**
     * 设置湿度K参数
     *
     * @param temperaturek 湿度K参数
     */
    public void setTemperaturek(String temperaturek) {
        this.temperaturek = temperaturek;
    }

    /**
     * 获取湿度B参数
     *
     * @return temperatureB - 湿度B参数
     */
    public String getTemperatureb() {
        return temperatureb;
    }

    /**
     * 设置湿度B参数
     *
     * @param temperatureb 湿度B参数
     */
    public void setTemperatureb(String temperatureb) {
        this.temperatureb = temperatureb;
    }

    /**
     * 获取湿度K参数
     *
     * @return humidityK - 湿度K参数
     */
    public String getHumidityk() {
        return humidityk;
    }

    /**
     * 设置湿度K参数
     *
     * @param humidityk 湿度K参数
     */
    public void setHumidityk(String humidityk) {
        this.humidityk = humidityk;
    }

    /**
     * 获取湿度B参数
     *
     * @return humidityB - 湿度B参数
     */
    public String getHumidityb() {
        return humidityb;
    }

    /**
     * 设置湿度B参数
     *
     * @param humidityb 湿度B参数
     */
    public void setHumidityb(String humidityb) {
        this.humidityb = humidityb;
    }

    /**
     * 获取气压K参数
     *
     * @return airpressureK - 气压K参数
     */
    public String getAirpressurek() {
        return airpressurek;
    }

    /**
     * 设置气压K参数
     *
     * @param airpressurek 气压K参数
     */
    public void setAirpressurek(String airpressurek) {
        this.airpressurek = airpressurek;
    }

    /**
     * 获取气压B参数
     *
     * @return airpressureB - 气压B参数
     */
    public String getAirpressureb() {
        return airpressureb;
    }

    /**
     * 设置气压B参数
     *
     * @param airpressureb 气压B参数
     */
    public void setAirpressureb(String airpressureb) {
        this.airpressureb = airpressureb;
    }

    /**
     * 获取电压K参数
     *
     * @return voltageK - 电压K参数
     */
    public String getVoltagek() {
        return voltagek;
    }

    /**
     * 设置电压K参数
     *
     * @param voltagek 电压K参数
     */
    public void setVoltagek(String voltagek) {
        this.voltagek = voltagek;
    }

    /**
     * 获取电压B参数
     *
     * @return voltageB - 电压B参数
     */
    public String getVoltageb() {
        return voltageb;
    }

    /**
     * 设置电压B参数
     *
     * @param voltageb 电压B参数
     */
    public void setVoltageb(String voltageb) {
        this.voltageb = voltageb;
    }

    /**
     * 获取设备序列号
     *
     * @return serialNumber - 设备序列号
     */
    public String getSerialnumber() {
        return serialnumber;
    }

    /**
     * 设置设备序列号
     *
     * @param serialnumber 设备序列号
     */
    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    /**
     * 获取供应商表外键ID
     *
     * @return supplierId - 供应商表外键ID
     */
    public Integer getSupplierid() {
        return supplierid;
    }

    /**
     * 设置供应商表外键ID
     *
     * @param supplierid 供应商表外键ID
     */
    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }
}