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
@Table(name = "bi_resume_notice_interview", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeNoticeInterviewEntity {
    private String id;
    private String jobId;
    private String turnId;
    private String position;
    private String postId;
    private String postName;
    private String seekerId;
    private String resumeId;
    private String jobSeekerName;
    private String jobSeekerEmail;
    private String jobSeekerPhone;
    private String templateContent;
    private Timestamp interviewTime;
    private String interviewSite;
    private Integer contactPeopleId;
    private String contactPeople;
    private String telephone;
    private String informType;
    private Integer isMail;
    private Integer isSms;
    private String materious;
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
    @Column(name = "job_id")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "turn_id")
    public String getTurnId() {
        return turnId;
    }

    public void setTurnId(String turnId) {
        this.turnId = turnId;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
    @Column(name = "post_name")
    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
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
    @Column(name = "job_seeker_name")
    public String getJobSeekerName() {
        return jobSeekerName;
    }

    public void setJobSeekerName(String jobSeekerName) {
        this.jobSeekerName = jobSeekerName;
    }

    @Basic
    @Column(name = "job_seeker_email")
    public String getJobSeekerEmail() {
        return jobSeekerEmail;
    }

    public void setJobSeekerEmail(String jobSeekerEmail) {
        this.jobSeekerEmail = jobSeekerEmail;
    }

    @Basic
    @Column(name = "job_seeker_phone")
    public String getJobSeekerPhone() {
        return jobSeekerPhone;
    }

    public void setJobSeekerPhone(String jobSeekerPhone) {
        this.jobSeekerPhone = jobSeekerPhone;
    }

    @Basic
    @Column(name = "template_content")
    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
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
    @Column(name = "interview_site")
    public String getInterviewSite() {
        return interviewSite;
    }

    public void setInterviewSite(String interviewSite) {
        this.interviewSite = interviewSite;
    }

    @Basic
    @Column(name = "contact_people_id")
    public Integer getContactPeopleId() {
        return contactPeopleId;
    }

    public void setContactPeopleId(Integer contactPeopleId) {
        this.contactPeopleId = contactPeopleId;
    }

    @Basic
    @Column(name = "contact_people")
    public String getContactPeople() {
        return contactPeople;
    }

    public void setContactPeople(String contactPeople) {
        this.contactPeople = contactPeople;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "inform_type")
    public String getInformType() {
        return informType;
    }

    public void setInformType(String informType) {
        this.informType = informType;
    }

    @Basic
    @Column(name = "is_mail")
    public Integer getIsMail() {
        return isMail;
    }

    public void setIsMail(Integer isMail) {
        this.isMail = isMail;
    }

    @Basic
    @Column(name = "is_sms")
    public Integer getIsSms() {
        return isSms;
    }

    public void setIsSms(Integer isSms) {
        this.isSms = isSms;
    }

    @Basic
    @Column(name = "materious")
    public String getMaterious() {
        return materious;
    }

    public void setMaterious(String materious) {
        this.materious = materious;
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
        BiResumeNoticeInterviewEntity that = (BiResumeNoticeInterviewEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(turnId, that.turnId) &&
                Objects.equals(position, that.position) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(postName, that.postName) &&
                Objects.equals(seekerId, that.seekerId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(jobSeekerName, that.jobSeekerName) &&
                Objects.equals(jobSeekerEmail, that.jobSeekerEmail) &&
                Objects.equals(jobSeekerPhone, that.jobSeekerPhone) &&
                Objects.equals(templateContent, that.templateContent) &&
                Objects.equals(interviewTime, that.interviewTime) &&
                Objects.equals(interviewSite, that.interviewSite) &&
                Objects.equals(contactPeopleId, that.contactPeopleId) &&
                Objects.equals(contactPeople, that.contactPeople) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(informType, that.informType) &&
                Objects.equals(isMail, that.isMail) &&
                Objects.equals(isSms, that.isSms) &&
                Objects.equals(materious, that.materious) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobId, turnId, position, postId, postName, seekerId, resumeId, jobSeekerName, jobSeekerEmail, jobSeekerPhone, templateContent, interviewTime, interviewSite, contactPeopleId, contactPeople, telephone, informType, isMail, isSms, materious, comments, createdDate, lastUpdatedDate, deleted, version);
    }
}
