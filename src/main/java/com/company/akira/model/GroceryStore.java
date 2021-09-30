package com.company.akira.model;

import javax.persistence.*;

@Entity
public class GroceryStore extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gs_gen")
    @SequenceGenerator(name = "gs_gen", sequenceName = "gs_seq", allocationSize = 1)
    private Long id;

    public GroceryStore() {
    }

    public GroceryStore(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "GroceryStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }
}
