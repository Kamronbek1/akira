package com.company.akira.model;

import javax.persistence.*;

@Entity
public class CarShowroom extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carshr_gen")
    @SequenceGenerator(name = "carshr_gen", sequenceName = "carshr_seq", allocationSize = 1)
    private Long id;

    public CarShowroom() {
    }

    public CarShowroom(String name, String address, String phone, String imageUrl, String mapUrl) {
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
