package com.practice.springhibernateapplicaton.controller;

import com.practice.springhibernateapplicaton.service.PushService;
import com.practice.springhibernateapplicaton.service.RetrieveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @Autowired
    private PushService pushService;
    private RetrieveService retrieveService;

    @GetMapping
    public String getData(){
        return retrieveService.getData();
    }

    @GetMapping(path="/v1/store")
    public String pushData(){
        return pushService.PushData();
    }
}
