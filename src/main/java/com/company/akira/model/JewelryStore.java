package com.company.akira.model;

import javax.persistence.*;

@Entity
public class JewelryStore extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jewelrys_gen")
    @SequenceGenerator(name = "jewelrys_gen", sequenceName = "jewelrys_seq", allocationSize = 1)
    private Long id;

    public JewelryStore() {
    }

    public JewelryStore(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "JewelryStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }
}
