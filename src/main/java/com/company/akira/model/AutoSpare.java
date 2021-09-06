package com.company.akira.model;

import javax.persistence.*;

@Entity
public class AutoSpare extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spare_gen")
    @SequenceGenerator(name = "spare_gen", sequenceName = "spare_seq", allocationSize = 1)
    private Long id;

    private String address;
    private String mapUrl;
    public AutoSpare() {
    }

    public AutoSpare(String name, String phone, String imageUrl) {
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
        return "AutoSpare{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
