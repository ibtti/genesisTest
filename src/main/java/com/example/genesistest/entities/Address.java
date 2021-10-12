package com.example.genesistest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id", nullable = false)

    private String idAddress;

    @Column (name="street")
    private String street;

    @Column (name="code_postal")
    private String codePostal;

    @Column (name="city")
    private String city;


    public Address() {
    }


    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String id) {
        this.idAddress = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
