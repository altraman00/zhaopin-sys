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
@Table(name = "bi_resume_interview_records", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeInterviewRecordsEntity {
    private String id;
    private String resumeId;
    private String resumeFlowId;
    private String jobId;
    private String jobName;
    private String handlerId;
    private String handlerName;
    private Timestamp interviewTime;
    private String interviewStatus;
    private Integer interviewTurnAll;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp lastUpdatedDate;
    private String lastUpdatedBy;
    private String deleted;
    private String version;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "resume_flow_id")
    public String getResumeFlowId() {
        return resumeFlowId;
    }

    public void setResumeFlowId(String resumeFlowId) {
        this.resumeFlowId = resumeFlowId;
    }

    @Basic
    @Column(name = "job_id")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
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
    @Column(name = "handler_id")
    public String getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(String handlerId) {
        this.handlerId = handlerId;
    }

    @Basic
    @Column(name = "handler_name")
    public String getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(String handlerName) {
        this.handlerName = handlerName;
    }

    @Basic
    @Column(name = "interview_time")
    public Timestamp getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(Timestamp interviewTime) {
        this.interviewTime = interviewTime;
    }

    @Basic
    @Column(name = "interview_status")
    public String getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(String interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    @Basic
    @Column(name = "interview_turn_all")
    public Integer getInterviewTurnAll() {
        return interviewTurnAll;
    }

    public void setInterviewTurnAll(Integer interviewTurnAll) {
        this.interviewTurnAll = interviewTurnAll;
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
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
    @Column(name = "last_updated_by")
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Basic
    @Column(name = "deleted")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiResumeInterviewRecordsEntity that = (BiResumeInterviewRecordsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(jobName, that.jobName) &&
                Objects.equals(handlerId, that.handlerId) &&
                Objects.equals(handlerName, that.handlerName) &&
                Objects.equals(interviewTime, that.interviewTime) &&
                Objects.equals(interviewStatus, that.interviewStatus) &&
                Objects.equals(interviewTurnAll, that.interviewTurnAll) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(lastUpdatedBy, that.lastUpdatedBy) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resumeId, resumeFlowId, jobId, jobName, handlerId, handlerName, interviewTime, interviewStatus, interviewTurnAll, createdDate, createdBy, lastUpdatedDate, lastUpdatedBy, deleted, version);
    }
}
