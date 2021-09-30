package com.company.akira.model;

import javax.persistence.*;

@Entity
public class FitnessClub extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fc_gen")
    @SequenceGenerator(name = "fc_gen", sequenceName = "fc_seq", allocationSize = 1)
    private Long id;

    public FitnessClub() {
    }

    public FitnessClub(String name, String address, String phone, String imageUrl, String mapUrl) {
        super(name, address, phone, imageUrl, mapUrl);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FitnessClub{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }
}
