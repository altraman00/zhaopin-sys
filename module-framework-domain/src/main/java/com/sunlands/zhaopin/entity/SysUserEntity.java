package com.sunlands.zhaopin.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Project : zhaopin-sys
 * @Package Name : com.sunlands.zhaopin.domain
 * @Description : TODO
 * @Author : admin
 * @Create Date : 2019年07月04日 23:50
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
@Entity
@Table(name = "sys_user", schema = "db_feo_zhaopin", catalog = "")
public class SysUserEntity {
    private String id;
    private String orgUserId;
    private String email;
    private String orgName5;
    private String orgName4;
    private String orgName3;
    private String orgName2;
    private String orgName1;
    private String employeeName;
    private String position;
    private String gender;
    private String workStateDesc;
    private String workState;
    private String source;
    private String employeeId;
    private String userName;
    private String deptId;
    private String dept;
    private String orgDeptId;
    private String phone;
    private String roleId;
    private String roleName;
    private String createdBy;
    private Timestamp createdDate;
    private String lastUpdatedBy;
    private Timestamp lastUpdatedDate;
    private Long enable;
    private String comment;
    private String password;
    private Integer loginCount;
    private String token;
    private Timestamp lastLoginTime;
    private Integer version;
    private Integer deleted;
    private String employeeId263;
    private String employeeIdEhr;
    private String divisionEhr;
    private String area;
    private Integer areaType;

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
    @Column(name = "employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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
    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "work_state_desc")
    public String getWorkStateDesc() {
        return workStateDesc;
    }

    public void setWorkStateDesc(String workStateDesc) {
        this.workStateDesc = workStateDesc;
    }

    @Basic
    @Column(name = "work_state")
    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
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
    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
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
    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
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
    @Column(name = "employee_id263")
    public String getEmployeeId263() {
        return employeeId263;
    }

    public void setEmployeeId263(String employeeId263) {
        this.employeeId263 = employeeId263;
    }

    @Basic
    @Column(name = "employee_id_ehr")
    public String getEmployeeIdEhr() {
        return employeeIdEhr;
    }

    public void setEmployeeIdEhr(String employeeIdEhr) {
        this.employeeIdEhr = employeeIdEhr;
    }

    @Basic
    @Column(name = "division_ehr")
    public String getDivisionEhr() {
        return divisionEhr;
    }

    public void setDivisionEhr(String divisionEhr) {
        this.divisionEhr = divisionEhr;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserEntity that = (SysUserEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(orgUserId, that.orgUserId) &&
                Objects.equals(email, that.email) &&
                Objects.equals(orgName5, that.orgName5) &&
                Objects.equals(orgName4, that.orgName4) &&
                Objects.equals(orgName3, that.orgName3) &&
                Objects.equals(orgName2, that.orgName2) &&
                Objects.equals(orgName1, that.orgName1) &&
                Objects.equals(employeeName, that.employeeName) &&
                Objects.equals(position, that.position) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(workStateDesc, that.workStateDesc) &&
                Objects.equals(workState, that.workState) &&
                Objects.equals(source, that.source) &&
                Objects.equals(employeeId, that.employeeId) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(dept, that.dept) &&
                Objects.equals(orgDeptId, that.orgDeptId) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(roleName, that.roleName) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(lastUpdatedBy, that.lastUpdatedBy) &&
                Objects.equals(lastUpdatedDate, that.lastUpdatedDate) &&
                Objects.equals(enable, that.enable) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(password, that.password) &&
                Objects.equals(loginCount, that.loginCount) &&
                Objects.equals(token, that.token) &&
                Objects.equals(lastLoginTime, that.lastLoginTime) &&
                Objects.equals(version, that.version) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(employeeId263, that.employeeId263) &&
                Objects.equals(employeeIdEhr, that.employeeIdEhr) &&
                Objects.equals(divisionEhr, that.divisionEhr) &&
                Objects.equals(area, that.area) &&
                Objects.equals(areaType, that.areaType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orgUserId, email, orgName5, orgName4, orgName3, orgName2, orgName1, employeeName, position, gender, workStateDesc, workState, source, employeeId, userName, deptId, dept, orgDeptId, phone, roleId, roleName, createdBy, createdDate, lastUpdatedBy, lastUpdatedDate, enable, comment, password, loginCount, token, lastLoginTime, version, deleted, employeeId263, employeeIdEhr, divisionEhr, area, areaType);
    }
}
