package com.example.genesistest.services.serviceImpl;


import com.example.genesistest.entities.FreelancerEntity;
import com.example.genesistest.repositories.CompanyRepository;
import com.example.genesistest.repositories.FreelancerRepository;
import com.example.genesistest.services.FreelanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FreelancerServiceImpl implements FreelanceService {

    @Autowired
    public FreelancerRepository freelancerRepository;
    @Autowired
    public CompanyRepository companyRepository;

    public List<FreelancerEntity> getFreelancers(){
        List<FreelancerEntity> freelancerEntities = new ArrayList<FreelancerEntity>();
        freelancerRepository.findAll().forEach(freelancerEntities::add);
        return freelancerEntities;
    }

    public FreelancerEntity getFreelancer(String id){
        return freelancerRepository.findById(id).get();
    }

    public void addFreelancer(FreelancerEntity freelancerEntity){


        freelancerRepository.save(freelancerEntity);
    }

    public void updateFreelancer(String id, FreelancerEntity freelancerEntity){
        boolean exists = freelancerRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Freelancer with id "+ id +" does not exist");
        }
        freelancerRepository.save(freelancerEntity);
    }

    public void deleteFreelancer(String id){
        boolean exists = freelancerRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Freelancer with id "+ id +" does not exist");
        }
        freelancerRepository.deleteById(id);
    }
}
