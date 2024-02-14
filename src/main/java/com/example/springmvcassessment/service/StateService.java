package com.example.springmvcassessment.service;

import com.example.springmvcassessment.entity.State;

import java.util.List;

public interface StateService {
    public List<State> getAllSta();
    public State findById(int id);
}
