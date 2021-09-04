package com.company.akira.model;

import javax.persistence.*;

@Entity
public class HouseholdGoodsStore extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hgs_gen")
    @SequenceGenerator(name = "hgs_gen", sequenceName = "hgs_seq", allocationSize = 1)
    private Long id;
    public HouseholdGoodsStore() {
    }

    public HouseholdGoodsStore(String name, String phone, String imageUrl) {
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