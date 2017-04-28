package edu.nf.controller;

import edu.nf.dao.OneselfDao;
import edu.nf.entity.Oneself;
import edu.nf.service.OneselfService;
import edu.nf.service.MailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller("oneSelfAction")
public class OneSelfController {
    @Resource
    private OneselfService oneselfService;

    @Resource
    private MailService mailService;

    @Resource
    private OneselfDao oneselfDao;

  /*  @GetMapping(value = "login")*/
    @RequestMapping(value = "login")
    public String login(){
        return "login";
    }
    /**
     * localhost/login
     *  get 方法  提交
     * @param oemail
     * @param opassword
     * @return
     */
    @RequestMapping(value = "loginDo")
    public String loginDo(String oemail, String opassword,HttpSession session) {
        Oneself oneself = oneselfService.loginimp(oemail,opassword);
        if (oneself != null) {
            session.setAttribute("oneself", oneself);
        } else {
            session.setAttribute("oneself", "denglushibai");
        }
        return "index";
    }
/*
* post 方法 登录
* */
    @PostMapping(value = "loginDo")
    public String a(String oemail, String opassword,HttpSession session) {
        Oneself Oneself = oneselfService.loginimp(oemail, opassword);
        return "index";
    }



    /*
    *注册
    * */
    @PostMapping(value = "regist")
    public String regist(Oneself oneself) {
        Boolean regist = oneselfService.regist(oneself);
        if (regist){
            return "forward:/yanzheng";
        } else {
            return "login";
        }
    }
    /*
    * 点击发送邮件
    * */
    @RequestMapping(value = "yanzheng")
    public String yanzheng(Oneself oneself, RedirectAttributes redirectAttributes) {

        // 1. 发送
        String digest = mailService.sendByQQMail(oneself.getOemail());
        if (digest == null)
            return "error";

     /*   // 2. 将用户注册的信息,包括 digest 等,插入数据库.
        oneself.setDigest(digest);
        oneself.setStatus(false);
        OneService.updateOrSave(oneself);
        */

        System.out.println(oneself.getOemail().toString());

        return "login";
    }

    @RequestMapping(value = "index")
    public String index(String usermail,String digest){
        oneselfDao.updateOne(usermail);
        return "index";
    }


}
