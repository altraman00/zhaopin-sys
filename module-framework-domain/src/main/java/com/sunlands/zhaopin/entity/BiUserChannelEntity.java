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
@Table(name = "bi_user_channel", schema = "db_feo_zhaopin", catalog = "")
public class BiUserChannelEntity {
    private long id;
    private Integer userId;
    private Long channelId;
    private Integer refreshNum;
    private String unit;
    private Integer count;
    private Integer downloadNum;
    private String platId;
    private Timestamp createDate;
    private Timestamp updateDate;
    private Integer deleted;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "channel_id")
    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
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
    @Column(name = "unit")
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Basic
    @Column(name = "download_num")
    public Integer getDownloadNum() {
        return downloadNum;
    }

    public void setDownloadNum(Integer downloadNum) {
        this.downloadNum = downloadNum;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiUserChannelEntity that = (BiUserChannelEntity) o;
        return id == that.id &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(channelId, that.channelId) &&
                Objects.equals(refreshNum, that.refreshNum) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(count, that.count) &&
                Objects.equals(downloadNum, that.downloadNum) &&
                Objects.equals(platId, that.platId) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(deleted, that.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, channelId, refreshNum, unit, count, downloadNum, platId, createDate, updateDate, deleted);
    }
}
