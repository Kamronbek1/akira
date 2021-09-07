package com.company.akira.model;

import javax.persistence.*;

@Entity
public class HouseholdGoodsStore extends Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hgs_gen")
    @SequenceGenerator(name = "hgs_gen", sequenceName = "hgs_seq", allocationSize = 1)
    private Long id;
    private String address;
    private String mapUrl;

    public HouseholdGoodsStore() {
    }

    public HouseholdGoodsStore(String name, String phone, String address, String mapUrl, String imageUrl) {
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
        return "HouseholdGoodsStore{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", mapUrl='" + mapUrl + '\'' +
                '}';
    }
}
