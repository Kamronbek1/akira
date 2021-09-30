package com.company.akira.model;

import javax.persistence.*;

@Entity
public class HouseholdGoodsStore extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hgs_gen")
    @SequenceGenerator(name = "hgs_gen", sequenceName = "hgs_seq", allocationSize = 1)
    private Long id;

    public HouseholdGoodsStore() {
    }

    public HouseholdGoodsStore(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "HouseholdGoodsStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }
}
