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
@Table(name = "bi_template_interview", schema = "db_feo_zhaopin", catalog = "")
public class BiTemplateInterviewEntity {
    private String id;
    private String templateName;
    private String templateContent;
    private String interviewTime;
    private String interviewSite;
    private String contactPeople;
    private String telephone;
    private String materious;
    private Long informType;
    private String comments;
    private Long enable;
    private Timestamp lastUpdatedDate;
    private Timestamp createdDate;
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
    @Column(name = "template_name")
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
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
    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
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
    @Column(name = "materious")
    public String getMaterious() {
        return materious;
    }

    public void setMaterious(String materious) {
        this.materious = materious;
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
    @Column(name = "comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "enable")
    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
        this.enable = enable;
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
    @Column(name = "created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
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
        BiTemplateInterviewEntity that = (BiTemplateInterviewEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(templateName, that.templateName) &&
                Objects.equals(templateContent, that.templateContent) &&
                Objects.equals(interviewTime, that.interviewTime) &&
                Objects.equals(interviewSite, that.interviewSite) &&
                Objects.equals(contactPeople, that.contactPeople) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(materious, that.materious) &&
                Objects.equals(informType, that.informType) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(enable, that.enable) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, templateName, templateContent, interviewTime, interviewSite, contactPeople, telephone, materious, informType, comments, enable, lastUpdatedDate, createdDate, deleted, version);
    }
}
