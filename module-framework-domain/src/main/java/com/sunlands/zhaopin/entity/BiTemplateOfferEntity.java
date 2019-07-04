package com.sunlands.zhaopin.entity;

import javax.persistence.*;
import java.math.BigDecimal;
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
@Table(name = "bi_template_offer", schema = "db_feo_zhaopin", catalog = "")
public class BiTemplateOfferEntity {
    private String id;
    private String templateName;
    private String templateContent;
    private Timestamp createdDate;
    private String deptment;
    private Timestamp lastUpdatedDate;
    private long enable;
    private String position;
    private String workSite;
    private String salary;
    private String entryTime;
    private String entryMaterials;
    private String contactPeople;
    private String telephone;
    private Long informType;
    private String comment;
    private String busline;
    private String welfare;
    private BigDecimal achievementsSalary;
    private String probation;
    private Byte area;
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
    @Column(name = "template_name")
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    @Basic
    @Column(name = "template_content")
    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
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
    @Column(name = "deptment")
    public String getDeptment() {
        return deptment;
    }

    public void setDeptment(String deptment) {
        this.deptment = deptment;
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
    @Column(name = "enable")
    public long getEnable() {
        return enable;
    }

    public void setEnable(long enable) {
        this.enable = enable;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "work_site")
    public String getWorkSite() {
        return workSite;
    }

    public void setWorkSite(String workSite) {
        this.workSite = workSite;
    }

    @Basic
    @Column(name = "salary")
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "entry_time")
    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    @Basic
    @Column(name = "entry_materials")
    public String getEntryMaterials() {
        return entryMaterials;
    }

    public void setEntryMaterials(String entryMaterials) {
        this.entryMaterials = entryMaterials;
    }

    @Basic
    @Column(name = "contact_people")
    public String getContactPeople() {
        return contactPeople;
    }

    public void setContactPeople(String contactPeople) {
        this.contactPeople = contactPeople;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "inform_type")
    public Long getInformType() {
        return informType;
    }

    public void setInformType(Long informType) {
        this.informType = informType;
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
    @Column(name = "busline")
    public String getBusline() {
        return busline;
    }

    public void setBusline(String busline) {
        this.busline = busline;
    }

    @Basic
    @Column(name = "welfare")
    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    @Basic
    @Column(name = "achievements_salary")
    public BigDecimal getAchievementsSalary() {
        return achievementsSalary;
    }

    public void setAchievementsSalary(BigDecimal achievementsSalary) {
        this.achievementsSalary = achievementsSalary;
    }

    @Basic
    @Column(name = "probation")
    public String getProbation() {
        return probation;
    }

    public void setProbation(String probation) {
        this.probation = probation;
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
        BiTemplateOfferEntity that = (BiTemplateOfferEntity) o;
        return enable == that.enable &&
                Objects.equals(id, that.id) &&
                Objects.equals(templateName, that.templateName) &&
                Objects.equals(templateContent, that.templateContent) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(deptment, that.deptment) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(position, that.position) &&
                Objects.equals(workSite, that.workSite) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(entryTime, that.entryTime) &&
                Objects.equals(entryMaterials, that.entryMaterials) &&
                Objects.equals(contactPeople, that.contactPeople) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(informType, that.informType) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(busline, that.busline) &&
                Objects.equals(welfare, that.welfare) &&
                Objects.equals(achievementsSalary, that.achievementsSalary) &&
                Objects.equals(probation, that.probation) &&
                Objects.equals(area, that.area) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, templateName, templateContent, createdDate, deptment, lastUpdatedDate, enable, position, workSite, salary, entryTime, entryMaterials, contactPeople, telephone, informType, comment, busline, welfare, achievementsSalary, probation, area, deleted, version);
    }
}
