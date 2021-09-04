package com.company.akira.model;

import javax.persistence.*;

@Entity
public class DiningArea extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "da_gen")
    @SequenceGenerator(name = "da_gen", sequenceName = "da_seq", allocationSize = 1)
    private Long id;
    public DiningArea() {
    }

    public DiningArea(String name, String phone, String imageUrl) {
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
