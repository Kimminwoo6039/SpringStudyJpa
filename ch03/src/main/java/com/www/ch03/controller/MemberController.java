package com.www.ch03.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MemberController {

  private Logger looger = LoggerFactory.getLogger(MemberController.class);

  @GetMapping("/member/login")
  public String Login() {
    return "/member/login";
  }

  @GetMapping("/member/list")
  public String list(Model model) {
    List<Map<String, Object>> list = new ArrayList<>();
    Map<String, Object> map = new HashMap();
    map.put("userID", "아이디");
    map.put("userName", "이름");
    list.add(map);

    Map<String, Object> map1 = new HashMap();
    map1.put("userID", "아이디1");
    map1.put("userName", "이름1");
    list.add(map1);

    Map<String, Object> map2 = new HashMap();
    map2.put("userID", "아이디2");
    map2.put("userName", "이름2");
    list.add(map2);

    model.addAttribute("memberList", list);

    return "member/list";
  }

  @PostMapping("/member/login")
  public String LoginCheck(
    String id,
    String pwd,
    Model model,
    RedirectAttributes rAttributes
  ) {
    model.addAttribute("msg", id);

    if (id.equals("id") && pwd.equals("1234")) {
      rAttributes.addAttribute("gender", 1);
      rAttributes.addAttribute("msg", "성공했다");
      rAttributes.addAttribute("content", "내용");
      return "redirect:/";
    } else {
      return "redirect:/member/login";
    }
  }
}
