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
@Table(name = "bi_resume", schema = "db_feo_zhaopin", catalog = "")
public class BiResumeEntity {
    private String seekerId;
    private String id;
    private String platSeekerId;
    private String platResumeId;
    private String jobId;
    private String postId;
    private String platId;
    private String jobSeekerName;
    private String inWay;
    private String phone;
    private String oldPhone;
    private Integer age;
    private String email;
    private String sex;
    private String birthday;
    private String degree;
    private Integer workLengthMax;
    private Integer workLengthMin;
    private String workLength;
    private String isMarry;
    private String jobTitle;
    private String resideAddress;
    private String currentState;
    private Integer expectSalaryMax;
    private Integer expectSalaryMin;
    private String expectPlace;
    private String interestedDept;
    private String expectJob;
    private String isOccupy;
    private String expectIndustry;
    private String photoPath;
    private String personState;
    private String abandonReasonId;
    private String expectJobProperty;
    private String politicalStatus;
    private String educationStr;
    private String workExStr;
    private String comment;
    private String isDistribute;
    private Timestamp askTime;
    private String isBrandCompany;
    private String isBrandUniversity;
    private Timestamp lastUpdatedDate;
    private String university;
    private String major;
    private String resumeUploadName;
    private String resumeName;
    private String resumePath;
    private String pdfPath;
    private String worksPath;
    private String deptId;
    private String bussDeptId;
    private Integer state;
    private Timestamp outDate;
    private Integer lastOperUserId;
    private Integer outState;
    private String resumeDetail;
    private String esId;
    private String signatureCode;
    private Integer version;
    private Integer deleted;
    private Timestamp createdDate;

    @Basic
    @Column(name = "seeker_id")
    public String getSeekerId() {
        return seekerId;
    }

    public void setSeekerId(String seekerId) {
        this.seekerId = seekerId;
    }

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "plat_seeker_id")
    public String getPlatSeekerId() {
        return platSeekerId;
    }

    public void setPlatSeekerId(String platSeekerId) {
        this.platSeekerId = platSeekerId;
    }

    @Basic
    @Column(name = "plat_resume_id")
    public String getPlatResumeId() {
        return platResumeId;
    }

    public void setPlatResumeId(String platResumeId) {
        this.platResumeId = platResumeId;
    }

    @Basic
    @Column(name = "job_id")
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "post_id")
    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "plat_id")
    public String getPlatId() {
        return platId;
    }

    public void setPlatId(String platId) {
        this.platId = platId;
    }

    @Basic
    @Column(name = "job_seeker_name")
    public String getJobSeekerName() {
        return jobSeekerName;
    }

    public void setJobSeekerName(String jobSeekerName) {
        this.jobSeekerName = jobSeekerName;
    }

    @Basic
    @Column(name = "in_way")
    public String getInWay() {
        return inWay;
    }

    public void setInWay(String inWay) {
        this.inWay = inWay;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "old_phone")
    public String getOldPhone() {
        return oldPhone;
    }

    public void setOldPhone(String oldPhone) {
        this.oldPhone = oldPhone;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
    @Column(name = "degree")
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Basic
    @Column(name = "work_length_max")
    public Integer getWorkLengthMax() {
        return workLengthMax;
    }

    public void setWorkLengthMax(Integer workLengthMax) {
        this.workLengthMax = workLengthMax;
    }

    @Basic
    @Column(name = "work_length_min")
    public Integer getWorkLengthMin() {
        return workLengthMin;
    }

    public void setWorkLengthMin(Integer workLengthMin) {
        this.workLengthMin = workLengthMin;
    }

    @Basic
    @Column(name = "work_length")
    public String getWorkLength() {
        return workLength;
    }

    public void setWorkLength(String workLength) {
        this.workLength = workLength;
    }

    @Basic
    @Column(name = "is_marry")
    public String getIsMarry() {
        return isMarry;
    }

    public void setIsMarry(String isMarry) {
        this.isMarry = isMarry;
    }

    @Basic
    @Column(name = "job_title")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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
    @Column(name = "current_state")
    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    @Basic
    @Column(name = "expect_salary_max")
    public Integer getExpectSalaryMax() {
        return expectSalaryMax;
    }

    public void setExpectSalaryMax(Integer expectSalaryMax) {
        this.expectSalaryMax = expectSalaryMax;
    }

    @Basic
    @Column(name = "expect_salary_min")
    public Integer getExpectSalaryMin() {
        return expectSalaryMin;
    }

    public void setExpectSalaryMin(Integer expectSalaryMin) {
        this.expectSalaryMin = expectSalaryMin;
    }

    @Basic
    @Column(name = "expect_place")
    public String getExpectPlace() {
        return expectPlace;
    }

    public void setExpectPlace(String expectPlace) {
        this.expectPlace = expectPlace;
    }

    @Basic
    @Column(name = "interested_dept")
    public String getInterestedDept() {
        return interestedDept;
    }

    public void setInterestedDept(String interestedDept) {
        this.interestedDept = interestedDept;
    }

    @Basic
    @Column(name = "expect_job")
    public String getExpectJob() {
        return expectJob;
    }

    public void setExpectJob(String expectJob) {
        this.expectJob = expectJob;
    }

    @Basic
    @Column(name = "is_occupy")
    public String getIsOccupy() {
        return isOccupy;
    }

    public void setIsOccupy(String isOccupy) {
        this.isOccupy = isOccupy;
    }

    @Basic
    @Column(name = "expect_industry")
    public String getExpectIndustry() {
        return expectIndustry;
    }

    public void setExpectIndustry(String expectIndustry) {
        this.expectIndustry = expectIndustry;
    }

    @Basic
    @Column(name = "photo_path")
    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    @Basic
    @Column(name = "person_state")
    public String getPersonState() {
        return personState;
    }

    public void setPersonState(String personState) {
        this.personState = personState;
    }

    @Basic
    @Column(name = "abandon_reason_id")
    public String getAbandonReasonId() {
        return abandonReasonId;
    }

    public void setAbandonReasonId(String abandonReasonId) {
        this.abandonReasonId = abandonReasonId;
    }

    @Basic
    @Column(name = "expect_job_property")
    public String getExpectJobProperty() {
        return expectJobProperty;
    }

    public void setExpectJobProperty(String expectJobProperty) {
        this.expectJobProperty = expectJobProperty;
    }

    @Basic
    @Column(name = "political_status")
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    @Basic
    @Column(name = "education_str")
    public String getEducationStr() {
        return educationStr;
    }

    public void setEducationStr(String educationStr) {
        this.educationStr = educationStr;
    }

    @Basic
    @Column(name = "work_ex_str")
    public String getWorkExStr() {
        return workExStr;
    }

    public void setWorkExStr(String workExStr) {
        this.workExStr = workExStr;
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
    @Column(name = "is_distribute")
    public String getIsDistribute() {
        return isDistribute;
    }

    public void setIsDistribute(String isDistribute) {
        this.isDistribute = isDistribute;
    }

    @Basic
    @Column(name = "ask_time")
    public Timestamp getAskTime() {
        return askTime;
    }

    public void setAskTime(Timestamp askTime) {
        this.askTime = askTime;
    }

    @Basic
    @Column(name = "is_brand_company")
    public String getIsBrandCompany() {
        return isBrandCompany;
    }

    public void setIsBrandCompany(String isBrandCompany) {
        this.isBrandCompany = isBrandCompany;
    }

    @Basic
    @Column(name = "is_brand_university")
    public String getIsBrandUniversity() {
        return isBrandUniversity;
    }

    public void setIsBrandUniversity(String isBrandUniversity) {
        this.isBrandUniversity = isBrandUniversity;
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
    @Column(name = "university")
    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "resume_upload_name")
    public String getResumeUploadName() {
        return resumeUploadName;
    }

    public void setResumeUploadName(String resumeUploadName) {
        this.resumeUploadName = resumeUploadName;
    }

    @Basic
    @Column(name = "resume_name")
    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    @Basic
    @Column(name = "resume_path")
    public String getResumePath() {
        return resumePath;
    }

    public void setResumePath(String resumePath) {
        this.resumePath = resumePath;
    }

    @Basic
    @Column(name = "pdf_path")
    public String getPdfPath() {
        return pdfPath;
    }

    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath;
    }

    @Basic
    @Column(name = "works_path")
    public String getWorksPath() {
        return worksPath;
    }

    public void setWorksPath(String worksPath) {
        this.worksPath = worksPath;
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
    @Column(name = "buss_dept_id")
    public String getBussDeptId() {
        return bussDeptId;
    }

    public void setBussDeptId(String bussDeptId) {
        this.bussDeptId = bussDeptId;
    }

    @Basic
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Basic
    @Column(name = "out_date")
    public Timestamp getOutDate() {
        return outDate;
    }

    public void setOutDate(Timestamp outDate) {
        this.outDate = outDate;
    }

    @Basic
    @Column(name = "last_oper_user_id")
    public Integer getLastOperUserId() {
        return lastOperUserId;
    }

    public void setLastOperUserId(Integer lastOperUserId) {
        this.lastOperUserId = lastOperUserId;
    }

    @Basic
    @Column(name = "out_state")
    public Integer getOutState() {
        return outState;
    }

    public void setOutState(Integer outState) {
        this.outState = outState;
    }

    @Basic
    @Column(name = "resume_detail")
    public String getResumeDetail() {
        return resumeDetail;
    }

    public void setResumeDetail(String resumeDetail) {
        this.resumeDetail = resumeDetail;
    }

    @Basic
    @Column(name = "es_id")
    public String getEsId() {
        return esId;
    }

    public void setEsId(String esId) {
        this.esId = esId;
    }

    @Basic
    @Column(name = "signature_code")
    public String getSignatureCode() {
        return signatureCode;
    }

    public void setSignatureCode(String signatureCode) {
        this.signatureCode = signatureCode;
    }

    @Basic
    @Column(name = "version")
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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
    @Column(name = "created_date")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiResumeEntity that = (BiResumeEntity) o;
        return Objects.equals(seekerId, that.seekerId) &&
                Objects.equals(id, that.id) &&
                Objects.equals(platSeekerId, that.platSeekerId) &&
                Objects.equals(platResumeId, that.platResumeId) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(platId, that.platId) &&
                Objects.equals(jobSeekerName, that.jobSeekerName) &&
                Objects.equals(inWay, that.inWay) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(oldPhone, that.oldPhone) &&
                Objects.equals(age, that.age) &&
                Objects.equals(email, that.email) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(degree, that.degree) &&
                Objects.equals(workLengthMax, that.workLengthMax) &&
                Objects.equals(workLengthMin, that.workLengthMin) &&
                Objects.equals(workLength, that.workLength) &&
                Objects.equals(isMarry, that.isMarry) &&
                Objects.equals(jobTitle, that.jobTitle) &&
                Objects.equals(resideAddress, that.resideAddress) &&
                Objects.equals(currentState, that.currentState) &&
                Objects.equals(expectSalaryMax, that.expectSalaryMax) &&
                Objects.equals(expectSalaryMin, that.expectSalaryMin) &&
                Objects.equals(expectPlace, that.expectPlace) &&
                Objects.equals(interestedDept, that.interestedDept) &&
                Objects.equals(expectJob, that.expectJob) &&
                Objects.equals(isOccupy, that.isOccupy) &&
                Objects.equals(expectIndustry, that.expectIndustry) &&
                Objects.equals(photoPath, that.photoPath) &&
                Objects.equals(personState, that.personState) &&
                Objects.equals(abandonReasonId, that.abandonReasonId) &&
                Objects.equals(expectJobProperty, that.expectJobProperty) &&
                Objects.equals(politicalStatus, that.politicalStatus) &&
                Objects.equals(educationStr, that.educationStr) &&
                Objects.equals(workExStr, that.workExStr) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(isDistribute, that.isDistribute) &&
                Objects.equals(askTime, that.askTime) &&
                Objects.equals(isBrandCompany, that.isBrandCompany) &&
                Objects.equals(isBrandUniversity, that.isBrandUniversity) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(university, that.university) &&
                Objects.equals(major, that.major) &&
                Objects.equals(resumeUploadName, that.resumeUploadName) &&
                Objects.equals(resumeName, that.resumeName) &&
                Objects.equals(resumePath, that.resumePath) &&
                Objects.equals(pdfPath, that.pdfPath) &&
                Objects.equals(worksPath, that.worksPath) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(bussDeptId, that.bussDeptId) &&
                Objects.equals(state, that.state) &&
                Objects.equals(outDate, that.outDate) &&
                Objects.equals(lastOperUserId, that.lastOperUserId) &&
                Objects.equals(outState, that.outState) &&
                Objects.equals(resumeDetail, that.resumeDetail) &&
                Objects.equals(esId, that.esId) &&
                Objects.equals(signatureCode, that.signatureCode) &&
                Objects.equals(version, that.version) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(createdDate, that.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seekerId, id, platSeekerId, platResumeId, jobId, postId, platId, jobSeekerName, inWay, phone, oldPhone, age, email, sex, birthday, degree, workLengthMax, workLengthMin, workLength, isMarry, jobTitle, resideAddress, currentState, expectSalaryMax, expectSalaryMin, expectPlace, interestedDept, expectJob, isOccupy, expectIndustry, photoPath, personState, abandonReasonId, expectJobProperty, politicalStatus, educationStr, workExStr, comment, isDistribute, askTime, isBrandCompany, isBrandUniversity, lastUpdatedDate, university, major, resumeUploadName, resumeName, resumePath, pdfPath, worksPath, deptId, bussDeptId, state, outDate, lastOperUserId, outState, resumeDetail, esId, signatureCode, version, deleted, createdDate);
    }
}
