package com.www.ch05.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
  int insertMember();
}
