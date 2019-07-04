package com.sunlands.zhaopin.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Project : zhaopin-sys
 * @Package Name : com.sunlands.zhaopin.domain
 * @Description : TODO
 * @Author : admin
 * @Create Date : 2019年07月04日 23:47
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
@Entity
@Table(name = "bi_channel_department", schema = "db_feo_zhaopin", catalog = "")
public class BiChannelDepartmentEntity {
    private int id;
    private String channelId;
    private String deptId;
    private String deptName;
    private Timestamp updateDate;
    private Timestamp insertDate;
    private Integer deleteStatus;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "channel_id")
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    @Basic
    @Column(name = "dept_id")
    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "update_date")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "insert_date")
    public Timestamp getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Timestamp insertDate) {
        this.insertDate = insertDate;
    }

    @Basic
    @Column(name = "delete_status")
    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiChannelDepartmentEntity that = (BiChannelDepartmentEntity) o;
        return id == that.id &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(insertDate, that.insertDate) &&
                Objects.equals(deleteStatus, that.deleteStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, channelId, deptId, deptName, updateDate, insertDate, deleteStatus);
    }
}
