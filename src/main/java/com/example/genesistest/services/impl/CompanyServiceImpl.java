package com.example.genesistest.services.impl;

import com.example.genesistest.entities.CompanyEntity;
import com.example.genesistest.entities.ContactEntity;
import com.example.genesistest.repositories.CompanyRepository;
import com.example.genesistest.repositories.ContactRepository;
import com.example.genesistest.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    public CompanyRepository companyRepository;
    @Autowired
    public ContactRepository contactRepository;
    public List<CompanyEntity> getCompanies(){
        List<CompanyEntity> companies = new ArrayList<CompanyEntity>();
        companyRepository.findAll().forEach(companies::add);
        return companies;
    }

    public CompanyEntity getCompany(String id){
        return companyRepository.findById(id).get();
    }

    public void addCompany(CompanyEntity companyEntity){
        companyRepository.save(companyEntity);
    }

    public void updateCompany(String id, CompanyEntity companyEntity){
        boolean exists = companyRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Company with id "+ id +" does not exist");
        }
        companyRepository.save(companyEntity);
    }

    public void addContact(String id, ContactEntity contact){

        CompanyEntity companyEntity = companyRepository.findById(id).orElseThrow( () -> new IllegalStateException("Company with id "+ id +" does not exist"));
        if (contact != null  && !Objects.equals(companyEntity.getContact(),contact)){
            List<ContactEntity> contacts = new ArrayList<ContactEntity>();
            boolean exist = contactRepository.existsById(contact.getId());
            if(!exist) contactRepository.save(contact);
            contacts.add(contact);
            companyEntity.setContact(contacts);
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
