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
@Table(name = "bi_resume_notice_offer", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeNoticeOfferEntity {
    private String id;
    private String seekerId;
    private String resumeId;
    private String resumeFlowId;
    private String jobSeekerName;
    private String templateContent;
    private String deptment;
    private String templateCode;
    private String companyCode;
    private String position;
    private String jobId;
    private Integer postId;
    private String workSite;
    private String salary;
    private Timestamp entryTime;
    private String entryMaterials;
    private Integer contactPeopleId;
    private String contactPeople;
    private String telephone;
    private String welfare;
    private String busline;
    private Long informType;
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
    @Column(name = "job_seeker_name")
    public String getJobSeekerName() {
        return jobSeekerName;
    }

    public void setJobSeekerName(String jobSeekerName) {
        this.jobSeekerName = jobSeekerName;
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
    @Column(name = "deptment")
    public String getDeptment() {
        return deptment;
    }

    public void setDeptment(String deptment) {
        this.deptment = deptment;
    }

    @Basic
    @Column(name = "template_code")
    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    @Basic
    @Column(name = "company_code")
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
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
    @Column(name = "job_id")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
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
    @Column(name = "work_site")
    public String getWorkSite() {
        return workSite;
    }

    public void setWorkSite(String workSite) {
        this.workSite = workSite;
    }

    @Basic
    @Column(name = "salary")
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "entry_time")
    public Timestamp getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Timestamp entryTime) {
        this.entryTime = entryTime;
    }

    @Basic
    @Column(name = "entry_materials")
    public String getEntryMaterials() {
        return entryMaterials;
    }

    public void setEntryMaterials(String entryMaterials) {
        this.entryMaterials = entryMaterials;
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
    @Column(name = "welfare")
    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    @Basic
    @Column(name = "busline")
    public String getBusline() {
        return busline;
    }

    public void setBusline(String busline) {
        this.busline = busline;
    }

    @Basic
    @Column(name = "inform_type")
    public Long getInformType() {
        return informType;
    }

    public void setInformType(Long informType) {
        this.informType = informType;
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
        BiResumeNoticeOfferEntity that = (BiResumeNoticeOfferEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(seekerId, that.seekerId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(jobSeekerName, that.jobSeekerName) &&
                Objects.equals(templateContent, that.templateContent) &&
                Objects.equals(deptment, that.deptment) &&
                Objects.equals(templateCode, that.templateCode) &&
                Objects.equals(companyCode, that.companyCode) &&
                Objects.equals(position, that.position) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(workSite, that.workSite) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(entryTime, that.entryTime) &&
                Objects.equals(entryMaterials, that.entryMaterials) &&
                Objects.equals(contactPeopleId, that.contactPeopleId) &&
                Objects.equals(contactPeople, that.contactPeople) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(welfare, that.welfare) &&
                Objects.equals(busline, that.busline) &&
                Objects.equals(informType, that.informType) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, seekerId, resumeId, resumeFlowId, jobSeekerName, templateContent, deptment, templateCode, companyCode, position, jobId, postId, workSite, salary, entryTime, entryMaterials, contactPeopleId, contactPeople, telephone, welfare, busline, informType, createdDate, lastUpdatedDate, deleted, version);
    }
}
