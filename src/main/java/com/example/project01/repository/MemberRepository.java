package com.example.project01.repository;

import com.example.project01.entity.Member;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    public List<Member> findByEmail(String memberEmail) {
        return em.createQuery("select m from Member m where  m.memberEmail = : memberEmail", Member.class)
                .setParameter("memberEmail", memberEmail)
                .getResultList();
    }

//    public Optional<Member> findByEmail(String memberEmail) {
//        return findAll()
//    }


}
