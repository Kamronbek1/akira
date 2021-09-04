package com.company.akira.model;

import javax.persistence.*;

@Entity
public class ClothingStore extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cstore_gen")
    @SequenceGenerator(name = "cstore_gen", sequenceName = "cstore_seq", allocationSize = 1)
    private Long id;
    public ClothingStore() {
    }

    public ClothingStore(String name, String phone, String imageUrl) {
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
