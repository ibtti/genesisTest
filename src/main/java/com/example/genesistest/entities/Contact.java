package com.example.genesistest.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.List;


@Entity
public class Contact {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "address")
    private String address;

    @OneToMany(targetEntity=Company.class, mappedBy="contact", fetch=FetchType.LAZY)
    @Column(name = "companies")
    private List<Company> companies;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Contact() {}

    public Contact(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Contact(String firstName, String lastName, String address, List<Company> companies) {
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

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }
}
