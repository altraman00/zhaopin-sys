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
@Table(name = "elearning_sys_user", schema = "db_feo_zhaopin", catalog = "")
public class ElearningSysUserEntity {
    private String id;
    private String orgUserId;
    private String email;
    private String employeeName;
    private String employeeId;
    private String userName;
    private String deptId;
    private String dept;
    private String orgDeptId;
    private String phone;
    private String idNum;
    private String gender;
    private Integer orgIdEnt;
    private Integer orgCharger;
    private Integer orgId;
    private Integer orgId5;
    private Integer orgId4;
    private Integer orgId3;
    private Integer orgId2;
    private Integer orgId1;
    private Integer workState;
    private Integer type;
    private String workCategory;
    private String posRank;
    private String posLevel;
    private String posDivide;
    private String poseName;
    private String orgName6;
    private String orgName5;
    private String orgName4;
    private String orgName3;
    private String orgName2;
    private String orgName1;
    private String division;
    private String level;
    private String sourceleader;
    private String source;
    private String employeeId263;
    private String roleId;
    private String roleName;
    private String createdBy;
    private Timestamp createdDate;
    private String lastUpdatedBy;
    private Timestamp lastUpdatedDate;
    private Byte enable;
    private String comment;
    private String password;
    private int loginCount;
    private String token;
    private String chargeOrgs;
    private Timestamp firstLoginTime;
    private Timestamp lastLoginTime;
    private Integer version;
    private Integer deleted;
    private Long employeeFlag;
    private Byte teacher;
    private String trainerId;
    private String trainerName;
    private Timestamp trainDate;
    private Timestamp entryDate;
    private Timestamp leaveDate;
    private String area;
    private Integer areaType;
    private String leaveReason;
    private Timestamp groupStartDate;
    private Timestamp groupEndDate;
    private String groupId;
    private String groupNo;
    private String userIntroduction;
    private String courseTableId;
    private Timestamp tokenExpirationDate;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "org_user_id")
    public String getOrgUserId() {
        return orgUserId;
    }

    public void setOrgUserId(String orgUserId) {
        this.orgUserId = orgUserId;
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
    @Column(name = "employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
    @Column(name = "dept")
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Basic
    @Column(name = "org_dept_id")
    public String getOrgDeptId() {
        return orgDeptId;
    }

    public void setOrgDeptId(String orgDeptId) {
        this.orgDeptId = orgDeptId;
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
    @Column(name = "idNum")
    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
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
    @Column(name = "org_id_ent")
    public Integer getOrgIdEnt() {
        return orgIdEnt;
    }

    public void setOrgIdEnt(Integer orgIdEnt) {
        this.orgIdEnt = orgIdEnt;
    }

    @Basic
    @Column(name = "org_charger")
    public Integer getOrgCharger() {
        return orgCharger;
    }

    public void setOrgCharger(Integer orgCharger) {
        this.orgCharger = orgCharger;
    }

    @Basic
    @Column(name = "org_id")
    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    @Basic
    @Column(name = "org_id5")
    public Integer getOrgId5() {
        return orgId5;
    }

    public void setOrgId5(Integer orgId5) {
        this.orgId5 = orgId5;
    }

    @Basic
    @Column(name = "org_id4")
    public Integer getOrgId4() {
        return orgId4;
    }

    public void setOrgId4(Integer orgId4) {
        this.orgId4 = orgId4;
    }

    @Basic
    @Column(name = "org_id3")
    public Integer getOrgId3() {
        return orgId3;
    }

    public void setOrgId3(Integer orgId3) {
        this.orgId3 = orgId3;
    }

    @Basic
    @Column(name = "org_id2")
    public Integer getOrgId2() {
        return orgId2;
    }

    public void setOrgId2(Integer orgId2) {
        this.orgId2 = orgId2;
    }

    @Basic
    @Column(name = "org_id1")
    public Integer getOrgId1() {
        return orgId1;
    }

    public void setOrgId1(Integer orgId1) {
        this.orgId1 = orgId1;
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
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "work_category")
    public String getWorkCategory() {
        return workCategory;
    }

    public void setWorkCategory(String workCategory) {
        this.workCategory = workCategory;
    }

    @Basic
    @Column(name = "pos_rank")
    public String getPosRank() {
        return posRank;
    }

    public void setPosRank(String posRank) {
        this.posRank = posRank;
    }

    @Basic
    @Column(name = "pos_level")
    public String getPosLevel() {
        return posLevel;
    }

    public void setPosLevel(String posLevel) {
        this.posLevel = posLevel;
    }

    @Basic
    @Column(name = "pos_divide")
    public String getPosDivide() {
        return posDivide;
    }

    public void setPosDivide(String posDivide) {
        this.posDivide = posDivide;
    }

    @Basic
    @Column(name = "pose_name")
    public String getPoseName() {
        return poseName;
    }

    public void setPoseName(String poseName) {
        this.poseName = poseName;
    }

    @Basic
    @Column(name = "org_name6")
    public String getOrgName6() {
        return orgName6;
    }

    public void setOrgName6(String orgName6) {
        this.orgName6 = orgName6;
    }

    @Basic
    @Column(name = "org_name5")
    public String getOrgName5() {
        return orgName5;
    }

    public void setOrgName5(String orgName5) {
        this.orgName5 = orgName5;
    }

    @Basic
    @Column(name = "org_name4")
    public String getOrgName4() {
        return orgName4;
    }

    public void setOrgName4(String orgName4) {
        this.orgName4 = orgName4;
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
    @Column(name = "org_name2")
    public String getOrgName2() {
        return orgName2;
    }

    public void setOrgName2(String orgName2) {
        this.orgName2 = orgName2;
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
    @Column(name = "division")
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
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
    @Column(name = "sourceleader")
    public String getSourceleader() {
        return sourceleader;
    }

    public void setSourceleader(String sourceleader) {
        this.sourceleader = sourceleader;
    }

    @Basic
    @Column(name = "source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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
    @Column(name = "role_id")
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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
    @Column(name = "last_updated_by")
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
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
    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "login_count")
    public int getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(int loginCount) {
        this.loginCount = loginCount;
    }

    @Basic
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "charge_orgs")
    public String getChargeOrgs() {
        return chargeOrgs;
    }

    public void setChargeOrgs(String chargeOrgs) {
        this.chargeOrgs = chargeOrgs;
    }

    @Basic
    @Column(name = "first_login_time")
    public Timestamp getFirstLoginTime() {
        return firstLoginTime;
    }

    public void setFirstLoginTime(Timestamp firstLoginTime) {
        this.firstLoginTime = firstLoginTime;
    }

    @Basic
    @Column(name = "last_login_time")
    public Timestamp getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Timestamp lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
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
    @Column(name = "employee_flag")
    public Long getEmployeeFlag() {
        return employeeFlag;
    }

    public void setEmployeeFlag(Long employeeFlag) {
        this.employeeFlag = employeeFlag;
    }

    @Basic
    @Column(name = "teacher")
    public Byte getTeacher() {
        return teacher;
    }

    public void setTeacher(Byte teacher) {
        this.teacher = teacher;
    }

    @Basic
    @Column(name = "trainer_id")
    public String getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    @Basic
    @Column(name = "trainer_name")
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    @Basic
    @Column(name = "train_date")
    public Timestamp getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Timestamp trainDate) {
        this.trainDate = trainDate;
    }

    @Basic
    @Column(name = "entry_date")
    public Timestamp getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Timestamp entryDate) {
        this.entryDate = entryDate;
    }

    @Basic
    @Column(name = "leave_date")
    public Timestamp getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(Timestamp leaveDate) {
        this.leaveDate = leaveDate;
    }

    @Basic
    @Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Basic
    @Column(name = "area_type")
    public Integer getAreaType() {
        return areaType;
    }

    public void setAreaType(Integer areaType) {
        this.areaType = areaType;
    }

    @Basic
    @Column(name = "leave_reason")
    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    @Basic
    @Column(name = "group_start_date")
    public Timestamp getGroupStartDate() {
        return groupStartDate;
    }

    public void setGroupStartDate(Timestamp groupStartDate) {
        this.groupStartDate = groupStartDate;
    }

    @Basic
    @Column(name = "group_end_date")
    public Timestamp getGroupEndDate() {
        return groupEndDate;
    }

    public void setGroupEndDate(Timestamp groupEndDate) {
        this.groupEndDate = groupEndDate;
    }

    @Basic
    @Column(name = "group_id")
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "group_no")
    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    @Basic
    @Column(name = "user_introduction")
    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
    }

    @Basic
    @Column(name = "course_table_id")
    public String getCourseTableId() {
        return courseTableId;
    }

    public void setCourseTableId(String courseTableId) {
        this.courseTableId = courseTableId;
    }

    @Basic
    @Column(name = "token_expiration_date")
    public Timestamp getTokenExpirationDate() {
        return tokenExpirationDate;
    }

    public void setTokenExpirationDate(Timestamp tokenExpirationDate) {
        this.tokenExpirationDate = tokenExpirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElearningSysUserEntity that = (ElearningSysUserEntity) o;
        return loginCount == that.loginCount &&
                Objects.equals(id, that.id) &&
                Objects.equals(orgUserId, that.orgUserId) &&
                Objects.equals(email, that.email) &&
                Objects.equals(employeeName, that.employeeName) &&
                Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(dept, that.dept) &&
                Objects.equals(orgDeptId, that.orgDeptId) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(idNum, that.idNum) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(orgIdEnt, that.orgIdEnt) &&
                Objects.equals(orgCharger, that.orgCharger) &&
                Objects.equals(orgId, that.orgId) &&
                Objects.equals(orgId5, that.orgId5) &&
                Objects.equals(orgId4, that.orgId4) &&
                Objects.equals(orgId3, that.orgId3) &&
                Objects.equals(orgId2, that.orgId2) &&
                Objects.equals(orgId1, that.orgId1) &&
                Objects.equals(workState, that.workState) &&
                Objects.equals(type, that.type) &&
                Objects.equals(workCategory, that.workCategory) &&
                Objects.equals(posRank, that.posRank) &&
                Objects.equals(posLevel, that.posLevel) &&
                Objects.equals(posDivide, that.posDivide) &&
                Objects.equals(poseName, that.poseName) &&
                Objects.equals(orgName6, that.orgName6) &&
                Objects.equals(orgName5, that.orgName5) &&
                Objects.equals(orgName4, that.orgName4) &&
                Objects.equals(orgName3, that.orgName3) &&
                Objects.equals(orgName2, that.orgName2) &&
                Objects.equals(orgName1, that.orgName1) &&
                Objects.equals(division, that.division) &&
                Objects.equals(level, that.level) &&
                Objects.equals(sourceleader, that.sourceleader) &&
                Objects.equals(source, that.source) &&
                Objects.equals(employeeId263, that.employeeId263) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(roleName, that.roleName) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedBy, that.lastUpdatedBy) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(enable, that.enable) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(password, that.password) &&
                Objects.equals(token, that.token) &&
                Objects.equals(chargeOrgs, that.chargeOrgs) &&
                Objects.equals(firstLoginTime, that.firstLoginTime) &&
                Objects.equals(lastLoginTime, that.lastLoginTime) &&
                Objects.equals(version, that.version) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(employeeFlag, that.employeeFlag) &&
                Objects.equals(teacher, that.teacher) &&
                Objects.equals(trainerId, that.trainerId) &&
                Objects.equals(trainerName, that.trainerName) &&
                Objects.equals(trainDate, that.trainDate) &&
                Objects.equals(entryDate, that.entryDate) &&
                Objects.equals(leaveDate, that.leaveDate) &&
                Objects.equals(area, that.area) &&
                Objects.equals(areaType, that.areaType) &&
                Objects.equals(leaveReason, that.leaveReason) &&
                Objects.equals(groupStartDate, that.groupStartDate) &&
                Objects.equals(groupEndDate, that.groupEndDate) &&
                Objects.equals(groupId, that.groupId) &&
                Objects.equals(groupNo, that.groupNo) &&
                Objects.equals(userIntroduction, that.userIntroduction) &&
                Objects.equals(courseTableId, that.courseTableId) &&
                Objects.equals(tokenExpirationDate, that.tokenExpirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orgUserId, email, employeeName, employeeId, userName, deptId, dept, orgDeptId, phone, idNum, gender, orgIdEnt, orgCharger, orgId, orgId5, orgId4, orgId3, orgId2, orgId1, workState, type, workCategory, posRank, posLevel, posDivide, poseName, orgName6, orgName5, orgName4, orgName3, orgName2, orgName1, division, level, sourceleader, source, employeeId263, roleId, roleName, createdBy, createdDate, lastUpdatedBy, lastUpdatedDate, enable, comment, password, loginCount, token, chargeOrgs, firstLoginTime, lastLoginTime, version, deleted, employeeFlag, teacher, trainerId, trainerName, trainDate, entryDate, leaveDate, area, areaType, leaveReason, groupStartDate, groupEndDate, groupId, groupNo, userIntroduction, courseTableId, tokenExpirationDate);
    }
}
