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
@Table(name = "bi_resume_flow", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeFlowEntity {
    private String id;
    private String seekerId;
    private String resumeId;
    private Integer handlerDeptId;
    private int operUserId;
    private String deptId;
    private String jobId;
    private String postId;
    private String resumeState;
    private String preResumeState;
    private String jobTitles;
    private String flowType;
    private Integer num;
    private String flowTag;
    private String interviewRound;
    private String interviewRoundResult;
    private String enable;
    private String evaluateScore;
    private String evaluateContent;
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
    private Integer deleted;
    private Integer version;
    private String hiredDeptId;
    private String offerNo;
    private Byte areaType;
    private Integer companyCode;
    private Integer bankCardCode;
    private Integer bpoType;
    private String offerHtml;

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
    @Column(name = "handler_dept_id")
    public Integer getHandlerDeptId() {
        return handlerDeptId;
    }

    public void setHandlerDeptId(Integer handlerDeptId) {
        this.handlerDeptId = handlerDeptId;
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
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
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
    @Column(name = "post_id")
    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
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
    @Column(name = "pre_resume_state")
    public String getPreResumeState() {
        return preResumeState;
    }

    public void setPreResumeState(String preResumeState) {
        this.preResumeState = preResumeState;
    }

    @Basic
    @Column(name = "jobTitles")
    public String getJobTitles() {
        return jobTitles;
    }

    public void setJobTitles(String jobTitles) {
        this.jobTitles = jobTitles;
    }

    @Basic
    @Column(name = "flow_type")
    public String getFlowType() {
        return flowType;
    }

    public void setFlowType(String flowType) {
        this.flowType = flowType;
    }

    @Basic
    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "flow_tag")
    public String getFlowTag() {
        return flowTag;
    }

    public void setFlowTag(String flowTag) {
        this.flowTag = flowTag;
    }

    @Basic
    @Column(name = "interview_round")
    public String getInterviewRound() {
        return interviewRound;
    }

    public void setInterviewRound(String interviewRound) {
        this.interviewRound = interviewRound;
    }

    @Basic
    @Column(name = "interview_round_result")
    public String getInterviewRoundResult() {
        return interviewRoundResult;
    }

    public void setInterviewRoundResult(String interviewRoundResult) {
        this.interviewRoundResult = interviewRoundResult;
    }

    @Basic
    @Column(name = "enable")
    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
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

    @Basic
    @Column(name = "hired_dept_id")
    public String getHiredDeptId() {
        return hiredDeptId;
    }

    public void setHiredDeptId(String hiredDeptId) {
        this.hiredDeptId = hiredDeptId;
    }

    @Basic
    @Column(name = "offer_no")
    public String getOfferNo() {
        return offerNo;
    }

    public void setOfferNo(String offerNo) {
        this.offerNo = offerNo;
    }

    @Basic
    @Column(name = "area_type")
    public Byte getAreaType() {
        return areaType;
    }

    public void setAreaType(Byte areaType) {
        this.areaType = areaType;
    }

    @Basic
    @Column(name = "company_code")
    public Integer getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Integer companyCode) {
        this.companyCode = companyCode;
    }

    @Basic
    @Column(name = "bank_card_code")
    public Integer getBankCardCode() {
        return bankCardCode;
    }

    public void setBankCardCode(Integer bankCardCode) {
        this.bankCardCode = bankCardCode;
    }

    @Basic
    @Column(name = "bpo_type")
    public Integer getBpoType() {
        return bpoType;
    }

    public void setBpoType(Integer bpoType) {
        this.bpoType = bpoType;
    }

    @Basic
    @Column(name = "offer_html")
    public String getOfferHtml() {
        return offerHtml;
    }

    public void setOfferHtml(String offerHtml) {
        this.offerHtml = offerHtml;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiResumeFlowEntity that = (BiResumeFlowEntity) o;
        return operUserId == that.operUserId &&
                Objects.equals(id, that.id) &&
                Objects.equals(seekerId, that.seekerId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(handlerDeptId, that.handlerDeptId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(resumeState, that.resumeState) &&
                Objects.equals(preResumeState, that.preResumeState) &&
                Objects.equals(jobTitles, that.jobTitles) &&
                Objects.equals(flowType, that.flowType) &&
                Objects.equals(num, that.num) &&
                Objects.equals(flowTag, that.flowTag) &&
                Objects.equals(interviewRound, that.interviewRound) &&
                Objects.equals(interviewRoundResult, that.interviewRoundResult) &&
                Objects.equals(enable, that.enable) &&
                Objects.equals(evaluateScore, that.evaluateScore) &&
                Objects.equals(evaluateContent, that.evaluateContent) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version) &&
                Objects.equals(hiredDeptId, that.hiredDeptId) &&
                Objects.equals(offerNo, that.offerNo) &&
                Objects.equals(areaType, that.areaType) &&
                Objects.equals(companyCode, that.companyCode) &&
                Objects.equals(bankCardCode, that.bankCardCode) &&
                Objects.equals(bpoType, that.bpoType) &&
                Objects.equals(offerHtml, that.offerHtml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seekerId, resumeId, handlerDeptId, operUserId, deptId, jobId, postId, resumeState, preResumeState, jobTitles, flowType, num, flowTag, interviewRound, interviewRoundResult, enable, evaluateScore, evaluateContent, createdDate, lastUpdatedDate, deleted, version, hiredDeptId, offerNo, areaType, companyCode, bankCardCode, bpoType, offerHtml);
    }
}
