package com.example.genesistest.controllers;

import com.example.genesistest.entities.FreelancerEntity;
import com.example.genesistest.services.serviceImpl.FreelancerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController("/freelancer")
public class FreelancerController {

    @Autowired
    public FreelancerServiceImpl freelancerRepository;

    @GetMapping("/getAllFreelancers")
    public List<FreelancerEntity> getAllFreelancer(){
        return freelancerRepository.getFreelancers();
    }

    @GetMapping("/getFreelancer/{id}")
    public FreelancerEntity getFreelancer(@PathVariable String id){
        return freelancerRepository.getFreelancer(id);
    }
    @PostMapping("/addFreelancer")
    public void addFreelancer(@RequestBody FreelancerEntity freelancerEntity){
        freelancerRepository.addFreelancer(freelancerEntity);
    }

    @PostMapping("/updateFreelancer/{id}")
    public void updateFreelancer(@PathVariable String id,@RequestBody FreelancerEntity freelancerEntity){
        freelancerRepository.updateFreelancer(id, freelancerEntity);
    }

    @DeleteMapping("/deleteFreelancer/{id}")
    public void deleteFreelancer(@PathVariable String id){
        freelancerRepository.deleteFreelancer(id);
    }
}
