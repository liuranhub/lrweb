package com.liuran.demo.repository;

import com.liuran.demo.domain.TestDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TestDemoRepository extends JpaRepository<TestDemo, String> {
}
