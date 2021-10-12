package com.example.genesistest.controllers;


import com.example.genesistest.entities.ContactEntity;
import com.example.genesistest.services.impl.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/contact")
public class ContactController {
    @Autowired
    public ContactServiceImpl contactRepository;

    @GetMapping("/getAllContacts")
    public List<ContactEntity> getAllContacts(){
        return contactRepository.getContacts();
    }

    @GetMapping("/getContact/{id}")
    public ContactEntity getContact(@PathVariable String id){
        return contactRepository.getContact(id);
    }
    @PostMapping("/addContact")
    public void addContact(@RequestBody ContactEntity contact){
        contactRepository.addContact(contact);
    }

    @PostMapping("/updateContact/{id}")
    public void updateContact(@PathVariable String id,@RequestBody ContactEntity contact){
        contactRepository.updateContact(id, contact);
    }

    @DeleteMapping("/deleteContact/{id}")
    public void deleteContact(@PathVariable String id){
        contactRepository.deleteContact(id);
    }
}
