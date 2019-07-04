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
@Table(name = "bi_resume_dial_cdr", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeDialCdrEntity {
    private String id;
    private String dialId;
    private String resumeId;
    private String resumeFlowId;
    private String hrId;
    private Byte extNumFlag;
    private String callId;
    private String caller;
    private String called;
    private Timestamp ringTime;
    private Timestamp answerTime;
    private Timestamp endTime;
    private Integer totalTimeLen;
    private Integer ringTimeLen;
    private Integer talkTimeLen;
    private String recordPath;
    private Integer callDirect;
    private Integer deleted;
    private Timestamp createDt;
    private Timestamp modifyDt;
    private String version;
    private Integer sortNo;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dial_id")
    public String getDialId() {
        return dialId;
    }

    public void setDialId(String dialId) {
        this.dialId = dialId;
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
    @Column(name = "hr_id")
    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId;
    }

    @Basic
    @Column(name = "ext_num_flag")
    public Byte getExtNumFlag() {
        return extNumFlag;
    }

    public void setExtNumFlag(Byte extNumFlag) {
        this.extNumFlag = extNumFlag;
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
    @Column(name = "caller")
    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    @Basic
    @Column(name = "called")
    public String getCalled() {
        return called;
    }

    public void setCalled(String called) {
        this.called = called;
    }

    @Basic
    @Column(name = "ring_time")
    public Timestamp getRingTime() {
        return ringTime;
    }

    public void setRingTime(Timestamp ringTime) {
        this.ringTime = ringTime;
    }

    @Basic
    @Column(name = "answer_time")
    public Timestamp getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Timestamp answerTime) {
        this.answerTime = answerTime;
    }

    @Basic
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "total_time_len")
    public Integer getTotalTimeLen() {
        return totalTimeLen;
    }

    public void setTotalTimeLen(Integer totalTimeLen) {
        this.totalTimeLen = totalTimeLen;
    }

    @Basic
    @Column(name = "ring_time_len")
    public Integer getRingTimeLen() {
        return ringTimeLen;
    }

    public void setRingTimeLen(Integer ringTimeLen) {
        this.ringTimeLen = ringTimeLen;
    }

    @Basic
    @Column(name = "talk_time_len")
    public Integer getTalkTimeLen() {
        return talkTimeLen;
    }

    public void setTalkTimeLen(Integer talkTimeLen) {
        this.talkTimeLen = talkTimeLen;
    }

    @Basic
    @Column(name = "record_path")
    public String getRecordPath() {
        return recordPath;
    }

    public void setRecordPath(String recordPath) {
        this.recordPath = recordPath;
    }

    @Basic
    @Column(name = "call_direct")
    public Integer getCallDirect() {
        return callDirect;
    }

    public void setCallDirect(Integer callDirect) {
        this.callDirect = callDirect;
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
    @Column(name = "create_dt")
    public Timestamp getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Timestamp createDt) {
        this.createDt = createDt;
    }

    @Basic
    @Column(name = "modify_dt")
    public Timestamp getModifyDt() {
        return modifyDt;
    }

    public void setModifyDt(Timestamp modifyDt) {
        this.modifyDt = modifyDt;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "sort_no")
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiResumeDialCdrEntity that = (BiResumeDialCdrEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dialId, that.dialId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(hrId, that.hrId) &&
                Objects.equals(extNumFlag, that.extNumFlag) &&
                Objects.equals(callId, that.callId) &&
                Objects.equals(caller, that.caller) &&
                Objects.equals(called, that.called) &&
                Objects.equals(ringTime, that.ringTime) &&
                Objects.equals(answerTime, that.answerTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(totalTimeLen, that.totalTimeLen) &&
                Objects.equals(ringTimeLen, that.ringTimeLen) &&
                Objects.equals(talkTimeLen, that.talkTimeLen) &&
                Objects.equals(recordPath, that.recordPath) &&
                Objects.equals(callDirect, that.callDirect) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(createDt, that.createDt) &&
                Objects.equals(modifyDt, that.modifyDt) &&
                Objects.equals(version, that.version) &&
                Objects.equals(sortNo, that.sortNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dialId, resumeId, resumeFlowId, hrId, extNumFlag, callId, caller, called, ringTime, answerTime, endTime, totalTimeLen, ringTimeLen, talkTimeLen, recordPath, callDirect, deleted, createDt, modifyDt, version, sortNo);
    }
}
