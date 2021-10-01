package com.customers.application.controller;

import com.customers.application.service.PushService;
import com.customers.application.service.RetrieveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("online/v1")
public class CustomerController {
    @Autowired
    private PushService pushService;
    private RetrieveService pullService;

    @GetMapping(value = "/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getData(){
        return pullService.getData();
    }

    @GetMapping(path="/v1/add-customer", produces = MediaType.APPLICATION_JSON_VALUE)
    public String pushData(){
        return pushService.PushData();
    }
}
