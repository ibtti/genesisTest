package com.example.genesistest.services;

import com.example.genesistest.entities.FreelancerEntity;

import java.util.List;

public interface FreelanceService {
    public List<FreelancerEntity> getFreelancers();
    public void addFreelancer(FreelancerEntity freelancerEntity);
    public void updateFreelancer(String id, FreelancerEntity freelancerEntity);
    public void deleteFreelancer(String id);
}
