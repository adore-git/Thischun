package edu.nf.service;

import edu.nf.utils.MD5Utils;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

@Service
public class MailService {

    @Resource
    private JavaMailSenderImpl mailSender;

   /* public void sendMailDemo(Oneself Oneself) {
        try {
            MimeMessage msg = mailSender.createMimeMessage();
            MimeMessageHelper mailHelper = new MimeMessageHelper(msg, true, "utf-8");
            mailHelper.setFrom("2877143504@qq.com");   // 发件人
            mailHelper.setTo(Oneself.getOemail());    // 收件人
            mailHelper.setSubject("激活邮件");      // 邮件标题
            String content = "<div><a href='http://localhost:8080/login/?digest=" + MD5Utils.getDigestMD5("lxx") + "'>点击激活账号</a></div>";  // 发送的内容
            mailHelper.setText(content, true);       // 发送内容
            mailSender.send(msg);         // 发送
        }
        catch (Exception ex) {
                ex.printStackTrace();
        }
    }

*/
   /*
   * 邮箱验证
   * */
    public String sendByQQMail(String to) {
        String digest = null;
        try {
            digest = MD5Utils.getDigestMD5(to);
            MimeMessage msg = mailSender.createMimeMessage();
            MimeMessageHelper mailHelper = new MimeMessageHelper(msg, true, "utf-8");
            mailHelper.setFrom("2877143504@qq.com");    // 发件人
            mailHelper.setTo(to);                         // 收件人
            mailHelper.setSubject("激活邮件");            // 邮件标题
            String content = "<div><a href='http://localhost:8080/index/?usermail=" + to + "&digest=" + digest + "'>点击激活账号</a></div>";  // 发送的内容
            mailHelper.setText(content, true);       // 发送内容
            mailSender.send(msg);                         // 发送
        }
        catch (Exception ex) {
            ex.printStackTrace();
            digest = null;
        }
        return digest;
    }


    /**
     * 1. 生成临时的验证码和地址的方法(组装成一个http请求url),随邮件发送,用户点击就相当于访问你这个服务器并带了你指定的两个参数.
     * 2. 有一个临时保存的容器(在服务器保存以上的俩数据)
     * 3. 一个验证的方法
     * */


}
