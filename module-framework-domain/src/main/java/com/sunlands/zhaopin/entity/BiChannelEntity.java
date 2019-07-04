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
@Table(name = "bi_channel", schema = "db_feo_zhaopin", catalog = "")
public class BiChannelEntity {
    private long id;
    private String platId;
    private String accountName;
    private String account;
    private Integer type;
    private String password;
    private String phoneNum;
    private Long downloadNum;
    private Long balance;
    private String deptName;
    private Integer deptId;
    private Integer remJobNum;
    private Integer refreshNum;
    private Integer offLineJobNum;
    private Integer onLineJobNum;
    private String unit;
    private Timestamp createDate;
    private Timestamp updateDate;
    private Integer deleted;
    private Integer status;
    private Integer userNum;
    private String channelCode;
    private String parentChannel;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "account_name")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Basic
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "download_num")
    public Long getDownloadNum() {
        return downloadNum;
    }

    public void setDownloadNum(Long downloadNum) {
        this.downloadNum = downloadNum;
    }

    @Basic
    @Column(name = "balance")
    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    @Basic
    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "dept_id")
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Basic
    @Column(name = "rem_job_num")
    public Integer getRemJobNum() {
        return remJobNum;
    }

    public void setRemJobNum(Integer remJobNum) {
        this.remJobNum = remJobNum;
    }

    @Basic
    @Column(name = "refresh_num")
    public Integer getRefreshNum() {
        return refreshNum;
    }

    public void setRefreshNum(Integer refreshNum) {
        this.refreshNum = refreshNum;
    }

    @Basic
    @Column(name = "off_line_job_num")
    public Integer getOffLineJobNum() {
        return offLineJobNum;
    }

    public void setOffLineJobNum(Integer offLineJobNum) {
        this.offLineJobNum = offLineJobNum;
    }

    @Basic
    @Column(name = "on_line_job_num")
    public Integer getOnLineJobNum() {
        return onLineJobNum;
    }

    public void setOnLineJobNum(Integer onLineJobNum) {
        this.onLineJobNum = onLineJobNum;
    }

    @Basic
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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
    @Column(name = "deleted")
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "user_num")
    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    @Basic
    @Column(name = "channel_code")
    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    @Basic
    @Column(name = "parent_channel")
    public String getParentChannel() {
        return parentChannel;
    }

    public void setParentChannel(String parentChannel) {
        this.parentChannel = parentChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiChannelEntity that = (BiChannelEntity) o;
        return id == that.id &&
                Objects.equals(platId, that.platId) &&
                Objects.equals(accountName, that.accountName) &&
                Objects.equals(account, that.account) &&
                Objects.equals(type, that.type) &&
                Objects.equals(password, that.password) &&
                Objects.equals(phoneNum, that.phoneNum) &&
                Objects.equals(downloadNum, that.downloadNum) &&
                Objects.equals(balance, that.balance) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(deptId, that.deptId) &&
                Objects.equals(remJobNum, that.remJobNum) &&
                Objects.equals(refreshNum, that.refreshNum) &&
                Objects.equals(offLineJobNum, that.offLineJobNum) &&
                Objects.equals(onLineJobNum, that.onLineJobNum) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(status, that.status) &&
                Objects.equals(userNum, that.userNum) &&
                Objects.equals(channelCode, that.channelCode) &&
                Objects.equals(parentChannel, that.parentChannel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, platId, accountName, account, type, password, phoneNum, downloadNum, balance, deptName, deptId, remJobNum, refreshNum, offLineJobNum, onLineJobNum, unit, createDate, updateDate, deleted, status, userNum, channelCode, parentChannel);
    }
}
