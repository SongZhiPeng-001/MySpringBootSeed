package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "worker_cert")
public class WorkerCert {
    /**
     * 证书表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 证书持有人 worker表外键
     */
    @Column(name = "workerId")
    private Integer workerid;

    /**
     * 证书编号
     */
    @Column(name = "certCode")
    private String certcode;

    /**
     * 证书名称
     */
    @Column(name = "certName")
    private String certname;

    /**
     * 签发单位
     */
    @Column(name = "signDepartment")
    private String signdepartment;

    /**
     * 截止有效日期
     */
    @Column(name = "effectTime")
    private Date effecttime;

    /**
     * 办理日期
     */
    @Column(name = "signTime")
    private Date signtime;

    /**
     * 证书照片 upload_file 外键
     */
    @Column(name = "certImageId")
    private Integer certimageid;

    /**
     * 状态 1 正常 0失效 -1删除
     */
    private Integer status;

    /**
     * 创建人 system_user外键
     */
    @Column(name = "createUser")
    private Integer createuser;

    /**
     * 证书类型  worker_cert_type表外键
     */
    @Column(name = "certType")
    private Integer certtype;

    /**
     * 获取证书表
     *
     * @return id - 证书表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置证书表
     *
     * @param id 证书表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取证书持有人 worker表外键
     *
     * @return workerId - 证书持有人 worker表外键
     */
    public Integer getWorkerid() {
        return workerid;
    }

    /**
     * 设置证书持有人 worker表外键
     *
     * @param workerid 证书持有人 worker表外键
     */
    public void setWorkerid(Integer workerid) {
        this.workerid = workerid;
    }

    /**
     * 获取证书编号
     *
     * @return certCode - 证书编号
     */
    public String getCertcode() {
        return certcode;
    }

    /**
     * 设置证书编号
     *
     * @param certcode 证书编号
     */
    public void setCertcode(String certcode) {
        this.certcode = certcode;
    }

    /**
     * 获取证书名称
     *
     * @return certName - 证书名称
     */
    public String getCertname() {
        return certname;
    }

    /**
     * 设置证书名称
     *
     * @param certname 证书名称
     */
    public void setCertname(String certname) {
        this.certname = certname;
    }

    /**
     * 获取签发单位
     *
     * @return signDepartment - 签发单位
     */
    public String getSigndepartment() {
        return signdepartment;
    }

    /**
     * 设置签发单位
     *
     * @param signdepartment 签发单位
     */
    public void setSigndepartment(String signdepartment) {
        this.signdepartment = signdepartment;
    }

    /**
     * 获取截止有效日期
     *
     * @return effectTime - 截止有效日期
     */
    public Date getEffecttime() {
        return effecttime;
    }

    /**
     * 设置截止有效日期
     *
     * @param effecttime 截止有效日期
     */
    public void setEffecttime(Date effecttime) {
        this.effecttime = effecttime;
    }

    /**
     * 获取办理日期
     *
     * @return signTime - 办理日期
     */
    public Date getSigntime() {
        return signtime;
    }

    /**
     * 设置办理日期
     *
     * @param signtime 办理日期
     */
    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    /**
     * 获取证书照片 upload_file 外键
     *
     * @return certImageId - 证书照片 upload_file 外键
     */
    public Integer getCertimageid() {
        return certimageid;
    }

    /**
     * 设置证书照片 upload_file 外键
     *
     * @param certimageid 证书照片 upload_file 外键
     */
    public void setCertimageid(Integer certimageid) {
        this.certimageid = certimageid;
    }

    /**
     * 获取状态 1 正常 0失效 -1删除
     *
     * @return status - 状态 1 正常 0失效 -1删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1 正常 0失效 -1删除
     *
     * @param status 状态 1 正常 0失效 -1删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建人 system_user外键
     *
     * @return createUser - 创建人 system_user外键
     */
    public Integer getCreateuser() {
        return createuser;
    }

    /**
     * 设置创建人 system_user外键
     *
     * @param createuser 创建人 system_user外键
     */
    public void setCreateuser(Integer createuser) {
        this.createuser = createuser;
    }

    /**
     * 获取证书类型  worker_cert_type表外键
     *
     * @return certType - 证书类型  worker_cert_type表外键
     */
    public Integer getCerttype() {
        return certtype;
    }

    /**
     * 设置证书类型  worker_cert_type表外键
     *
     * @param certtype 证书类型  worker_cert_type表外键
     */
    public void setCerttype(Integer certtype) {
        this.certtype = certtype;
    }
}