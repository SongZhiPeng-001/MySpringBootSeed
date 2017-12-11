package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "worker_work_info")
public class WorkerWorkInfo {
    /**
     * 工地人员基础信息表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 劳务人员id， worker表外键
     */
    @Column(name = "workerId")
    private Integer workerid;

    /**
     * 工号
     */
    @Column(name = "workNo")
    private String workno;

    /**
     * worker_info_poisition 外键 职称
     */
    private Integer type;

    /**
     * 人员状态：1在职  0离职  -1删除
     */
    private Integer status;

    /**
     * 工种，worker_type外键
     */
    @Column(name = "workerTypeId")
    private Integer workertypeid;

    /**
     * 考勤卡号
     */
    @Column(name = "attendanceCode")
    private String attendancecode;

    /**
     * 所属分包， enterprise_branch 外键
     */
    @Column(name = "branchId")
    private Integer branchid;

    /**
     * 所属班组 enterprise_branch_department外键
     */
    @Column(name = "departmentId")
    private Integer departmentid;

    /**
     * 银行卡正反面图片 例如： 1,2
     */
    @Column(name = "bankImageIds")
    private String bankimageids;

    /**
     * 合同照片 upload_file 外键
     */
    @Column(name = "contractImageId")
    private Integer contractimageid;

    /**
     * 银行卡号
     */
    @Column(name = "bankCode")
    private String bankcode;

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
     * 各种培训证书ID集合 upload_file 外键
     */
    @Column(name = "safeStatusId")
    private String safestatusid;

    /**
     * 项目表Project表的ID
     */
    @Column(name = "projectId")
    private Integer projectid;

    /**
     * 所在项目中的职位（未启用）
     */
    private String position;

    /**
     * 角色 worke_role 外键，1,3
     */
    @Column(name = "workRole")
    private String workrole;

    /**
     * 个人评价
     */
    @Column(name = "personComment")
    private String personcomment;

    /**
     * 合同有效日期
     */
    @Column(name = "effectiveData")
    private Date effectivedata;

    /**
     * 物资发放
     */
    @Column(name = "materialDistribution")
    private String materialdistribution;

    /**
     * 二维码  upload_file外键
     */
    @Column(name = "qrCodeId")
    private Integer qrcodeid;

    /**
     * 工资规则表外键
     */
    @Column(name = "wagesRuleId")
    private Integer wagesruleid;

    /**
     * 是否有安全培训
     */
    @Column(name = "safeYesOrNo")
    private Integer safeyesorno;

    /**
     * 当人员类型为外包工时输入所要做的数量
     */
    @Column(name = "subcontractorsNumbers")
    private Integer subcontractorsnumbers;

    /**
     * 当人员类型为外包工时，输入总共金额
     */
    @Column(name = "subcontractorsTotal")
    private String subcontractorstotal;

    /**
     * 当人员类型为外包工时，输入所要完工的时间
     */
    @Column(name = "finishDate")
    private Date finishdate;

    /**
     * 获取工地人员基础信息表
     *
     * @return id - 工地人员基础信息表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置工地人员基础信息表
     *
     * @param id 工地人员基础信息表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取劳务人员id， worker表外键
     *
     * @return workerId - 劳务人员id， worker表外键
     */
    public Integer getWorkerid() {
        return workerid;
    }

    /**
     * 设置劳务人员id， worker表外键
     *
     * @param workerid 劳务人员id， worker表外键
     */
    public void setWorkerid(Integer workerid) {
        this.workerid = workerid;
    }

    /**
     * 获取工号
     *
     * @return workNo - 工号
     */
    public String getWorkno() {
        return workno;
    }

    /**
     * 设置工号
     *
     * @param workno 工号
     */
    public void setWorkno(String workno) {
        this.workno = workno;
    }

    /**
     * 获取worker_info_poisition 外键 职称
     *
     * @return type - worker_info_poisition 外键 职称
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置worker_info_poisition 外键 职称
     *
     * @param type worker_info_poisition 外键 职称
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取人员状态：1在职  0离职  -1删除
     *
     * @return status - 人员状态：1在职  0离职  -1删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置人员状态：1在职  0离职  -1删除
     *
     * @param status 人员状态：1在职  0离职  -1删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取工种，worker_type外键
     *
     * @return workerTypeId - 工种，worker_type外键
     */
    public Integer getWorkertypeid() {
        return workertypeid;
    }

    /**
     * 设置工种，worker_type外键
     *
     * @param workertypeid 工种，worker_type外键
     */
    public void setWorkertypeid(Integer workertypeid) {
        this.workertypeid = workertypeid;
    }

    /**
     * 获取考勤卡号
     *
     * @return attendanceCode - 考勤卡号
     */
    public String getAttendancecode() {
        return attendancecode;
    }

    /**
     * 设置考勤卡号
     *
     * @param attendancecode 考勤卡号
     */
    public void setAttendancecode(String attendancecode) {
        this.attendancecode = attendancecode;
    }

    /**
     * 获取所属分包， enterprise_branch 外键
     *
     * @return branchId - 所属分包， enterprise_branch 外键
     */
    public Integer getBranchid() {
        return branchid;
    }

    /**
     * 设置所属分包， enterprise_branch 外键
     *
     * @param branchid 所属分包， enterprise_branch 外键
     */
    public void setBranchid(Integer branchid) {
        this.branchid = branchid;
    }

    /**
     * 获取所属班组 enterprise_branch_department外键
     *
     * @return departmentId - 所属班组 enterprise_branch_department外键
     */
    public Integer getDepartmentid() {
        return departmentid;
    }

    /**
     * 设置所属班组 enterprise_branch_department外键
     *
     * @param departmentid 所属班组 enterprise_branch_department外键
     */
    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    /**
     * 获取银行卡正反面图片 例如： 1,2
     *
     * @return bankImageIds - 银行卡正反面图片 例如： 1,2
     */
    public String getBankimageids() {
        return bankimageids;
    }

    /**
     * 设置银行卡正反面图片 例如： 1,2
     *
     * @param bankimageids 银行卡正反面图片 例如： 1,2
     */
    public void setBankimageids(String bankimageids) {
        this.bankimageids = bankimageids;
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
     * 获取银行卡号
     *
     * @return bankCode - 银行卡号
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
     * 设置银行卡号
     *
     * @param bankcode 银行卡号
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
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
     * 获取各种培训证书ID集合 upload_file 外键
     *
     * @return safeStatusId - 各种培训证书ID集合 upload_file 外键
     */
    public String getSafestatusid() {
        return safestatusid;
    }

    /**
     * 设置各种培训证书ID集合 upload_file 外键
     *
     * @param safestatusid 各种培训证书ID集合 upload_file 外键
     */
    public void setSafestatusid(String safestatusid) {
        this.safestatusid = safestatusid;
    }

    /**
     * 获取项目表Project表的ID
     *
     * @return projectId - 项目表Project表的ID
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * 设置项目表Project表的ID
     *
     * @param projectid 项目表Project表的ID
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * 获取所在项目中的职位（未启用）
     *
     * @return position - 所在项目中的职位（未启用）
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置所在项目中的职位（未启用）
     *
     * @param position 所在项目中的职位（未启用）
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取角色 worke_role 外键，1,3
     *
     * @return workRole - 角色 worke_role 外键，1,3
     */
    public String getWorkrole() {
        return workrole;
    }

    /**
     * 设置角色 worke_role 外键，1,3
     *
     * @param workrole 角色 worke_role 外键，1,3
     */
    public void setWorkrole(String workrole) {
        this.workrole = workrole;
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
     * 获取合同有效日期
     *
     * @return effectiveData - 合同有效日期
     */
    public Date getEffectivedata() {
        return effectivedata;
    }

    /**
     * 设置合同有效日期
     *
     * @param effectivedata 合同有效日期
     */
    public void setEffectivedata(Date effectivedata) {
        this.effectivedata = effectivedata;
    }

    /**
     * 获取物资发放
     *
     * @return materialDistribution - 物资发放
     */
    public String getMaterialdistribution() {
        return materialdistribution;
    }

    /**
     * 设置物资发放
     *
     * @param materialdistribution 物资发放
     */
    public void setMaterialdistribution(String materialdistribution) {
        this.materialdistribution = materialdistribution;
    }

    /**
     * 获取二维码  upload_file外键
     *
     * @return qrCodeId - 二维码  upload_file外键
     */
    public Integer getQrcodeid() {
        return qrcodeid;
    }

    /**
     * 设置二维码  upload_file外键
     *
     * @param qrcodeid 二维码  upload_file外键
     */
    public void setQrcodeid(Integer qrcodeid) {
        this.qrcodeid = qrcodeid;
    }

    /**
     * 获取工资规则表外键
     *
     * @return wagesRuleId - 工资规则表外键
     */
    public Integer getWagesruleid() {
        return wagesruleid;
    }

    /**
     * 设置工资规则表外键
     *
     * @param wagesruleid 工资规则表外键
     */
    public void setWagesruleid(Integer wagesruleid) {
        this.wagesruleid = wagesruleid;
    }

    /**
     * 获取是否有安全培训
     *
     * @return safeYesOrNo - 是否有安全培训
     */
    public Integer getSafeyesorno() {
        return safeyesorno;
    }

    /**
     * 设置是否有安全培训
     *
     * @param safeyesorno 是否有安全培训
     */
    public void setSafeyesorno(Integer safeyesorno) {
        this.safeyesorno = safeyesorno;
    }

    /**
     * 获取当人员类型为外包工时输入所要做的数量
     *
     * @return subcontractorsNumbers - 当人员类型为外包工时输入所要做的数量
     */
    public Integer getSubcontractorsnumbers() {
        return subcontractorsnumbers;
    }

    /**
     * 设置当人员类型为外包工时输入所要做的数量
     *
     * @param subcontractorsnumbers 当人员类型为外包工时输入所要做的数量
     */
    public void setSubcontractorsnumbers(Integer subcontractorsnumbers) {
        this.subcontractorsnumbers = subcontractorsnumbers;
    }

    /**
     * 获取当人员类型为外包工时，输入总共金额
     *
     * @return subcontractorsTotal - 当人员类型为外包工时，输入总共金额
     */
    public String getSubcontractorstotal() {
        return subcontractorstotal;
    }

    /**
     * 设置当人员类型为外包工时，输入总共金额
     *
     * @param subcontractorstotal 当人员类型为外包工时，输入总共金额
     */
    public void setSubcontractorstotal(String subcontractorstotal) {
        this.subcontractorstotal = subcontractorstotal;
    }

    /**
     * 获取当人员类型为外包工时，输入所要完工的时间
     *
     * @return finishDate - 当人员类型为外包工时，输入所要完工的时间
     */
    public Date getFinishdate() {
        return finishdate;
    }

    /**
     * 设置当人员类型为外包工时，输入所要完工的时间
     *
     * @param finishdate 当人员类型为外包工时，输入所要完工的时间
     */
    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }
}