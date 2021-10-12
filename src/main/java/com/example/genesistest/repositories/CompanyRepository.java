package com.example.genesistest.repositories;

import com.example.genesistest.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,String> {
}
