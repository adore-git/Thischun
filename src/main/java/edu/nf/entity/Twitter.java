package edu.nf.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/18.
 */
@Entity
@Table
public class Twitter {
    @Id
    private int tid;
    private String tcontext;
    private int tself_id;
    private Date treated;
    private Date tupdated;
    private String tpicture;

    @ManyToOne
    public Oneself Oneself;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTcontext() {
        return tcontext;
    }

    public void setTcontext(String tcontext) {
        this.tcontext = tcontext;
    }

    public int getTself_id() {
        return tself_id;
    }

    public void setTself_id(int tself_id) {
        this.tself_id = tself_id;
    }

    public Date getTreated() {
        return treated;
    }

    public void setTreated(Date treated) {
        this.treated = treated;
    }

    public Date getTupdated() {
        return tupdated;
    }

    public void setTupdated(Date tupdated) {
        this.tupdated = tupdated;
    }

    public String getTpicture() {
        return tpicture;
    }

    public void setTpicture(String tpicture) {
        this.tpicture = tpicture;
    }

    public edu.nf.entity.Oneself getOneself() {
        return Oneself;
    }

    public void setOneself(edu.nf.entity.Oneself oneself) {
        Oneself = oneself;
    }
}
