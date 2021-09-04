package com.company.akira.model;

import javax.persistence.*;

@Entity
public class HomeApplianceStore extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HAS_gen")
    @SequenceGenerator(name = "HAS_gen", sequenceName = "HAS_seq", allocationSize = 1)
    private Long id;
    public HomeApplianceStore() {
    }

    public HomeApplianceStore(String name, String phone, String imageUrl) {
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
