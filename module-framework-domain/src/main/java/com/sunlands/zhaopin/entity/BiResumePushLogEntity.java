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
@Table(name = "bi_resume_push_log", schema = "db_feo_zhaopin", catalog = "")
public class BiResumePushLogEntity {
    private String id;
    private String resumeId;
    private Integer pushUserId;
    private String pushJobId;
    private String pushComment;
    private Timestamp pushDate;
    private String status;
    private String toUserId;
    private String answerComment;
    private Timestamp answerDate;
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
    @Column(name = "resume_id")
    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    @Basic
    @Column(name = "push_user_id")
    public Integer getPushUserId() {
        return pushUserId;
    }

    public void setPushUserId(Integer pushUserId) {
        this.pushUserId = pushUserId;
    }

    @Basic
    @Column(name = "push_job_id")
    public String getPushJobId() {
        return pushJobId;
    }

    public void setPushJobId(String pushJobId) {
        this.pushJobId = pushJobId;
    }

    @Basic
    @Column(name = "push_comment")
    public String getPushComment() {
        return pushComment;
    }

    public void setPushComment(String pushComment) {
        this.pushComment = pushComment;
    }

    @Basic
    @Column(name = "push_date")
    public Timestamp getPushDate() {
        return pushDate;
    }

    public void setPushDate(Timestamp pushDate) {
        this.pushDate = pushDate;
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
    @Column(name = "to_user_id")
    public String getToUserId() {
        return toUserId;
    }

    public void setToUserId(String toUserId) {
        this.toUserId = toUserId;
    }

    @Basic
    @Column(name = "answer_comment")
    public String getAnswerComment() {
        return answerComment;
    }

    public void setAnswerComment(String answerComment) {
        this.answerComment = answerComment;
    }

    @Basic
    @Column(name = "answer_date")
    public Timestamp getAnswerDate() {
        return answerDate;
    }

    public void setAnswerDate(Timestamp answerDate) {
        this.answerDate = answerDate;
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
        BiResumePushLogEntity that = (BiResumePushLogEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(pushUserId, that.pushUserId) &&
                Objects.equals(pushJobId, that.pushJobId) &&
                Objects.equals(pushComment, that.pushComment) &&
                Objects.equals(pushDate, that.pushDate) &&
                Objects.equals(status, that.status) &&
                Objects.equals(toUserId, that.toUserId) &&
                Objects.equals(answerComment, that.answerComment) &&
                Objects.equals(answerDate, that.answerDate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resumeId, pushUserId, pushJobId, pushComment, pushDate, status, toUserId, answerComment, answerDate, createdDate, lastUpdatedDate, deleted, version);
    }
}
