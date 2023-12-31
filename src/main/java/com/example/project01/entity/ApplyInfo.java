package com.example.project01.entity;

import com.example.project01.type.ApplyType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "applyInfo")
@RequiredArgsConstructor
public class ApplyInfo {

    @Id
    @GeneratedValue
    @Column(name = "applyInfo_id")
    private Long id;

    private String companyName;

    private String role;

    private String qualification;

    private String deadLine;

    private String homePageUrl;

    private String salary;

    @Enumerated(EnumType.STRING)
    private ApplyType applyCheck;

    private String companyTalent;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "member_id")
//    private Member member;

    public ApplyInfo(Long id) {
        this.id = id;
    }
}
