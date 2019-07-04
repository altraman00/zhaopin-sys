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
@Table(name = "bi_channel_log", schema = "db_feo_zhaopin", catalog = "")
public class BiChannelLogEntity {
    private long id;
    private Long channelId;
    private Integer type;
    private Integer userId;
    private String platId;
    private String comment;
    private Integer suid;
    private Timestamp createDate;
    private Timestamp updateDate;
    private String channelAccount;
    private String userEmail;
    private String suserEmail;
    private String suserRole;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "channel_id")
    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
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
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "suid")
    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
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
    @Column(name = "channel_account")
    public String getChannelAccount() {
        return channelAccount;
    }

    public void setChannelAccount(String channelAccount) {
        this.channelAccount = channelAccount;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "suser_email")
    public String getSuserEmail() {
        return suserEmail;
    }

    public void setSuserEmail(String suserEmail) {
        this.suserEmail = suserEmail;
    }

    @Basic
    @Column(name = "suser_role")
    public String getSuserRole() {
        return suserRole;
    }

    public void setSuserRole(String suserRole) {
        this.suserRole = suserRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiChannelLogEntity that = (BiChannelLogEntity) o;
        return id == that.id &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(type, that.type) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(platId, that.platId) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(suid, that.suid) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(channelAccount, that.channelAccount) &&
                Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(suserEmail, that.suserEmail) &&
                Objects.equals(suserRole, that.suserRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, channelId, type, userId, platId, comment, suid, createDate, updateDate, channelAccount, userEmail, suserEmail, suserRole);
    }
}
