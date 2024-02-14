package com.example.springmvcassessment.repository;

import com.example.springmvcassessment.entity.Coverage;

import java.util.List;

public interface CoverageDAO {
    public List<Coverage> getAllCov();


    public Coverage findById(int id);


}
