package com.example.genesistest.services;

import com.example.genesistest.entities.CompanyEntity;
import com.example.genesistest.entities.ContactEntity;

import java.util.List;

public interface CompanyService {

    public List<CompanyEntity> getCompanies();
    public CompanyEntity getCompany(String id);
    public void addCompany(CompanyEntity companyEntity);
    public void updateCompany(String id, CompanyEntity companyEntity);
    public void addContact(String id, ContactEntity contact);
    public abstract void deleteCompany(String id);

}

