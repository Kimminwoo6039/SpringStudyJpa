package com.www.ch05.service;

import com.www.ch05.dao.MemberDao;
import com.www.ch05.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

  private final MemberDao memberDao;

  @Override
  public int insertMember(MemberDto memberDto) {
    return memberDao.insertMember(memberDto);
  }

  @Override
  public int idCheck(MemberDto memberDto) {
    return memberDao.idCheck(memberDto);
  }
}
