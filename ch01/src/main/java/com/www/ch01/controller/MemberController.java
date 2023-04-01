package com.www.ch01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

  private Logger logger = LoggerFactory.getLogger(MemberController.class);

  @GetMapping("/member/login")
  public String login() {
    return "/member/login";
  }

  @PutMapping("/member/login")
  @ResponseBody
  public String loginPut(String userId, String userPw) {
    if (userId.equals("id") && userPw.equals("1234")) {
      return "로그인 성공";
    } else {
      return "로그인 실패";
    }
  }

  @PostMapping("/member/loginJson")
  @ResponseBody
  public String loginJson(
    @RequestParam(name = "userId") String userId,
    @RequestParam("userPw") String userPw
  ) {
    logger.info("아이디 : {}", userId);
    logger.info("패스워드 : {}", userPw);

    if (userId.equals("id") && userPw.equals("pwd")) {
      logger.info("성공");
      return "성공입니다";
    } else {
      logger.info("실패");
      return "실패입니다.";
    }
  }

  @PostMapping("/member/login")
  public String login(
    @RequestParam(name = "userId") String userId,
    @RequestParam("userPw") String userPw
  ) {
    logger.info("아이디 : {}", userId);
    logger.info("패스워드 : {}", userPw);

    if (userId.equals("id") && userPw.equals("pwd")) {
      logger.info("성공");
      return "/member/loginOk";
    } else {
      logger.info("실패");
      return "/member/loginError";
    }
  }
}
