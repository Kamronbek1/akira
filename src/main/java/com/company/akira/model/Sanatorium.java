package com.company.akira.model;

import javax.persistence.*;

@Entity
public class Sanatorium extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sanatorium_gen")
    @SequenceGenerator(name = "sanatorium_gen", sequenceName = "sanatorium_seq", allocationSize = 1)
    private Long id;

    public Sanatorium() {
    }

    public Sanatorium(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "Sanatorium{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }
}
