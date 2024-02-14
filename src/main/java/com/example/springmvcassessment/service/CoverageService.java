package com.example.springmvcassessment.service;

import com.example.springmvcassessment.entity.Coverage;

import java.util.List;

public interface CoverageService {
    public List<Coverage> getAllCov();

   public Coverage findById(int id);
}
