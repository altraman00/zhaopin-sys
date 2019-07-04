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
@Table(name = "bi_ehr_resume", schema = "db_feo_zhaopin", catalog = "")
public class BiEhrResumeEntity {
    private long id;
    private String resumeId;
    private String name;
    private String sex;
    private String nation;
    private String birthday;
    private String idCard;
    private String registerAddress;
    private String resideAddress;
    private String phoneNum;
    private String email;
    private String qq;
    private String microblog;
    private String emergencyContactName;
    private String emergencyContactPhoneNum;
    private String bloodType;
    private String registerType;
    private String recordAddress;
    private String politicsStatus;
    private String employmentStatus;
    private String maritalStatus;
    private String resumeSource;
    private String remark;
    private String ehrEducations;
    private String ehrWorkExperiences;
    private String ehrCertifications;
    private String ehrFamilyMembers;
    private Timestamp createDate;
    private Timestamp updateDate;
    private int status;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "resume_id")
    public String getResumeId() {
        return resumeId;
    }

    public void setResumeId(String resumeId) {
        this.resumeId = resumeId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "nation")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "id_card")
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Basic
    @Column(name = "register_address")
    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    @Basic
    @Column(name = "reside_address")
    public String getResideAddress() {
        return resideAddress;
    }

    public void setResideAddress(String resideAddress) {
        this.resideAddress = resideAddress;
    }

    @Basic
    @Column(name = "phone_num")
    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "microblog")
    public String getMicroblog() {
        return microblog;
    }

    public void setMicroblog(String microblog) {
        this.microblog = microblog;
    }

    @Basic
    @Column(name = "emergency_contact_name")
    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    @Basic
    @Column(name = "emergency_contact_phone_num")
    public String getEmergencyContactPhoneNum() {
        return emergencyContactPhoneNum;
    }

    public void setEmergencyContactPhoneNum(String emergencyContactPhoneNum) {
        this.emergencyContactPhoneNum = emergencyContactPhoneNum;
    }

    @Basic
    @Column(name = "blood_type")
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Basic
    @Column(name = "register_type")
    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    @Basic
    @Column(name = "record_address")
    public String getRecordAddress() {
        return recordAddress;
    }

    public void setRecordAddress(String recordAddress) {
        this.recordAddress = recordAddress;
    }

    @Basic
    @Column(name = "politics_status")
    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    @Basic
    @Column(name = "employment_status")
    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    @Basic
    @Column(name = "marital_status")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "resume_source")
    public String getResumeSource() {
        return resumeSource;
    }

    public void setResumeSource(String resumeSource) {
        this.resumeSource = resumeSource;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "ehr_educations")
    public String getEhrEducations() {
        return ehrEducations;
    }

    public void setEhrEducations(String ehrEducations) {
        this.ehrEducations = ehrEducations;
    }

    @Basic
    @Column(name = "ehr_work_experiences")
    public String getEhrWorkExperiences() {
        return ehrWorkExperiences;
    }

    public void setEhrWorkExperiences(String ehrWorkExperiences) {
        this.ehrWorkExperiences = ehrWorkExperiences;
    }

    @Basic
    @Column(name = "ehr_certifications")
    public String getEhrCertifications() {
        return ehrCertifications;
    }

    public void setEhrCertifications(String ehrCertifications) {
        this.ehrCertifications = ehrCertifications;
    }

    @Basic
    @Column(name = "ehr_family_members")
    public String getEhrFamilyMembers() {
        return ehrFamilyMembers;
    }

    public void setEhrFamilyMembers(String ehrFamilyMembers) {
        this.ehrFamilyMembers = ehrFamilyMembers;
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
    @Column(name = "update_date")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiEhrResumeEntity that = (BiEhrResumeEntity) o;
        return id == that.id &&
                status == that.status &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(nation, that.nation) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(idCard, that.idCard) &&
                Objects.equals(registerAddress, that.registerAddress) &&
                Objects.equals(resideAddress, that.resideAddress) &&
                Objects.equals(phoneNum, that.phoneNum) &&
                Objects.equals(email, that.email) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(microblog, that.microblog) &&
                Objects.equals(emergencyContactName, that.emergencyContactName) &&
                Objects.equals(emergencyContactPhoneNum, that.emergencyContactPhoneNum) &&
                Objects.equals(bloodType, that.bloodType) &&
                Objects.equals(registerType, that.registerType) &&
                Objects.equals(recordAddress, that.recordAddress) &&
                Objects.equals(politicsStatus, that.politicsStatus) &&
                Objects.equals(employmentStatus, that.employmentStatus) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(resumeSource, that.resumeSource) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(ehrEducations, that.ehrEducations) &&
                Objects.equals(ehrWorkExperiences, that.ehrWorkExperiences) &&
                Objects.equals(ehrCertifications, that.ehrCertifications) &&
                Objects.equals(ehrFamilyMembers, that.ehrFamilyMembers) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(updateDate, that.updateDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resumeId, name, sex, nation, birthday, idCard, registerAddress, resideAddress, phoneNum, email, qq, microblog, emergencyContactName, emergencyContactPhoneNum, bloodType, registerType, recordAddress, politicsStatus, employmentStatus, maritalStatus, resumeSource, remark, ehrEducations, ehrWorkExperiences, ehrCertifications, ehrFamilyMembers, createDate, updateDate, status);
    }
}
