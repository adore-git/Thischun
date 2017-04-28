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
public class Comments {
    @Id
    private int cid;
    private String cbody;
    private int cself_id;
    private int ctwitter_id;
    private Date created;
    private Date cupdated;

    public edu.nf.entity.Twitter getTwitter() {
        return Twitter;
    }

    public void setTwitter(edu.nf.entity.Twitter twitter) {
        Twitter = twitter;
    }

    @ManyToOne
    public  Twitter Twitter;


    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCbody() {
        return cbody;
    }

    public void setCbody(String cbody) {
        this.cbody = cbody;
    }

    public int getCself_id() {
        return cself_id;
    }

    public void setCself_id(int cself_id) {
        this.cself_id = cself_id;
    }

    public int getCtwitter_id() {
        return ctwitter_id;
    }

    public void setCtwitter_id(int ctwitter_id) {
        this.ctwitter_id = ctwitter_id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCupdated() {
        return cupdated;
    }

    public void setCupdated(Date cupdated) {
        this.cupdated = cupdated;
    }
}
