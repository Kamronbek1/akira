package com.company.akira.model;

import javax.persistence.*;

@Entity
public class AutoSpare extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spare_gen")
    @SequenceGenerator(name = "spare_gen", sequenceName = "spare_seq", allocationSize = 1)
    private Long id;

    public AutoSpare() {
    }

    public AutoSpare(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "AutoSpare{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
