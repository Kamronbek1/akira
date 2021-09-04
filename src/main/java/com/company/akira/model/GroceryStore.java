package com.company.akira.model;

import javax.persistence.*;

@Entity
public class GroceryStore extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gs_gen")
    @SequenceGenerator(name = "gs_gen", sequenceName = "gs_seq", allocationSize = 1)
    private Long id;
    public GroceryStore() {
    }

    public GroceryStore(String name, String phone, String imageUrl) {
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
