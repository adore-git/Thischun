package edu.nf.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Administrator on 2017/4/18.
 */
@Table
@Entity
public class Relationships{
    @Id
    @GeneratedValue
    private int rid;
    private int rself_id;
    private int rself_id_p;
    private Date rcreated_at;

    public Set<Oneself> getOneself() {
        return oneself;
    }

    public void setOneself(Set<Oneself> oneself) {
        this.oneself = oneself;
    }

    @ManyToMany
    public Set<Oneself> oneself;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getRself_id() {
        return rself_id;
    }

    public void setRself_id(int rself_id) {
        this.rself_id = rself_id;
    }

    public int getRself_id_p() {
        return rself_id_p;
    }

    public void setRself_id_p(int rself_id_p) {
        this.rself_id_p = rself_id_p;
    }

    public Date getRcreated_at() {
        return rcreated_at;
    }

    public void setRcreated_at(Date rcreated_at) {
        this.rcreated_at = rcreated_at;
    }


}
