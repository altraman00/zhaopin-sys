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
@Table(name = "bi_ehr_entry", schema = "db_feo_zhaopin", catalog = "")
public class BiEhrEntryEntity {
    private int id;
    private String idNum;
    private String employeeId263;
    private String employeeId;
    private String mail;
    private String tel;
    private String gender;
    private Integer workState;
    private String resumeFlowId;
    private String resumeId;
    private String candidateName;
    private String subdivisionId;
    private Integer empLevel;
    private Integer positionLevel;
    private Integer jobGrade;
    private String postName;
    private String leaderId;
    private String leaderName;
    private String guideId;
    private String guideName;
    private Integer probationSalary;
    private Integer probationPerformanceSalary;
    private Integer officialSalary;
    private Integer officialOperformancSalary;
    private Integer postSalary;
    private Integer hrId;
    private String hrName;
    private Timestamp sentDate;
    private Timestamp employmentDate;
    private Integer probationPeriod;
    private String practice;
    private String securityFund;
    private String recruitmentType;
    private String ehrEntryRemark;
    private String jobType;
    private String training;
    private String bpoType;
    private String telephone;
    private String entryMaterials;
    private String busline;
    private String workSite;
    private String welfare;
    private String comment;
    private Integer approvalStatus;
    private Integer postId;
    private String jobId;
    private String salary;
    private String achievementsSalary;
    private String probation;
    private Integer loginUserId;
    private Integer processId;
    private String checkList;
    private Integer trainSalary;
    private String secondEntry;
    private String badRecord;
    private String posNameBefore;
    private String hasFriend;
    private String relation;
    private String relationName;
    private String relationPos;
    private String performanceSalaryBefore;
    private Integer performanceSalary;
    private Integer welfareFormal;
    private Integer welfareTrial;
    private String takeComputer;
    private String region;
    private Integer entryType;
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
    private Byte deleted;
    private String version;
    private Byte outFlag;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "id_num")
    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    @Basic
    @Column(name = "employee_id263")
    public String getEmployeeId263() {
        return employeeId263;
    }

    public void setEmployeeId263(String employeeId263) {
        this.employeeId263 = employeeId263;
    }

    @Basic
    @Column(name = "employee_id")
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "work_state")
    public Integer getWorkState() {
        return workState;
    }

    public void setWorkState(Integer workState) {
        this.workState = workState;
    }

    @Basic
    @Column(name = "resume_flow_id")
    public String getResumeFlowId() {
        return resumeFlowId;
    }

    public void setResumeFlowId(String resumeFlowId) {
        this.resumeFlowId = resumeFlowId;
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
    @Column(name = "candidate_name")
    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    @Basic
    @Column(name = "subdivision_id")
    public String getSubdivisionId() {
        return subdivisionId;
    }

    public void setSubdivisionId(String subdivisionId) {
        this.subdivisionId = subdivisionId;
    }

    @Basic
    @Column(name = "emp_level")
    public Integer getEmpLevel() {
        return empLevel;
    }

    public void setEmpLevel(Integer empLevel) {
        this.empLevel = empLevel;
    }

    @Basic
    @Column(name = "position_level")
    public Integer getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(Integer positionLevel) {
        this.positionLevel = positionLevel;
    }

    @Basic
    @Column(name = "job_grade")
    public Integer getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(Integer jobGrade) {
        this.jobGrade = jobGrade;
    }

    @Basic
    @Column(name = "post_name")
    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    @Basic
    @Column(name = "leader_id")
    public String getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(String leaderId) {
        this.leaderId = leaderId;
    }

    @Basic
    @Column(name = "leader_name")
    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    @Basic
    @Column(name = "guide_id")
    public String getGuideId() {
        return guideId;
    }

    public void setGuideId(String guideId) {
        this.guideId = guideId;
    }

    @Basic
    @Column(name = "guide_name")
    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    @Basic
    @Column(name = "probation_salary")
    public Integer getProbationSalary() {
        return probationSalary;
    }

    public void setProbationSalary(Integer probationSalary) {
        this.probationSalary = probationSalary;
    }

    @Basic
    @Column(name = "probation_performance_salary")
    public Integer getProbationPerformanceSalary() {
        return probationPerformanceSalary;
    }

    public void setProbationPerformanceSalary(Integer probationPerformanceSalary) {
        this.probationPerformanceSalary = probationPerformanceSalary;
    }

    @Basic
    @Column(name = "official_salary")
    public Integer getOfficialSalary() {
        return officialSalary;
    }

    public void setOfficialSalary(Integer officialSalary) {
        this.officialSalary = officialSalary;
    }

    @Basic
    @Column(name = "official_operformanc_salary")
    public Integer getOfficialOperformancSalary() {
        return officialOperformancSalary;
    }

    public void setOfficialOperformancSalary(Integer officialOperformancSalary) {
        this.officialOperformancSalary = officialOperformancSalary;
    }

    @Basic
    @Column(name = "post_salary")
    public Integer getPostSalary() {
        return postSalary;
    }

    public void setPostSalary(Integer postSalary) {
        this.postSalary = postSalary;
    }

    @Basic
    @Column(name = "hr_id")
    public Integer getHrId() {
        return hrId;
    }

    public void setHrId(Integer hrId) {
        this.hrId = hrId;
    }

    @Basic
    @Column(name = "hr_name")
    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    @Basic
    @Column(name = "sent_date")
    public Timestamp getSentDate() {
        return sentDate;
    }

    public void setSentDate(Timestamp sentDate) {
        this.sentDate = sentDate;
    }

    @Basic
    @Column(name = "employment_date")
    public Timestamp getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Timestamp employmentDate) {
        this.employmentDate = employmentDate;
    }

    @Basic
    @Column(name = "probation_period")
    public Integer getProbationPeriod() {
        return probationPeriod;
    }

    public void setProbationPeriod(Integer probationPeriod) {
        this.probationPeriod = probationPeriod;
    }

    @Basic
    @Column(name = "practice")
    public String getPractice() {
        return practice;
    }

    public void setPractice(String practice) {
        this.practice = practice;
    }

    @Basic
    @Column(name = "security_fund")
    public String getSecurityFund() {
        return securityFund;
    }

    public void setSecurityFund(String securityFund) {
        this.securityFund = securityFund;
    }

    @Basic
    @Column(name = "recruitment_type")
    public String getRecruitmentType() {
        return recruitmentType;
    }

    public void setRecruitmentType(String recruitmentType) {
        this.recruitmentType = recruitmentType;
    }

    @Basic
    @Column(name = "ehr_entry_remark")
    public String getEhrEntryRemark() {
        return ehrEntryRemark;
    }

    public void setEhrEntryRemark(String ehrEntryRemark) {
        this.ehrEntryRemark = ehrEntryRemark;
    }

    @Basic
    @Column(name = "job_type")
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    @Basic
    @Column(name = "training")
    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    @Basic
    @Column(name = "bpo_type")
    public String getBpoType() {
        return bpoType;
    }

    public void setBpoType(String bpoType) {
        this.bpoType = bpoType;
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
    @Column(name = "entry_materials")
    public String getEntryMaterials() {
        return entryMaterials;
    }

    public void setEntryMaterials(String entryMaterials) {
        this.entryMaterials = entryMaterials;
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
    @Column(name = "work_site")
    public String getWorkSite() {
        return workSite;
    }

    public void setWorkSite(String workSite) {
        this.workSite = workSite;
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
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "approval_status")
    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Basic
    @Column(name = "post_id")
    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
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
    @Column(name = "salary")
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "achievements_salary")
    public String getAchievementsSalary() {
        return achievementsSalary;
    }

    public void setAchievementsSalary(String achievementsSalary) {
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
    @Column(name = "login_user_id")
    public Integer getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(Integer loginUserId) {
        this.loginUserId = loginUserId;
    }

    @Basic
    @Column(name = "process_id")
    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    @Basic
    @Column(name = "check_list")
    public String getCheckList() {
        return checkList;
    }

    public void setCheckList(String checkList) {
        this.checkList = checkList;
    }

    @Basic
    @Column(name = "train_salary")
    public Integer getTrainSalary() {
        return trainSalary;
    }

    public void setTrainSalary(Integer trainSalary) {
        this.trainSalary = trainSalary;
    }

    @Basic
    @Column(name = "second_entry")
    public String getSecondEntry() {
        return secondEntry;
    }

    public void setSecondEntry(String secondEntry) {
        this.secondEntry = secondEntry;
    }

    @Basic
    @Column(name = "bad_record")
    public String getBadRecord() {
        return badRecord;
    }

    public void setBadRecord(String badRecord) {
        this.badRecord = badRecord;
    }

    @Basic
    @Column(name = "pos_name_before")
    public String getPosNameBefore() {
        return posNameBefore;
    }

    public void setPosNameBefore(String posNameBefore) {
        this.posNameBefore = posNameBefore;
    }

    @Basic
    @Column(name = "has_friend")
    public String getHasFriend() {
        return hasFriend;
    }

    public void setHasFriend(String hasFriend) {
        this.hasFriend = hasFriend;
    }

    @Basic
    @Column(name = "relation")
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    @Basic
    @Column(name = "relation_name")
    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    @Basic
    @Column(name = "relation_pos")
    public String getRelationPos() {
        return relationPos;
    }

    public void setRelationPos(String relationPos) {
        this.relationPos = relationPos;
    }

    @Basic
    @Column(name = "performance_salary_before")
    public String getPerformanceSalaryBefore() {
        return performanceSalaryBefore;
    }

    public void setPerformanceSalaryBefore(String performanceSalaryBefore) {
        this.performanceSalaryBefore = performanceSalaryBefore;
    }

    @Basic
    @Column(name = "performance_salary")
    public Integer getPerformanceSalary() {
        return performanceSalary;
    }

    public void setPerformanceSalary(Integer performanceSalary) {
        this.performanceSalary = performanceSalary;
    }

    @Basic
    @Column(name = "welfare_formal")
    public Integer getWelfareFormal() {
        return welfareFormal;
    }

    public void setWelfareFormal(Integer welfareFormal) {
        this.welfareFormal = welfareFormal;
    }

    @Basic
    @Column(name = "welfare_trial")
    public Integer getWelfareTrial() {
        return welfareTrial;
    }

    public void setWelfareTrial(Integer welfareTrial) {
        this.welfareTrial = welfareTrial;
    }

    @Basic
    @Column(name = "take_computer")
    public String getTakeComputer() {
        return takeComputer;
    }

    public void setTakeComputer(String takeComputer) {
        this.takeComputer = takeComputer;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "entry_type")
    public Integer getEntryType() {
        return entryType;
    }

    public void setEntryType(Integer entryType) {
        this.entryType = entryType;
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
    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
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
    @Column(name = "out_flag")
    public Byte getOutFlag() {
        return outFlag;
    }

    public void setOutFlag(Byte outFlag) {
        this.outFlag = outFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiEhrEntryEntity that = (BiEhrEntryEntity) o;
        return id == that.id &&
                Objects.equals(idNum, that.idNum) &&
                Objects.equals(employeeId263, that.employeeId263) &&
                Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(tel, that.tel) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(workState, that.workState) &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(candidateName, that.candidateName) &&
                Objects.equals(subdivisionId, that.subdivisionId) &&
                Objects.equals(empLevel, that.empLevel) &&
                Objects.equals(positionLevel, that.positionLevel) &&
                Objects.equals(jobGrade, that.jobGrade) &&
                Objects.equals(postName, that.postName) &&
                Objects.equals(leaderId, that.leaderId) &&
                Objects.equals(leaderName, that.leaderName) &&
                Objects.equals(guideId, that.guideId) &&
                Objects.equals(guideName, that.guideName) &&
                Objects.equals(probationSalary, that.probationSalary) &&
                Objects.equals(probationPerformanceSalary, that.probationPerformanceSalary) &&
                Objects.equals(officialSalary, that.officialSalary) &&
                Objects.equals(officialOperformancSalary, that.officialOperformancSalary) &&
                Objects.equals(postSalary, that.postSalary) &&
                Objects.equals(hrId, that.hrId) &&
                Objects.equals(hrName, that.hrName) &&
                Objects.equals(sentDate, that.sentDate) &&
                Objects.equals(employmentDate, that.employmentDate) &&
                Objects.equals(probationPeriod, that.probationPeriod) &&
                Objects.equals(practice, that.practice) &&
                Objects.equals(securityFund, that.securityFund) &&
                Objects.equals(recruitmentType, that.recruitmentType) &&
                Objects.equals(ehrEntryRemark, that.ehrEntryRemark) &&
                Objects.equals(jobType, that.jobType) &&
                Objects.equals(training, that.training) &&
                Objects.equals(bpoType, that.bpoType) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(entryMaterials, that.entryMaterials) &&
                Objects.equals(busline, that.busline) &&
                Objects.equals(workSite, that.workSite) &&
                Objects.equals(welfare, that.welfare) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(approvalStatus, that.approvalStatus) &&
                Objects.equals(postId, that.postId) &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(salary, that.salary) &&
                Objects.equals(achievementsSalary, that.achievementsSalary) &&
                Objects.equals(probation, that.probation) &&
                Objects.equals(loginUserId, that.loginUserId) &&
                Objects.equals(processId, that.processId) &&
                Objects.equals(checkList, that.checkList) &&
                Objects.equals(trainSalary, that.trainSalary) &&
                Objects.equals(secondEntry, that.secondEntry) &&
                Objects.equals(badRecord, that.badRecord) &&
                Objects.equals(posNameBefore, that.posNameBefore) &&
                Objects.equals(hasFriend, that.hasFriend) &&
                Objects.equals(relation, that.relation) &&
                Objects.equals(relationName, that.relationName) &&
                Objects.equals(relationPos, that.relationPos) &&
                Objects.equals(performanceSalaryBefore, that.performanceSalaryBefore) &&
                Objects.equals(performanceSalary, that.performanceSalary) &&
                Objects.equals(welfareFormal, that.welfareFormal) &&
                Objects.equals(welfareTrial, that.welfareTrial) &&
                Objects.equals(takeComputer, that.takeComputer) &&
                Objects.equals(region, that.region) &&
                Objects.equals(entryType, that.entryType) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version) &&
                Objects.equals(outFlag, that.outFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idNum, employeeId263, employeeId, mail, tel, gender, workState, resumeFlowId, resumeId, candidateName, subdivisionId, empLevel, positionLevel, jobGrade, postName, leaderId, leaderName, guideId, guideName, probationSalary, probationPerformanceSalary, officialSalary, officialOperformancSalary, postSalary, hrId, hrName, sentDate, employmentDate, probationPeriod, practice, securityFund, recruitmentType, ehrEntryRemark, jobType, training, bpoType, telephone, entryMaterials, busline, workSite, welfare, comment, approvalStatus, postId, jobId, salary, achievementsSalary, probation, loginUserId, processId, checkList, trainSalary, secondEntry, badRecord, posNameBefore, hasFriend, relation, relationName, relationPos, performanceSalaryBefore, performanceSalary, welfareFormal, welfareTrial, takeComputer, region, entryType, createdDate, lastUpdatedDate, deleted, version, outFlag);
    }
}
