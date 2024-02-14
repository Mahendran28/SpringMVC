package com.example.springmvcassessment.service;

import com.example.springmvcassessment.entity.State;
import com.example.springmvcassessment.repository.StateDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImple implements StateService{
    @Autowired
    StateDAO sd;

    @Override
    public List<State> getAllSta() {
        return sd.getAllSta();
    }

    @Override
    public State findById(int id) {

        return sd.findById(id);
    }
}
