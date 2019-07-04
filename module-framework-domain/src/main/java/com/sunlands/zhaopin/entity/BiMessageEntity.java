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
@Table(name = "bi_message", schema = "db_feo_zhaopin", catalog = "")
public class BiMessageEntity {
    private String id;
    private Integer messageType;
    private String messageName;
    private Integer onHandler;
    private String onJobName;
    private String onResumeName;
    private Integer toHandler;
    private Integer isRead;
    private String createdBy;
    private Timestamp createdDate;
    private Integer lastUpdatedBy;
    private Timestamp lastUpdatedDate;
    private Integer enable;
    private String comment1;
    private String seekerId;
    private String resumeId;
    private String jobId;
    private String comment2;
    private String comment3;
    private String tabIndex;
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
    @Column(name = "message_type")
    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    @Basic
    @Column(name = "message_name")
    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    @Basic
    @Column(name = "on_handler")
    public Integer getOnHandler() {
        return onHandler;
    }

    public void setOnHandler(Integer onHandler) {
        this.onHandler = onHandler;
    }

    @Basic
    @Column(name = "on_job_name")
    public String getOnJobName() {
        return onJobName;
    }

    public void setOnJobName(String onJobName) {
        this.onJobName = onJobName;
    }

    @Basic
    @Column(name = "on_resume_name")
    public String getOnResumeName() {
        return onResumeName;
    }

    public void setOnResumeName(String onResumeName) {
        this.onResumeName = onResumeName;
    }

    @Basic
    @Column(name = "to_handler")
    public Integer getToHandler() {
        return toHandler;
    }

    public void setToHandler(Integer toHandler) {
        this.toHandler = toHandler;
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
    public Integer getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(Integer lastUpdatedBy) {
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
    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    @Basic
    @Column(name = "comment1")
    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
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
    @Column(name = "job_id")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "comment2")
    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    @Basic
    @Column(name = "comment3")
    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }

    @Basic
    @Column(name = "tab_index")
    public String getTabIndex() {
        return tabIndex;
    }

    public void setTabIndex(String tabIndex) {
        this.tabIndex = tabIndex;
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
        BiMessageEntity that = (BiMessageEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(messageType, that.messageType) &&
                Objects.equals(messageName, that.messageName) &&
                Objects.equals(onHandler, that.onHandler) &&
                Objects.equals(onJobName, that.onJobName) &&
                Objects.equals(onResumeName, that.onResumeName) &&
                Objects.equals(toHandler, that.toHandler) &&
                Objects.equals(isRead, that.isRead) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedBy, that.lastUpdatedBy) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(enable, that.enable) &&
                Objects.equals(comment1, that.comment1) &&
                Objects.equals(seekerId, that.seekerId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(comment2, that.comment2) &&
                Objects.equals(comment3, that.comment3) &&
                Objects.equals(tabIndex, that.tabIndex) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, messageType, messageName, onHandler, onJobName, onResumeName, toHandler, isRead, createdBy, createdDate, lastUpdatedBy, lastUpdatedDate, enable, comment1, seekerId, resumeId, jobId, comment2, comment3, tabIndex, deleted, version);
    }
}
