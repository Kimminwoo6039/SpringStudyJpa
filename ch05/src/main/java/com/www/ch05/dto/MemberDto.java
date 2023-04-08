package com.www.ch05.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {

  private int no;
  private String userId;
  private String userPw;
  private String userName;
  private String userEmail;
  private String userAddr;
  private String regdate;
}
