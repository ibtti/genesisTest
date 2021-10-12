package com.example.genesistest.services;

import com.example.genesistest.entities.Company;
import com.example.genesistest.entities.Contact;
import com.example.genesistest.repositories.CompanyRepository;
import com.example.genesistest.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CompanyService {

    @Autowired
    public CompanyRepository companyRepository;
    @Autowired
    public ContactRepository contactRepository;
    public List<Company> getCompanies(){
        List<Company> companies = new ArrayList<Company>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
    }

    public Company getCompany(String id){
        return companyRepository.findById(id).get();
    }

    public void addCompany(Company company){
        companyRepository.save(company);
    }

    public void updateCompany(String id, Company company){
        boolean exists = companyRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Company with id "+ id +" does not exist");
        }
        companyRepository.save(company);
    }

    public void addContact(String id,Contact contact){

        Company company = companyRepository.findById(id).orElseThrow( () -> new IllegalStateException("Company with id "+ id +" does not exist"));
        if (contact != null  && !Objects.equals(company.getContact(),contact)){
            company.setContact(contact);
        }
    }

    public void deleteCompany(String id){
        boolean exists = companyRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Company with id "+ id +" does not exist");
        }
        companyRepository.deleteById(id);
    }
}
