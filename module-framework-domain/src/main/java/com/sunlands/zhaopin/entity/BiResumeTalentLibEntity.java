package com.sunlands.zhaopin.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Project : zhaopin-sys
 * @Package Name : com.sunlands.zhaopin.domain
 * @Description : TODO
 * @Author : admin
 * @Create Date : 2019年07月04日 23:49
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
@Entity
@Table(name = "bi_resume_talent_lib", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeTalentLibEntity {
    private String id;
    private String seekerId;
    private Integer deptId;
    private String jobId;
    private String enterStage;
    private String talentType;
    private String poolType;
    private String evaluateScore;
    private String status;
    private String reason;
    private String comments;
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
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
    @Column(name = "dept_id")
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
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
    @Column(name = "enter_stage")
    public String getEnterStage() {
        return enterStage;
    }

    public void setEnterStage(String enterStage) {
        this.enterStage = enterStage;
    }

    @Basic
    @Column(name = "talent_type")
    public String getTalentType() {
        return talentType;
    }

    public void setTalentType(String talentType) {
        this.talentType = talentType;
    }

    @Basic
    @Column(name = "pool_type")
    public String getPoolType() {
        return poolType;
    }

    public void setPoolType(String poolType) {
        this.poolType = poolType;
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
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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
        BiResumeTalentLibEntity that = (BiResumeTalentLibEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(seekerId, that.seekerId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(enterStage, that.enterStage) &&
                Objects.equals(talentType, that.talentType) &&
                Objects.equals(poolType, that.poolType) &&
                Objects.equals(evaluateScore, that.evaluateScore) &&
                Objects.equals(status, that.status) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seekerId, deptId, jobId, enterStage, talentType, poolType, evaluateScore, status, reason, comments, createdDate, lastUpdatedDate, deleted, version);
    }
}
