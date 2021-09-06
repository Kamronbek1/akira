package com.company.akira.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CarWash extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carwash_gen")
    @SequenceGenerator(name = "carwash_gen", sequenceName = "carwash_seq", allocationSize = 1)
    private Long id;

    private String address;
    private String mapUrl;
//    private Set<>
    public CarWash() {
    }

    public CarWash(String name, String phone, String imageUrl) {
        super(name, phone, imageUrl);
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMapUrl() {
        return mapUrl;
    }

    public void setMapUrl(String mapUrl) {
        this.mapUrl = mapUrl;
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
