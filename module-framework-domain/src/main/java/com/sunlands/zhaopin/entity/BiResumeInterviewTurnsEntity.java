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
@Table(name = "bi_resume_interview_turns", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeInterviewTurnsEntity {
    private String id;
    private String resumeId;
    private String interviewRecordId;
    private String resumeFlowId;
    private Integer count;
    private Timestamp interviewTime;
    private String interviewerName;
    private String interviewerId;
    private String result;
    private Timestamp feedbackTime;
    private String score;
    private String isFeedback;
    private String isVisit;
    private Integer isNeedVisit;
    private String interviewComment;
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
    @Column(name = "interview_record_id")
    public String getInterviewRecordId() {
        return interviewRecordId;
    }

    public void setInterviewRecordId(String interviewRecordId) {
        this.interviewRecordId = interviewRecordId;
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
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
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
    @Column(name = "interviewer_name")
    public String getInterviewerName() {
        return interviewerName;
    }

    public void setInterviewerName(String interviewerName) {
        this.interviewerName = interviewerName;
    }

    @Basic
    @Column(name = "interviewer_id")
    public String getInterviewerId() {
        return interviewerId;
    }

    public void setInterviewerId(String interviewerId) {
        this.interviewerId = interviewerId;
    }

    @Basic
    @Column(name = "result")
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Basic
    @Column(name = "feedback_time")
    public Timestamp getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Timestamp feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    @Basic
    @Column(name = "score")
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Basic
    @Column(name = "is_feedback")
    public String getIsFeedback() {
        return isFeedback;
    }

    public void setIsFeedback(String isFeedback) {
        this.isFeedback = isFeedback;
    }

    @Basic
    @Column(name = "is_visit")
    public String getIsVisit() {
        return isVisit;
    }

    public void setIsVisit(String isVisit) {
        this.isVisit = isVisit;
    }

    @Basic
    @Column(name = "is_need_visit")
    public Integer getIsNeedVisit() {
        return isNeedVisit;
    }

    public void setIsNeedVisit(Integer isNeedVisit) {
        this.isNeedVisit = isNeedVisit;
    }

    @Basic
    @Column(name = "interview_comment")
    public String getInterviewComment() {
        return interviewComment;
    }

    public void setInterviewComment(String interviewComment) {
        this.interviewComment = interviewComment;
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
        BiResumeInterviewTurnsEntity that = (BiResumeInterviewTurnsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(interviewRecordId, that.interviewRecordId) &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(count, that.count) &&
                Objects.equals(interviewTime, that.interviewTime) &&
                Objects.equals(interviewerName, that.interviewerName) &&
                Objects.equals(interviewerId, that.interviewerId) &&
                Objects.equals(result, that.result) &&
                Objects.equals(feedbackTime, that.feedbackTime) &&
                Objects.equals(score, that.score) &&
                Objects.equals(isFeedback, that.isFeedback) &&
                Objects.equals(isVisit, that.isVisit) &&
                Objects.equals(isNeedVisit, that.isNeedVisit) &&
                Objects.equals(interviewComment, that.interviewComment) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(lastUpdatedBy, that.lastUpdatedBy) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resumeId, interviewRecordId, resumeFlowId, count, interviewTime, interviewerName, interviewerId, result, feedbackTime, score, isFeedback, isVisit, isNeedVisit, interviewComment, createdDate, createdBy, lastUpdatedDate, lastUpdatedBy, deleted, version);
    }
}
