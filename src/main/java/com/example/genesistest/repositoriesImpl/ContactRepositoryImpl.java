package com.example.genesistest.repositoriesImpl;

import com.example.genesistest.entities.Company;
import com.example.genesistest.entities.Contact;
import com.example.genesistest.repositories.CompanyRepository;
import com.example.genesistest.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactRepositoryImpl {

    @Autowired
    public ContactRepository contactRepository;
    @Autowired
    public CompanyRepository companyRepository;
    public List<Contact> getContacts(){
        List<Contact> contacts = new ArrayList<Contact>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }

    public Contact getContact(String id){
        return contactRepository.findById(id).get();
    }

    public void addContact(Contact contact){

        contactRepository.save(contact);
    }

    public void updateContact(String id, Contact contact){
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
