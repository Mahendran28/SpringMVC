package com.example.springmvcassessment.repository;

import com.example.springmvcassessment.entity.Policy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PolicyDAOImpl implements PolicyDAO{
    @Autowired
    EntityManager em;
    @Override
    public List<Policy> gatAllPolicy() {
        TypedQuery<Policy> sql = em.createQuery("from Policy", Policy.class);
        List<Policy> policies=sql.getResultList();
        return policies;
    }

    @Override
    public void save(Policy policy) {
        em.merge(policy);
    }

    @Override
    public Policy update(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Policy getPremium(int id) {
        TypedQuery<Policy> sql = em.createQuery(" select p.coverages from Policy as p where pno=id", Policy.class);
        return null;
    }

    @Override
    public Policy getById(int id) {
        Policy policy=em.find(Policy.class,id);


        return policy;
    }
}
