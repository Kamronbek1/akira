package com.company.akira.model;

import javax.persistence.*;

@Entity
public class TrainingCenter extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tc_gen")
    @SequenceGenerator(name = "tc_gen", sequenceName = "tc_seq", allocationSize = 1)
    private Long id;
    public TrainingCenter() {
    }

    public TrainingCenter(String name, String phone, String imageUrl) {
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
