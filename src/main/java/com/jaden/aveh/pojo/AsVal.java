package com.jaden.aveh.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="as_val")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class AsVal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String valset_id;
    @Id
    private String val_id;
    private String val;
    private int ord_index;
    private Date lstdate;
    private String is_system;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValset_id() {
        return valset_id;
    }

    public void setValset_id(String valset_id) {
        this.valset_id = valset_id;
    }

    public String getVal_id() {
        return val_id;
    }

    public void setVal_id(String val_id) {
        this.val_id = val_id;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getOrd_index() {
        return ord_index;
    }

    public void setOrd_index(int ord_index) {
        this.ord_index = ord_index;
    }

    public Date getLstdate() {
        return lstdate;
    }

    public void setLstdate(Date lstdate) {
        this.lstdate = lstdate;
    }

    public String getIs_system() {
        return is_system;
    }

    public void setIs_system(String is_system) {
        this.is_system = is_system;
    }
}
