package com.sunlands.zhaopin.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Project : zhaopin-sys
 * @Package Name : com.sunlands.zhaopin.domain
 * @Description : TODO
 * @Author : admin
 * @Create Date : 2019年07月04日 23:50
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
@Entity
@Table(name = "sys_login_report", schema = "db_feo_zhaopin", catalog = "")
public class SysLoginReportEntity {
    private long id;
    private Integer loginUserId;
    private String loginUserName;
    private Integer orgId;
    private String orgName;
    private Integer loginTime;
    private Integer loginNum;
    private String date;
    private Timestamp createDate;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "login_user_id")
    public Integer getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(Integer loginUserId) {
        this.loginUserId = loginUserId;
    }

    @Basic
    @Column(name = "login_user_name")
    public String getLoginUserName() {
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    @Basic
    @Column(name = "org_id")
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "org_name")
    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Basic
    @Column(name = "login_time")
    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "login_num")
    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    @Basic
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysLoginReportEntity that = (SysLoginReportEntity) o;
        return id == that.id &&
                Objects.equals(loginUserId, that.loginUserId) &&
                Objects.equals(loginUserName, that.loginUserName) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(orgName, that.orgName) &&
                Objects.equals(loginTime, that.loginTime) &&
                Objects.equals(loginNum, that.loginNum) &&
                Objects.equals(date, that.date) &&
                Objects.equals(createDate, that.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, loginUserId, loginUserName, orgId, orgName, loginTime, loginNum, date, createDate);
    }
}
