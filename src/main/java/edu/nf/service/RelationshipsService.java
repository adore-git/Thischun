package edu.nf.service;

import edu.nf.dao.RelationshipsDao;
import edu.nf.entity.Relationships;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/4/19.
 */
@Service
public class RelationshipsService {

    @Resource
    public RelationshipsDao RelaDao;

    /*
    * 关注
    * */
    public boolean guanzhu(Relationships Relationships){
    if(Relationships == null) {
        RelaDao.guangzhu(Relationships);
        return true;
    }else{
            return false;
        }
    }

    /*
    * 粉丝
    * */

    public Relationships fenshi(int rself_id_p){
        return RelaDao.fengshi(rself_id_p);
    }
}
