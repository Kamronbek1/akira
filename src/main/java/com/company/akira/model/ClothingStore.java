package com.company.akira.model;

import javax.persistence.*;

@Entity
public class ClothingStore extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cstore_gen")
    @SequenceGenerator(name = "cstore_gen", sequenceName = "cstore_seq", allocationSize = 1)
    private Long id;

    public ClothingStore() {
    }

    public ClothingStore(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "ClothingStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
