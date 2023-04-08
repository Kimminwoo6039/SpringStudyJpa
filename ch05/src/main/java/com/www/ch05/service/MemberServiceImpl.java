package com.www.ch05.service;

import com.www.ch05.dao.MemberDao;
import com.www.ch05.dto.MemberDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

  private final MemberDao memberDao;

  @Override
  public int insertMember(MemberDto memberDto) {
    return memberDao.insertMember(memberDto);
  }
}
