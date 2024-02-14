package com.example.springmvcassessment.repository;

import com.example.springmvcassessment.entity.Coverage;
import com.example.springmvcassessment.entity.State;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StateDAOImpl implements StateDAO{
    @Autowired
    EntityManager em;
    @Override
    public List<State> getAllSta() {
        TypedQuery<State> sql = em.createQuery("from State", State.class);
        List<State> states=sql.getResultList();
        return states;
    }

    @Override
    public State findById(int id) {
        State state=em.find(State.class,id);
        return state;
    }
}
