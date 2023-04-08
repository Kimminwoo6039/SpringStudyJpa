package com.www.ch05.service;

import com.www.ch05.dto.MemberDto;
import org.springframework.stereotype.Service;

public interface MemberService {
  int insertMember(MemberDto memberDto);
  int idCheck(MemberDto memberDto);
}
