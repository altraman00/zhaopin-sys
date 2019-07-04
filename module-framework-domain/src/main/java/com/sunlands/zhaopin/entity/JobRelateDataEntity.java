package com.sunlands.zhaopin.entity;

import javax.persistence.*;
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
@Table(name = "job_relate_data", schema = "db_feo_zhaopin", catalog = "")
public class JobRelateDataEntity {
    private int id;
    private Integer jobId;
    private Integer needNum;
    private Integer entryNum;
    private Integer waitOpreNum;
    private Integer waitComuniNum;
    private Integer waitInitialNum;
    private Integer waitRetestNum;
    private Integer waitFinalNum;
    private Integer waitEntryNum;
    private Integer yetSendOffer;
    private Integer toSendOffer;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "job_id")
    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    @Basic
    @Column(name = "need_num")
    public Integer getNeedNum() {
        return needNum;
    }

    public void setNeedNum(Integer needNum) {
        this.needNum = needNum;
    }

    @Basic
    @Column(name = "entry_num")
    public Integer getEntryNum() {
        return entryNum;
    }

    public void setEntryNum(Integer entryNum) {
        this.entryNum = entryNum;
    }

    @Basic
    @Column(name = "wait_opre_num")
    public Integer getWaitOpreNum() {
        return waitOpreNum;
    }

    public void setWaitOpreNum(Integer waitOpreNum) {
        this.waitOpreNum = waitOpreNum;
    }

    @Basic
    @Column(name = "wait_comuni_num")
    public Integer getWaitComuniNum() {
        return waitComuniNum;
    }

    public void setWaitComuniNum(Integer waitComuniNum) {
        this.waitComuniNum = waitComuniNum;
    }

    @Basic
    @Column(name = "wait_initial_num")
    public Integer getWaitInitialNum() {
        return waitInitialNum;
    }

    public void setWaitInitialNum(Integer waitInitialNum) {
        this.waitInitialNum = waitInitialNum;
    }

    @Basic
    @Column(name = "wait_retest_num")
    public Integer getWaitRetestNum() {
        return waitRetestNum;
    }

    public void setWaitRetestNum(Integer waitRetestNum) {
        this.waitRetestNum = waitRetestNum;
    }

    @Basic
    @Column(name = "wait_final_num")
    public Integer getWaitFinalNum() {
        return waitFinalNum;
    }

    public void setWaitFinalNum(Integer waitFinalNum) {
        this.waitFinalNum = waitFinalNum;
    }

    @Basic
    @Column(name = "wait_entry_num")
    public Integer getWaitEntryNum() {
        return waitEntryNum;
    }

    public void setWaitEntryNum(Integer waitEntryNum) {
        this.waitEntryNum = waitEntryNum;
    }

    @Basic
    @Column(name = "yet_send_offer")
    public Integer getYetSendOffer() {
        return yetSendOffer;
    }

    public void setYetSendOffer(Integer yetSendOffer) {
        this.yetSendOffer = yetSendOffer;
    }

    @Basic
    @Column(name = "to_send_offer")
    public Integer getToSendOffer() {
        return toSendOffer;
    }

    public void setToSendOffer(Integer toSendOffer) {
        this.toSendOffer = toSendOffer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobRelateDataEntity that = (JobRelateDataEntity) o;
        return id == that.id &&
                Objects.equals(jobId, that.jobId) &&
                Objects.equals(needNum, that.needNum) &&
                Objects.equals(entryNum, that.entryNum) &&
                Objects.equals(waitOpreNum, that.waitOpreNum) &&
                Objects.equals(waitComuniNum, that.waitComuniNum) &&
                Objects.equals(waitInitialNum, that.waitInitialNum) &&
                Objects.equals(waitRetestNum, that.waitRetestNum) &&
                Objects.equals(waitFinalNum, that.waitFinalNum) &&
                Objects.equals(waitEntryNum, that.waitEntryNum) &&
                Objects.equals(yetSendOffer, that.yetSendOffer) &&
                Objects.equals(toSendOffer, that.toSendOffer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobId, needNum, entryNum, waitOpreNum, waitComuniNum, waitInitialNum, waitRetestNum, waitFinalNum, waitEntryNum, yetSendOffer, toSendOffer);
    }
}
