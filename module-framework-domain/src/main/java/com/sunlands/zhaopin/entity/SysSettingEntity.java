package com.sunlands.zhaopin.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Project : zhaopin-sys
 * @Package Name : com.sunlands.zhaopin.domain
 * @Description : TODO
 * @Author : admin
 * @Create Date : 2019年07月04日 23:50
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
@Entity
@Table(name = "sys_setting", schema = "db_feo_zhaopin", catalog = "")
public class SysSettingEntity {
    private String id;
    private String settingName;
    private String createdBy;
    private Timestamp createdDate;
    private String lastUpdatedBy;
    private Timestamp lastUpdatedDate;
    private Long usefulTime;
    private Timestamp refreshFrom;
    private Timestamp refreshTo;
    private Long refreshInterval;
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
    @Column(name = "setting_name")
    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
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
    @Column(name = "useful_time")
    public Long getUsefulTime() {
        return usefulTime;
    }

    public void setUsefulTime(Long usefulTime) {
        this.usefulTime = usefulTime;
    }

    @Basic
    @Column(name = "refresh_from")
    public Timestamp getRefreshFrom() {
        return refreshFrom;
    }

    public void setRefreshFrom(Timestamp refreshFrom) {
        this.refreshFrom = refreshFrom;
    }

    @Basic
    @Column(name = "refresh_to")
    public Timestamp getRefreshTo() {
        return refreshTo;
    }

    public void setRefreshTo(Timestamp refreshTo) {
        this.refreshTo = refreshTo;
    }

    @Basic
    @Column(name = "refresh_interval")
    public Long getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(Long refreshInterval) {
        this.refreshInterval = refreshInterval;
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
        SysSettingEntity that = (SysSettingEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(settingName, that.settingName) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedBy, that.lastUpdatedBy) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(usefulTime, that.usefulTime) &&
                Objects.equals(refreshFrom, that.refreshFrom) &&
                Objects.equals(refreshTo, that.refreshTo) &&
                Objects.equals(refreshInterval, that.refreshInterval) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, settingName, createdBy, createdDate, lastUpdatedBy, lastUpdatedDate, usefulTime, refreshFrom, refreshTo, refreshInterval, comment, deleted, version);
    }
}
