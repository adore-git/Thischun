package edu.nf.dao;

import edu.nf.entity.Oneself;

/**
 * Created by Administrator on 2017/4/17.
 */
public interface Oneselfimp {
    /*
    * 注册
    * */
    public void reginimp(Oneself oneself);

    /*
    * 登录
    * */
    public Oneself loginimp(String oemail,String opassword);
}
