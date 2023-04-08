package com.www.ch05.dao;

import com.www.ch05.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
  int insertMember(MemberDto memberDto);
  int idCheck(MemberDto memberDto);
}
