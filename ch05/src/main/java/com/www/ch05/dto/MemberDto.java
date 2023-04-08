package com.www.ch05.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MemberDto {

  private int no;

  @Size(min = 5, max = 15, message = "5자에서 15자 이상입력해주세요")
  private String userId;

  private String userPw;
  private String userName;
  private String userEmail;
  private String userAddr;
  private String regdate;
}
