package com.company.akira.model;

import javax.persistence.*;

@Entity
public class Pharmacy extends Category {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pharm_gen")
    @SequenceGenerator(name = "pharm_gen", sequenceName = "pharm_seq", allocationSize = 1)
    private Long id;

    public Pharmacy() {
    }

    public Pharmacy(String name, String phone, String imageUrl) {
        super(name, phone, imageUrl);
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
