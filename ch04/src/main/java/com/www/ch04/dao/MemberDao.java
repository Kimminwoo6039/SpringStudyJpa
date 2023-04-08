package com.www.ch04.dao;

import com.www.ch04.dto.MemberDto;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberDao {
  int insertMember(MemberDto memberdto);

  List<MemberDto> getAllMember();

  MemberDto getOneMember(String user);

  int deleteMember(MemberDto memberDto);
}
