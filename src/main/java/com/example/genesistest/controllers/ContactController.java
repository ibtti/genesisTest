package com.example.genesistest.controllers;


import com.example.genesistest.entities.Contact;
import com.example.genesistest.repositoriesImpl.ContactRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/contact")
public class ContactController {
    @Autowired
    public ContactRepositoryImpl contactRepository;

    @GetMapping("/getAllContacts")
    public List<Contact> getAllContacts(){
        return contactRepository.getContacts();
    }

    @GetMapping("/getContact/{id}")
    public Contact getContact(@PathVariable String id){
        return contactRepository.getContact(id);
    }
    @PostMapping("/addContact")
    public void addContact(@RequestBody Contact contact){
        contactRepository.addContact(contact);
    }

    @PostMapping("/updateContact/{id}")
    public void updateContact(@PathVariable String id,@RequestBody Contact contact){
        contactRepository.updateContact(id, contact);
    }

    @DeleteMapping("/deleteContact/{id}")
    public void deleteContact(@PathVariable String id){
        contactRepository.deleteContact(id);
    }
}
