package com.company.akira.model;

import javax.persistence.*;

@Entity
public class BuildingMaterialsStore extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bms_gen")
    @SequenceGenerator(name = "bms_gen", sequenceName = "bms_seq", allocationSize = 1)
    private Long id;
    public BuildingMaterialsStore() {
    }

    public BuildingMaterialsStore(String name, String phone, String imageUrl) {
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
