package com.jaden.aveh.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="aveh_hp")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class AvehHp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String cph;

    @ManyToOne
    @JoinColumn(name="hptz")
    private AsVal asVal;

    private String hpzt;
    private String hd;
    private String hd_exfield;
    private String remark ;
    private String jyjl_no;
    private Date cdate;
    private String creator;
    private String cipaddr;
    private Date mdate;
    private String modifier;
    private String mipaddr;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCph() {
        return cph;
    }

    public void setCph(String cph) {
        this.cph = cph;
    }

    public AsVal getAsVal() {
        return asVal;
    }

    public void setAsval(AsVal asVal) {
        this.asVal = asVal;
    }

    public String getHpzt() {
        return hpzt;
    }

    public void setHpzt(String hpzt) {
        this.hpzt = hpzt;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getHd_exfield() {
        return hd_exfield;
    }

    public void setHd_exfield(String hd_exfield) {
        this.hd_exfield = hd_exfield;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getJyjl_no() {
        return jyjl_no;
    }

    public void setJyjl_no(String jyjl_no) {
        this.jyjl_no = jyjl_no;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCipaddr() {
        return cipaddr;
    }

    public void setCipaddr(String cipaddr) {
        this.cipaddr = cipaddr;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = mdate;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getMipaddr() {
        return mipaddr;
    }

    public void setMipaddr(String mipaddr) {
        this.mipaddr = mipaddr;
    }
}
