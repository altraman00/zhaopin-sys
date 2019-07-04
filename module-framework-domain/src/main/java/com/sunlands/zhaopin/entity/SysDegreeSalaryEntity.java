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
@Table(name = "sys_degree_salary", schema = "db_feo_zhaopin", catalog = "")
public class SysDegreeSalaryEntity {
    private String id;
    private String degreeId;
    private Byte skuType;
    private Byte area;
    private Integer salary;
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
    @Column(name = "degree_id")
    public String getDegreeId() {
        return degreeId;
    }

    public void setDegreeId(String degreeId) {
        this.degreeId = degreeId;
    }

    @Basic
    @Column(name = "sku_type")
    public Byte getSkuType() {
        return skuType;
    }

    public void setSkuType(Byte skuType) {
        this.skuType = skuType;
    }

    @Basic
    @Column(name = "area")
    public Byte getArea() {
        return area;
    }

    public void setArea(Byte area) {
        this.area = area;
    }

    @Basic
    @Column(name = "salary")
    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
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
        SysDegreeSalaryEntity that = (SysDegreeSalaryEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(degreeId, that.degreeId) &&
                Objects.equals(skuType, that.skuType) &&
                Objects.equals(area, that.area) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(createDt, that.createDt) &&
                Objects.equals(modifyDt, that.modifyDt) &&
                Objects.equals(version, that.version) &&
                Objects.equals(sortNo, that.sortNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, degreeId, skuType, area, salary, deleted, createDt, modifyDt, version, sortNo);
    }
}
