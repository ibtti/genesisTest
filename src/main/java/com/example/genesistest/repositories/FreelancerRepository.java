package com.example.genesistest.repositories;

import com.example.genesistest.entities.Freelancer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FreelancerRepository extends JpaRepository<Freelancer,String> {
}
