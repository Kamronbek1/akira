package com.company.akira.model;

import javax.persistence.*;

@Entity
public class Refueling extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "refueling_gen")
    @SequenceGenerator(name = "refueling_gen", sequenceName = "refueling_seq", allocationSize = 1)
    private Long id;

    public Refueling() {
    }

    public Refueling(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "AutoService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
