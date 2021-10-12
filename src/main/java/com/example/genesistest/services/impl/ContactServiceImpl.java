package com.example.genesistest.services.impl;

import com.example.genesistest.entities.ContactEntity;
import com.example.genesistest.repositories.CompanyRepository;
import com.example.genesistest.repositories.ContactRepository;
import com.example.genesistest.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    public ContactRepository contactRepository;
    @Autowired
    public CompanyRepository companyRepository;
    public List<ContactEntity> getContacts(){
        List<ContactEntity> contacts = new ArrayList<ContactEntity>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }

    public ContactEntity getContact(String id){
        return contactRepository.findById(id).get();
    }

    public void addContact(ContactEntity contact){

        contactRepository.save(contact);
    }

    public void updateContact(String id, ContactEntity contact){
        contactRepository.save(contact);
    }

    public void deleteContact(String id){
        boolean exists = contactRepository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Contact with id "+ id +" does not exist");
        }
        contactRepository.deleteById(id);
    }
}
