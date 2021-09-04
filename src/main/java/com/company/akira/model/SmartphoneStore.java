package com.company.akira.model;

import javax.persistence.*;

@Entity
public class SmartphoneStore extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "smarts_gen")
    @SequenceGenerator(name = "smarts_gen", sequenceName = "smarts_seq", allocationSize = 1)
    private Long id;

    public SmartphoneStore() {
    }

    public SmartphoneStore(String name, String phone, String imageUrl) {
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
