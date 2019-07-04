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
@Table(name = "bi_resume_dial", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeDialEntity {
    private String id;
    private String resumeFlowId;
    private String resumeId;
    private String dialResult;
    private Integer dialPersonId;
    private String dialPersonName;
    private Timestamp nextDialTime;
    private String refuseReason;
    private String disConnectReason;
    private Timestamp createdDate;
    private String createdBy;
    private Timestamp lastUpdatedDate;
    private String lastUpdatedBy;
    private String callId;
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
    @Column(name = "resume_flow_id")
    public String getResumeFlowId() {
        return resumeFlowId;
    }

    public void setResumeFlowId(String resumeFlowId) {
        this.resumeFlowId = resumeFlowId;
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
    @Column(name = "dial_result")
    public String getDialResult() {
        return dialResult;
    }

    public void setDialResult(String dialResult) {
        this.dialResult = dialResult;
    }

    @Basic
    @Column(name = "dial_person_id")
    public Integer getDialPersonId() {
        return dialPersonId;
    }

    public void setDialPersonId(Integer dialPersonId) {
        this.dialPersonId = dialPersonId;
    }

    @Basic
    @Column(name = "dial_person_name")
    public String getDialPersonName() {
        return dialPersonName;
    }

    public void setDialPersonName(String dialPersonName) {
        this.dialPersonName = dialPersonName;
    }

    @Basic
    @Column(name = "next_dial_time")
    public Timestamp getNextDialTime() {
        return nextDialTime;
    }

    public void setNextDialTime(Timestamp nextDialTime) {
        this.nextDialTime = nextDialTime;
    }

    @Basic
    @Column(name = "refuse_reason")
    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    @Basic
    @Column(name = "dis_connect_reason")
    public String getDisConnectReason() {
        return disConnectReason;
    }

    public void setDisConnectReason(String disConnectReason) {
        this.disConnectReason = disConnectReason;
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
    @Column(name = "call_id")
    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
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
        BiResumeDialEntity that = (BiResumeDialEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(dialResult, that.dialResult) &&
                Objects.equals(dialPersonId, that.dialPersonId) &&
                Objects.equals(dialPersonName, that.dialPersonName) &&
                Objects.equals(nextDialTime, that.nextDialTime) &&
                Objects.equals(refuseReason, that.refuseReason) &&
                Objects.equals(disConnectReason, that.disConnectReason) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(lastUpdatedBy, that.lastUpdatedBy) &&
                Objects.equals(callId, that.callId) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resumeFlowId, resumeId, dialResult, dialPersonId, dialPersonName, nextDialTime, refuseReason, disConnectReason, createdDate, createdBy, lastUpdatedDate, lastUpdatedBy, callId, deleted, version);
    }
}
