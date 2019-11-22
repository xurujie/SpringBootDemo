package com.shangxue.demo05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, @RequestParam("password") String password , Map<String,String> map, HttpSession  session, RedirectAttributes attributes){
if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
    session.setAttribute("LoginName",username);
    return "redirect:/main.html";
}
attributes.addFlashAttribute("msg","账号或密码错误！");
/*        map.put("msg","123");
        session.setAttribute("msg","msg");*/
        return "redirect:/login.html";
    }
}
