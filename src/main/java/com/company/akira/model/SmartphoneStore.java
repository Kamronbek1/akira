package com.company.akira.model;

import javax.persistence.*;

@Entity
public class SmartphoneStore extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "smarts_gen")
    @SequenceGenerator(name = "smarts_gen", sequenceName = "smarts_seq", allocationSize = 1)
    private Long id;

    public SmartphoneStore() {
    }

    public SmartphoneStore(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "SmartphoneStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }
}
