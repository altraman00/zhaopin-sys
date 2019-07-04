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
@Table(name = "st_user_indicators", schema = "db_feo_zhaopin", catalog = "")
public class StUserIndicatorsEntity {
    private String id;
    private Integer userId;
    private Integer deptId;
    private Integer roleId;
    private Integer publishCount;
    private Integer receiveCount;
    private Integer downloadCount;
    private Integer handlerCount;
    private Integer interviewCount;
    private Integer passCount;
    private Integer inCount;
    private Integer notInCount;
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
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "dept_id")
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "role_id")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "publish_count")
    public Integer getPublishCount() {
        return publishCount;
    }

    public void setPublishCount(Integer publishCount) {
        this.publishCount = publishCount;
    }

    @Basic
    @Column(name = "receive_count")
    public Integer getReceiveCount() {
        return receiveCount;
    }

    public void setReceiveCount(Integer receiveCount) {
        this.receiveCount = receiveCount;
    }

    @Basic
    @Column(name = "download_count")
    public Integer getDownloadCount() {
        return downloadCount;
    }

    public void setDownloadCount(Integer downloadCount) {
        this.downloadCount = downloadCount;
    }

    @Basic
    @Column(name = "handler_count")
    public Integer getHandlerCount() {
        return handlerCount;
    }

    public void setHandlerCount(Integer handlerCount) {
        this.handlerCount = handlerCount;
    }

    @Basic
    @Column(name = "interview_count")
    public Integer getInterviewCount() {
        return interviewCount;
    }

    public void setInterviewCount(Integer interviewCount) {
        this.interviewCount = interviewCount;
    }

    @Basic
    @Column(name = "pass_count")
    public Integer getPassCount() {
        return passCount;
    }

    public void setPassCount(Integer passCount) {
        this.passCount = passCount;
    }

    @Basic
    @Column(name = "in_count")
    public Integer getInCount() {
        return inCount;
    }

    public void setInCount(Integer inCount) {
        this.inCount = inCount;
    }

    @Basic
    @Column(name = "not_in_count")
    public Integer getNotInCount() {
        return notInCount;
    }

    public void setNotInCount(Integer notInCount) {
        this.notInCount = notInCount;
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
        StUserIndicatorsEntity that = (StUserIndicatorsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(publishCount, that.publishCount) &&
                Objects.equals(receiveCount, that.receiveCount) &&
                Objects.equals(downloadCount, that.downloadCount) &&
                Objects.equals(handlerCount, that.handlerCount) &&
                Objects.equals(interviewCount, that.interviewCount) &&
                Objects.equals(passCount, that.passCount) &&
                Objects.equals(inCount, that.inCount) &&
                Objects.equals(notInCount, that.notInCount) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, deptId, roleId, publishCount, receiveCount, downloadCount, handlerCount, interviewCount, passCount, inCount, notInCount, createdDate, lastUpdatedDate, deleted, version);
    }
}
