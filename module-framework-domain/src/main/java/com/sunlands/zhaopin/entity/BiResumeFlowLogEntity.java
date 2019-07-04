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
@Table(name = "bi_resume_flow_log", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeFlowLogEntity {
    private String id;
    private String seekerId;
    private String resumeId;
    private String resumeFlowId;
    private String resumeState;
    private int operUserId;
    private Integer deptId;
    private String jobName;
    private String jobId;
    private String postId;
    private String evaluateScore;
    private String evaluateContent;
    private String action;
    private String detail;
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
    private Integer concatPeopleId;
    private Integer deleted;
    private Integer version;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "seeker_id")
    public String getSeekerId() {
        return seekerId;
    }

    public void setSeekerId(String seekerId) {
        this.seekerId = seekerId;
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
    @Column(name = "resume_state")
    public String getResumeState() {
        return resumeState;
    }

    public void setResumeState(String resumeState) {
        this.resumeState = resumeState;
    }

    @Basic
    @Column(name = "oper_user_id")
    public int getOperUserId() {
        return operUserId;
    }

    public void setOperUserId(int operUserId) {
        this.operUserId = operUserId;
    }

    @Basic
    @Column(name = "dept_id")
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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
    @Column(name = "job_id")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "post_id")
    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "evaluate_score")
    public String getEvaluateScore() {
        return evaluateScore;
    }

    public void setEvaluateScore(String evaluateScore) {
        this.evaluateScore = evaluateScore;
    }

    @Basic
    @Column(name = "evaluate_content")
    public String getEvaluateContent() {
        return evaluateContent;
    }

    public void setEvaluateContent(String evaluateContent) {
        this.evaluateContent = evaluateContent;
    }

    @Basic
    @Column(name = "action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Basic
    @Column(name = "detail")
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
    @Column(name = "last_updated_date")
    public Timestamp getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @Basic
    @Column(name = "concat_people_id")
    public Integer getConcatPeopleId() {
        return concatPeopleId;
    }

    public void setConcatPeopleId(Integer concatPeopleId) {
        this.concatPeopleId = concatPeopleId;
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
    @Column(name = "version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiResumeFlowLogEntity that = (BiResumeFlowLogEntity) o;
        return operUserId == that.operUserId &&
                Objects.equals(id, that.id) &&
                Objects.equals(seekerId, that.seekerId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(resumeState, that.resumeState) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(jobName, that.jobName) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(evaluateScore, that.evaluateScore) &&
                Objects.equals(evaluateContent, that.evaluateContent) &&
                Objects.equals(action, that.action) &&
                Objects.equals(detail, that.detail) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(concatPeopleId, that.concatPeopleId) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seekerId, resumeId, resumeFlowId, resumeState, operUserId, deptId, jobName, jobId, postId, evaluateScore, evaluateContent, action, detail, createdDate, lastUpdatedDate, concatPeopleId, deleted, version);
    }
}
