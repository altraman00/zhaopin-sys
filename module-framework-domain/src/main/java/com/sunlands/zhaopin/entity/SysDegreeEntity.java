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
@Table(name = "sys_degree", schema = "db_feo_zhaopin", catalog = "")
public class SysDegreeEntity {
    private String id;
    private String pDegree;
    private String degreeName;
    private Byte level;
    private Byte bpoFlag;
    private Integer deleted;
    private Timestamp createDt;
    private Timestamp modifyDt;
    private String version;
    private Integer sortNo;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "p_degree")
    public String getpDegree() {
        return pDegree;
    }

    public void setpDegree(String pDegree) {
        this.pDegree = pDegree;
    }

    @Basic
    @Column(name = "degree_name")
    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    @Basic
    @Column(name = "level")
    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    @Basic
    @Column(name = "bpo_flag")
    public Byte getBpoFlag() {
        return bpoFlag;
    }

    public void setBpoFlag(Byte bpoFlag) {
        this.bpoFlag = bpoFlag;
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
    @Column(name = "create_dt")
    public Timestamp getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Timestamp createDt) {
        this.createDt = createDt;
    }

    @Basic
    @Column(name = "modify_dt")
    public Timestamp getModifyDt() {
        return modifyDt;
    }

    public void setModifyDt(Timestamp modifyDt) {
        this.modifyDt = modifyDt;
    }

    @Basic
    @Column(name = "version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Basic
    @Column(name = "sort_no")
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysDegreeEntity that = (SysDegreeEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(pDegree, that.pDegree) &&
                Objects.equals(degreeName, that.degreeName) &&
                Objects.equals(level, that.level) &&
                Objects.equals(bpoFlag, that.bpoFlag) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(createDt, that.createDt) &&
                Objects.equals(modifyDt, that.modifyDt) &&
                Objects.equals(version, that.version) &&
                Objects.equals(sortNo, that.sortNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pDegree, degreeName, level, bpoFlag, deleted, createDt, modifyDt, version, sortNo);
    }
}
