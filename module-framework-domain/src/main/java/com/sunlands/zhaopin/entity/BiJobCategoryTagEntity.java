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
@Table(name = "bi_job_category_tag", schema = "db_feo_zhaopin", catalog = "")
public class BiJobCategoryTagEntity {
    private long id;
    private Integer jobCategoryId;
    private String tagContent;
    private String platId;
    private String platJobCode;
    private Integer deleted;
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
    private String version;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "job_category_id")
    public Integer getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(Integer jobCategoryId) {
        this.jobCategoryId = jobCategoryId;
    }

    @Basic
    @Column(name = "tag_content")
    public String getTagContent() {
        return tagContent;
    }

    public void setTagContent(String tagContent) {
        this.tagContent = tagContent;
    }

    @Basic
    @Column(name = "plat_id")
    public String getPlatId() {
        return platId;
    }

    public void setPlatId(String platId) {
        this.platId = platId;
    }

    @Basic
    @Column(name = "plat_job_code")
    public String getPlatJobCode() {
        return platJobCode;
    }

    public void setPlatJobCode(String platJobCode) {
        this.platJobCode = platJobCode;
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
        BiJobCategoryTagEntity that = (BiJobCategoryTagEntity) o;
        return id == that.id &&
                Objects.equals(jobCategoryId, that.jobCategoryId) &&
                Objects.equals(tagContent, that.tagContent) &&
                Objects.equals(platId, that.platId) &&
                Objects.equals(platJobCode, that.platJobCode) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobCategoryId, tagContent, platId, platJobCode, deleted, createdDate, lastUpdatedDate, version);
    }
}
