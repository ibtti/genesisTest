package com.example.genesistest.repositories;

import com.example.genesistest.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<CompanyEntity,String> {
}
