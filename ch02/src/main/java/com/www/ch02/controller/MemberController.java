package com.www.ch02.controller;

import com.www.ch02.dto.Member;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j2
public class MemberController {

  @GetMapping("/member/join")
  public String join(Member member) {
    log.debug(
      "id : {} , password : {}",
      member.getName(),
      member.getPassword()
    );
    member.setName("name");
    member.setPassword("1234");
    member.toString();
    return "/member/join";
  }
}
