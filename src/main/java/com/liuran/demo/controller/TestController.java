package com.liuran.demo.controller;

import com.liuran.demo.service.TestService;
import com.liuran.demo.domain.TestDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/demo/test")
public class
TestController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE } )
    public TestDemo create(@RequestBody TestDemo demo){
        return service.testService(demo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public TestDemo get(@PathVariable String id){
        return service.get(id);
    }
}
