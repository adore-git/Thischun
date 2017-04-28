package edu.nf.service;

import edu.nf.dao.OneselfDao;
import edu.nf.entity.Oneself;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class OneselfService {
    @Resource
    private OneselfDao oneselfDao;

    /**
     * 登录
     */
    public Oneself loginimp(String oemail,String opassword ) throws ServiceException{
        if(oemail!=null && opassword!=null ){
            Oneself loginimp = oneselfDao.loginimp(oemail, opassword);
            if(loginimp!=null){
                return loginimp;
            }else{
                throw new ServiceException("登录异常");
            }
        }
        return null;
    }
    /*
    * 注册
    * */
    public Boolean regist(Oneself oneself){
        Oneself oneself1 = oneselfDao.exitOneself(oneself.getOemail());
        if(oneself1==null){
            //... 还有其它信息 填入 比如 发邮箱  更改 状态
            //...
            oneself.setOname("新手一号");
            oneself.setPicture("one.jpg");
            oneself.setActivated("f");
            oneselfDao.reginimp(oneself);
         //   System.out.println("输出周强:周强");
            return true;
        }else{
            return false;
        }
    }


}
