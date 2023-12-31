package com.example.project01.dto.mypage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EducationForm {
    private Long id;

    private String school;

    private String degree;

    private String major;

    private String admissionDate;

    private String graduateDate;

    private float grades;

    private String prize;

}
