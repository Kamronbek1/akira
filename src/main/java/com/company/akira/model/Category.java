package com.company.akira.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Category {

    protected String name;
    protected String address;
    protected String phone;
    protected String imageUrl;
    protected String mapUrl;

    public Category() {
    }

    public Category(String name, String address, String phone, String imageUrl, String mapUrl) {
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
