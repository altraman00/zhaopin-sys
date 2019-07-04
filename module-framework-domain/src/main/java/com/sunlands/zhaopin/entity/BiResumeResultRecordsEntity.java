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
@Table(name = "bi_resume_result_records", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeResultRecordsEntity {
    private String id;
    private String resumeId;
    private String resumeFlowId;
    private Integer isDial;
    private Integer dialResult;
    private Integer isInter;
    private Integer interTurn;
    private Integer interviewStatus;
    private Integer isOffer;
    private Integer offerReslut;
    private Integer isEntry;
    private Integer entryResult;
    private Timestamp createDate;
    private Timestamp updatedDate;

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
    @Column(name = "is_dial")
    public Integer getIsDial() {
        return isDial;
    }

    public void setIsDial(Integer isDial) {
        this.isDial = isDial;
    }

    @Basic
    @Column(name = "dial_result")
    public Integer getDialResult() {
        return dialResult;
    }

    public void setDialResult(Integer dialResult) {
        this.dialResult = dialResult;
    }

    @Basic
    @Column(name = "is_inter")
    public Integer getIsInter() {
        return isInter;
    }

    public void setIsInter(Integer isInter) {
        this.isInter = isInter;
    }

    @Basic
    @Column(name = "inter_turn")
    public Integer getInterTurn() {
        return interTurn;
    }

    public void setInterTurn(Integer interTurn) {
        this.interTurn = interTurn;
    }

    @Basic
    @Column(name = "interview_status")
    public Integer getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(Integer interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    @Basic
    @Column(name = "is_offer")
    public Integer getIsOffer() {
        return isOffer;
    }

    public void setIsOffer(Integer isOffer) {
        this.isOffer = isOffer;
    }

    @Basic
    @Column(name = "offer_reslut")
    public Integer getOfferReslut() {
        return offerReslut;
    }

    public void setOfferReslut(Integer offerReslut) {
        this.offerReslut = offerReslut;
    }

    @Basic
    @Column(name = "is_entry")
    public Integer getIsEntry() {
        return isEntry;
    }

    public void setIsEntry(Integer isEntry) {
        this.isEntry = isEntry;
    }

    @Basic
    @Column(name = "entry_result")
    public Integer getEntryResult() {
        return entryResult;
    }

    public void setEntryResult(Integer entryResult) {
        this.entryResult = entryResult;
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
        BiResumeResultRecordsEntity that = (BiResumeResultRecordsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(isDial, that.isDial) &&
                Objects.equals(dialResult, that.dialResult) &&
                Objects.equals(isInter, that.isInter) &&
                Objects.equals(interTurn, that.interTurn) &&
                Objects.equals(interviewStatus, that.interviewStatus) &&
                Objects.equals(isOffer, that.isOffer) &&
                Objects.equals(offerReslut, that.offerReslut) &&
                Objects.equals(isEntry, that.isEntry) &&
                Objects.equals(entryResult, that.entryResult) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resumeId, resumeFlowId, isDial, dialResult, isInter, interTurn, interviewStatus, isOffer, offerReslut, isEntry, entryResult, createDate, updatedDate);
    }
}
