package com.company.akira.model;

import javax.persistence.*;

@Entity
public class Bank extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank_gen")
    @SequenceGenerator(name = "bank_gen", sequenceName = "bank_seq", allocationSize = 1)
    private Long id;

    public Bank() {
    }

    public Bank(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "Bank{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
