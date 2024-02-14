package com.example.springmvcassessment.controller;

import com.example.springmvcassessment.entity.*;
import com.example.springmvcassessment.service.CoverageService;
import com.example.springmvcassessment.service.PolicyService;
import com.example.springmvcassessment.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/policy")
public class PolicyController {
    @Autowired
    PolicyService policyService;
    @Autowired
    CoverageService coverageService;
    @Autowired
    StateService ss;



    @GetMapping("/index")
    public String in(Model model) {
        Policy policy = new Policy();
        model.addAttribute("policy", policy);

        return "index";
    }

    @GetMapping("/list")
    public String getAll(Model model) {
        List<Policy> policyList = policyService.gatAllPolicy();
        //  List<State> states=ss.getAllSta();

        model.addAttribute("policies", policyList);
        // model.addAttribute("coverages", coverages);
        // model.addAttribute("states", states);
        return "policy-list";
    }

    @GetMapping("/adduser")
    public String addUser(Model model) {
        Policy policy = new Policy();
        List<Coverage> coverageList = coverageService.getAllCov();
        List<State> states = ss.getAllSta();
        model.addAttribute("policy", policy);
        model.addAttribute("coverages", coverageList);
        model.addAttribute("states", states);
        String status ="unbound";
        model.addAttribute("status",status);
        return "userindex";

    }

    @Transactional
    @PostMapping("/save")
    public String savePolicy(Model model, @ModelAttribute Policy policy, @RequestParam("states") String states, @RequestParam("address1") String address1, @RequestParam("address2") String address2, @RequestParam("coverageIds") String[] coverageIds) {
        List<Coverage> coverageList = new ArrayList<>();
        //Coverage_Premium cp = new Coverage_Premium();
        Address address = new Address();
        address.setAddress1(address1);
        address.setAddress2(address2);

        policy.setAddress(address);
        State states1 = ss.findById(Integer.parseInt(states));
        policy.setState(states1);

        for (String coverageId : coverageIds) {
            Coverage coverage = coverageService.findById(Integer.parseInt(coverageId));
            if (coverage != null) {
                coverageList.add(coverage);
            }
        }

        policy.setCoverages(coverageList);

        policyService.save(policy);
        policyService.getPremium(policy.getPno());
        //cp.setPno(policy.getPno());

        model.addAttribute("premium", policy.getState());

        return "premium";
    }

    @GetMapping("/premium")
    public String premium(Model model) {


        return "premium";
    }


    @GetMapping("/update")
    public String update(@RequestParam int policyId, Model model) {
        Policy policy = policyService.getById(policyId);
        List<Coverage> coverageList = coverageService.getAllCov();
        List<State> states = ss.getAllSta();
        model.addAttribute("coverages", coverageList);
        model.addAttribute("states", states);
        model.addAttribute("policy", policy);
        return "update";
    }

    @Transactional
    @GetMapping("/delete")
    public String delete(@RequestParam int policyId) {
        policyService.delete(policyId);
        return "redirect:/policy/list";

    }


}


