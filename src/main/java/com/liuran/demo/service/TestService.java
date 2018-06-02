package com.liuran.demo.service;

import com.liuran.demo.domain.TestDemo;
import com.liuran.demo.repository.TestDemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

@Service
public class TestService {

    @Autowired
    private TestDemoRepository repository;

    public TestDemo testService(TestDemo demo){
        demo.setId(UUID.randomUUID().toString());

        demo.setCreateTime(System.currentTimeMillis());
        demo.setUpdateTime(System.currentTimeMillis());

        return repository.save(demo);
    }

    public TestDemo get(String id){
        return repository.findById(id).orElse(new TestDemo());
    }
}
