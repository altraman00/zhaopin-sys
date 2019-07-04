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
@Table(name = "el_sys_org", schema = "db_feo_zhaopin", catalog = "")
public class ElSysOrgEntity {
    private String id;
    private Timestamp createDt;
    private Byte deleted;
    private Timestamp modifyDt;
    private Integer sortNo;
    private String version;
    private String level;
    private String organizationName;
    private String pid;
    private Byte orgType;
    private String division;
    private String orgName1;
    private String orgName2;
    private String orgName3;
    private String orgName4;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "deleted")
    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
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
    @Column(name = "sort_no")
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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
    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Basic
    @Column(name = "organization_name")
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    @Basic
    @Column(name = "pid")
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "org_type")
    public Byte getOrgType() {
        return orgType;
    }

    public void setOrgType(Byte orgType) {
        this.orgType = orgType;
    }

    @Basic
    @Column(name = "division")
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Basic
    @Column(name = "org_name1")
    public String getOrgName1() {
        return orgName1;
    }

    public void setOrgName1(String orgName1) {
        this.orgName1 = orgName1;
    }

    @Basic
    @Column(name = "org_name2")
    public String getOrgName2() {
        return orgName2;
    }

    public void setOrgName2(String orgName2) {
        this.orgName2 = orgName2;
    }

    @Basic
    @Column(name = "org_name3")
    public String getOrgName3() {
        return orgName3;
    }

    public void setOrgName3(String orgName3) {
        this.orgName3 = orgName3;
    }

    @Basic
    @Column(name = "org_name4")
    public String getOrgName4() {
        return orgName4;
    }

    public void setOrgName4(String orgName4) {
        this.orgName4 = orgName4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElSysOrgEntity that = (ElSysOrgEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createDt, that.createDt) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(modifyDt, that.modifyDt) &&
                Objects.equals(sortNo, that.sortNo) &&
                Objects.equals(version, that.version) &&
                Objects.equals(level, that.level) &&
                Objects.equals(organizationName, that.organizationName) &&
                Objects.equals(pid, that.pid) &&
                Objects.equals(orgType, that.orgType) &&
                Objects.equals(division, that.division) &&
                Objects.equals(orgName1, that.orgName1) &&
                Objects.equals(orgName2, that.orgName2) &&
                Objects.equals(orgName3, that.orgName3) &&
                Objects.equals(orgName4, that.orgName4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createDt, deleted, modifyDt, sortNo, version, level, organizationName, pid, orgType, division, orgName1, orgName2, orgName3, orgName4);
    }
}
