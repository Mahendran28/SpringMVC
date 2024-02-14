package com.example.springmvcassessment.service;

import com.example.springmvcassessment.entity.Policy;
import com.example.springmvcassessment.repository.PolicyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PolicyServiceImpl implements PolicyService{
    @Autowired
    PolicyDAO pd;
    @Override
    public List<Policy> gatAllPolicy() {
        return pd.gatAllPolicy();
    }

    @Override
    public Policy update(int id) {
        return pd.update(id);
    }

    @Override
    public void save(Policy policy) {
        pd.save(policy);
    }

    @Override
    public void delete(int id) {
        pd.delete(id);
    }

    @Override
    public Policy getPremium(int id) {
        return pd.getPremium(id);
    }

    @Override
    public Policy getById(int id) {
        return pd.getById(id);
    }
}
