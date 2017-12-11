package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Tenders {
    /**
     * 标段表id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标段名称
     */
    @Column(name = "tenderName")
    private String tendername;

    /**
     * 项目Id
     */
    @Column(name = "projectId")
    private Integer projectid;

    /**
     * 报建编号
     */
    @Column(name = "reportNumber")
    private String reportnumber;

    /**
     * 标段地址
     */
    @Column(name = "tendersAdress")
    private String tendersadress;

    /**
     * 标段所在城市Id
     */
    @Column(name = "tenderscityId")
    private Integer tenderscityid;

    /**
     * 标段所在县区Id
     */
    @Column(name = "tendersareaId")
    private Integer tendersareaid;

    /**
     * 建筑面积
     */
    @Column(name = "buildAcreage")
    private String buildacreage;

    /**
     * 标段进度
     */
    @Column(name = "tendersStage")
    private String tendersstage;

    /**
     * 标段类型
     */
    @Column(name = "tendersType")
    private Integer tenderstype;

    /**
     * 结构类型
     */
    @Column(name = "structureType")
    private Integer structuretype;

    /**
     * 标段总投资
     */
    @Column(name = "tendersMoney")
    private String tendersmoney;

    /**
     * 地上层数
     */
    @Column(name = "upFloor")
    private Integer upfloor;

    /**
     * 地下层数
     */
    @Column(name = "downFloor")
    private Integer downfloor;

    /**
     * 建设性质
     */
    @Column(name = "buildNature")
    private Integer buildnature;

    /**
     * 建设模式
     */
    @Column(name = "buildType")
    private Integer buildtype;

    /**
     * 基坑深度
     */
    @Column(name = "ditchHigh")
    private String ditchhigh;

    /**
     * 建设工程规划许可证编号
     */
    @Column(name = "buildProjectNumber")
    private String buildprojectnumber;

    /**
     * 中标通知书编号
     */
    @Column(name = "acceptanceNumber")
    private String acceptancenumber;

    /**
     * 安全监督注册号
     */
    @Column(name = "safeNumber")
    private String safenumber;

    /**
     * 安全监督注册日期
     */
    @Column(name = "safeDate")
    private Date safedate;

    /**
     * 施工许可证号
     */
    @Column(name = "allowBuildNumber")
    private String allowbuildnumber;

    /**
     * 人防面积
     */
    @Column(name = "peopleDefenceArea")
    private String peopledefencearea;

    /**
     * 建筑物高度
     */
    @Column(name = "floorHigh")
    private String floorhigh;

    /**
     * 合同造价
     */
    @Column(name = "contractCost")
    private String contractcost;

    /**
     * 现实造价
     */
    @Column(name = "realityMoney")
    private String realitymoney;

    /**
     * 基础类型
     */
    @Column(name = "baseType")
    private String basetype;

    /**
     * 开工日期
     */
    @Column(name = "startTime")
    private Date starttime;

    /**
     * 竣工日期
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 勘察单位
     */
    @Column(name = "scoutCompanyId")
    private Integer scoutcompanyid;

    /**
     * 设计单位
     */
    @Column(name = "designCompanyId")
    private Integer designcompanyid;

    /**
     * 监理单位
     */
    @Column(name = "supervisionCompanyId")
    private Integer supervisioncompanyid;

    /**
     * 建设单位
     */
    @Column(name = "constructionCompanyId")
    private Integer constructioncompanyid;

    /**
     * 检测单位
     */
    @Column(name = "detectionCompanyId")
    private Integer detectioncompanyid;

    /**
     * 施工单位
     */
    @Column(name = "buildingCompanyId")
    private Integer buildingcompanyid;

    /**
     * 劳务公司
     */
    @Column(name = "serviceCompanyId")
    private Integer servicecompanyid;

    /**
     * 银行账号
     */
    @Column(name = "bankAccount")
    private String bankaccount;

    /**
     * 获取标段表id
     *
     * @return id - 标段表id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置标段表id
     *
     * @param id 标段表id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标段名称
     *
     * @return tenderName - 标段名称
     */
    public String getTendername() {
        return tendername;
    }

    /**
     * 设置标段名称
     *
     * @param tendername 标段名称
     */
    public void setTendername(String tendername) {
        this.tendername = tendername;
    }

    /**
     * 获取项目Id
     *
     * @return projectId - 项目Id
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置项目Id
     *
     * @param projectid 项目Id
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * 获取报建编号
     *
     * @return reportNumber - 报建编号
     */
    public String getReportnumber() {
        return reportnumber;
    }

    /**
     * 设置报建编号
     *
     * @param reportnumber 报建编号
     */
    public void setReportnumber(String reportnumber) {
        this.reportnumber = reportnumber;
    }

    /**
     * 获取标段地址
     *
     * @return tendersAdress - 标段地址
     */
    public String getTendersadress() {
        return tendersadress;
    }

    /**
     * 设置标段地址
     *
     * @param tendersadress 标段地址
     */
    public void setTendersadress(String tendersadress) {
        this.tendersadress = tendersadress;
    }

    /**
     * 获取标段所在城市Id
     *
     * @return tenderscityId - 标段所在城市Id
     */
    public Integer getTenderscityid() {
        return tenderscityid;
    }

    /**
     * 设置标段所在城市Id
     *
     * @param tenderscityid 标段所在城市Id
     */
    public void setTenderscityid(Integer tenderscityid) {
        this.tenderscityid = tenderscityid;
    }

    /**
     * 获取标段所在县区Id
     *
     * @return tendersareaId - 标段所在县区Id
     */
    public Integer getTendersareaid() {
        return tendersareaid;
    }

    /**
     * 设置标段所在县区Id
     *
     * @param tendersareaid 标段所在县区Id
     */
    public void setTendersareaid(Integer tendersareaid) {
        this.tendersareaid = tendersareaid;
    }

    /**
     * 获取建筑面积
     *
     * @return buildAcreage - 建筑面积
     */
    public String getBuildacreage() {
        return buildacreage;
    }

    /**
     * 设置建筑面积
     *
     * @param buildacreage 建筑面积
     */
    public void setBuildacreage(String buildacreage) {
        this.buildacreage = buildacreage;
    }

    /**
     * 获取标段进度
     *
     * @return tendersStage - 标段进度
     */
    public String getTendersstage() {
        return tendersstage;
    }

    /**
     * 设置标段进度
     *
     * @param tendersstage 标段进度
     */
    public void setTendersstage(String tendersstage) {
        this.tendersstage = tendersstage;
    }

    /**
     * 获取标段类型
     *
     * @return tendersType - 标段类型
     */
    public Integer getTenderstype() {
        return tenderstype;
    }

    /**
     * 设置标段类型
     *
     * @param tenderstype 标段类型
     */
    public void setTenderstype(Integer tenderstype) {
        this.tenderstype = tenderstype;
    }

    /**
     * 获取结构类型
     *
     * @return structureType - 结构类型
     */
    public Integer getStructuretype() {
        return structuretype;
    }

    /**
     * 设置结构类型
     *
     * @param structuretype 结构类型
     */
    public void setStructuretype(Integer structuretype) {
        this.structuretype = structuretype;
    }

    /**
     * 获取标段总投资
     *
     * @return tendersMoney - 标段总投资
     */
    public String getTendersmoney() {
        return tendersmoney;
    }

    /**
     * 设置标段总投资
     *
     * @param tendersmoney 标段总投资
     */
    public void setTendersmoney(String tendersmoney) {
        this.tendersmoney = tendersmoney;
    }

    /**
     * 获取地上层数
     *
     * @return upFloor - 地上层数
     */
    public Integer getUpfloor() {
        return upfloor;
    }

    /**
     * 设置地上层数
     *
     * @param upfloor 地上层数
     */
    public void setUpfloor(Integer upfloor) {
        this.upfloor = upfloor;
    }

    /**
     * 获取地下层数
     *
     * @return downFloor - 地下层数
     */
    public Integer getDownfloor() {
        return downfloor;
    }

    /**
     * 设置地下层数
     *
     * @param downfloor 地下层数
     */
    public void setDownfloor(Integer downfloor) {
        this.downfloor = downfloor;
    }

    /**
     * 获取建设性质
     *
     * @return buildNature - 建设性质
     */
    public Integer getBuildnature() {
        return buildnature;
    }

    /**
     * 设置建设性质
     *
     * @param buildnature 建设性质
     */
    public void setBuildnature(Integer buildnature) {
        this.buildnature = buildnature;
    }

    /**
     * 获取建设模式
     *
     * @return buildType - 建设模式
     */
    public Integer getBuildtype() {
        return buildtype;
    }

    /**
     * 设置建设模式
     *
     * @param buildtype 建设模式
     */
    public void setBuildtype(Integer buildtype) {
        this.buildtype = buildtype;
    }

    /**
     * 获取基坑深度
     *
     * @return ditchHigh - 基坑深度
     */
    public String getDitchhigh() {
        return ditchhigh;
    }

    /**
     * 设置基坑深度
     *
     * @param ditchhigh 基坑深度
     */
    public void setDitchhigh(String ditchhigh) {
        this.ditchhigh = ditchhigh;
    }

    /**
     * 获取建设工程规划许可证编号
     *
     * @return buildProjectNumber - 建设工程规划许可证编号
     */
    public String getBuildprojectnumber() {
        return buildprojectnumber;
    }

    /**
     * 设置建设工程规划许可证编号
     *
     * @param buildprojectnumber 建设工程规划许可证编号
     */
    public void setBuildprojectnumber(String buildprojectnumber) {
        this.buildprojectnumber = buildprojectnumber;
    }

    /**
     * 获取中标通知书编号
     *
     * @return acceptanceNumber - 中标通知书编号
     */
    public String getAcceptancenumber() {
        return acceptancenumber;
    }

    /**
     * 设置中标通知书编号
     *
     * @param acceptancenumber 中标通知书编号
     */
    public void setAcceptancenumber(String acceptancenumber) {
        this.acceptancenumber = acceptancenumber;
    }

    /**
     * 获取安全监督注册号
     *
     * @return safeNumber - 安全监督注册号
     */
    public String getSafenumber() {
        return safenumber;
    }

    /**
     * 设置安全监督注册号
     *
     * @param safenumber 安全监督注册号
     */
    public void setSafenumber(String safenumber) {
        this.safenumber = safenumber;
    }

    /**
     * 获取安全监督注册日期
     *
     * @return safeDate - 安全监督注册日期
     */
    public Date getSafedate() {
        return safedate;
    }

    /**
     * 设置安全监督注册日期
     *
     * @param safedate 安全监督注册日期
     */
    public void setSafedate(Date safedate) {
        this.safedate = safedate;
    }

    /**
     * 获取施工许可证号
     *
     * @return allowBuildNumber - 施工许可证号
     */
    public String getAllowbuildnumber() {
        return allowbuildnumber;
    }

    /**
     * 设置施工许可证号
     *
     * @param allowbuildnumber 施工许可证号
     */
    public void setAllowbuildnumber(String allowbuildnumber) {
        this.allowbuildnumber = allowbuildnumber;
    }

    /**
     * 获取人防面积
     *
     * @return peopleDefenceArea - 人防面积
     */
    public String getPeopledefencearea() {
        return peopledefencearea;
    }

    /**
     * 设置人防面积
     *
     * @param peopledefencearea 人防面积
     */
    public void setPeopledefencearea(String peopledefencearea) {
        this.peopledefencearea = peopledefencearea;
    }

    /**
     * 获取建筑物高度
     *
     * @return floorHigh - 建筑物高度
     */
    public String getFloorhigh() {
        return floorhigh;
    }

    /**
     * 设置建筑物高度
     *
     * @param floorhigh 建筑物高度
     */
    public void setFloorhigh(String floorhigh) {
        this.floorhigh = floorhigh;
    }

    /**
     * 获取合同造价
     *
     * @return contractCost - 合同造价
     */
    public String getContractcost() {
        return contractcost;
    }

    /**
     * 设置合同造价
     *
     * @param contractcost 合同造价
     */
    public void setContractcost(String contractcost) {
        this.contractcost = contractcost;
    }

    /**
     * 获取现实造价
     *
     * @return realityMoney - 现实造价
     */
    public String getRealitymoney() {
        return realitymoney;
    }

    /**
     * 设置现实造价
     *
     * @param realitymoney 现实造价
     */
    public void setRealitymoney(String realitymoney) {
        this.realitymoney = realitymoney;
    }

    /**
     * 获取基础类型
     *
     * @return baseType - 基础类型
     */
    public String getBasetype() {
        return basetype;
    }

    /**
     * 设置基础类型
     *
     * @param basetype 基础类型
     */
    public void setBasetype(String basetype) {
        this.basetype = basetype;
    }

    /**
     * 获取开工日期
     *
     * @return startTime - 开工日期
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置开工日期
     *
     * @param starttime 开工日期
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取竣工日期
     *
     * @return endTime - 竣工日期
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置竣工日期
     *
     * @param endtime 竣工日期
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取勘察单位
     *
     * @return scoutCompanyId - 勘察单位
     */
    public Integer getScoutcompanyid() {
        return scoutcompanyid;
    }

    /**
     * 设置勘察单位
     *
     * @param scoutcompanyid 勘察单位
     */
    public void setScoutcompanyid(Integer scoutcompanyid) {
        this.scoutcompanyid = scoutcompanyid;
    }

    /**
     * 获取设计单位
     *
     * @return designCompanyId - 设计单位
     */
    public Integer getDesigncompanyid() {
        return designcompanyid;
    }

    /**
     * 设置设计单位
     *
     * @param designcompanyid 设计单位
     */
    public void setDesigncompanyid(Integer designcompanyid) {
        this.designcompanyid = designcompanyid;
    }

    /**
     * 获取监理单位
     *
     * @return supervisionCompanyId - 监理单位
     */
    public Integer getSupervisioncompanyid() {
        return supervisioncompanyid;
    }

    /**
     * 设置监理单位
     *
     * @param supervisioncompanyid 监理单位
     */
    public void setSupervisioncompanyid(Integer supervisioncompanyid) {
        this.supervisioncompanyid = supervisioncompanyid;
    }

    /**
     * 获取建设单位
     *
     * @return constructionCompanyId - 建设单位
     */
    public Integer getConstructioncompanyid() {
        return constructioncompanyid;
    }

    /**
     * 设置建设单位
     *
     * @param constructioncompanyid 建设单位
     */
    public void setConstructioncompanyid(Integer constructioncompanyid) {
        this.constructioncompanyid = constructioncompanyid;
    }

    /**
     * 获取检测单位
     *
     * @return detectionCompanyId - 检测单位
     */
    public Integer getDetectioncompanyid() {
        return detectioncompanyid;
    }

    /**
     * 设置检测单位
     *
     * @param detectioncompanyid 检测单位
     */
    public void setDetectioncompanyid(Integer detectioncompanyid) {
        this.detectioncompanyid = detectioncompanyid;
    }

    /**
     * 获取施工单位
     *
     * @return buildingCompanyId - 施工单位
     */
    public Integer getBuildingcompanyid() {
        return buildingcompanyid;
    }

    /**
     * 设置施工单位
     *
     * @param buildingcompanyid 施工单位
     */
    public void setBuildingcompanyid(Integer buildingcompanyid) {
        this.buildingcompanyid = buildingcompanyid;
    }

    /**
     * 获取劳务公司
     *
     * @return serviceCompanyId - 劳务公司
     */
    public Integer getServicecompanyid() {
        return servicecompanyid;
    }

    /**
     * 设置劳务公司
     *
     * @param servicecompanyid 劳务公司
     */
    public void setServicecompanyid(Integer servicecompanyid) {
        this.servicecompanyid = servicecompanyid;
    }

    /**
     * 获取银行账号
     *
     * @return bankAccount - 银行账号
     */
    public String getBankaccount() {
        return bankaccount;
    }

    /**
     * 设置银行账号
     *
     * @param bankaccount 银行账号
     */
    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }
}