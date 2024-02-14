package com.example.springmvcassessment.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String sname;
    private int pamt;

    public int getPamt() {
        return pamt;
    }

    public void setPamt(int pamt) {
        this.pamt = pamt;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


}
