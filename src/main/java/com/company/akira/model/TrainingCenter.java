package com.company.akira.model;

import javax.persistence.*;

@Entity
public class TrainingCenter extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tc_gen")
    @SequenceGenerator(name = "tc_gen", sequenceName = "tc_seq", allocationSize = 1)
    private Long id;

    public TrainingCenter() {
    }

    public TrainingCenter(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "TrainingCenter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }
}
