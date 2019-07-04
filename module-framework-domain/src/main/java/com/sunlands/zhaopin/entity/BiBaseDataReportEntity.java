package com.sunlands.zhaopin.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Project : zhaopin-sys
 * @Package Name : com.sunlands.zhaopin.domain
 * @Description : TODO
 * @Author : admin
 * @Create Date : 2019年07月04日 23:47
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
@Entity
@Table(name = "bi_base_data_report", schema = "db_feo_zhaopin", catalog = "")
public class BiBaseDataReportEntity {
    private long id;
    private Integer orgId;
    private String organizationName;
    private Integer cityCode;
    private String city;
    private String platId;
    private String platName;
    private Integer uid;
    private String userName;
    private String resumeId;
    private String jobName;
    private String resumeInWay;
    private Integer type;
    private Timestamp createTime;
    private String resumeStatus;
    private String firstOrganizationName;
    private String secOrganizationName;
    private String threeOrganizationName;
    private String fourOrganizationName;
    private String turnId;
    private Timestamp operDate;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "organization_name")
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Basic
    @Column(name = "city_code")
    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "plat_id")
    public String getPlatId() {
        return platId;
    }

    public void setPlatId(String platId) {
        this.platId = platId;
    }

    @Basic
    @Column(name = "plat_name")
    public String getPlatName() {
        return platName;
    }

    public void setPlatName(String platName) {
        this.platName = platName;
    }

    @Basic
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "resume_id")
    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    @Basic
    @Column(name = "job_name")
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Basic
    @Column(name = "resume_in_way")
    public String getResumeInWay() {
        return resumeInWay;
    }

    public void setResumeInWay(String resumeInWay) {
        this.resumeInWay = resumeInWay;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "resume_status")
    public String getResumeStatus() {
        return resumeStatus;
    }

    public void setResumeStatus(String resumeStatus) {
        this.resumeStatus = resumeStatus;
    }

    @Basic
    @Column(name = "first_organization_name")
    public String getFirstOrganizationName() {
        return firstOrganizationName;
    }

    public void setFirstOrganizationName(String firstOrganizationName) {
        this.firstOrganizationName = firstOrganizationName;
    }

    @Basic
    @Column(name = "sec_organization_name")
    public String getSecOrganizationName() {
        return secOrganizationName;
    }

    public void setSecOrganizationName(String secOrganizationName) {
        this.secOrganizationName = secOrganizationName;
    }

    @Basic
    @Column(name = "three_organization_name")
    public String getThreeOrganizationName() {
        return threeOrganizationName;
    }

    public void setThreeOrganizationName(String threeOrganizationName) {
        this.threeOrganizationName = threeOrganizationName;
    }

    @Basic
    @Column(name = "four_organization_name")
    public String getFourOrganizationName() {
        return fourOrganizationName;
    }

    public void setFourOrganizationName(String fourOrganizationName) {
        this.fourOrganizationName = fourOrganizationName;
    }

    @Basic
    @Column(name = "turn_id")
    public String getTurnId() {
        return turnId;
    }

    public void setTurnId(String turnId) {
        this.turnId = turnId;
    }

    @Basic
    @Column(name = "oper_date")
    public Timestamp getOperDate() {
        return operDate;
    }

    public void setOperDate(Timestamp operDate) {
        this.operDate = operDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiBaseDataReportEntity that = (BiBaseDataReportEntity) o;
        return id == that.id &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(organizationName, that.organizationName) &&
                Objects.equals(cityCode, that.cityCode) &&
                Objects.equals(city, that.city) &&
                Objects.equals(platId, that.platId) &&
                Objects.equals(platName, that.platName) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(jobName, that.jobName) &&
                Objects.equals(resumeInWay, that.resumeInWay) &&
                Objects.equals(type, that.type) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(resumeStatus, that.resumeStatus) &&
                Objects.equals(firstOrganizationName, that.firstOrganizationName) &&
                Objects.equals(secOrganizationName, that.secOrganizationName) &&
                Objects.equals(threeOrganizationName, that.threeOrganizationName) &&
                Objects.equals(fourOrganizationName, that.fourOrganizationName) &&
                Objects.equals(turnId, that.turnId) &&
                Objects.equals(operDate, that.operDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orgId, organizationName, cityCode, city, platId, platName, uid, userName, resumeId, jobName, resumeInWay, type, createTime, resumeStatus, firstOrganizationName, secOrganizationName, threeOrganizationName, fourOrganizationName, turnId, operDate);
    }
}
