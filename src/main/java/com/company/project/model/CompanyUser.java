package com.company.project.model;

import javax.persistence.*;

@Table(name = "company_user")
public class CompanyUser {
    /**
     * 企业账号表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String username;

    /**
     * 密码
     */
    @Column(name = "passWord")
    private String password;

    /**
     * 企业名称
     */
    @Column(name = "companyName")
    private String companyname;

    /**
     * company_type表外键
     */
    @Column(name = "companyTypeId")
    private Integer companytypeid;

    /**
     * 描述
     */
    private String description;

    /**
     * 该账号新建项目是否需要审批 1是需要  -1为不需要
     */
    @Column(name = "newProjectApprove")
    private Integer newprojectapprove;

    /**
     * 企业地址
     */
    @Column(name = "companyAdress")
    private String companyadress;

    /**
     * 企业联系电话
     */
    @Column(name = "companyLinkMobile")
    private String companylinkmobile;

    /**
     * 企业安全生产许可证
     */
    @Column(name = "companySafeAllow")
    private String companysafeallow;

    /**
     * 法定代表人
     */
    @Column(name = "companyLegalPeson")
    private String companylegalpeson;

    @Column(name = "legalPesonTel")
    private String legalpesontel;

    /**
     * 社会统一信用代码
     */
    @Column(name = "socialCode")
    private String socialcode;

    @Column(name = "companyPropertyId")
    private Integer companypropertyid;

    @Column(name = "businessNumber")
    private String businessnumber;

    @Column(name = "companyEmail")
    private String companyemail;

    /**
     * 注册资金
     */
    @Column(name = "registeredCapital")
    private String registeredcapital;

    /**
     * 开户行
     */
    @Column(name = "bankName")
    private String bankname;

    /**
     * 银行卡号
     */
    @Column(name = "bankCode")
    private String bankcode;

    /**
     * 资质证书号
     */
    @Column(name = "qualificationNumber")
    private String qualificationnumber;

    /**
     * 企业资质表外键Id
     */
    @Column(name = "companyQualificationId")
    private Integer companyqualificationid;

    /**
     * 企业ID
     */
    @Column(name = "companyId")
    private Integer companyid;

    /**
     * 标段ID字符集
     */
    @Column(name = "tendersId")
    private String tendersid;

    /**
     * 获取企业账号表
     *
     * @return id - 企业账号表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置企业账号表
     *
     * @param id 企业账号表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return userName - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return passWord - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取企业名称
     *
     * @return companyName - 企业名称
     */
    public String getCompanyname() {
        return companyname;
    }

    /**
     * 设置企业名称
     *
     * @param companyname 企业名称
     */
    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    /**
     * 获取company_type表外键
     *
     * @return companyTypeId - company_type表外键
     */
    public Integer getCompanytypeid() {
        return companytypeid;
    }

    /**
     * 设置company_type表外键
     *
     * @param companytypeid company_type表外键
     */
    public void setCompanytypeid(Integer companytypeid) {
        this.companytypeid = companytypeid;
    }

    /**
     * 获取描述
     *
     * @return description - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取该账号新建项目是否需要审批 1是需要  -1为不需要
     *
     * @return newProjectApprove - 该账号新建项目是否需要审批 1是需要  -1为不需要
     */
    public Integer getNewprojectapprove() {
        return newprojectapprove;
    }

    /**
     * 设置该账号新建项目是否需要审批 1是需要  -1为不需要
     *
     * @param newprojectapprove 该账号新建项目是否需要审批 1是需要  -1为不需要
     */
    public void setNewprojectapprove(Integer newprojectapprove) {
        this.newprojectapprove = newprojectapprove;
    }

    /**
     * 获取企业地址
     *
     * @return companyAdress - 企业地址
     */
    public String getCompanyadress() {
        return companyadress;
    }

    /**
     * 设置企业地址
     *
     * @param companyadress 企业地址
     */
    public void setCompanyadress(String companyadress) {
        this.companyadress = companyadress;
    }

    /**
     * 获取企业联系电话
     *
     * @return companyLinkMobile - 企业联系电话
     */
    public String getCompanylinkmobile() {
        return companylinkmobile;
    }

    /**
     * 设置企业联系电话
     *
     * @param companylinkmobile 企业联系电话
     */
    public void setCompanylinkmobile(String companylinkmobile) {
        this.companylinkmobile = companylinkmobile;
    }

    /**
     * 获取企业安全生产许可证
     *
     * @return companySafeAllow - 企业安全生产许可证
     */
    public String getCompanysafeallow() {
        return companysafeallow;
    }

    /**
     * 设置企业安全生产许可证
     *
     * @param companysafeallow 企业安全生产许可证
     */
    public void setCompanysafeallow(String companysafeallow) {
        this.companysafeallow = companysafeallow;
    }

    /**
     * 获取法定代表人
     *
     * @return companyLegalPeson - 法定代表人
     */
    public String getCompanylegalpeson() {
        return companylegalpeson;
    }

    /**
     * 设置法定代表人
     *
     * @param companylegalpeson 法定代表人
     */
    public void setCompanylegalpeson(String companylegalpeson) {
        this.companylegalpeson = companylegalpeson;
    }

    /**
     * @return legalPesonTel
     */
    public String getLegalpesontel() {
        return legalpesontel;
    }

    /**
     * @param legalpesontel
     */
    public void setLegalpesontel(String legalpesontel) {
        this.legalpesontel = legalpesontel;
    }

    /**
     * 获取社会统一信用代码
     *
     * @return socialCode - 社会统一信用代码
     */
    public String getSocialcode() {
        return socialcode;
    }

    /**
     * 设置社会统一信用代码
     *
     * @param socialcode 社会统一信用代码
     */
    public void setSocialcode(String socialcode) {
        this.socialcode = socialcode;
    }

    /**
     * @return companyPropertyId
     */
    public Integer getCompanypropertyid() {
        return companypropertyid;
    }

    /**
     * @param companypropertyid
     */
    public void setCompanypropertyid(Integer companypropertyid) {
        this.companypropertyid = companypropertyid;
    }

    /**
     * @return businessNumber
     */
    public String getBusinessnumber() {
        return businessnumber;
    }

    /**
     * @param businessnumber
     */
    public void setBusinessnumber(String businessnumber) {
        this.businessnumber = businessnumber;
    }

    /**
     * @return companyEmail
     */
    public String getCompanyemail() {
        return companyemail;
    }

    /**
     * @param companyemail
     */
    public void setCompanyemail(String companyemail) {
        this.companyemail = companyemail;
    }

    /**
     * 获取注册资金
     *
     * @return registeredCapital - 注册资金
     */
    public String getRegisteredcapital() {
        return registeredcapital;
    }

    /**
     * 设置注册资金
     *
     * @param registeredcapital 注册资金
     */
    public void setRegisteredcapital(String registeredcapital) {
        this.registeredcapital = registeredcapital;
    }

    /**
     * 获取开户行
     *
     * @return bankName - 开户行
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * 设置开户行
     *
     * @param bankname 开户行
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
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
     * 获取资质证书号
     *
     * @return qualificationNumber - 资质证书号
     */
    public String getQualificationnumber() {
        return qualificationnumber;
    }

    /**
     * 设置资质证书号
     *
     * @param qualificationnumber 资质证书号
     */
    public void setQualificationnumber(String qualificationnumber) {
        this.qualificationnumber = qualificationnumber;
    }

    /**
     * 获取企业资质表外键Id
     *
     * @return companyQualificationId - 企业资质表外键Id
     */
    public Integer getCompanyqualificationid() {
        return companyqualificationid;
    }

    /**
     * 设置企业资质表外键Id
     *
     * @param companyqualificationid 企业资质表外键Id
     */
    public void setCompanyqualificationid(Integer companyqualificationid) {
        this.companyqualificationid = companyqualificationid;
    }

    /**
     * 获取企业ID
     *
     * @return companyId - 企业ID
     */
    public Integer getCompanyid() {
        return companyid;
    }

    /**
     * 设置企业ID
     *
     * @param companyid 企业ID
     */
    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    /**
     * 获取标段ID字符集
     *
     * @return tendersId - 标段ID字符集
     */
    public String getTendersid() {
        return tendersid;
    }

    /**
     * 设置标段ID字符集
     *
     * @param tendersid 标段ID字符集
     */
    public void setTendersid(String tendersid) {
        this.tendersid = tendersid;
    }
}