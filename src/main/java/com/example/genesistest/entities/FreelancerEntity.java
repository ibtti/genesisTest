package com.example.genesistest.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "freelancer")
public class FreelancerEntity extends ContactEntity {

    @Column(name = "TVA_freelancer")
    private String TVA;

    public FreelancerEntity() {
            super();
            this.TVA=null;
    }

    public FreelancerEntity(String firstName, String lastName, String address, List<CompanyEntity> companies, String TVA) {
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
