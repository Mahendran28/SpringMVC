package com.example.springmvcassessment.service;

import com.example.springmvcassessment.entity.Coverage;
import com.example.springmvcassessment.repository.CoverageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoverageServiceImpl implements CoverageService{
    @Autowired
    CoverageDAO cd;

    @Override
    public List<Coverage> getAllCov() {
        return cd.getAllCov();
    }

    @Override
    public Coverage findById(int id) {
        return cd.findById(id);
    }
}
