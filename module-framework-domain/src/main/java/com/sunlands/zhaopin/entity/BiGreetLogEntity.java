package com.sunlands.zhaopin.entity;

import javax.persistence.*;
import java.sql.Date;
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
@Table(name = "bi_greet_log", schema = "db_feo_zhaopin", catalog = "")
public class BiGreetLogEntity {
    private long id;
    private String platResumeId;
    private String platId;
    private String platSeekerId;
    private Date greetDate;
    private Integer status;
    private Integer userId;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "plat_id")
    public String getPlatId() {
        return platId;
    }

    public void setPlatId(String platId) {
        this.platId = platId;
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
    @Column(name = "greet_date")
    public Date getGreetDate() {
        return greetDate;
    }

    public void setGreetDate(Date greetDate) {
        this.greetDate = greetDate;
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
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiGreetLogEntity that = (BiGreetLogEntity) o;
        return id == that.id &&
                Objects.equals(platResumeId, that.platResumeId) &&
                Objects.equals(platId, that.platId) &&
                Objects.equals(platSeekerId, that.platSeekerId) &&
                Objects.equals(greetDate, that.greetDate) &&
                Objects.equals(status, that.status) &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, platResumeId, platId, platSeekerId, greetDate, status, userId);
    }
}
