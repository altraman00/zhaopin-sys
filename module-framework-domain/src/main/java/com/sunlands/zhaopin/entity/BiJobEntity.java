package com.sunlands.zhaopin.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Project : zhaopin-sys
 * @Package Name : com.sunlands.zhaopin.domain
 * @Description : TODO
 * @Author : admin
 * @Create Date : 2019年07月04日 23:48
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
@Entity
@Table(name = "bi_job", schema = "db_feo_zhaopin", catalog = "")
public class BiJobEntity {
    private String id;
    private String jobName;
    private String editId;
    private String jobCode;
    private String createdBy;
    private Timestamp createdDate;
    private String lastUpdatedBy;
    private Timestamp lastUpdatedDate;
    private long enable;
    private Long publishState;
    private String jobPropertyId;
    private String jobPropertyIds;
    private String deptId;
    private String deptIds;
    private String deptName;
    private String salaryPeriodName;
    private String salaryPeriod;
    private String workLengthName;
    private String workLength;
    private String degreeName;
    private String degreeId;
    private Long number;
    private Long lackNumber;
    private Long ownNumber;
    private String publishCity;
    private String workSite;
    private String workPlace;
    private Long feedbackTime;
    private String jobLableName;
    private String jobLable;
    private String jobSternName;
    private String jobStern;
    private String jobDesc;
    private String deadline;
    private Long acceptSetting;
    private String receiveEmail;
    private String publishWayName;
    private String publishWay;
    private String jobCategory;
    private String comment;
    private String publishUserId;
    private Timestamp publishDate;
    private String tele58;
    private Integer isRefresh;
    private String jobDuty;
    private String lastestRecord;
    private Integer version;
    private Integer isRead;
    private Integer deleted;
    private Integer payMonth;
    private String jobDeptId;
    private String jobDeptName;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "edit_id")
    public String getEditId() {
        return editId;
    }

    public void setEditId(String editId) {
        this.editId = editId;
    }

    @Basic
    @Column(name = "job_code")
    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    @Basic
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "last_updated_by")
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "last_updated_date")
    public Timestamp getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Basic
    @Column(name = "enable")
    public long getEnable() {
        return enable;
    }

    public void setEnable(long enable) {
        this.enable = enable;
    }

    @Basic
    @Column(name = "publish_state")
    public Long getPublishState() {
        return publishState;
    }

    public void setPublishState(Long publishState) {
        this.publishState = publishState;
    }

    @Basic
    @Column(name = "job_property_id")
    public String getJobPropertyId() {
        return jobPropertyId;
    }

    public void setJobPropertyId(String jobPropertyId) {
        this.jobPropertyId = jobPropertyId;
    }

    @Basic
    @Column(name = "job_property_ids")
    public String getJobPropertyIds() {
        return jobPropertyIds;
    }

    public void setJobPropertyIds(String jobPropertyIds) {
        this.jobPropertyIds = jobPropertyIds;
    }

    @Basic
    @Column(name = "dept_id")
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "dept_ids")
    public String getDeptIds() {
        return deptIds;
    }

    public void setDeptIds(String deptIds) {
        this.deptIds = deptIds;
    }

    @Basic
    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "salary_period_name")
    public String getSalaryPeriodName() {
        return salaryPeriodName;
    }

    public void setSalaryPeriodName(String salaryPeriodName) {
        this.salaryPeriodName = salaryPeriodName;
    }

    @Basic
    @Column(name = "salary_period")
    public String getSalaryPeriod() {
        return salaryPeriod;
    }

    public void setSalaryPeriod(String salaryPeriod) {
        this.salaryPeriod = salaryPeriod;
    }

    @Basic
    @Column(name = "work_length_name")
    public String getWorkLengthName() {
        return workLengthName;
    }

    public void setWorkLengthName(String workLengthName) {
        this.workLengthName = workLengthName;
    }

    @Basic
    @Column(name = "work_length")
    public String getWorkLength() {
        return workLength;
    }

    public void setWorkLength(String workLength) {
        this.workLength = workLength;
    }

    @Basic
    @Column(name = "degree_name")
    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    @Basic
    @Column(name = "degree_id")
    public String getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(String degreeId) {
        this.degreeId = degreeId;
    }

    @Basic
    @Column(name = "number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Basic
    @Column(name = "lack_number")
    public Long getLackNumber() {
        return lackNumber;
    }

    public void setLackNumber(Long lackNumber) {
        this.lackNumber = lackNumber;
    }

    @Basic
    @Column(name = "own_number")
    public Long getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(Long ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Basic
    @Column(name = "publish_city")
    public String getPublishCity() {
        return publishCity;
    }

    public void setPublishCity(String publishCity) {
        this.publishCity = publishCity;
    }

    @Basic
    @Column(name = "work_site")
    public String getWorkSite() {
        return workSite;
    }

    public void setWorkSite(String workSite) {
        this.workSite = workSite;
    }

    @Basic
    @Column(name = "work_place")
    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Basic
    @Column(name = "feedback_time")
    public Long getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Long feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    @Basic
    @Column(name = "job_lable_name")
    public String getJobLableName() {
        return jobLableName;
    }

    public void setJobLableName(String jobLableName) {
        this.jobLableName = jobLableName;
    }

    @Basic
    @Column(name = "job_lable")
    public String getJobLable() {
        return jobLable;
    }

    public void setJobLable(String jobLable) {
        this.jobLable = jobLable;
    }

    @Basic
    @Column(name = "job_stern_name")
    public String getJobSternName() {
        return jobSternName;
    }

    public void setJobSternName(String jobSternName) {
        this.jobSternName = jobSternName;
    }

    @Basic
    @Column(name = "job_stern")
    public String getJobStern() {
        return jobStern;
    }

    public void setJobStern(String jobStern) {
        this.jobStern = jobStern;
    }

    @Basic
    @Column(name = "job_desc")
    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    @Basic
    @Column(name = "deadline")
    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @Basic
    @Column(name = "accept_setting")
    public Long getAcceptSetting() {
        return acceptSetting;
    }

    public void setAcceptSetting(Long acceptSetting) {
        this.acceptSetting = acceptSetting;
    }

    @Basic
    @Column(name = "receive_email")
    public String getReceiveEmail() {
        return receiveEmail;
    }

    public void setReceiveEmail(String receiveEmail) {
        this.receiveEmail = receiveEmail;
    }

    @Basic
    @Column(name = "publish_way_name")
    public String getPublishWayName() {
        return publishWayName;
    }

    public void setPublishWayName(String publishWayName) {
        this.publishWayName = publishWayName;
    }

    @Basic
    @Column(name = "publish_way")
    public String getPublishWay() {
        return publishWay;
    }

    public void setPublishWay(String publishWay) {
        this.publishWay = publishWay;
    }

    @Basic
    @Column(name = "job_category")
    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "publish_user_id")
    public String getPublishUserId() {
        return publishUserId;
    }

    public void setPublishUserId(String publishUserId) {
        this.publishUserId = publishUserId;
    }

    @Basic
    @Column(name = "publish_date")
    public Timestamp getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Timestamp publishDate) {
        this.publishDate = publishDate;
    }

    @Basic
    @Column(name = "tele58")
    public String getTele58() {
        return tele58;
    }

    public void setTele58(String tele58) {
        this.tele58 = tele58;
    }

    @Basic
    @Column(name = "is_refresh")
    public Integer getIsRefresh() {
        return isRefresh;
    }

    public void setIsRefresh(Integer isRefresh) {
        this.isRefresh = isRefresh;
    }

    @Basic
    @Column(name = "job_duty")
    public String getJobDuty() {
        return jobDuty;
    }

    public void setJobDuty(String jobDuty) {
        this.jobDuty = jobDuty;
    }

    @Basic
    @Column(name = "lastestRecord")
    public String getLastestRecord() {
        return lastestRecord;
    }

    public void setLastestRecord(String lastestRecord) {
        this.lastestRecord = lastestRecord;
    }

    @Basic
    @Column(name = "version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Basic
    @Column(name = "is_read")
    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    @Basic
    @Column(name = "deleted")
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "pay_month")
    public Integer getPayMonth() {
        return payMonth;
    }

    public void setPayMonth(Integer payMonth) {
        this.payMonth = payMonth;
    }

    @Basic
    @Column(name = "job_dept_id")
    public String getJobDeptId() {
        return jobDeptId;
    }

    public void setJobDeptId(String jobDeptId) {
        this.jobDeptId = jobDeptId;
    }

    @Basic
    @Column(name = "job_dept_name")
    public String getJobDeptName() {
        return jobDeptName;
    }

    public void setJobDeptName(String jobDeptName) {
        this.jobDeptName = jobDeptName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiJobEntity that = (BiJobEntity) o;
        return enable == that.enable &&
                Objects.equals(id, that.id) &&
                Objects.equals(jobName, that.jobName) &&
                Objects.equals(editId, that.editId) &&
                Objects.equals(jobCode, that.jobCode) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedBy, that.lastUpdatedBy) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(publishState, that.publishState) &&
                Objects.equals(jobPropertyId, that.jobPropertyId) &&
                Objects.equals(jobPropertyIds, that.jobPropertyIds) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(deptIds, that.deptIds) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(salaryPeriodName, that.salaryPeriodName) &&
                Objects.equals(salaryPeriod, that.salaryPeriod) &&
                Objects.equals(workLengthName, that.workLengthName) &&
                Objects.equals(workLength, that.workLength) &&
                Objects.equals(degreeName, that.degreeName) &&
                Objects.equals(degreeId, that.degreeId) &&
                Objects.equals(number, that.number) &&
                Objects.equals(lackNumber, that.lackNumber) &&
                Objects.equals(ownNumber, that.ownNumber) &&
                Objects.equals(publishCity, that.publishCity) &&
                Objects.equals(workSite, that.workSite) &&
                Objects.equals(workPlace, that.workPlace) &&
                Objects.equals(feedbackTime, that.feedbackTime) &&
                Objects.equals(jobLableName, that.jobLableName) &&
                Objects.equals(jobLable, that.jobLable) &&
                Objects.equals(jobSternName, that.jobSternName) &&
                Objects.equals(jobStern, that.jobStern) &&
                Objects.equals(jobDesc, that.jobDesc) &&
                Objects.equals(deadline, that.deadline) &&
                Objects.equals(acceptSetting, that.acceptSetting) &&
                Objects.equals(receiveEmail, that.receiveEmail) &&
                Objects.equals(publishWayName, that.publishWayName) &&
                Objects.equals(publishWay, that.publishWay) &&
                Objects.equals(jobCategory, that.jobCategory) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(publishUserId, that.publishUserId) &&
                Objects.equals(publishDate, that.publishDate) &&
                Objects.equals(tele58, that.tele58) &&
                Objects.equals(isRefresh, that.isRefresh) &&
                Objects.equals(jobDuty, that.jobDuty) &&
                Objects.equals(lastestRecord, that.lastestRecord) &&
                Objects.equals(version, that.version) &&
                Objects.equals(isRead, that.isRead) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(payMonth, that.payMonth) &&
                Objects.equals(jobDeptId, that.jobDeptId) &&
                Objects.equals(jobDeptName, that.jobDeptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobName, editId, jobCode, createdBy, createdDate, lastUpdatedBy, lastUpdatedDate, enable, publishState, jobPropertyId, jobPropertyIds, deptId, deptIds, deptName, salaryPeriodName, salaryPeriod, workLengthName, workLength, degreeName, degreeId, number, lackNumber, ownNumber, publishCity, workSite, workPlace, feedbackTime, jobLableName, jobLable, jobSternName, jobStern, jobDesc, deadline, acceptSetting, receiveEmail, publishWayName, publishWay, jobCategory, comment, publishUserId, publishDate, tele58, isRefresh, jobDuty, lastestRecord, version, isRead, deleted, payMonth, jobDeptId, jobDeptName);
    }
}
