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
@Table(name = "bi_offer", schema = "db_feo_zhaopin", catalog = "")
public class BiOfferEntity {
    private int id;
    private String resumeFlowId;
    private String resumeId;
    private String candidateName;
    private String subdivisionId;
    private String positionLevel;
    private String jobGrade;
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
    private String probationPeriod;
    private String practice;
    private String securityFund;
    private String recruitmentType;
    private String offerRemark;
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
    private String checkList;
    private String refuseReason;
    private Integer isNeedVisit;
    private Integer isVisit;
    private Byte skuType;
    private Integer trainPeriod;
    private Integer contractPeriod;
    private Byte trainNeed;
    private String degreeId;
    private Integer salaryProbationBase;
    private Integer salaryProbationPerformance;
    private Integer salaryFormalPerformance;
    private Integer salaryFormalBase;
    private String offerNo;
    private Integer companyCode;
    private Integer bankCardCode;
    private Byte areaType;
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
    private Byte deleted;
    private String version;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "position_level")
    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    @Basic
    @Column(name = "job_grade")
    public String getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(String jobGrade) {
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
    public String getProbationPeriod() {
        return probationPeriod;
    }

    public void setProbationPeriod(String probationPeriod) {
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
    @Column(name = "offer_remark")
    public String getOfferRemark() {
        return offerRemark;
    }

    public void setOfferRemark(String offerRemark) {
        this.offerRemark = offerRemark;
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
    @Column(name = "check_list")
    public String getCheckList() {
        return checkList;
    }

    public void setCheckList(String checkList) {
        this.checkList = checkList;
    }

    @Basic
    @Column(name = "refuse_reason")
    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    @Basic
    @Column(name = "is_need_visit")
    public Integer getIsNeedVisit() {
        return isNeedVisit;
    }

    public void setIsNeedVisit(Integer isNeedVisit) {
        this.isNeedVisit = isNeedVisit;
    }

    @Basic
    @Column(name = "is_visit")
    public Integer getIsVisit() {
        return isVisit;
    }

    public void setIsVisit(Integer isVisit) {
        this.isVisit = isVisit;
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
    @Column(name = "train_period")
    public Integer getTrainPeriod() {
        return trainPeriod;
    }

    public void setTrainPeriod(Integer trainPeriod) {
        this.trainPeriod = trainPeriod;
    }

    @Basic
    @Column(name = "contract_period")
    public Integer getContractPeriod() {
        return contractPeriod;
    }

    public void setContractPeriod(Integer contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    @Basic
    @Column(name = "train_need")
    public Byte getTrainNeed() {
        return trainNeed;
    }

    public void setTrainNeed(Byte trainNeed) {
        this.trainNeed = trainNeed;
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
    @Column(name = "salary_probation_base")
    public Integer getSalaryProbationBase() {
        return salaryProbationBase;
    }

    public void setSalaryProbationBase(Integer salaryProbationBase) {
        this.salaryProbationBase = salaryProbationBase;
    }

    @Basic
    @Column(name = "salary_probation_performance")
    public Integer getSalaryProbationPerformance() {
        return salaryProbationPerformance;
    }

    public void setSalaryProbationPerformance(Integer salaryProbationPerformance) {
        this.salaryProbationPerformance = salaryProbationPerformance;
    }

    @Basic
    @Column(name = "salary_formal_performance")
    public Integer getSalaryFormalPerformance() {
        return salaryFormalPerformance;
    }

    public void setSalaryFormalPerformance(Integer salaryFormalPerformance) {
        this.salaryFormalPerformance = salaryFormalPerformance;
    }

    @Basic
    @Column(name = "salary_formal_base")
    public Integer getSalaryFormalBase() {
        return salaryFormalBase;
    }

    public void setSalaryFormalBase(Integer salaryFormalBase) {
        this.salaryFormalBase = salaryFormalBase;
    }

    @Basic
    @Column(name = "offer_no")
    public String getOfferNo() {
        return offerNo;
    }

    public void setOfferNo(String offerNo) {
        this.offerNo = offerNo;
    }

    @Basic
    @Column(name = "company_code")
    public Integer getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(Integer companyCode) {
        this.companyCode = companyCode;
    }

    @Basic
    @Column(name = "bank_card_code")
    public Integer getBankCardCode() {
        return bankCardCode;
    }

    public void setBankCardCode(Integer bankCardCode) {
        this.bankCardCode = bankCardCode;
    }

    @Basic
    @Column(name = "area_type")
    public Byte getAreaType() {
        return areaType;
    }

    public void setAreaType(Byte areaType) {
        this.areaType = areaType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiOfferEntity that = (BiOfferEntity) o;
        return id == that.id &&
                Objects.equals(resumeFlowId, that.resumeFlowId) &&
                Objects.equals(resumeId, that.resumeId) &&
                Objects.equals(candidateName, that.candidateName) &&
                Objects.equals(subdivisionId, that.subdivisionId) &&
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
                Objects.equals(offerRemark, that.offerRemark) &&
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
                Objects.equals(checkList, that.checkList) &&
                Objects.equals(refuseReason, that.refuseReason) &&
                Objects.equals(isNeedVisit, that.isNeedVisit) &&
                Objects.equals(isVisit, that.isVisit) &&
                Objects.equals(skuType, that.skuType) &&
                Objects.equals(trainPeriod, that.trainPeriod) &&
                Objects.equals(contractPeriod, that.contractPeriod) &&
                Objects.equals(trainNeed, that.trainNeed) &&
                Objects.equals(degreeId, that.degreeId) &&
                Objects.equals(salaryProbationBase, that.salaryProbationBase) &&
                Objects.equals(salaryProbationPerformance, that.salaryProbationPerformance) &&
                Objects.equals(salaryFormalPerformance, that.salaryFormalPerformance) &&
                Objects.equals(salaryFormalBase, that.salaryFormalBase) &&
                Objects.equals(offerNo, that.offerNo) &&
                Objects.equals(companyCode, that.companyCode) &&
                Objects.equals(bankCardCode, that.bankCardCode) &&
                Objects.equals(areaType, that.areaType) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resumeFlowId, resumeId, candidateName, subdivisionId, positionLevel, jobGrade, postName, leaderId, leaderName, guideId, guideName, probationSalary, probationPerformanceSalary, officialSalary, officialOperformancSalary, postSalary, hrId, hrName, sentDate, employmentDate, probationPeriod, practice, securityFund, recruitmentType, offerRemark, jobType, training, bpoType, telephone, entryMaterials, busline, workSite, welfare, comment, approvalStatus, postId, jobId, salary, achievementsSalary, probation, loginUserId, checkList, refuseReason, isNeedVisit, isVisit, skuType, trainPeriod, contractPeriod, trainNeed, degreeId, salaryProbationBase, salaryProbationPerformance, salaryFormalPerformance, salaryFormalBase, offerNo, companyCode, bankCardCode, areaType, createdDate, lastUpdatedDate, deleted, version);
    }
}
