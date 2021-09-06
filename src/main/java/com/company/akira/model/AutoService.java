package com.company.akira.model;

import javax.persistence.*;

@Entity
public class AutoService extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "as_gen")
    @SequenceGenerator(name = "as_gen", sequenceName = "as_seq", allocationSize = 1)
    private Long id;

    private String address;
    private String mapUrl;

    public AutoService() {
    }

    public AutoService(String name, String phone, String imageUrl) {
        super(name, phone, imageUrl);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
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
