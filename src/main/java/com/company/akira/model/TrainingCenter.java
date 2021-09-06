package com.company.akira.model;

import javax.persistence.*;

@Entity
public class TrainingCenter extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tc_gen")
    @SequenceGenerator(name = "tc_gen", sequenceName = "tc_seq", allocationSize = 1)
    private Long id;
    private String address;
    private String mapUrl;

    public TrainingCenter() {
    }

    public TrainingCenter(String name, String phone, String address, String mapUrl, String imageUrl) {
        super(name, phone, imageUrl);
        this.address = address;
        this.mapUrl = mapUrl;
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
