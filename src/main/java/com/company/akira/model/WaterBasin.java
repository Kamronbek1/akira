package com.company.akira.model;

import javax.persistence.*;

@Entity
public class WaterBasin extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wb_gen")
    @SequenceGenerator(name = "wb_gen", sequenceName = "wb_seq", allocationSize = 1)
    private Long id;
    public WaterBasin() {
    }

    public WaterBasin(String name, String phone, String imageUrl) {
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
