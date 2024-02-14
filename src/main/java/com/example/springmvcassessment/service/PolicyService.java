package com.example.springmvcassessment.service;

import com.example.springmvcassessment.entity.Policy;

import java.util.List;

public interface PolicyService {
    public List<Policy> gatAllPolicy() ;
    public Policy update(int id);
    public void save(Policy policy);
    public void delete(int id);
    public Policy getPremium(int id);
    public Policy getById(int id);

}
