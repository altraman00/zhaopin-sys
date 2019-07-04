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
@Table(name = "bi_resume_education", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeEducationEntity {
    private String id;
    private String resumeId;
    private String school;
    private String createdBy;
    private Timestamp createdDate;
    private String lastUpdatedBy;
    private Timestamp lastUpdatedDate;
    private Long background;
    private String major;
    private Timestamp educationFrom;
    private Timestamp educationTo;
    private String comment;
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
    @Column(name = "resume_id")
    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    @Basic
    @Column(name = "school")
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
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
    @Column(name = "background")
    public Long getBackground() {
        return background;
    }

    public void setBackground(Long background) {
        this.background = background;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "education_from")
    public Timestamp getEducationFrom() {
        return educationFrom;
    }

    public void setEducationFrom(Timestamp educationFrom) {
        this.educationFrom = educationFrom;
    }

    @Basic
    @Column(name = "education_to")
    public Timestamp getEducationTo() {
        return educationTo;
    }

    public void setEducationTo(Timestamp educationTo) {
        this.educationTo = educationTo;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        BiResumeEducationEntity that = (BiResumeEducationEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(school, that.school) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedBy, that.lastUpdatedBy) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(background, that.background) &&
                Objects.equals(major, that.major) &&
                Objects.equals(educationFrom, that.educationFrom) &&
                Objects.equals(educationTo, that.educationTo) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resumeId, school, createdBy, createdDate, lastUpdatedBy, lastUpdatedDate, background, major, educationFrom, educationTo, comment, deleted, version);
    }
}
