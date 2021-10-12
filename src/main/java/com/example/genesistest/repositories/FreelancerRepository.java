package com.example.genesistest.repositories;

import com.example.genesistest.entities.FreelancerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelancerRepository extends JpaRepository<FreelancerEntity,String> {
}
