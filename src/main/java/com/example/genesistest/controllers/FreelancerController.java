package com.example.genesistest.controllers;

import com.example.genesistest.entities.Freelancer;
import com.example.genesistest.services.FreelancerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController("/freelancer")
public class FreelancerController {

    @Autowired
    public FreelancerService freelancerRepository;

    @GetMapping("/getAllFreelancers")
    public List<Freelancer> getAllFreelancer(){
        return freelancerRepository.getFreelancers();
    }

    @GetMapping("/getFreelancer/{id}")
    public Freelancer getFreelancer(@PathVariable String id){
        return freelancerRepository.getFreelancer(id);
    }
    @PostMapping("/addFreelancer")
    public void addFreelancer(@RequestBody Freelancer freelancer){
        freelancerRepository.addFreelancer(freelancer);
    }

    @PostMapping("/updateFreelancer/{id}")
    public void updateFreelancer(@PathVariable String id,@RequestBody Freelancer freelancer){
        freelancerRepository.updateFreelancer(id, freelancer);
    }

    @DeleteMapping("/deleteFreelancer/{id}")
    public void deleteFreelancer(@PathVariable String id){
        freelancerRepository.deleteFreelancer(id);
    }
}
