package com.www.ch03.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  private final Logger logger = LoggerFactory.getLogger(HomeController.class);

  @GetMapping("/")
  public String home(Model model, String msg, String content, int gender) {
    logger.debug("msg : {}", msg);
    if (gender == 1) {
      model.addAttribute("gender", "남자");
    } else if (gender == 2) {
      model.addAttribute("gender", "여자");
    }
    model.addAttribute("content", content);
    model.addAttribute("msg", msg);
    return "/index/index";
  }
}
