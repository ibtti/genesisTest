package com.example.genesistest.repositories;

import com.example.genesistest.entities.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<ContactEntity,String> {
}
