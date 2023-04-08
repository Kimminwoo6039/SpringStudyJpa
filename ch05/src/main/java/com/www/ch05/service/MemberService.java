package com.www.ch05.service;

import com.www.ch05.dto.MemberDto;
import java.lang.reflect.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
  int insertMember(MemberDto memberDto);
}
