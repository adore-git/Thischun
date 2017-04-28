package edu.nf.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/15.
 */
@Entity
@Table
public class Oneself {
    @Id
    @GeneratedValue
    private int oid;  //编号
    private String oname;  //名字
    private String oemail;  //邮箱
    private Date ocreated;  //创建时间
    private Date oupdated;   //更新时间
    private String opassword;  //密码
    private String oactivtion_d;  //激活
    private String activated;    //是否激活
    private Date activated_t;   //激活时间
    private String picture;   //图片

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getOemail() {
        return oemail;
    }

    public void setOemail(String oemail) {
        this.oemail = oemail;
    }

    public Date getOcreated() {
        return ocreated;
    }

    public void setOcreated(Date ocreated) {
        this.ocreated = ocreated;
    }

    public Date getOupdated() {
        return oupdated;
    }

    public void setOupdated(Date oupdated) {
        this.oupdated = oupdated;
    }

    public String getOpassword() {
        return opassword;
    }

    public void setOpassword(String opassword) {
        this.opassword = opassword;
    }

    public String getOactivtion_d() {
        return oactivtion_d;
    }

    public void setOactivtion_d(String oactivtion_d) {
        this.oactivtion_d = oactivtion_d;
    }

    public String getActivated() {
        return activated;
    }

    public void setActivated(String activated) {
        this.activated = activated;
    }

    public Date getActivated_t() {
        return activated_t;
    }

    public void setActivated_t(Date activated_t) {
        this.activated_t = activated_t;
    }

    @Override
    public String toString() {
        return "Oneself{" +
                "oid=" + oid +
                ", oname='" + oname + '\'' +
                ", oemail='" + oemail + '\'' +
                ", ocreated=" + ocreated +
                ", oupdated=" + oupdated +
                ", opassword='" + opassword + '\'' +
                ", oactivtion_d='" + oactivtion_d + '\'' +
                ", activated='" + activated + '\'' +
                ", activated_t=" + activated_t +
                '}';
    }
}
