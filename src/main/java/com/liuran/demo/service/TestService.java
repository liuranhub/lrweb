package com.liuran.demo.service;

import com.liuran.demo.domain.TestDemo;
import com.liuran.demo.repository.TestDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TestService {

    @Autowired
    private TestDemoRepository repository;

    public TestDemo testService(TestDemo demo){
        demo.setId(UUID.randomUUID().toString());

        return repository.save(demo);
    }

    public TestDemo get(String id){
        return repository.findOne(id);
    }
}
