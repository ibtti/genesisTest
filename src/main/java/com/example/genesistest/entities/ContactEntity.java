package com.example.genesistest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "contact")
public class ContactEntity {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "address")
    private String address;

    @ManyToMany(mappedBy="contacts")
    @Column(name = "companies")
    private List<CompanyEntity> companies;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public ContactEntity() {}

    public ContactEntity(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public ContactEntity(String firstName, String lastName, String address, List<CompanyEntity> companies) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.companies = companies;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<CompanyEntity> getCompanies() {
        return companies;
    }

    @JsonIgnore
    public void setCompanies(List<CompanyEntity> companies) {
        this.companies = companies;
    }
}
