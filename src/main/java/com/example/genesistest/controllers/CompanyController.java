package com.example.genesistest.controllers;


import com.example.genesistest.entities.CompanyEntity;
import com.example.genesistest.entities.ContactEntity;
import com.example.genesistest.services.impl.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/company")
public class CompanyController {

    @Autowired
    public CompanyServiceImpl companyRepository;

    @GetMapping("/getAllCompanies")
    public List<CompanyEntity> getAllCompanies(){
        return companyRepository.getCompanies();
    }

    @GetMapping("/getCompany/{id}")
    public CompanyEntity getCompany(@PathVariable String id){
        return companyRepository.getCompany(id);
    }

    @PostMapping("/addCompany")
    public void addCompany(@RequestBody CompanyEntity companyEntity){
         companyRepository.addCompany(companyEntity);
    }

    @PostMapping("/updateCompany/{id}")
    public void updateCompany(@PathVariable String id,@RequestBody CompanyEntity companyEntity){
        companyRepository.updateCompany(id, companyEntity);
    }

    @PostMapping("/addCompanyContact/{id}")
    public void addContact(@PathVariable String id, @RequestBody ContactEntity contact){
        companyRepository.addContact(id,contact);
    }

    @DeleteMapping("/deleteCompany/{id}")
    public void deleteCompany(@PathVariable String id){
        companyRepository.deleteCompany(id);
    }
}
