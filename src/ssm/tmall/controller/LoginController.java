package ssm.tmall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.tmall.pojo.User;
import ssm.tmall.service.LoginService;

import javax.servlet.http.HttpSession;

/**
 * @author 杨敏钦
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/loginUser")
    public String loginUser(String uname, String password, Model m){
        User user = loginService.loginUser(uname, password);
        System.out.println(uname+password);
        if (user!=null){
            return "main";
        }else {
            m.addAttribute("msg","用户名或者密码不正确");
            return "login";
        }

    }
    //注册
    @RequestMapping("/registered")
    public String registered(String uname,String password,Model m){
        int n = loginService.registered(uname,password);
        if (n==1){
            return "login";
        }else {
            m.addAttribute("msg","注册失败");
            return "registered";
        }

    }

}
