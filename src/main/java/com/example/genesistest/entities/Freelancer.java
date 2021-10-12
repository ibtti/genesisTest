package com.example.genesistest.entities;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Freelancer extends Contact{

    private String TVA;

    public Freelancer() {
            super();
            this.TVA=null;
    }

    public Freelancer(String firstName, String lastName, String address, List<Company> companies, String TVA) {
        super(firstName, lastName, address, companies);
        this.TVA = TVA;
    }

    public String getTVA() {
        return TVA;
    }

    public void setTVA(String TVA) {
        this.TVA = TVA;
    }
}
