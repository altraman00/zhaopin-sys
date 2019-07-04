package com.sunlands.zhaopin.entity;

import javax.persistence.*;
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
@Table(name = "bi_ehr_options", schema = "db_feo_zhaopin", catalog = "")
public class BiEhrOptionsEntity {
    private int id;
    private String typeName;
    private String jsonDetail;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type_name")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "json_detail")
    public String getJsonDetail() {
        return jsonDetail;
    }

    public void setJsonDetail(String jsonDetail) {
        this.jsonDetail = jsonDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BiEhrOptionsEntity that = (BiEhrOptionsEntity) o;
        return id == that.id &&
                Objects.equals(typeName, that.typeName) &&
                Objects.equals(jsonDetail, that.jsonDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, typeName, jsonDetail);
    }
}
