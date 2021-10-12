package com.example.genesistest.repositoriesImpl;


import com.example.genesistest.entities.Company;
import com.example.genesistest.entities.Freelancer;
import com.example.genesistest.repositories.CompanyRepository;
import com.example.genesistest.repositories.FreelancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FreelancerRepositoryImpl {

    @Autowired
    public FreelancerRepository freelancerRepository;
    @Autowired
    public CompanyRepository companyRepository;

    public List<Freelancer> getFreelancers(){
        List<Freelancer> freelancers = new ArrayList<Freelancer>();
        freelancerRepository.findAll().forEach(freelancers::add);
        return freelancers;
    }

    public Freelancer getFreelancer(String id){
        return freelancerRepository.findById(id).get();
    }

    public void addFreelancer(Freelancer freelancer){


        freelancerRepository.save(freelancer);
    }

    public void updateFreelancer(String id, Freelancer freelancer){
        boolean exists = freelancerRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Freelancer with id "+ id +" does not exist");
        }
        freelancerRepository.save(freelancer);
    }

    public void deleteFreelancer(String id){
        boolean exists = freelancerRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Freelancer with id "+ id +" does not exist");
        }
        freelancerRepository.deleteById(id);
    }
}
