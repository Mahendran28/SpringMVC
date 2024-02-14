package com.example.springmvcassessment.repository;

import com.example.springmvcassessment.entity.Coverage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoverageDAOImpl implements CoverageDAO{
    @Autowired
    EntityManager em;

    @Override
    public List<Coverage> getAllCov() {
        TypedQuery<Coverage> sql = em.createQuery("from Coverage", Coverage.class);
        List<Coverage> coverages=sql.getResultList();
        return coverages;
    }


    @Override
    public Coverage findById(int id) {
        Coverage c=em.find(Coverage.class,id);
        return c;
    }


}
