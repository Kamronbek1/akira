package com.company.akira.model;

import javax.persistence.*;

@Entity
public class WaterBasin extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wb_gen")
    @SequenceGenerator(name = "wb_gen", sequenceName = "wb_seq", allocationSize = 1)
    private Long id;

    public WaterBasin() {
    }

    public WaterBasin(String name, String address, String phone, String imageUrl, String mapUrl) {
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
