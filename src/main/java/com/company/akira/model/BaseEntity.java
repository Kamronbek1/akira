package com.company.akira.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity {

    protected String name;
    @Column(length = 500)
    protected String address;
    protected String phone;
    protected String imageUrl;
    @Column(length = 500)
    protected String mapUrl;

    public BaseEntity() {
    }

    public BaseEntity(String name, String address, String phone, String imageUrl, String mapUrl) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.mapUrl = mapUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
}
