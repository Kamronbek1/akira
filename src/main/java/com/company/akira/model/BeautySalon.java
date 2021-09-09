package com.company.akira.model;

import javax.persistence.*;

@Entity
public class BeautySalon extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bs_gen")
    @SequenceGenerator(name = "bs_gen", sequenceName = "bs_seq", allocationSize = 1)
    private Long id;

    public BeautySalon() {
    }

    public BeautySalon(String name, String address, String phone, String imageUrl, String mapUrl) {
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
