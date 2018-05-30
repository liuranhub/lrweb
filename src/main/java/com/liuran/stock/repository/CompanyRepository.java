package com.liuran.stock.repository;

import com.liuran.stock.domain.CompanyDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyDomain, String>{
}
