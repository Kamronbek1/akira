package com.company.akira.model;

import javax.persistence.*;

@Entity
public class JewelryStore extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jewelrys_gen")
    @SequenceGenerator(name = "jewelrys_gen", sequenceName = "jewelrys_seq", allocationSize = 1)
    private Long id;
    public JewelryStore() {
    }

    public JewelryStore(String name, String phone, String imageUrl) {
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
