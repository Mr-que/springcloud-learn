package com.aqur.controller;

import com.aqur.service.SchedualServiceHi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String saiHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
