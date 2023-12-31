package com.example.project01.repository;

import com.example.project01.entity.ApplyInfo;
import com.example.project01.entity.Career;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class ApplyInfoRepository {

    private final EntityManager em;

    public void save(ApplyInfo applyInfo) {
        em.persist(applyInfo);
    }

    public List<ApplyInfo> findAll() {
        log.info("ApplyRepository.findAll");
        return em.createQuery("select a from ApplyInfo a", ApplyInfo.class)
                .getResultList();
    }

    public ApplyInfo findOne(Long id) {
        return em.find(ApplyInfo.class, id);
    }

    public void remove(Long id) {
        log.info("repository.remove");
        ApplyInfo findApply = findOne(id);
        em.remove(findApply);
    }
}
