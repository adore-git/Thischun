package edu.nf.dao;

import edu.nf.entity.Relationships;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/19.
 */
@Component("RelationDao")
public class RelationshipsDao extends BaseDao{

    /*
    *   关注
    *
    *   页面 : 点击关注
    * */
    public void guangzhu(Relationships Relationships){
        Session Session = getSession();
        getSession().save(Relationships.getRself_id_p());
    }

    /*
    * 关注的人
    *
    * 页面  :  查询我的粉丝
    * */

    public Relationships fengshi(int rself_id_p){
        Session session = getSession();
        String hql = "from Relationships where rself_id_p= :res";
        Relationships rela = (Relationships) session.createQuery(hql).setParameter("res",rself_id_p);
        return rela;

    }


}
