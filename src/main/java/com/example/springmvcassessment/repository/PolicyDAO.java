package com.example.springmvcassessment.repository;

import com.example.springmvcassessment.entity.Policy;

import java.util.List;

public interface PolicyDAO {
    public List<Policy> gatAllPolicy();
    public void save(Policy policy);
    public  Policy update(int id);
    public void delete(int id);
    public Policy getPremium(int id);

    public Policy getById(int id);

}
