package com.www.ch04.controller;

import com.www.ch04.dao.MemberDao;
import com.www.ch04.dto.MemberDto;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member")
public class MemberController {

  private final Logger logger = LoggerFactory.getLogger(MemberController.class);

  @Autowired
  MemberDao memberDao;

  @GetMapping("/join")
  public String join1() {
    return "/member/join";
  }

  @PostMapping("/join")
  public String joinProcess(
    @RequestParam String userId,
    @RequestParam String userPw,
    @RequestParam String userName,
    MemberDto memberDto
  ) {
    logger.info(
      "userId :{}, userPw : {} , userName : {}",
      userId,
      userPw,
      userName
    );
    memberDao.insertMember(memberDto);
    return "redirect:/member/list";
  }

  @GetMapping("/list")
  public String memberList(Model model, MemberDto memberDto) {
    List<MemberDto> member = memberDao.getAllMember();
    model.addAttribute("member", member);
    return "/member/list";
  }

  @GetMapping("/info")
  public String info(Model model) {
    MemberDto one = memberDao.getOneMember();
    model.addAttribute("one", one);
    return "/member/info";
  }
}
