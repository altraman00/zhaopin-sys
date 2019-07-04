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
@Table(name = "bi_notify", schema = "db_feo_zhaopin", catalog = "")
public class BiNotifyEntity {
    private int notifyId;
    private int notifyUserId;
    private int notifyType;
    private String notifyTypeName;
    private String title;
    private String contentTemplate;
    private Integer isRead;
    private Integer isDelete;
    private String createdBy;
    private Timestamp createDateTime;
    private Timestamp readDateTime;
    private Timestamp deleteDateTime;

    @Id
    @Column(name = "notify_id")
    public int getNotifyId() {
        return notifyId;
    }

    public void setNotifyId(int notifyId) {
        this.notifyId = notifyId;
    }

    @Basic
    @Column(name = "notify_user_id")
    public int getNotifyUserId() {
        return notifyUserId;
    }

    public void setNotifyUserId(int notifyUserId) {
        this.notifyUserId = notifyUserId;
    }

    @Basic
    @Column(name = "notify_type")
    public int getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(int notifyType) {
        this.notifyType = notifyType;
    }

    @Basic
    @Column(name = "notify_type_name")
    public String getNotifyTypeName() {
        return notifyTypeName;
    }

    public void setNotifyTypeName(String notifyTypeName) {
        this.notifyTypeName = notifyTypeName;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content_template")
    public String getContentTemplate() {
        return contentTemplate;
    }

    public void setContentTemplate(String contentTemplate) {
        this.contentTemplate = contentTemplate;
    }

    @Basic
    @Column(name = "is_read")
    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    @Basic
    @Column(name = "is_delete")
    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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
    @Column(name = "create_date_time")
    public Timestamp getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Timestamp createDateTime) {
        this.createDateTime = createDateTime;
    }

    @Basic
    @Column(name = "read_date_time")
    public Timestamp getReadDateTime() {
        return readDateTime;
    }

    public void setReadDateTime(Timestamp readDateTime) {
        this.readDateTime = readDateTime;
    }

    @Basic
    @Column(name = "delete_date_time")
    public Timestamp getDeleteDateTime() {
        return deleteDateTime;
    }

    public void setDeleteDateTime(Timestamp deleteDateTime) {
        this.deleteDateTime = deleteDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiNotifyEntity that = (BiNotifyEntity) o;
        return notifyId == that.notifyId &&
                notifyUserId == that.notifyUserId &&
                notifyType == that.notifyType &&
                Objects.equals(notifyTypeName, that.notifyTypeName) &&
                Objects.equals(title, that.title) &&
                Objects.equals(contentTemplate, that.contentTemplate) &&
                Objects.equals(isRead, that.isRead) &&
                Objects.equals(isDelete, that.isDelete) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createDateTime, that.createDateTime) &&
                Objects.equals(readDateTime, that.readDateTime) &&
                Objects.equals(deleteDateTime, that.deleteDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifyId, notifyUserId, notifyType, notifyTypeName, title, contentTemplate, isRead, isDelete, createdBy, createDateTime, readDateTime, deleteDateTime);
    }
}
