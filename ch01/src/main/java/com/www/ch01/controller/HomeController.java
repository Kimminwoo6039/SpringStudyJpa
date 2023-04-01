package com.www.ch01.controller;

import io.micrometer.core.instrument.util.StringUtils;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String home() {
    return "home.html";
  }

  @GetMapping("/hello")
  public String hello(
    @RequestParam("name") String name,
    @RequestParam("password") String password,
    Model model
  ) {
    System.out.println("name ==> " + name);
    System.out.println("password ==> " + password);

    if (name.equals("name") && password.equals("password")) {
      System.out.println("로그인 성공");
      model.addAttribute("loginMsg", "로그인 성공");
    } else {
      System.out.println("로그인 실패");
      model.addAttribute("loginMsg", "로그인 실패");
    }
    return "/home";
  }
}
