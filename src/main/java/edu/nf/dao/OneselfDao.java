package edu.nf.dao;

import edu.nf.entity.Oneself;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

@Component
public class OneselfDao extends BaseDao implements Oneselfimp{

    /**
     * 注册
     * @param oneself
     */
    public void reginimp(Oneself oneself) {
        Session session = getSession();
        session.save(oneself);
    }

    /**
     * 登录
     * @param
     */
    public Oneself loginimp(String oemail,String opassword) {
        Session session = getSession();
        String state = "f";
        String hql ="from Oneself where oemail =:oemail and opassword =:opassword and activated = :activated";
        Oneself oneself = (Oneself) session.createQuery(hql).setParameter("oemail", oemail).setParameter("opassword", opassword).setParameter("activated", state).uniqueResult();
        return oneself;
    }

    /**
     * 判断用户是否存在
     * @param
     */
    public Oneself exitOneself(String oemail){
        Session session =  getSession();
        String hql ="from Oneself where oemail =:oemail";
        Oneself oneself = (Oneself) session.createQuery(hql).setParameter("oemail", oemail).uniqueResult();
        return oneself;
    }
            /*
            * 更新状态
            * */
    public void updateOne(String email){
        Session session = getSession();
        String hql ="from Oneself where oemail =:oemail";
        Oneself oneself = (Oneself) session.createQuery(hql).setParameter("oemail", email).uniqueResult();

        session.saveOrUpdate(oneself);
    }


}
