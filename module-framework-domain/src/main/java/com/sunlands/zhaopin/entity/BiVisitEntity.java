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
@Table(name = "bi_visit", schema = "db_feo_zhaopin", catalog = "")
public class BiVisitEntity {
    private int id;
    private String bussinessId;
    private String visitId;
    private String resumeId;
    private String resumeFlowId;
    private String candidateId;
    private String candidateName;
    private String candidatePhone;
    private String hrEmail;
    private String hrName;
    private String groupName;
    private Timestamp orderTime;
    private String orderReason;
    private String orderPlace;
    private Integer postId;
    private String postName;
    private Integer visitType;
    private int isVisit;
    private Timestamp visitTime;
    private String operUserId;
    private Timestamp createDate;
    private Timestamp updatedDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "bussiness_id")
    public String getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(String bussinessId) {
        this.bussinessId = bussinessId;
    }

    @Basic
    @Column(name = "visit_id")
    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
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
    @Column(name = "candidate_id")
    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    @Basic
    @Column(name = "candidate_name")
    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    @Basic
    @Column(name = "candidate_phone")
    public String getCandidatePhone() {
        return candidatePhone;
    }

    public void setCandidatePhone(String candidatePhone) {
        this.candidatePhone = candidatePhone;
    }

    @Basic
    @Column(name = "hr_email")
    public String getHrEmail() {
        return hrEmail;
    }

    public void setHrEmail(String hrEmail) {
        this.hrEmail = hrEmail;
    }

    @Basic
    @Column(name = "hr_name")
    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    @Basic
    @Column(name = "group_name")
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Basic
    @Column(name = "order_time")
    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }

    @Basic
    @Column(name = "order_reason")
    public String getOrderReason() {
        return orderReason;
    }

    public void setOrderReason(String orderReason) {
        this.orderReason = orderReason;
    }

    @Basic
    @Column(name = "order_place")
    public String getOrderPlace() {
        return orderPlace;
    }

    public void setOrderPlace(String orderPlace) {
        this.orderPlace = orderPlace;
    }

    @Basic
    @Column(name = "post_id")
    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "post_name")
    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    @Basic
    @Column(name = "visit_type")
    public Integer getVisitType() {
        return visitType;
    }

    public void setVisitType(Integer visitType) {
        this.visitType = visitType;
    }

    @Basic
    @Column(name = "is_visit")
    public int getIsVisit() {
        return isVisit;
    }

    public void setIsVisit(int isVisit) {
        this.isVisit = isVisit;
    }

    @Basic
    @Column(name = "visit_time")
    public Timestamp getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Timestamp visitTime) {
        this.visitTime = visitTime;
    }

    @Basic
    @Column(name = "oper_user_id")
    public String getOperUserId() {
        return operUserId;
    }

    public void setOperUserId(String operUserId) {
        this.operUserId = operUserId;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "updated_date")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiVisitEntity that = (BiVisitEntity) o;
        return id == that.id &&
                isVisit == that.isVisit &&
                Objects.equals(bussinessId, that.bussinessId) &&
                Objects.equals(visitId, that.visitId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(candidateId, that.candidateId) &&
                Objects.equals(candidateName, that.candidateName) &&
                Objects.equals(candidatePhone, that.candidatePhone) &&
                Objects.equals(hrEmail, that.hrEmail) &&
                Objects.equals(hrName, that.hrName) &&
                Objects.equals(groupName, that.groupName) &&
                Objects.equals(orderTime, that.orderTime) &&
                Objects.equals(orderReason, that.orderReason) &&
                Objects.equals(orderPlace, that.orderPlace) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(postName, that.postName) &&
                Objects.equals(visitType, that.visitType) &&
                Objects.equals(visitTime, that.visitTime) &&
                Objects.equals(operUserId, that.operUserId) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bussinessId, visitId, resumeId, resumeFlowId, candidateId, candidateName, candidatePhone, hrEmail, hrName, groupName, orderTime, orderReason, orderPlace, postId, postName, visitType, isVisit, visitTime, operUserId, createDate, updatedDate);
    }
}
