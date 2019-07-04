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
@Table(name = "bi_ehr_post", schema = "db_feo_zhaopin", catalog = "")
public class BiEhrPostEntity {
    private int id;
    private String ehrPostName;
    private String ehrPostId;
    private Timestamp createDate;
    private Integer deleted;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ehr_post_name")
    public String getEhrPostName() {
        return ehrPostName;
    }

    public void setEhrPostName(String ehrPostName) {
        this.ehrPostName = ehrPostName;
    }

    @Basic
    @Column(name = "ehr_post_id")
    public String getEhrPostId() {
        return ehrPostId;
    }

    public void setEhrPostId(String ehrPostId) {
        this.ehrPostId = ehrPostId;
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
    @Column(name = "deleted")
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiEhrPostEntity that = (BiEhrPostEntity) o;
        return id == that.id &&
                Objects.equals(ehrPostName, that.ehrPostName) &&
                Objects.equals(ehrPostId, that.ehrPostId) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ehrPostName, ehrPostId, createDate, deleted);
    }
}
