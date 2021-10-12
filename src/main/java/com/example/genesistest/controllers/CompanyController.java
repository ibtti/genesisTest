package com.example.genesistest.controllers;


import com.example.genesistest.entities.Company;
import com.example.genesistest.entities.Contact;
import com.example.genesistest.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/company")
public class CompanyController {

    @Autowired
    public CompanyService companyRepository;

    @GetMapping("/getAllCompanies")
    public List<Company> getAllCompanies(){
        return companyRepository.getCompanies();
    }

    @GetMapping("/getCompany/{id}")
    public Company getCompany(@PathVariable String id){
        return companyRepository.getCompany(id);
    }
    @PostMapping("/addCompany")
    public void addCompany(@RequestBody Company company){
         companyRepository.addCompany(company);
    }

    @PostMapping("/updateCompany/{id}")
    public void updateCompany(@PathVariable String id,@RequestBody Company company){
        companyRepository.updateCompany(id, company);
    }

    @PostMapping("/addCompanyContact/{id}")
    public void addContact(@PathVariable String id, @RequestBody Contact contact){
        companyRepository.addContact(id,contact);
    }

    @DeleteMapping("/deleteCompany/{id}")
    public void deleteCompany(@PathVariable String id){
        companyRepository.deleteCompany(id);
    }
}
