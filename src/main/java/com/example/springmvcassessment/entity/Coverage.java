package com.example.springmvcassessment.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Coverage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int cid;
    private String cname;
/*    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "policy_coverage",
            joinColumns = @JoinColumn(name = "policy_id"),
            inverseJoinColumns = @JoinColumn(name = "coverage_id")
    )
    private List<State> states;

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }*/

    @ManyToMany(mappedBy = "coverages")
    private List<Policy> policies;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }
}
