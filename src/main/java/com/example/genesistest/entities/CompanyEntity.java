package com.example.genesistest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class CompanyEntity {

    @Id
    @Column(name = "idCompany", nullable = false)
    private String idCompany;

    @Column (name="TVA")
    private String TVA;

    @Column (name="adresse")
    private String address;

    @ManyToOne
    @JsonIgnore
    private ContactEntity contact;

    public String getId() {
        return idCompany;
    }

    public void setId(String id) {
        this.idCompany = id;
    }


    public CompanyEntity() {
    }

    public String getTVA() {
        return TVA;
    }

    public void setTVA(String TVA) {
        this.TVA = TVA;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public ContactEntity getContact() {
        return contact;
    }

    public void setContact(ContactEntity contact) {
        this.contact = contact;
    }
}
