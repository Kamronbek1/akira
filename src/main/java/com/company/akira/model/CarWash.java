package com.company.akira.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CarWash extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carwash_gen")
    @SequenceGenerator(name = "carwash_gen", sequenceName = "carwash_seq", allocationSize = 1)
    private Long id;

    public CarWash() {
    }

    public CarWash(String name, String address, String phone, String imageUrl, String mapUrl) {
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
