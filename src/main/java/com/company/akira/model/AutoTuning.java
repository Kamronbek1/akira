package com.company.akira.model;

import javax.persistence.*;

@Entity
public class AutoTuning extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tuning_gen")
    @SequenceGenerator(name = "tuning_gen", sequenceName = "tuning_seq", allocationSize = 1)
    private Long id;

    public AutoTuning() {
    }

    public AutoTuning(String name, String address, String phone, String imageUrl, String mapUrl) {
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
        return "AutoTuning{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
