package com.www.ch05.controller;

import com.www.ch05.dto.MemberDto;
import com.www.ch05.service.MemberService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {

  @Autowired
  MemberService memberService;

  @GetMapping("/join")
  public String join() {
    return "/member/join";
  }

  @PostMapping("/joinProcess")
  public String join1(@Valid MemberDto memberDto, BindingResult bindResult) {
    if (bindResult.hasErrors()) {
      return "/member/join";
    }

    log.info("memberDto  : {}", memberDto);
    int result = memberService.insertMember(memberDto);
    return "/";
  }

  @PostMapping("/idCheck")
  @ResponseBody
  public Integer idcheck(@Valid MemberDto memberDto) {
    System.out.println(memberDto.getUserId());

    Integer result = memberService.idCheck(memberDto);
    log.info("result : {}", result);
    return result;
  }
}
