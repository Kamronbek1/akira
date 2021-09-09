package com.company.akira.model;

import javax.persistence.*;

@Entity
public class AutoService extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "as_gen")
    @SequenceGenerator(name = "as_gen", sequenceName = "as_seq", allocationSize = 1)
    private Long id;

    public AutoService() {
    }

    public AutoService(String name, String address, String phone, String imageUrl, String mapUrl) {
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
