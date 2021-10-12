package com.example.genesistest.services;

import com.example.genesistest.entities.ContactEntity;

import java.util.List;

public interface ContactService {
    public List<ContactEntity> getContacts();
    public ContactEntity getContact(String id);
    public void addContact(ContactEntity contact);
    public void updateContact(String id, ContactEntity contact);
    public void deleteContact(String id);
}
