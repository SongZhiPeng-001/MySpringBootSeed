package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "upload_file")
public class UploadFile {
    /**
     * 上传文件表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 对应文件url
     */
    @Column(name = "fileUrl")
    private String fileurl;

    /**
     * 对应文件名字全名包括后缀
     */
    @Column(name = "fileName")
    private String filename;

    /**
     * 文件类型 即文件后缀名
     */
    @Column(name = "fileType")
    private String filetype;

    /**
     * 状态 1正常 -1删除
     */
    private Integer status;

    /**
     * 上传时间
     */
    @Column(name = "uploadTime")
    private Date uploadtime;

    /**
     * 获取上传文件表
     *
     * @return id - 上传文件表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置上传文件表
     *
     * @param id 上传文件表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取对应文件url
     *
     * @return fileUrl - 对应文件url
     */
    public String getFileurl() {
        return fileurl;
    }

    /**
     * 设置对应文件url
     *
     * @param fileurl 对应文件url
     */
    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    /**
     * 获取对应文件名字全名包括后缀
     *
     * @return fileName - 对应文件名字全名包括后缀
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置对应文件名字全名包括后缀
     *
     * @param filename 对应文件名字全名包括后缀
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 获取文件类型 即文件后缀名
     *
     * @return fileType - 文件类型 即文件后缀名
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * 设置文件类型 即文件后缀名
     *
     * @param filetype 文件类型 即文件后缀名
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    /**
     * 获取状态 1正常 -1删除
     *
     * @return status - 状态 1正常 -1删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 1正常 -1删除
     *
     * @param status 状态 1正常 -1删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取上传时间
     *
     * @return uploadTime - 上传时间
     */
    public Date getUploadtime() {
        return uploadtime;
    }

    /**
     * 设置上传时间
     *
     * @param uploadtime 上传时间
     */
    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }
}