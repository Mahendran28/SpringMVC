package com.example.springmvcassessment.repository;

import com.example.springmvcassessment.entity.State;

import java.util.List;

public interface StateDAO {
    public List<State> getAllSta();
    public State findById(int id);
}
