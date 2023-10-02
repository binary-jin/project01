package com.example.project01.dto.Member;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberUpdateForm {

    @NotEmpty(message = "필수 입력 값입니다")
    private String memberPhone;

    @NotEmpty(message = "필수 입력 값입니다")
    @Email(message = "이메일 형식을 지켜 입력해주세요")
    private String memberEmail;

    @NotEmpty(message = "필수 입력 값입니다")
    private String memberPwd;

}